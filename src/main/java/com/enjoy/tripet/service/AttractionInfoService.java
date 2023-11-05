package com.enjoy.tripet.service;

import com.enjoy.tripet.domain.AttractionInfo;
import com.enjoy.tripet.repository.AttractionInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttractionInfoService {
    private final AttractionInfoRepository attractionInfoRepository;

    public List<AttractionInfo> findBySidoCodeAndGugunCode(int sidoCode, int gugunCode){
        return attractionInfoRepository.findBySidoCodeAndGugunCode(sidoCode, gugunCode);
    }
}
