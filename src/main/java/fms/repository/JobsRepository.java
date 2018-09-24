package fms.repository;

import org.springframework.data.repository.CrudRepository;

import fms.entity.Jobs;

public interface JobsRepository extends CrudRepository<Jobs, Long>{

}
