package ma.entraide.formationcentres.Repository;


import ma.entraide.formationcentres.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepo extends JpaRepository<Region, Long>,
        PagingAndSortingRepository<Region, Long> {

}
