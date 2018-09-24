package fms.repository;
import org.springframework.data.repository.CrudRepository;
import fms.entity.User;



public interface UserRepository extends CrudRepository <User, Long> {
	 User findByUsername(String username);
}


