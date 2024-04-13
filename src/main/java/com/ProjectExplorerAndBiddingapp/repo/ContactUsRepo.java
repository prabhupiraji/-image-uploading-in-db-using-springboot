package com.ProjectExplorerAndBiddingapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectExplorerAndBiddingapp.model.ContactUsModel;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUsModel, String> {



}
