
CREATE TABLE E_15 (
);


CREATE TABLE E_20 (
);


CREATE TABLE M_CSB_DMMS (
       dmmc                 VARCHAR(15) NOT NULL,
       dmz                  VARCHAR(30) NOT NULL,
       dmms                 VARCHAR(200),
       dmsm                 VARCHAR(200),
       PRIMARY KEY (dmmc, dmz)
);

CREATE UNIQUE INDEX XPKM_CSB_DMMS ON M_CSB_DMMS
(
       dmmc                           ASC,
       dmz                            ASC
);


CREATE TABLE M_DXSJ_XXXX (
       tjrq                 INTEGER NOT NULL,
       yhbs                 VARCHAR(50) NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       xsmc                 VARCHAR(50) NOT NULL,
       qzmc                 VARCHAR(20) NOT NULL,
       qz                   DECIMAL(25,1),
       px                   INTEGER,
       PRIMARY KEY (tjrq, yhbs, hydh, xsmc)
);

CREATE UNIQUE INDEX XPKM_DXSJ_XXXX ON M_DXSJ_XXXX
(
       tjrq                           ASC,
       yhbs                           ASC,
       hydh                           ASC,
       xsmc                           ASC
);


CREATE TABLE M_DXZD (
       tjrq                 INTEGER NOT NULL,
       yhbs                 VARCHAR(20) NOT NULL,
       dxfsts               INTEGER,
       xfje                 DECIMAL(19,2),
       zhye                 DECIMAL(19,2),
       PRIMARY KEY (tjrq, yhbs)
);

CREATE UNIQUE INDEX XPKM_DXZD ON M_DXZD
(
       tjrq                           ASC,
       yhbs                           ASC
);


CREATE TABLE M_KHB (
       yhbs                 VARCHAR(200) NOT NULL,
       yhid                 VARCHAR(6),
       yhmc                 VARCHAR(50),
       yhfl                 VARCHAR(50) NOT NULL,
       zcrq                 INTEGER,
       sfzxpf               CHAR(2),
       sfyxgl               VARCHAR(2),
       PRIMARY KEY (yhbs)
);

CREATE UNIQUE INDEX XPKM_KHB ON M_KHB
(
       yhbs                           ASC
);


CREATE TABLE M_RZB (
       rzid                 INTEGER NOT NULL,
       tjrq                 INTEGER,
       hydh                 VARCHAR(12),
       hymc                 VARCHAR(10),
       yhbs                 VARCHAR(200) NOT NULL,
       fslb                 CHAR(2),
       rzzt                 VARCHAR(2),
       rzsj                 TIMESTAMP,
       rzms                 VARCHAR(4000),
       PRIMARY KEY (rzid)
);

CREATE UNIQUE INDEX XPKM_RZB ON M_RZB
(
       rzid                           ASC
);


CREATE TABLE M_YHB (
       yhid                 INTEGER NOT NULL,
       hydh                 VARCHAR(12),
       hymc                 VARCHAR(10),
       dlmc                 VARCHAR(20),
       dlmm                 VARCHAR(32),
       yhbs                 VARCHAR(200),
       sfscdl               VARCHAR(2),
       sjhm                 VARCHAR(11),
       yjdz                 VARCHAR(100),
       wxh                  VARCHAR(50),
       PRIMARY KEY (yhid)
);

CREATE UNIQUE INDEX XPKM_YHB ON M_YHB
(
       yhid                           ASC
);


CREATE TABLE M_消息推送 (
       ID                   INTEGER NOT NULL,
       xxlx                 VARCHAR(8),
       payload              VARCHAR(800),
       tssj                 TIMESTAMP,
       tshy                 INTEGER,
       tsbs                 VARCHAR(2),
       alias                VARCHAR(20),
       alias_type           VARCHAR(10),
       policy               VARCHAR(20),
       PRIMARY KEY (ID)
);

CREATE UNIQUE INDEX XPKM_消息推送 ON M_消息推送
(
       ID                             ASC
);


CREATE TABLE MPAS_APPDZGL (
       yhbs                 VARCHAR(200) NOT NULL,
       fwdz                 VARCHAR(100) NOT NULL,
       vpnsfkq              VARCHAR(2),
       vpnip                VARCHAR(100),
       vpnyhm               VARCHAR(20),
       vpnmm                VARCHAR(20),
       PRIMARY KEY (yhbs)
);

CREATE UNIQUE INDEX XPKMPAS_APPDZGL ON MPAS_APPDZGL
(
       yhbs                           ASC
);


