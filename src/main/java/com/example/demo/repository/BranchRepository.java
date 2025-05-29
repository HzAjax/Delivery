package com.example.demo.repository;

import com.example.demo.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface BranchRepository extends JpaRepository<Branch, UUID> {
    @Query("SELECT COUNT(c) FROM Cargo c WHERE c.branchFrom.id = :branchId")
    long countSentByBranch(@Param("branchId") Long branchId);

    @Query("SELECT COUNT(c) FROM Cargo c WHERE c.branchTo.id = :branchId")
    long countReceivedByBranch(@Param("branchId") Long branchId);
}
