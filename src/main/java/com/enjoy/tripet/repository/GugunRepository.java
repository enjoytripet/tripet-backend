package com.enjoy.tripet.repository;

import com.enjoy.tripet.domain.Gugun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GugunRepository extends JpaRepository<Gugun, Long> {
}
