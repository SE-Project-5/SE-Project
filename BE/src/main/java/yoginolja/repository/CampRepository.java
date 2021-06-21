package yoginolja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import yoginolja.domain.Camp;
import yoginolja.domain.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CampRepository extends JpaRepository<Camp,Long> {

    Optional<Camp> findByHostId(@Param(value = "hostID") Long hostIdx);
    Optional<Camp> findByCampAddressAndPossibleDateAndCampIsFullIsFalse(String campAddress , Date reservationDate);
    Optional<List<Camp>> findByCampAddressIsLikeAndCampIsFullIsFalseAndPossibleDateIs(String campAddress, Date reservationDate);
}
