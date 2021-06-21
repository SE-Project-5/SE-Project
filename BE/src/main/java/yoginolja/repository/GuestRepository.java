package yoginolja.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import yoginolja.domain.Guest;
import yoginolja.domain.User;

import java.util.Optional;

public interface GuestRepository extends JpaRepository<Guest,Long> {

    Optional<Guest> findById(String guestId);
    Optional<User> findByEmail(String userEmail);
    Optional<User> findByPhoneNumber(String userPhoneNumber);
}
