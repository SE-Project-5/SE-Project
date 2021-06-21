package yoginolja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yoginolja.domain.Guest;
import yoginolja.domain.Host;
import yoginolja.domain.User;

import java.util.Optional;

public interface HostRepository extends JpaRepository<Host,Long> {

    Optional<Host> findById(String guestId);
    Optional<User> findByEmail(String userEmail);
    Optional<User> findByPhoneNumber(String userPhoneNumber);
}
