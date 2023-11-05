package com.enjoy.tripet.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PetAccompanyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Attraction attraction;
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

    @Builder
    private PetAccompanyInfo(Attraction attraction, String acmpyPsblCpam, String relaRntlPrdist, String acompyNeedMtr, String relaFrnshPrdlst, String etcAcmpyInfo, String relaPurcPrdlst, String relaAcdntRiskMtr, String acmpyTypeCd, String relaPosesFclty, String petTursmInfo) {
        this.attraction = attraction;
        this.acmpyPsblCpam = acmpyPsblCpam;
        this.relaRntlPrdist = relaRntlPrdist;
        this.acompyNeedMtr = acompyNeedMtr;
        this.relaFrnshPrdlst = relaFrnshPrdlst;
        this.etcAcmpyInfo = etcAcmpyInfo;
        this.relaPurcPrdlst = relaPurcPrdlst;
        this.relaAcdntRiskMtr = relaAcdntRiskMtr;
        this.acmpyTypeCd = acmpyTypeCd;
        this.relaPosesFclty = relaPosesFclty;
        this.petTursmInfo = petTursmInfo;
    }
}
