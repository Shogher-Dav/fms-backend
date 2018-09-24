package fms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fms.services.interfaces.GenericService;
import fms.entity.Jobs;

@RestController

public class ResourceController {
	
	 @Autowired
	    private GenericService jobsService;
	 
	 @RequestMapping(value ="/home")
	 
	    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	    public List<Jobs> getJobs(){
	        return jobsService.findAllJobs();
	    }
}
