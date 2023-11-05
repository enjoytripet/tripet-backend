package com.enjoy.tripet.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PetAccompanyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private Attraction attraction;
    private String acmpyPsblCpam;
    private String relaRntlPrdist;
    private String acompyNeedMtr;
    private String relaFrnshPrdlst;
    private String etcAcmpyInfo;
    private String relaPurcPrdlst;
    private String relaAcdntRiskMtr;
    private String acmpyTypeCd;
    private String relaPosesFclty;
    private String petTursmInfo;

}
