package com.olx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olx.entity.CategoryEntity;
import com.olx.entity.StatusEntity;

public interface MasterDataRepoStatus extends JpaRepository<StatusEntity, Integer> {

}
