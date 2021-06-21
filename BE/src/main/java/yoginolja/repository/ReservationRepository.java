package yoginolja.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import yoginolja.domain.Reservation;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    Optional<Reservation> findByGuestId(@Param(value = "guestID") Long guestIdx);
}
