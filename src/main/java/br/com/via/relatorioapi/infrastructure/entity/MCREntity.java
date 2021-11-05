package br.com.via.relatorioapi.infrastructure.entity;


import br.com.via.relatorioapi.adapter.dto.MCRDto;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@Table(name = "MCR")
@NoArgsConstructor
public class MCREntity {

    public MCREntity(MCRDto mcr) {
        if(mcr.getCD_MCR() != null)
            this.CD_MCR = mcr.getCD_MCR();
        this.CD_SETMCR = mcr.getCD_SETMCR();
        this.CD_ESPMCR = mcr.getCD_ESPMCR();
        this.CD_MRCMCR = mcr.getCD_MRCMCR();
        this.CD_CLAMCR = mcr.getCD_CLAMCR();
        this.CD_MCR_LIN = mcr.getCD_MCR_LIN();
        this.CD_TSMCR = mcr.getCD_TSMCR();
        this.CD_MCR_ORD_EMI = mcr.getCD_MCR_ORD_EMI();
        this.DS_MCR = mcr.getDS_MCR();
        this.VR_MCR_RBT_ATU = mcr.getVR_MCR_RBT_ATU();
        this.VR_MCR_RBT_PXM = mcr.getVR_MCR_RBT_PXM();
        this.VR_MCR_RBT_RTO = mcr.getVR_MCR_RBT_RTO();
        this.VR_MCR_SGT_ATU = mcr.getVR_MCR_SGT_ATU();
        this.VR_MCR_SGT_PXM = mcr.getVR_MCR_SGT_PXM();
        this.VR_MCR_SGT_RTO = mcr.getVR_MCR_SGT_RTO();
        this.VR_MCR_VND_EPL = mcr.getVR_MCR_VND_EPL();
        this.ST_MCR_ORI = mcr.getST_MCR_ORI();
        this.ST_MCR_UND_VND = mcr.getST_MCR_UND_VND();
        this.VR_MCR_CPR_FNE = mcr.getVR_MCR_CPR_FNE();
        this.TX_MCR_ABT = mcr.getTX_MCR_ABT();
        this.TX_MCR_IPI = mcr.getTX_MCR_IPI();
        this.TX_MCR_PPG = mcr.getTX_MCR_PPG();
        this.CD_CNDPGT = mcr.getCD_CNDPGT();
        this.VR_MCR_ULT_RCB = mcr.getVR_MCR_ULT_RCB();
        this.DT_MCR_ULT_RCB = mcr.getDT_MCR_ULT_RCB();
        this.VR_MCR_CUS_MED = mcr.getVR_MCR_CUS_MED();
        this.DT_MCR_ICL = mcr.getDT_MCR_ICL();
        this.CD_EMPGCB_FUN_ALT = mcr.getCD_EMPGCB_FUN_ALT();
        this.CD_FUN_ALT = mcr.getCD_FUN_ALT();
        this.DT_MCR_ULT_ALT = mcr.getDT_MCR_ULT_ALT();
        this.CD_MCR_FCH_TEC = mcr.getCD_MCR_FCH_TEC();
        this.ST_MCR_DTB_ATM = mcr.getST_MCR_DTB_ATM();
        this.QT_MCR_CBG = mcr.getQT_MCR_CBG();
        this.QT_MCR_MAX_REQ = mcr.getQT_MCR_MAX_REQ();
        this.DT_MCR_ULT_DTB = mcr.getDT_MCR_ULT_DTB();
        this.DT_MCR_MNT_CBG = mcr.getDT_MCR_MNT_CBG();
        this.CD_CFIPI_RED = mcr.getCD_CFIPI_RED();
        this.QT_MCR_ATR = mcr.getQT_MCR_ATR();
        this.QT_MCR_LGU = mcr.getQT_MCR_LGU();
        this.QT_MCR_CMT = mcr.getQT_MCR_CMT();
        this.ST_MCR_CSC = mcr.getST_MCR_CSC();
        this.ST_MCR_ETG_DPO = mcr.getST_MCR_ETG_DPO();
        this.CD_EMPGCB_FNE_PEC = mcr.getCD_EMPGCB_FNE_PEC();
        this.CD_FNEMCR_FNE_PEC = mcr.getCD_FNEMCR_FNE_PEC();
        this.ST_MCR_VND_PRO = mcr.getST_MCR_VND_PRO();
        this.ST_MCR_DIG_SIS = mcr.getST_MCR_DIG_SIS();
        this.DT_MCR_PDT = mcr.getDT_MCR_PDT();
        this.ST_MCR_MTG = mcr.getST_MCR_MTG();
        this.ST_MCR_GLE = mcr.getST_MCR_GLE();
        this.ST_MCR_TBT_ESP = mcr.getST_MCR_TBT_ESP();
        this.ST_MCR_TEC = mcr.getST_MCR_TEC();
        this.CD_RTCMCR = mcr.getCD_RTCMCR();
        this.ST_MCR_BRD = mcr.getST_MCR_BRD();
        this.CD_TGMCR = mcr.getCD_TGMCR();
        this.CD_MODMCR = mcr.getCD_MODMCR();
        this.DT_MCR_REU = mcr.getDT_MCR_REU();
        this.QT_MCR_SER = mcr.getQT_MCR_SER();
        this.QT_MCR_LIN = mcr.getQT_MCR_LIN();
        this.QT_MCR_CHP = mcr.getQT_MCR_CHP();
        this.ST_MCR_FNC_TCO = mcr.getST_MCR_FNC_TCO();
        this.ST_MCR_GES = mcr.getST_MCR_GES();
        this.QT_MCR_DIA_PDT = mcr.getQT_MCR_DIA_PDT();
        this.CD_OPRCEL = mcr.getCD_OPRCEL();
        this.CD_RGICEL = mcr.getCD_RGICEL();
        this.ST_MCR_REQ_PRO = mcr.getST_MCR_REQ_PRO();
        this.ST_MCR_MID = mcr.getST_MCR_MID();
        this.QT_MCR_PSO = mcr.getQT_MCR_PSO();
        this.ST_MCR_LOJ_VRT = mcr.getST_MCR_LOJ_VRT();
        this.ST_MCR_CVT = mcr.getST_MCR_CVT();
        this.TX_MCR_DIF = mcr.getTX_MCR_DIF();
        this.QT_MCR_MTD = mcr.getQT_MCR_MTD();
        this.ST_MCR_CTZ = mcr.getST_MCR_CTZ();
        this.QT_MCR_VLM_EBG = mcr.getQT_MCR_VLM_EBG();
        this.ST_MCR_ECL_ITR = mcr.getST_MCR_ECL_ITR();
        this.CD_MCR_FAB = mcr.getCD_MCR_FAB();
        this.QT_MCR_PSO_LIQ = mcr.getQT_MCR_PSO_LIQ();
        this.QT_MCR_BLO_AMZ = mcr.getQT_MCR_BLO_AMZ();
        this.CD_MCR_CCT_CEL = mcr.getCD_MCR_CCT_CEL();
        this.CD_TCMCR = mcr.getCD_TCMCR();
        this.CD_ITCMCR = mcr.getCD_ITCMCR();
        this.ST_MCR_ABC = mcr.getST_MCR_ABC();
        this.QT_MCR_MUL_VND = mcr.getQT_MCR_MUL_VND();
        this.ST_MCR_SAT = mcr.getST_MCR_SAT();
        this.ST_MCR_VIC = mcr.getST_MCR_VIC();
        this.CD_MCR_EAN = mcr.getCD_MCR_EAN();
        this.ST_MCR_PEG_LEV = mcr.getST_MCR_PEG_LEV();
        this.ST_MCR_DTB_STM = mcr.getST_MCR_DTB_STM();
        this.QT_MCR_TMP_MTG = mcr.getQT_MCR_TMP_MTG();
        this.CD_MCDORI = mcr.getCD_MCDORI();
        this.ST_MCR_TIP_ETG = mcr.getST_MCR_TIP_ETG();
        this.ST_MCR_TIP_FNE = mcr.getST_MCR_TIP_FNE();
        this.ST_MCR_PPB = mcr.getST_MCR_PPB();
        this.DS_MCR_PPB_PRT = mcr.getDS_MCR_PPB_PRT();
        this.ST_MCR_CAD_FIS = mcr.getST_MCR_CAD_FIS();
        this.ST_MCR_BEM = mcr.getST_MCR_BEM();
        this.CD_MCDORI_PDT = mcr.getCD_MCDORI_PDT();
        this.ST_MCR_VND_CNJ = mcr.getST_MCR_VND_CNJ();
        this.ST_MCR_DMG = mcr.getST_MCR_DMG();
        this.ST_MCR_ELG_MBL = mcr.getST_MCR_ELG_MBL();
        this.CD_MCR_EAN_CXA = mcr.getCD_MCR_EAN_CXA();
        this.ST_MCR_SIN = mcr.getST_MCR_SIN();
        this.ST_MCR_SVV = mcr.getST_MCR_SVV();
        this.ST_MCR_SCN = mcr.getST_MCR_SCN();
        this.ST_MCR_SMV = mcr.getST_MCR_SMV();
        this.ST_MCR_ATZ_PMT = mcr.getST_MCR_ATZ_PMT();
        this.ST_MCR_CPR_PRO = mcr.getST_MCR_CPR_PRO();
        this.CD_MCR_CIT = mcr.getCD_MCR_CIT();
        this.ST_MCR_DTB_CXA = mcr.getST_MCR_DTB_CXA();
        this.CD_MDLMCR = mcr.getCD_MDLMCR();
        this.CD_TIPMCR = mcr.getCD_TIPMCR();
        this.CD_MCR_EAN_OPR = mcr.getCD_MCR_EAN_OPR();
        this.ST_MCR_UTZ_ATC = mcr.getST_MCR_UTZ_ATC();
        this.ST_MCR_SON = mcr.getST_MCR_SON();
        this.CD_MCR_TIP_PRD = mcr.getCD_MCR_TIP_PRD();
        this.CD_MCR_FNE = mcr.getCD_MCR_FNE();
        this.CD_SUBESP = mcr.getCD_SUBESP();
        this.QT_MCR_ATR_MTD = mcr.getQT_MCR_ATR_MTD();
        this.QT_MCR_LGU_MTD = mcr.getQT_MCR_LGU_MTD();
        this.QT_MCR_CMT_MTD = mcr.getQT_MCR_CMT_MTD();
        this.CD_MRCMCR_CMC = mcr.getCD_MRCMCR_CMC();
        this.ST_MCR_BLQ_VND = mcr.getST_MCR_BLQ_VND();
        this.ST_MCR_PRE_LAN = mcr.getST_MCR_PRE_LAN();
        this.QT_MCR_CXA_SUP = mcr.getQT_MCR_CXA_SUP();
        this.ST_MCR_ENV_NGD = mcr.getST_MCR_ENV_NGD();
        this.ST_MCR_SUS = mcr.getST_MCR_SUS();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_MCR")
    private Integer CD_MCR;

    @Column(name = "CD_SETMCR")
    private String CD_SETMCR;

    @Column(name = "CD_ESPMCR")
    private String CD_ESPMCR;

    @Column(name = "CD_MRCMCR")
    private String CD_MRCMCR;

    @Column(name = "CD_CLAMCR")
    private String CD_CLAMCR;

    @Column(name = "CD_MCR_LIN")
    private String CD_MCR_LIN;

    @Column(name = "CD_TSMCR")
    private String CD_TSMCR;

    @Column(name = "CD_MCR_ORD_EMI")
    private String CD_MCR_ORD_EMI;

    @Column(name = "DS_MCR")
    private String DS_MCR;

    @Column(name = "VR_MCR_RBT_ATU")
    private String VR_MCR_RBT_ATU;

    @Column(name = "VR_MCR_RBT_PXM")
    private String VR_MCR_RBT_PXM;

    @Column(name = "VR_MCR_RBT_RTO")
    private String VR_MCR_RBT_RTO;

    @Column(name = "VR_MCR_SGT_ATU")
    private String VR_MCR_SGT_ATU;

    @Column(name = "VR_MCR_SGT_PXM")
    private String VR_MCR_SGT_PXM;

    @Column(name = "VR_MCR_SGT_RTO")
    private String VR_MCR_SGT_RTO;

    @Column(name = "VR_MCR_VND_EPL")
    private String VR_MCR_VND_EPL;

    @Column(name = "ST_MCR_ORI")
    private String ST_MCR_ORI;

    @Column(name = "ST_MCR_UND_VND")
    private String ST_MCR_UND_VND;

    @Column(name = "VR_MCR_CPR_FNE")
    private String VR_MCR_CPR_FNE;

    @Column(name = "TX_MCR_ABT")
    private String TX_MCR_ABT;

    @Column(name = "TX_MCR_IPI")
    private String TX_MCR_IPI;

    @Column(name = "TX_MCR_PPG")
    private String TX_MCR_PPG;

    @Column(name = "CD_CNDPGT")
    private String CD_CNDPGT;

    @Column(name = "VR_MCR_ULT_RCB")
    private String VR_MCR_ULT_RCB;

    @Column(name = "DT_MCR_ULT_RCB")
    private String DT_MCR_ULT_RCB;

    @Column(name = "VR_MCR_CUS_MED")
    private String VR_MCR_CUS_MED;

    @Column(name = "DT_MCR_ICL")
    private String DT_MCR_ICL;

    @Column(name = "CD_EMPGCB_FUN_ALT")
    private String CD_EMPGCB_FUN_ALT;

    @Column(name = "CD_FUN_ALT")
    private String CD_FUN_ALT;

    @Column(name = "DT_MCR_ULT_ALT")
    private String DT_MCR_ULT_ALT;

    @Column(name = "CD_MCR_FCH_TEC")
    private String CD_MCR_FCH_TEC;

    @Column(name = "ST_MCR_DTB_ATM")
    private String ST_MCR_DTB_ATM;

    @Column(name = "QT_MCR_CBG")
    private String QT_MCR_CBG;

    @Column(name = "QT_MCR_MAX_REQ")
    private String QT_MCR_MAX_REQ;

    @Column(name = "DT_MCR_ULT_DTB")
    private String DT_MCR_ULT_DTB;

    @Column(name = "DT_MCR_MNT_CBG")
    private String DT_MCR_MNT_CBG;

    @Column(name = "CD_CFIPI_RED")
    private String CD_CFIPI_RED;

    @Column(name = "QT_MCR_ATR")
    private String QT_MCR_ATR;

    @Column(name = "QT_MCR_LGU")
    private String QT_MCR_LGU;

    @Column(name = "QT_MCR_CMT")
    private String QT_MCR_CMT;

    @Column(name = "ST_MCR_CSC")
    private String ST_MCR_CSC;

    @Column(name = "ST_MCR_ETG_DPO")
    private String ST_MCR_ETG_DPO;

    @Column(name = "CD_EMPGCB_FNE_PEC")
    private String CD_EMPGCB_FNE_PEC;

    @Column(name = "CD_FNEMCR_FNE_PEC")
    private String CD_FNEMCR_FNE_PEC;

    @Column(name = "ST_MCR_VND_PRO")
    private String ST_MCR_VND_PRO;

    @Column(name = "ST_MCR_DIG_SIS")
    private String ST_MCR_DIG_SIS;

    @Column(name = "DT_MCR_PDT")
    private String DT_MCR_PDT;

    @Column(name = "ST_MCR_MTG")
    private String ST_MCR_MTG;

    @Column(name = "ST_MCR_GLE")
    private String ST_MCR_GLE;

    @Column(name = "ST_MCR_TBT_ESP")
    private String ST_MCR_TBT_ESP;

    @Column(name = "ST_MCR_TEC")
    private String ST_MCR_TEC;

    @Column(name = "CD_RTCMCR")
    private String CD_RTCMCR;

    @Column(name = "ST_MCR_BRD")
    private String ST_MCR_BRD;

    @Column(name = "CD_TGMCR")
    private String CD_TGMCR;

    @Column(name = "CD_MODMCR")
    private String CD_MODMCR;

    @Column(name = "DT_MCR_REU")
    private String DT_MCR_REU;

    @Column(name = "QT_MCR_SER")
    private String QT_MCR_SER;

    @Column(name = "QT_MCR_LIN")
    private String QT_MCR_LIN;

    @Column(name = "QT_MCR_CHP")
    private String QT_MCR_CHP;

    @Column(name = "ST_MCR_FNC_TCO")
    private String ST_MCR_FNC_TCO;

    @Column(name = "ST_MCR_GES")
    private String ST_MCR_GES;

    @Column(name = "QT_MCR_DIA_PDT")
    private String QT_MCR_DIA_PDT;

    @Column(name = "CD_OPRCEL")
    private String CD_OPRCEL;

    @Column(name = "CD_RGICEL")
    private String CD_RGICEL;

    @Column(name = "ST_MCR_REQ_PRO")
    private String ST_MCR_REQ_PRO;

    @Column(name = "ST_MCR_MID")
    private String ST_MCR_MID;

    @Column(name = "QT_MCR_PSO")
    private String QT_MCR_PSO;

    @Column(name = "ST_MCR_LOJ_VRT")
    private String ST_MCR_LOJ_VRT;

    @Column(name = "ST_MCR_CVT")
    private String ST_MCR_CVT;

    @Column(name = "TX_MCR_DIF")
    private String TX_MCR_DIF;

    @Column(name = "QT_MCR_MTD")
    private String QT_MCR_MTD;

    @Column(name = "ST_MCR_CTZ")
    private String ST_MCR_CTZ;

    @Column(name = "QT_MCR_VLM_EBG")
    private String QT_MCR_VLM_EBG;

    @Column(name = "ST_MCR_ECL_ITR")
    private String ST_MCR_ECL_ITR;

    @Column(name = "CD_MCR_FAB")
    private String CD_MCR_FAB;

    @Column(name = "QT_MCR_PSO_LIQ")
    private String QT_MCR_PSO_LIQ;

    @Column(name = "QT_MCR_BLO_AMZ")
    private String QT_MCR_BLO_AMZ;

    @Column(name = "CD_MCR_CCT_CEL")
    private String CD_MCR_CCT_CEL;

    @Column(name = "CD_TCMCR")
    private String CD_TCMCR;

    @Column(name = "CD_ITCMCR")
    private String CD_ITCMCR;

    @Column(name = "ST_MCR_ABC")
    private String ST_MCR_ABC;

    @Column(name = "QT_MCR_MUL_VND")
    private String QT_MCR_MUL_VND;

    @Column(name = "ST_MCR_SAT")
    private String ST_MCR_SAT;

    @Column(name = "ST_MCR_VIC")
    private String ST_MCR_VIC;

    @Column(name = "CD_MCR_EAN")
    private String CD_MCR_EAN;

    @Column(name = "ST_MCR_PEG_LEV")
    private String ST_MCR_PEG_LEV;

    @Column(name = "ST_MCR_DTB_STM")
    private String ST_MCR_DTB_STM;

    @Column(name = "QT_MCR_TMP_MTG")
    private String QT_MCR_TMP_MTG;

    @Column(name = "CD_MCDORI")
    private String CD_MCDORI;

    @Column(name = "ST_MCR_TIP_ETG")
    private String ST_MCR_TIP_ETG;

    @Column(name = "ST_MCR_TIP_FNE")
    private String ST_MCR_TIP_FNE;

    @Column(name = "ST_MCR_PPB")
    private String ST_MCR_PPB;

    @Column(name = "DS_MCR_PPB_PRT")
    private String DS_MCR_PPB_PRT;

    @Column(name = "ST_MCR_CAD_FIS")
    private String ST_MCR_CAD_FIS;

    @Column(name = "ST_MCR_BEM")
    private String ST_MCR_BEM;

    @Column(name = "CD_MCDORI_PDT")
    private String CD_MCDORI_PDT;

    @Column(name = "ST_MCR_VND_CNJ")
    private String ST_MCR_VND_CNJ;

    @Column(name = "ST_MCR_DMG")
    private String ST_MCR_DMG;

    @Column(name = "ST_MCR_ELG_MBL")
    private String ST_MCR_ELG_MBL;

    @Column(name = "CD_MCR_EAN_CXA")
    private String CD_MCR_EAN_CXA;

    @Column(name = "ST_MCR_SIN")
    private String ST_MCR_SIN;

    @Column(name = "ST_MCR_SVV")
    private String ST_MCR_SVV;

    @Column(name = "ST_MCR_SCN")
    private String ST_MCR_SCN;

    @Column(name = "ST_MCR_SMV")
    private String ST_MCR_SMV;

    @Column(name = "ST_MCR_ATZ_PMT")
    private String ST_MCR_ATZ_PMT;

    @Column(name = "ST_MCR_CPR_PRO")
    private String ST_MCR_CPR_PRO;

    @Column(name = "CD_MCR_CIT")
    private String CD_MCR_CIT;

    @Column(name = "ST_MCR_DTB_CXA")
    private String ST_MCR_DTB_CXA;

    @Column(name = "CD_MDLMCR")
    private String CD_MDLMCR;

    @Column(name = "CD_TIPMCR")
    private String CD_TIPMCR;

    @Column(name = "CD_MCR_EAN_OPR")
    private String CD_MCR_EAN_OPR;

    @Column(name = "ST_MCR_UTZ_ATC")
    private String ST_MCR_UTZ_ATC;

    @Column(name = "ST_MCR_SON")
    private String ST_MCR_SON;

    @Column(name = "CD_MCR_TIP_PRD")
    private String CD_MCR_TIP_PRD;

    @Column(name = "CD_MCR_FNE")
    private String CD_MCR_FNE;

    @Column(name = "CD_SUBESP")
    private String CD_SUBESP;

    @Column(name = "QT_MCR_ATR_MTD")
    private String QT_MCR_ATR_MTD;

    @Column(name = "QT_MCR_LGU_MTD")
    private String QT_MCR_LGU_MTD;

    @Column(name = "QT_MCR_CMT_MTD")
    private String QT_MCR_CMT_MTD;

    @Column(name = "CD_MRCMCR_CMC")
    private String CD_MRCMCR_CMC;

    @Column(name = "ST_MCR_BLQ_VND")
    private String ST_MCR_BLQ_VND;

    @Column(name = "ST_MCR_PRE_LAN")
    private String ST_MCR_PRE_LAN;

    @Column(name = "QT_MCR_CXA_SUP")
    private String QT_MCR_CXA_SUP;

    @Column(name = "ST_MCR_ENV_NGD")
    private String ST_MCR_ENV_NGD;

    @Column(name = "ST_MCR_SUS")
    private String ST_MCR_SUS;

    @Override
    public String toString() {
        return "MCR{" +
                "CD_MCR='" + CD_MCR + '\'' +
                ", CD_SETMCR='" + CD_SETMCR + '\'' +
                ", CD_ESPMCR='" + CD_ESPMCR + '\'' +
                ", CD_MRCMCR='" + CD_MRCMCR + '\'' +
                ", CD_CLAMCR='" + CD_CLAMCR + '\'' +
                ", CD_MCR_LIN='" + CD_MCR_LIN + '\'' +
                ", CD_TSMCR='" + CD_TSMCR + '\'' +
                ", CD_MCR_ORD_EMI='" + CD_MCR_ORD_EMI + '\'' +
                ", DS_MCR='" + DS_MCR + '\'' +
                ", VR_MCR_RBT_ATU='" + VR_MCR_RBT_ATU + '\'' +
                ", VR_MCR_RBT_PXM='" + VR_MCR_RBT_PXM + '\'' +
                ", VR_MCR_RBT_RTO='" + VR_MCR_RBT_RTO + '\'' +
                ", VR_MCR_SGT_ATU='" + VR_MCR_SGT_ATU + '\'' +
                ", VR_MCR_SGT_PXM='" + VR_MCR_SGT_PXM + '\'' +
                ", VR_MCR_SGT_RTO='" + VR_MCR_SGT_RTO + '\'' +
                ", VR_MCR_VND_EPL='" + VR_MCR_VND_EPL + '\'' +
                ", ST_MCR_ORI='" + ST_MCR_ORI + '\'' +
                ", ST_MCR_UND_VND='" + ST_MCR_UND_VND + '\'' +
                ", VR_MCR_CPR_FNE='" + VR_MCR_CPR_FNE + '\'' +
                ", TX_MCR_ABT='" + TX_MCR_ABT + '\'' +
                ", TX_MCR_IPI='" + TX_MCR_IPI + '\'' +
                ", TX_MCR_PPG='" + TX_MCR_PPG + '\'' +
                ", CD_CNDPGT='" + CD_CNDPGT + '\'' +
                ", VR_MCR_ULT_RCB='" + VR_MCR_ULT_RCB + '\'' +
                ", DT_MCR_ULT_RCB='" + DT_MCR_ULT_RCB + '\'' +
                ", VR_MCR_CUS_MED='" + VR_MCR_CUS_MED + '\'' +
                ", DT_MCR_ICL='" + DT_MCR_ICL + '\'' +
                ", CD_EMPGCB_FUN_ALT='" + CD_EMPGCB_FUN_ALT + '\'' +
                ", CD_FUN_ALT='" + CD_FUN_ALT + '\'' +
                ", DT_MCR_ULT_ALT='" + DT_MCR_ULT_ALT + '\'' +
                ", CD_MCR_FCH_TEC='" + CD_MCR_FCH_TEC + '\'' +
                ", ST_MCR_DTB_ATM='" + ST_MCR_DTB_ATM + '\'' +
                ", QT_MCR_CBG='" + QT_MCR_CBG + '\'' +
                ", QT_MCR_MAX_REQ='" + QT_MCR_MAX_REQ + '\'' +
                ", DT_MCR_ULT_DTB='" + DT_MCR_ULT_DTB + '\'' +
                ", DT_MCR_MNT_CBG='" + DT_MCR_MNT_CBG + '\'' +
                ", CD_CFIPI_RED='" + CD_CFIPI_RED + '\'' +
                ", QT_MCR_ATR='" + QT_MCR_ATR + '\'' +
                ", QT_MCR_LGU='" + QT_MCR_LGU + '\'' +
                ", QT_MCR_CMT='" + QT_MCR_CMT + '\'' +
                ", ST_MCR_CSC='" + ST_MCR_CSC + '\'' +
                ", ST_MCR_ETG_DPO='" + ST_MCR_ETG_DPO + '\'' +
                ", CD_EMPGCB_FNE_PEC='" + CD_EMPGCB_FNE_PEC + '\'' +
                ", CD_FNEMCR_FNE_PEC='" + CD_FNEMCR_FNE_PEC + '\'' +
                ", ST_MCR_VND_PRO='" + ST_MCR_VND_PRO + '\'' +
                ", ST_MCR_DIG_SIS='" + ST_MCR_DIG_SIS + '\'' +
                ", DT_MCR_PDT='" + DT_MCR_PDT + '\'' +
                ", ST_MCR_MTG='" + ST_MCR_MTG + '\'' +
                ", ST_MCR_GLE='" + ST_MCR_GLE + '\'' +
                ", ST_MCR_TBT_ESP='" + ST_MCR_TBT_ESP + '\'' +
                ", ST_MCR_TEC='" + ST_MCR_TEC + '\'' +
                ", CD_RTCMCR='" + CD_RTCMCR + '\'' +
                ", ST_MCR_BRD='" + ST_MCR_BRD + '\'' +
                ", CD_TGMCR='" + CD_TGMCR + '\'' +
                ", CD_MODMCR='" + CD_MODMCR + '\'' +
                ", DT_MCR_REU='" + DT_MCR_REU + '\'' +
                ", QT_MCR_SER='" + QT_MCR_SER + '\'' +
                ", QT_MCR_LIN='" + QT_MCR_LIN + '\'' +
                ", QT_MCR_CHP='" + QT_MCR_CHP + '\'' +
                ", ST_MCR_FNC_TCO='" + ST_MCR_FNC_TCO + '\'' +
                ", ST_MCR_GES='" + ST_MCR_GES + '\'' +
                ", QT_MCR_DIA_PDT='" + QT_MCR_DIA_PDT + '\'' +
                ", CD_OPRCEL='" + CD_OPRCEL + '\'' +
                ", CD_RGICEL='" + CD_RGICEL + '\'' +
                ", ST_MCR_REQ_PRO='" + ST_MCR_REQ_PRO + '\'' +
                ", ST_MCR_MID='" + ST_MCR_MID + '\'' +
                ", QT_MCR_PSO='" + QT_MCR_PSO + '\'' +
                ", ST_MCR_LOJ_VRT='" + ST_MCR_LOJ_VRT + '\'' +
                ", ST_MCR_CVT='" + ST_MCR_CVT + '\'' +
                ", TX_MCR_DIF='" + TX_MCR_DIF + '\'' +
                ", QT_MCR_MTD='" + QT_MCR_MTD + '\'' +
                ", ST_MCR_CTZ='" + ST_MCR_CTZ + '\'' +
                ", QT_MCR_VLM_EBG='" + QT_MCR_VLM_EBG + '\'' +
                ", ST_MCR_ECL_ITR='" + ST_MCR_ECL_ITR + '\'' +
                ", CD_MCR_FAB='" + CD_MCR_FAB + '\'' +
                ", QT_MCR_PSO_LIQ='" + QT_MCR_PSO_LIQ + '\'' +
                ", QT_MCR_BLO_AMZ='" + QT_MCR_BLO_AMZ + '\'' +
                ", CD_MCR_CCT_CEL='" + CD_MCR_CCT_CEL + '\'' +
                ", CD_TCMCR='" + CD_TCMCR + '\'' +
                ", CD_ITCMCR='" + CD_ITCMCR + '\'' +
                ", ST_MCR_ABC='" + ST_MCR_ABC + '\'' +
                ", QT_MCR_MUL_VND='" + QT_MCR_MUL_VND + '\'' +
                ", ST_MCR_SAT='" + ST_MCR_SAT + '\'' +
                ", ST_MCR_VIC='" + ST_MCR_VIC + '\'' +
                ", CD_MCR_EAN='" + CD_MCR_EAN + '\'' +
                ", ST_MCR_PEG_LEV='" + ST_MCR_PEG_LEV + '\'' +
                ", ST_MCR_DTB_STM='" + ST_MCR_DTB_STM + '\'' +
                ", QT_MCR_TMP_MTG='" + QT_MCR_TMP_MTG + '\'' +
                ", CD_MCDORI='" + CD_MCDORI + '\'' +
                ", ST_MCR_TIP_ETG='" + ST_MCR_TIP_ETG + '\'' +
                ", ST_MCR_TIP_FNE='" + ST_MCR_TIP_FNE + '\'' +
                ", ST_MCR_PPB='" + ST_MCR_PPB + '\'' +
                ", DS_MCR_PPB_PRT='" + DS_MCR_PPB_PRT + '\'' +
                ", ST_MCR_CAD_FIS='" + ST_MCR_CAD_FIS + '\'' +
                ", ST_MCR_BEM='" + ST_MCR_BEM + '\'' +
                ", CD_MCDORI_PDT='" + CD_MCDORI_PDT + '\'' +
                ", ST_MCR_VND_CNJ='" + ST_MCR_VND_CNJ + '\'' +
                ", ST_MCR_DMG='" + ST_MCR_DMG + '\'' +
                ", ST_MCR_ELG_MBL='" + ST_MCR_ELG_MBL + '\'' +
                ", CD_MCR_EAN_CXA='" + CD_MCR_EAN_CXA + '\'' +
                ", ST_MCR_SIN='" + ST_MCR_SIN + '\'' +
                ", ST_MCR_SVV='" + ST_MCR_SVV + '\'' +
                ", ST_MCR_SCN='" + ST_MCR_SCN + '\'' +
                ", ST_MCR_SMV='" + ST_MCR_SMV + '\'' +
                ", ST_MCR_ATZ_PMT='" + ST_MCR_ATZ_PMT + '\'' +
                ", ST_MCR_CPR_PRO='" + ST_MCR_CPR_PRO + '\'' +
                ", CD_MCR_CIT='" + CD_MCR_CIT + '\'' +
                ", ST_MCR_DTB_CXA='" + ST_MCR_DTB_CXA + '\'' +
                ", CD_MDLMCR='" + CD_MDLMCR + '\'' +
                ", CD_TIPMCR='" + CD_TIPMCR + '\'' +
                ", CD_MCR_EAN_OPR='" + CD_MCR_EAN_OPR + '\'' +
                ", ST_MCR_UTZ_ATC='" + ST_MCR_UTZ_ATC + '\'' +
                ", ST_MCR_SON='" + ST_MCR_SON + '\'' +
                ", CD_MCR_TIP_PRD='" + CD_MCR_TIP_PRD + '\'' +
                ", CD_MCR_FNE='" + CD_MCR_FNE + '\'' +
                ", CD_SUBESP='" + CD_SUBESP + '\'' +
                ", QT_MCR_ATR_MTD='" + QT_MCR_ATR_MTD + '\'' +
                ", QT_MCR_LGU_MTD='" + QT_MCR_LGU_MTD + '\'' +
                ", QT_MCR_CMT_MTD='" + QT_MCR_CMT_MTD + '\'' +
                ", CD_MRCMCR_CMC='" + CD_MRCMCR_CMC + '\'' +
                ", ST_MCR_BLQ_VND='" + ST_MCR_BLQ_VND + '\'' +
                ", ST_MCR_PRE_LAN='" + ST_MCR_PRE_LAN + '\'' +
                ", QT_MCR_CXA_SUP='" + QT_MCR_CXA_SUP + '\'' +
                ", ST_MCR_ENV_NGD='" + ST_MCR_ENV_NGD + '\'' +
                ", ST_MCR_SUS='" + ST_MCR_SUS + '\'' +
                "}\n";
    }
}
