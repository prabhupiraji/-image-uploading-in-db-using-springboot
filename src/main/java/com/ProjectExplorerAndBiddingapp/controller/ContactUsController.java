package com.ProjectExplorerAndBiddingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectExplorerAndBiddingapp.model.ContactUsModel;
import com.ProjectExplorerAndBiddingapp.service.ContactService;

@RestController
public class ContactUsController {
	@Autowired
  ContactService contactService;
 
@PostMapping("/saverequest")
public ResponseEntity<ContactUsModel> saveRequest(@RequestBody ContactUsModel contactUsModel){
	return new ResponseEntity<ContactUsModel> (contactService.saverequest(contactUsModel),HttpStatus.OK);
}

}
