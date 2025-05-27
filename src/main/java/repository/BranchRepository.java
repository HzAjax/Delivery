package repository;

import entity.Branch;
import entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface BranchRepository extends JpaRepository<Branch, UUID> {
    //TODO сделать JPQL запрос
    @Query()
    List<Branch> findByName(@Param("name") String name);
}
