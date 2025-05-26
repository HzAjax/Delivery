package com.example.demo.service;

import com.example.demo.entity.Branch;

import java.util.UUID;

public interface BranchService {
    Branch addBranch (Branch branch);
    Branch getBranchById (UUID id);
    Branch editBranchById (Branch cargo);
    void deleteBranchById (UUID id);
}
