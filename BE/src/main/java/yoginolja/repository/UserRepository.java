package yoginolja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import yoginolja.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String userEmail);
    Optional<User> findByPhoneNumber(String userPhoneNumber);

 }