CREATE TABLE MPAS_BHKH (
       khdxdh               INTEGER NOT NULL,
       khh                  VARCHAR(30) NOT NULL,
       khmc                 VARCHAR(100) NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       bhje                 DECIMAL(19,2),
       ckye                 DECIMAL(19,2),
       xskhh                VARCHAR(30),
       xskhmc               VARCHAR(100),
       PRIMARY KEY (khdxdh, khh, khmc)
);

CREATE UNIQUE INDEX XPKMPAS_BHKH ON MPAS_BHKH
(
       khdxdh                         ASC,
       khh                            ASC,
       khmc                           ASC
);


CREATE TABLE MPAS_CDSZ (
       cdbh                 VARCHAR(20) NOT NULL,
       APPbb                VARCHAR(2) NOT NULL,
       cdjb                 VARCHAR(2),
       cdmc                 VARCHAR(200),
       cdms                 VARCHAR(200),
       cddz                 VARCHAR(100),
       sjcd                 VARCHAR(20),
       cddyb                VARCHAR(20),
       px                   INTEGER,
       PRIMARY KEY (cdbh, APPbb)
);

CREATE UNIQUE INDEX XPKMPAS_CDSZ ON MPAS_CDSZ
(
       cdbh                           ASC,
       APPbb                          ASC
);


