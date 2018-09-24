package fms.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import fms.entity.Jobs;

import fms.repository.JobsRepository;
import fms.repository.UserRepository;
import fms.services.interfaces.GenericService;

@Service
public class GenericServiceImpl implements GenericService{

	  @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private  JobsRepository jobsRepository;

		public User findByUsername(String username) {
		
			return userRepository.findByUsername(username);
		}

		public List<User> findAllUsers() {
			 return (List<User>)userRepository.findAll();
	
		}

		@Override
		public List<Jobs> findAllJobs() {
			return (List<Jobs>)jobsRepository.findAll();	
		}
}
