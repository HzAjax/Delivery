package com.example.demo.controller;

import com.example.demo.entity.Branch;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.BranchService;

import java.util.UUID;

@RestController
@RequestMapping("/delivery/branch")
@RequiredArgsConstructor
public class BranchController {

    private final BranchService branchService;

    @PostMapping
    public ResponseEntity<?> addBranch (@Valid @RequestBody Branch branch) {
        return ResponseEntity.ok(branchService.addBranch(branch));
    }

    @GetMapping("/{branchId}")
    public ResponseEntity<?> getBranch (@PathVariable("branchId") UUID branchId){
        return ResponseEntity.ok(branchService.getBranchById(branchId));
    }

    @PutMapping
    public ResponseEntity<?> editBranch (@Valid @RequestBody Branch branch) {
        return ResponseEntity.ok(branchService.editBranchById(branch));
    }

    @DeleteMapping("/{branchId}")
    public ResponseEntity<?> deleteBranch (@PathVariable("branchId") UUID branchId){
        branchService.deleteBranchById(branchId);
        return ResponseEntity.ok().build();
    }
}
