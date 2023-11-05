package com.enjoy.tripet.repository;

import com.enjoy.tripet.domain.Sido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SidoRepository extends JpaRepository<Sido, Long> {
}
