package com.example.demo.service.impl;

import com.example.demo.entity.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.repository.BranchRepository;
import com.example.demo.service.BranchService;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;

    public Branch addBranch (Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch getBranchById (UUID id) {
        return branchRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No Branch in BD!"));
    }

    public Branch editBranchById (Branch cargo) {
        return branchRepository.save(cargo);
    }

    public void deleteBranchById (UUID id) {
        branchRepository.deleteById(id);
    }
}
