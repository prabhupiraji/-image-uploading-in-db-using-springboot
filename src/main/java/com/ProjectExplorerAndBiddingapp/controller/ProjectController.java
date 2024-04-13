package com.ProjectExplorerAndBiddingapp.controller;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ProjectExplorerAndBiddingapp.model.ProjectModel;
import com.ProjectExplorerAndBiddingapp.service.ProjectService;

import jakarta.annotation.Resource;


@RestController
public class ProjectController {
     @Autowired
	ProjectService service;
    
          private static String imageDirectory = System.getProperty("user.dir") + "/src/main/webapp/images";

          @PostMapping("/Image")
          public ResponseEntity<ProjectModel> uploadImage(@ModelAttribute ProjectModel projectModel,
                                               @RequestParam("image") MultipartFile file) {
                  try {
                	  String originalfilname=file.getOriginalFilename();
                      Path fileNamePath = Paths.get(imageDirectory,originalfilname);
					Files.write(fileNamePath, file.getBytes());
				    projectModel.setProfileimage(originalfilname);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
              
				return new ResponseEntity<ProjectModel> (service.saveProject(projectModel),HttpStatus.OK);
              
          }

        
         
          @GetMapping("/getproject")
          public Optional<ProjectModel> getProjectByProjectName(@RequestParam String projectName) {
        	  return service.getProjectByProject(projectName);
          }
          
//          fetching image from db
          @GetMapping("/getproject/{projectName}")
          public ResponseEntity<FileSystemResource> getProjectByProject(@PathVariable String projectName) throws IOException {
        	Optional<ProjectModel> projectp = service.getProjectByProjectName(projectName);
        	       
        	     Path imagepath=Paths.get(imageDirectory,projectp.get().getProfileimage());
        	     System.out.println(imagepath);
        	     FileSystemResource resource= new FileSystemResource(imagepath.toFile());
        	      String contentType=Files.probeContentType(imagepath);
        	      
        	  return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).body (resource);
          }
          
          
          
        



		@GetMapping("/getallproject")
          public List<ProjectModel> getAllProject() {
        	  return service.getProjects();
          }
}
