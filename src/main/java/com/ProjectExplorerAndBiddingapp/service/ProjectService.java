package com.ProjectExplorerAndBiddingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ProjectExplorerAndBiddingapp.model.ProjectModel;
import com.ProjectExplorerAndBiddingapp.repo.ProjectRepository;

@Service
public class ProjectService{
	
     @Autowired
	ProjectRepository  projectRepository;
     
	public ProjectModel saveProject(ProjectModel  model) {
		return projectRepository.save(model);
	}
	
	public Optional<ProjectModel> getProjectByProject(String projectName) {
		// TODO Auto-generated method stub
		return projectRepository.findById(projectName);
	}

	

	public List<ProjectModel> getProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	public ProjectModel saveProject(String projectName, MultipartFile projectImage, String projectUrl,
			String projectDescription) {
		ProjectModel p=new ProjectModel();
		p.setProjectName(projectName);
		// TODO Auto-generated method stub
//		p.setProjectImage(projectImage);
		p.setProjectUrl(projectUrl);
		p.setProjectDescription(projectDescription);
		return projectRepository.save(p);
	}

	public Optional<ProjectModel> getProjectByProjectName(String projectName) {
		// TODO Auto-generated method stub
		return projectRepository.findById(projectName);
	}


}
