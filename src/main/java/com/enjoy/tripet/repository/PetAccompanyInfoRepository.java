package com.enjoy.tripet.repository;

import com.enjoy.tripet.domain.PetAccompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetAccompanyInfoRepository extends JpaRepository<PetAccompanyInfo, Long> {
}
