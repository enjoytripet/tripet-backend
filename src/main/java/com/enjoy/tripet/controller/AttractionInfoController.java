package com.enjoy.tripet.controller;

import com.enjoy.tripet.domain.AttractionInfo;
import com.enjoy.tripet.request.AttractionRequest;
import com.enjoy.tripet.service.AttractionInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attractionInfo")
public class AttractionInfoController {
    private final AttractionInfoService attractionInfoService;

    @PostMapping("/search")
    public ResponseEntity<List<AttractionInfo>> search(@RequestBody AttractionRequest attractionRequest){
        List<AttractionInfo> result = attractionInfoService.findBySidoCodeAndGugunCode(attractionRequest.getSidoCode(), attractionRequest.getGugunCode());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
