package com.ProjectExplorerAndBiddingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectExplorerAndBiddingapp.model.ContactUsModel;
import com.ProjectExplorerAndBiddingapp.repo.ContactUsRepo;

@Service
public class ContactService {
	
       @Autowired
	ContactUsRepo contactUsRepo;
    
	public ContactUsModel saverequest(ContactUsModel contactUsModel) {
	
		return contactUsRepo.save(contactUsModel) ;
	}

	
}