CREATE TABLE MPAS_CKDQKH (
       khdxdh               INTEGER NOT NULL,
       jxdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       zhdh                 VARCHAR(40) NOT NULL,
       kmh                  VARCHAR(20),
       kmmc                 VARCHAR(40),
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       dqrq                 INTEGER,
       zhye                 DECIMAL(19,2),
       ghbl                 DECIMAL(19,2),
       ghsj                 INTEGER,
       ghxx                 VARCHAR(400),
       xskhh                VARCHAR(30),
       xskhmc               VARCHAR(100),
       xszhdh               VARCHAR(40),
       PRIMARY KEY (khdxdh, jxdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_CKDQKH ON MPAS_CKDQKH
(
       khdxdh                         ASC,
       jxdxdh                         ASC
);


CREATE TABLE MPAS_CPFL (
       fldh                 VARCHAR(2) NOT NULL,
       flmc                 VARCHAR(50),
       px                   INTEGER,
       PRIMARY KEY (fldh)
);

CREATE UNIQUE INDEX XPKMPAS_CPFL ON MPAS_CPFL
(
       fldh                           ASC
);


CREATE TABLE MPAS_CPFL_XXXX (
       fldh                 INTEGER NOT NULL,
       flmc                 VARCHAR(50),
       px                   INTEGER,
       PRIMARY KEY (fldh)
);

CREATE UNIQUE INDEX XPKMPAS_CPFL_XXXX ON MPAS_CPFL_XXXX
(
       fldh                           ASC
);


CREATE TABLE MPAS_CSB_BQFZ (
       fzdh                 VARCHAR(2) NOT NULL,
       fzmc                 VARCHAR(50),
       PRIMARY KEY (fzdh)
);

CREATE UNIQUE INDEX XPKMPAS_CSB_BQFZ ON MPAS_CSB_BQFZ
(
       fzdh                           ASC
);


CREATE TABLE MPAS_CSB_BQFZ_XXXX (
       fzdh                 VARCHAR(2) NOT NULL,
       fzmc                 VARCHAR(50),
       PRIMARY KEY (fzdh)
);

CREATE UNIQUE INDEX XPKMPAS_CSB_BQFZ_X ON MPAS_CSB_BQFZ_XXXX
(
       fzdh                           ASC
);


CREATE TABLE MPAS_CSB_HYGW (
       yhbs                 VARCHAR(50) NOT NULL,
       gwbh                 VARCHAR2(10) NOT NULL,
       gwmc                 VARCHAR2(50) NOT NULL,
       PRIMARY KEY (yhbs, gwbh)
);

CREATE UNIQUE INDEX XPKCSB_HYGW ON MPAS_CSB_HYGW
(
       yhbs                           ASC,
       gwbh                           ASC
);


CREATE TABLE MPAS_DKDQKH (
       khdxdh               INTEGER NOT NULL,
       jxdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       zhdh                 VARCHAR(40) NOT NULL,
       kmh                  VARCHAR(20),
       kmmc                 VARCHAR(40),
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       dqrq                 INTEGER,
       zhye                 DECIMAL(19,2),
       ghbl                 DECIMAL(19,2),
       ghsj                 INTEGER,
       ghxx                 VARCHAR(400),
       xskhh                VARCHAR(30),
       xskhmc               VARCHAR(100),
       xszhdh               VARCHAR(40),
       PRIMARY KEY (khdxdh, jxdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_DKDQKH ON MPAS_DKDQKH
(
       khdxdh                         ASC,
       jxdxdh                         ASC
);


CREATE TABLE MPAS_GR_ZXPF (
       yhbs                 VARCHAR(50) NOT NULL,
       fabh                 INTEGER NOT NULL,
       khqs                 INTEGER NOT NULL,
       dfzkhdxdh            INTEGER NOT NULL,
       hykhdxdh             INTEGER NOT NULL,
       xmbh                 INTEGER NOT NULL,
       khdx                 VARCHAR(2),
       wdmc                 VARCHAR(200),
       xmmc                 VARCHAR(100),
       khnr                 VARCHAR(2000),
       khzq                 INTEGER,
       pfqz                 DECIMAL(19,4),
       xmdfsx               DECIMAL(25,4),
       xmdfxx               DECIMAL(25,4),
       df                   DECIMAL(25,4),
       pfzt                 VARCHAR(2),
       PRIMARY KEY (yhbs, fabh, khqs, dfzkhdxdh, hykhdxdh, xmbh)
);

CREATE UNIQUE INDEX XPKMPAS_GR_ZXPF ON MPAS_GR_ZXPF
(
       yhbs                           ASC,
       fabh                           ASC,
       khqs                           ASC,
       dfzkhdxdh                      ASC,
       hykhdxdh                       ASC,
       xmbh                           ASC
);


CREATE TABLE MPAS_GRCSSZ (
       khdxdh               INTEGER NOT NULL,
       cslx                 VARCHAR(2) NOT NULL,
       csz                  VARCHAR(10),
       PRIMARY KEY (khdxdh, cslx)
);

CREATE UNIQUE INDEX XPKMPAS_GRCSSZ ON MPAS_GRCSSZ
(
       khdxdh                         ASC,
       cslx                           ASC
);


CREATE TABLE MPAS_GRGZKH (
       khdxdh               INTEGER NOT NULL,
       khh                  VARCHAR(30) NOT NULL,
       khmc                 VARCHAR(100),
       gzsj                 TIMESTAMP,
       PRIMARY KEY (khdxdh, khh)
);

CREATE UNIQUE INDEX XPKMPAS_GRGZKH ON MPAS_GRGZKH
(
       khdxdh                         ASC,
       khh                            ASC
);


CREATE TABLE MPAS_HDFL_XXXX (
       fldh                 INTEGER NOT NULL,
       flmc                 VARCHAR(50),
       px                   INTEGER,
       PRIMARY KEY (fldh)
);

CREATE UNIQUE INDEX XPKMPAS_HDFL_XXXX ON MPAS_HDFL_XXXX
(
       fldh                           ASC
);


CREATE TABLE MPAS_HY (
       khdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       hymc                 VARCHAR(40),
       jgkhdxdh             INTEGER,
       jgdh                 VARCHAR(20),
       jgmc                 VARCHAR(100),
       lbdh                 VARCHAR(10),
       lbmc                 VARCHAR(60),
       APPbb                VARCHAR(2),
       dlmc                 VARCHAR(12),
       dlmm                 VARCHAR(32),
       PRIMARY KEY (khdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_HY ON MPAS_HY
(
       khdxdh                         ASC
);


CREATE TABLE MPAS_HYCDCKTX (
       khdxdh               INTEGER NOT NULL,
       cdbh                 VARCHAR(20) NOT NULL,
       sfck                 VARCHAR(2),
       PRIMARY KEY (khdxdh, cdbh)
);

CREATE UNIQUE INDEX XPKMPAS_HYCDCKTX ON MPAS_HYCDCKTX
(
       khdxdh                         ASC,
       cdbh                           ASC
);


CREATE TABLE MPAS_HYLBDYKHJG (
       lbdh                 VARCHAR(10) NOT NULL,
       lbmc                 VARCHAR(20),
       fabh                 INTEGER,
       PRIMARY KEY (lbdh)
);

CREATE UNIQUE INDEX XPKMPAS_HYLBDYKHJG ON MPAS_HYLBDYKHJG
(
       lbdh                           ASC
);


CREATE TABLE MPAS_HYXX (
       hydh                 VARCHAR(40) NOT NULL,
       sjhm                 CHAR(11),
       yjdz                 VARCHAR(100),
       wxh                  VARCHAR(50),
       PRIMARY KEY (hydh)
);

CREATE UNIQUE INDEX XPKMPAS_HYXX ON MPAS_HYXX
(
       hydh                           ASC
);


CREATE TABLE MPAS_HYXXCKTX (
       khdxdh               INTEGER NOT NULL,
       xxbh                 INTEGER NOT NULL,
       sfck                 VARCHAR(2),
       xxzt                 VARCHAR(800),
       xxnr                 VARCHAR(4000),
       xxsj                 INTEGER,
       hydh                 VARCHAR(12),
       hymc                 VARCHAR(40),
       PRIMARY KEY (khdxdh, xxbh)
);

CREATE UNIQUE INDEX XPKMPAS_HYXXCKTX ON MPAS_HYXXCKTX
(
       khdxdh                         ASC,
       xxbh                           ASC
);


CREATE TABLE mpas_jcxx_log_XXXX (
       sjdh                 INTEGER NOT NULL,
       yhbs                 VARCHAR(10) NOT NULL,
       bm                   VARCHAR(20) NOT NULL,
       gxsj                 TIMESTAMP,
       PRIMARY KEY (sjdh)
);

CREATE UNIQUE INDEX XPKKHDX_JG ON mpas_jcxx_log_XXXX
(
       sjdh                           ASC
);


CREATE TABLE MPAS_KH_XXXX (
       khdh                 VARCHAR(50) NOT NULL,
       xm                   VARCHAR(100),
       xb                   VARCHAR(2),
       csny                 INTEGER,
       sf                   VARCHAR(10),
       cs                   VARCHAR(60),
       zylx                 VARCHAR(2),
       srsp                 VARCHAR(100),
       fxfs                 VARCHAR(2),
       ywfd                 VARCHAR(2),
       ywcd                 VARCHAR(2),
       ywxyk                VARCHAR(2),
       bzxx                 VARCHAR(200),
       khzt                 INTEGER,
       lxdh                 VARCHAR(20),
       sj                   VARCHAR(50),
       PRIMARY KEY (khdh)
);

CREATE UNIQUE INDEX XPKMPAS_KH_XXXX ON MPAS_KH_XXXX
(
       khdh                           ASC
);


CREATE TABLE MPAS_KHBQ_XXXX (
       fzdh                 VARCHAR(2) NOT NULL,
       bqdh                 VARCHAR(2) NOT NULL,
       bqmc                 VARCHAR(50),
       PRIMARY KEY (fzdh, bqdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHBQ_XXXX ON MPAS_KHBQ_XXXX
(
       fzdh                           ASC,
       bqdh                           ASC
);


CREATE TABLE MPAS_KHDX_JG (
       yhbs                 VARCHAR(50) NOT NULL,
       khdxdh               INTEGER NOT NULL,
       jgdh                 VARCHAR2(10),
       jgmc                 VARCHAR2(100),
       jyjgbz               VARCHAR2(1),
       pxbz                 INTEGER,
       zxzt                 VARCHAR2(1) NOT NULL,
       zxrq                 INTEGER,
       fhdh                 VARCHAR2(10),
       fhbz                 VARCHAR2(2),
       jgdj                 VARCHAR2(2),
       PRIMARY KEY (yhbs, khdxdh)
);

CREATE UNIQUE INDEX XPKKHDX_JG ON MPAS_KHDX_JG
(
       yhbs                           ASC,
       khdxdh                         ASC
);


CREATE TABLE MPAS_KHDX_ZNBS (
       yhbs                 VARCHAR(50) NOT NULL,
       khdxdh               INTEGER NOT NULL,
       jgdh                 VARCHAR2(10),
       jgmc                 VARCHAR2(100),
       jgjb                 INTEGER,
       sjkhdxdh             INTEGER,
       sjjgdh               VARCHAR(10) NOT NULL,
       pxbz                 INTEGER,
       fhdh                 VARCHAR(10),
       PRIMARY KEY (yhbs, khdxdh)
);

CREATE UNIQUE INDEX XPKKHDX_JG ON MPAS_KHDX_ZNBS
(
       yhbs                           ASC,
       khdxdh                         ASC
);


CREATE TABLE MPAS_KHFL_XXXX (
       khdh                 VARCHAR(50) NOT NULL,
       fzdh                 VARCHAR(2) NOT NULL,
       bqdh                 VARCHAR(2) NOT NULL,
       PRIMARY KEY (khdh, fzdh, bqdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHFL_XXXX ON MPAS_KHFL_XXXX
(
       khdh                           ASC,
       fzdh                           ASC,
       bqdh                           ASC
);


CREATE TABLE MPAS_KHGJ_XXXX (
       khdh                 VARCHAR(50) NOT NULL,
       cpdh                 VARCHAR(50) NOT NULL,
       hykhdxdh             INTEGER NOT NULL,
       sqsj                 TIMESTAMP,
       PRIMARY KEY (khdh, cpdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHGJ_XXXX ON MPAS_KHGJ_XXXX
(
       khdh                           ASC,
       cpdh                           ASC
);


CREATE TABLE MPAS_KHJG (
       tjrq                 INTEGER NOT NULL,
       khdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(20) NOT NULL,
       khjg                 DECIMAL(19,2),
       symkhjg              DECIMAL(19,2),
       PRIMARY KEY (tjrq, khdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHJG ON MPAS_KHJG
(
       tjrq                           ASC,
       khdxdh                         ASC
);


CREATE TABLE MPAS_KHMX (
       tjrq                 INTEGER NOT NULL,
       khdxdh               INTEGER NOT NULL,
       khzbdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       khzbmc               VARCHAR(100),
       yyjgz                DECIMAL(19,2),
       PRIMARY KEY (tjrq, khdxdh, khzbdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHMX ON MPAS_KHMX
(
       tjrq                           ASC,
       khdxdh                         ASC,
       khzbdh                         ASC
);


CREATE TABLE MPAS_KHSJ (
       hydh                 VARCHAR(12) NOT NULL,
       zhdh                 VARCHAR(40) NOT NULL,
       kmh                  VARCHAR(20),
       kmmc                 VARCHAR(40),
       zhlx                 VARCHAR(2),
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       khrq                 INTEGER,
       dqrq                 INTEGER,
       zhye                 DECIMAL(19,2),
       ghbl                 DECIMAL(19,2),
       ghsj                 INTEGER,
       ghrmc                VARCHAR(40),
       PRIMARY KEY (hydh, zhdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHSJ ON MPAS_KHSJ
(
       hydh                           ASC,
       zhdh                           ASC
);


CREATE TABLE MPAS_KHSJ (
       khdxdh               INTEGER NOT NULL,
       jxdxdh               INTEGER NOT NULL,
       zhlx                 INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       zhdh                 VARCHAR(40) NOT NULL,
       kmh                  VARCHAR(20),
       kmmc                 VARCHAR(40),
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       khrq                 INTEGER,
       dqrq                 INTEGER,
       zhye                 DECIMAL(19,2),
       ghbl                 DECIMAL(19,2),
       ghsj                 INTEGER,
       ghrmc                VARCHAR(40),
       PRIMARY KEY (khdxdh, jxdxdh, zhlx)
);

CREATE UNIQUE INDEX XPKMPAS_KHSJ ON MPAS_KHSJ
(
       khdxdh                         ASC,
       jxdxdh                         ASC,
       zhlx                           ASC
);


CREATE TABLE MPAS_KHSJ (
       khdxdh               INTEGER NOT NULL,
       khh                  VARCHAR(30) NOT NULL,
       khmc                 VARCHAR(100) NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       ckye                 DECIMAL(19,2),
       dkye                 DECIMAL(19,2),
       xskhh                VARCHAR(30),
       xskhmc               VARCHAR(100),
       PRIMARY KEY (khdxdh, khh, khmc)
);

CREATE UNIQUE INDEX XPKMPAS_KHSJ ON MPAS_KHSJ
(
       khdxdh                         ASC,
       khh                            ASC,
       khmc                           ASC
);


CREATE TABLE MPAS_KHSJ (
       hydh                 VARCHAR(12) NOT NULL,
       zhdh                 VARCHAR(40) NOT NULL,
       kmmc                 VARCHAR(40),
       zhlx                 VARCHAR(2),
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       khrq                 INTEGER,
       dqrq                 INTEGER,
       zhye                 DECIMAL(19,2),
       ghbl                 DECIMAL(19,2),
       ghsj                 INTEGER,
       ghrmc                VARCHAR(40),
       PRIMARY KEY (hydh, zhdh)
);

CREATE UNIQUE INDEX XPKMPAS_KHSJ ON MPAS_KHSJ
(
       hydh                           ASC,
       zhdh                           ASC
);


CREATE TABLE MPAS_LBDYAPP (
       lbdh                 VARCHAR(10) NOT NULL,
       lbmc                 VARCHAR(50),
       APPbb                VARCHAR(2),
       PRIMARY KEY (lbdh)
);

CREATE UNIQUE INDEX XPKMPAS_LBDYAPP ON MPAS_LBDYAPP
(
       lbdh                           ASC
);


CREATE TABLE MPAS_RWWCQK (
       khdxdh               INTEGER NOT NULL,
       khzq                 VARCHAR(20) NOT NULL,
       khzbdh               INTEGER NOT NULL,
       hydh                 VARCHAR(20) NOT NULL,
       khzbmc               VARCHAR(100) NOT NULL,
       jhz                  DECIMAL(19,2),
       zbz                  DECIMAL(19,2),
       wcbl                 DECIMAL(19,2),
       PRIMARY KEY (khdxdh, khzq, khzbdh)
);

CREATE UNIQUE INDEX XPKMPAS_RWWCQK ON MPAS_RWWCQK
(
       khdxdh                         ASC,
       khzq                           ASC,
       khzbdh                         ASC
);


CREATE TABLE MPAS_RZLS_YHBS (
       rzbh                 INTEGER NOT NULL,
       cdbh                 INTEGER,
       cdmc                 VARCHAR(100),
       czsj                 TIMESTAMP,
       khdxdh               INTEGER,
       hymc                 VARCHAR(20),
       hylb                 VARCHAR(20),
       PRIMARY KEY (rzbh)
);

CREATE UNIQUE INDEX XPKMPAS_RZLS_YHBS ON MPAS_RZLS_YHBS
(
       rzbh                           ASC
);


CREATE TABLE MPAS_RZTJ_YHBS (
       tjyf                 INTEGER NOT NULL,
       cdbh                 INTEGER NOT NULL,
       cdmc                 VARCHAR(100),
       sycs                 INTEGER,
       PRIMARY KEY (tjyf, cdbh)
);

CREATE UNIQUE INDEX XPKMPAS_RZTJ_YHBS ON MPAS_RZTJ_YHBS
(
       tjyf                           ASC,
       cdbh                           ASC
);


CREATE TABLE MPAS_TDYJ (
       khdxdh               INTEGER NOT NULL,
       khzbdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       khzbmc               VARCHAR(100) NOT NULL,
       tdhydh               VARCHAR(12),
       tdhymc               VARCHAR(100),
       jgmc                 VARCHAR(100),
       lbdh                 VARCHAR(10),
       lbmc                 VARCHAR(50),
       zbz                  DECIMAL(19,2),
       pm                   INTEGER,
       PRIMARY KEY (khdxdh, khzbdh)
);

CREATE UNIQUE INDEX XPKMPAS_TDYJ ON MPAS_TDYJ
(
       khdxdh                         ASC,
       khzbdh                         ASC
);


CREATE TABLE MPAS_XT_HY (
       YHBS                 VARCHAR(50) NOT NULL,
       khdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       hymc                 VARCHAR(40),
       jgkhdxdh             INTEGER,
       jgdh                 VARCHAR(20),
       jgmc                 VARCHAR(100),
       lbdh                 VARCHAR(10),
       lbmc                 VARCHAR(60),
       dlmc                 VARCHAR(12),
       dlmm                 VARCHAR(32),
       PRIMARY KEY (YHBS, khdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_XT_HY ON MPAS_XT_HY
(
       YHBS                           ASC,
       khdxdh                         ASC
);


CREATE TABLE MPAS_XZKH (
       khdxdh               INTEGER NOT NULL,
       jxdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       xzhdh                VARCHAR(40),
       khrq                 INTEGER,
       xskhh                VARCHAR(30),
       xskhmc               VARCHAR(100),
       xszhdh               VARCHAR(40),
       PRIMARY KEY (khdxdh, jxdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_XZKH ON MPAS_XZKH
(
       khdxdh                         ASC,
       jxdxdh                         ASC
);


CREATE TABLE MPAS_YJSJ (
       tjrq                 INTEGER NOT NULL,
       khdxdh               INTEGER NOT NULL,
       khzbdh               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       khzbmc               VARCHAR(100),
       khzbz                DECIMAL(19,2),
       PRIMARY KEY (tjrq, khdxdh, khzbdh)
);

CREATE UNIQUE INDEX XPKMPAS_YJSJ ON MPAS_YJSJ
(
       tjrq                           ASC,
       khdxdh                         ASC,
       khzbdh                         ASC
);


CREATE TABLE MPAS_YXCP_XXXX (
       cpdh                 VARCHAR(50) NOT NULL,
       cpmc                 VARCHAR(100),
       cpfl                 INTEGER,
       sjsj                 INTEGER,
       xjsj                 INTEGER,
       cpxl                 DECIMAL(19,2),
       ewmxx                VARCHAR(2000),
       cpzt                 VARCHAR(2),
       cpms                 VARCHAR(4000),
       ymdz                 VARCHAR(200),
       cpslt                VARCHAR(50),
       PRIMARY KEY (cpdh)
);

CREATE UNIQUE INDEX XPKMPAS_YXCP_XXXX ON MPAS_YXCP_XXXX
(
       cpdh                           ASC
);


CREATE TABLE MPAS_YXHD_XXXX (
       hddh                 VARCHAR(50) NOT NULL,
       hdmc                 VARCHAR(100),
       hdfl                 INTEGER,
       fbsj                 TIMESTAMP,
       cyrs                 INTEGER,
       ewmxx                VARCHAR(2000),
       hdzt                 VARCHAR(2),
       hdms                 VARCHAR(4000),
       ymdz                 VARCHAR(200),
       hdslt                VARCHAR(50),
       PRIMARY KEY (hddh)
);

CREATE UNIQUE INDEX XPKMPAS_YXHD_XXXX ON MPAS_YXHD_XXXX
(
       hddh                           ASC
);


CREATE TABLE MPAS_YXYJ_XXXX (
       tjrq                 INTEGER NOT NULL,
       hykhdxdh             INTEGER NOT NULL,
       cpdh                 VARCHAR(50) NOT NULL,
       zbdh                 INTEGER NOT NULL,
       zbsd                 VARCHAR(1) NOT NULL,
       zbz                  DECIMAL(19,2),
       PRIMARY KEY (tjrq, hykhdxdh, cpdh, zbdh, zbsd)
);

CREATE UNIQUE INDEX XPKMPAS_YXYJ_XXXX ON MPAS_YXYJ_XXXX
(
       tjrq                           ASC,
       hykhdxdh                       ASC,
       cpdh                           ASC,
       zbdh                           ASC,
       zbsd                           ASC
);


CREATE TABLE MPAS_YXZB_XXXX (
       zbdh                 INTEGER NOT NULL,
       zbmc                 VARCHAR(50) NOT NULL,
       PRIMARY KEY (zbdh)
);

CREATE UNIQUE INDEX XPKMPAS_YXZB_XXXX ON MPAS_YXZB_XXXX
(
       zbdh                           ASC
);


CREATE TABLE MPAS_YYGL (
       yhmc                 VARCHAR(80) NOT NULL,
       yhbs                 VARCHAR(200) NOT NULL,
       yymc                 VARCHAR(40),
       dlj                  VARCHAR(200),
       bbh                  VARCHAR(20),
       gxnr                 VARCHAR(200),
       fbsj                 INTEGER,
       PRIMARY KEY (yhmc, yhbs)
);

CREATE UNIQUE INDEX XPKMPAS_YYGL ON MPAS_YYGL
(
       yhmc                           ASC,
       yhbs                           ASC
);


CREATE TABLE MPAS_YYGL_FB (
       fbbmc                VARCHAR(100) NOT NULL,
       yhbs                 VARCHAR(200) NOT NULL,
       fbbbh                VARCHAR(20) NOT NULL,
       xtlx                 VARCHAR(8) NOT NULL,
       xgsj                 TIMESTAMP,
       xzcs                 INTEGER,
       zt                   VARCHAR(2),
       gxnr                 VARCHAR(200),
       codebbh              VARCHAR(10),
       url                  VARCHAR(200),
       PRIMARY KEY (fbbmc)
);

CREATE UNIQUE INDEX XPKMPAS_YYGL_FB ON MPAS_YYGL_FB
(
       fbbmc                          ASC
);


CREATE TABLE MPAS_ZHSJ (
       khdxdh               INTEGER NOT NULL,
       jxdxdh               INTEGER NOT NULL,
       jxdxlx               INTEGER NOT NULL,
       hydh                 VARCHAR(12) NOT NULL,
       zhdh                 VARCHAR(40) NOT NULL,
       kmh                  VARCHAR(20),
       kmmc                 VARCHAR(40),
       khh                  VARCHAR(30),
       khmc                 VARCHAR(100),
       khrq                 INTEGER,
       dqrq                 INTEGER,
       zhye                 DECIMAL(19,2),
       ghbl                 DECIMAL(19,2),
       ghsj                 INTEGER,
       ghxx                 VARCHAR(400),
       bhje                 DECIMAL(19,2),
       xskhh                VARCHAR(30),
       xskhmc               VARCHAR(100),
       xszhdh               VARCHAR(40),
       PRIMARY KEY (khdxdh, jxdxdh, jxdxlx)
);

CREATE UNIQUE INDEX XPKMPAS_ZHSJ ON MPAS_ZHSJ
(
       khdxdh                         ASC,
       jxdxdh                         ASC,
       jxdxlx                         ASC
);


CREATE TABLE MPAS_ZNBS_FAPZ (
       yhbs                 VARCHAR(50) NOT NULL,
       fabh                 INTEGER NOT NULL,
       famc                 VARCHAR2(100) NOT NULL,
       khnf                 INTEGER,
       khdx                 VARCHAR2(2) NOT NULL,
       znbs                 INTEGER NOT NULL,
       hygw                 VARCHAR2(500),
       khzq                 INTEGER NOT NULL,
       khqs                 VARCHAR2(200) NOT NULL,
       khzf                 DECIMAL(25,4),
       zt                   VARCHAR2(2) NOT NULL,
       czr                  VARCHAR2(12),
       czsj                 TIMESTAMP,
       PRIMARY KEY (yhbs, fabh)
);

CREATE UNIQUE INDEX XPKZNBS_FAPZ ON MPAS_ZNBS_FAPZ
(
       yhbs                           ASC,
       fabh                           ASC
);


CREATE TABLE MPAS_ZNBS_KHXMPZ (
       yhbs                 VARCHAR(50) NOT NULL,
       fabh                 INTEGER NOT NULL,
       xmbh                 INTEGER NOT NULL,
       wdbh                 INTEGER,
       mbbh                 INTEGER,
       pjbh                 INTEGER,
       jflx                 VARCHAR2(2),
       wdf                  DECIMAL(25,4),
       mf                   DECIMAL(25,4) NOT NULL,
       bdz                  DECIMAL(25,4),
       fdz                  DECIMAL(25,4),
       jsfs                 VARCHAR2(2) NOT NULL,
       tjcx                 VARCHAR2(30),
       pjzbj                VARCHAR2(500),
       xh                   INTEGER,
       xmmc                 VARCHAR2(100) NOT NULL,
       khnr                 VARCHAR2(2000),
       PRIMARY KEY (yhbs, fabh, xmbh)
);

CREATE UNIQUE INDEX XPKZNBS_KHXMPZ ON MPAS_ZNBS_KHXMPZ
(
       yhbs                           ASC,
       fabh                           ASC,
       xmbh                           ASC
);


CREATE TABLE MPAS_ZXPF_FASX (
       yhbs                 VARCHAR(50) NOT NULL,
       fabh                 INTEGER NOT NULL,
       khqs                 INTEGER NOT NULL,
       pfksrq               INTEGER,
       pfjsrq               INTEGER,
       drsj                 TIMESTAMP,
       PRIMARY KEY (yhbs, fabh, khqs)
);

CREATE UNIQUE INDEX XPKMPAS_ZXPF_FASX ON MPAS_ZXPF_FASX
(
       yhbs                           ASC,
       fabh                           ASC,
       khqs                           ASC
);


CREATE TABLE MPAS_ZXPF_PY (
       yhbs                 VARCHAR(50) NOT NULL,
       fabh                 INTEGER NOT NULL,
       khqs                 INTEGER NOT NULL,
       dfzkhdxdh            INTEGER NOT NULL,
       hykhdxdh             INTEGER NOT NULL,
       py                   VARCHAR(2000),
       PRIMARY KEY (yhbs, fabh, khqs, dfzkhdxdh, hykhdxdh)
);

CREATE UNIQUE INDEX XPKMPAS_ZXPF_PY ON MPAS_ZXPF_PY
(
       yhbs                           ASC,
       fabh                           ASC,
       khqs                           ASC,
       dfzkhdxdh                      ASC,
       hykhdxdh                       ASC
);


CREATE TABLE MPAS_活动分类 (
);


CREATE TABLE SJBC_DXSJ_XXXX (
       tjrq                 INTEGER NOT NULL,
       yhbs                 VARCHAR(50) NOT NULL,
       khdxdh               INTEGER NOT NULL,
       sjlx                 VARCHAR(2) NOT NULL,
       sjly                 INTEGER NOT NULL,
       hydh                 VARCHAR(20),
       xsmc                 VARCHAR(50) NOT NULL,
       zbz                  DECIMAL(19,2),
       wcbl                 DECIMAL(19,2),
       dw                   VARCHAR(20),
       px                   INTEGER,
       PRIMARY KEY (tjrq, yhbs, khdxdh, sjlx, sjly)
);

CREATE UNIQUE INDEX XPKSJBC_DXSJ_XXXX ON SJBC_DXSJ_XXXX
(
       tjrq                           ASC,
       yhbs                           ASC,
       khdxdh                         ASC,
       sjlx                           ASC,
       sjly                           ASC
);


CREATE TABLE SJBC_HYXX_XXXX (
       khdxdh               INTEGER NOT NULL,
       hydh                 VARCHAR(20),
       sjhm                 VARCHAR(11),
       yjdz                 VARCHAR(100),
       wxh                  VARCHAR(50),
       hymc                 VARCHAR(40),
       jgdh                 VARCHAR(10),
       jgmc                 VARCHAR(50),
       lbdh                 VARCHAR(10),
       lbmc                 VARCHAR(50),
       dlmm                 CHAR(32),
       yhbs                 VARCHAR(50),
       PRIMARY KEY (khdxdh)
);

CREATE UNIQUE INDEX XPKSJBC_HYXX_XXXX ON SJBC_HYXX_XXXX
(
       khdxdh                         ASC
);


CREATE TABLE SJBC_XTCS_XXXX (
       csmc                 VARCHAR(15) NOT NULL,
       csz                  VARCHAR(30) NOT NULL,
       csms                 VARCHAR(200),
       yhbs                 VARCHAR(50),
       bzsm                 VARCHAR(500),
       PRIMARY KEY (csmc, csz)
);

CREATE UNIQUE INDEX XPKSJBC_XTCS_XXXX ON SJBC_XTCS_XXXX
(
       csmc                           ASC,
       csz                            ASC
);



