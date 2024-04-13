package com.ProjectExplorerAndBiddingapp.model;

import java.awt.Image;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
@Entity
@Table(name="projectexplorerandbidding")
public class ProjectModel {
	@Id
	String projectName;
	String profileimage;
	String projectUrl;
	String projectDescription;

	public ProjectModel(String projectName,String profileimage,String projectUrl, String projectDescription) {
		super();
		this.projectName = projectName;
		this.profileimage = profileimage;
		this.projectUrl = projectUrl;
		this.projectDescription = projectDescription;
	}

	public ProjectModel() {
		super();
	}

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	

	public String getProfileimage() {
		return profileimage;
	}

	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}

	public String getProjectUrl() {
		return projectUrl;
	}
	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

}
