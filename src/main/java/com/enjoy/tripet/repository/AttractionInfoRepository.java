package com.enjoy.tripet.repository;

import com.enjoy.tripet.domain.AttractionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionInfoRepository extends JpaRepository<AttractionInfo, Long> {
    List<AttractionInfo> findBySidoCodeAndGugunCode(int sidoCode, int gugunCode);
}
