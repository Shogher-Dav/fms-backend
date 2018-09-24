package fms.services.interfaces;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import fms.entity.Jobs;



public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<Jobs> findAllJobs();
}