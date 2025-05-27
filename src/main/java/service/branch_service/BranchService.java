package service.branch_service;

import entity.Branch;

import java.util.UUID;

public interface BranchService {
    public Branch addBranch (Branch branch);

    public Branch getBranchById (UUID id);

    public Branch editBranchById (Branch cargo);

    public void deleteBranchById (UUID id);
}
