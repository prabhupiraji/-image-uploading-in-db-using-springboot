package com.ProjectExplorerAndBiddingapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectExplorerAndBiddingapp.model.ProjectModel;

public interface ProjectRepository extends JpaRepository<ProjectModel, String>  {

}
