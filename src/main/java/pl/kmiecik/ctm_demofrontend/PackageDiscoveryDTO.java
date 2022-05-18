package pl.kmiecik.ctm_demofrontend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class PackageDiscoveryDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("package_id")
    private String packageId;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("buoy_number")
    private String buoyNumber;
    @JsonProperty("detection_timestamp")
    private LocalDateTime detectionTimestamp;
    @JsonProperty("mission_number")
    private String missionNumber;
    @JsonProperty("detection_rms")
    private BigDecimal detectionRms;
    @JsonProperty("created_user")
    private String createdUser;
    @JsonProperty("updated_user")
    private String updatedUser;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    @JsonProperty("background_rms")
    private BigDecimal backgroundRms;
    @JsonProperty("background_timestamp")
    private LocalDateTime backgroundTimestamp;
    @JsonProperty("background_adaptive_rms")
    private BigDecimal backgroundAdaptiveRms;
    @JsonProperty("background_adaptive_timestamp")
    private LocalDateTime backgroundAdaptiveTimestamp;

    @JsonProperty("oto_detection_amplitude_band1")
    private BigDecimal otoDetectionAmplitudeBand1;
    @JsonProperty("oto_detection_amplitude_band2")
    private BigDecimal otoDetectionAmplitudeBand2;
    @JsonProperty("oto_detection_amplitude_band3")
    private BigDecimal otoDetectionAmplitudeBand3;
    @JsonProperty("oto_detection_amplitude_band4")
    private BigDecimal otoDetectionAmplitudeBand4;
    @JsonProperty("oto_detection_amplitude_band5")
    private BigDecimal otoDetectionAmplitudeBand5;
    @JsonProperty("oto_detection_amplitude_band6")
    private BigDecimal otoDetectionAmplitudeBand6;
    @JsonProperty("oto_detection_amplitude_band7")
    private BigDecimal otoDetectionAmplitudeBand7;
    @JsonProperty("oto_detection_amplitude_band8")
    private BigDecimal otoDetectionAmplitudeBand8;
    @JsonProperty("oto_detection_amplitude_band9")
    private BigDecimal otoDetectionAmplitudeBand9;
    @JsonProperty("oto_detection_amplitude_band10")
    private BigDecimal otoDetectionAmplitudeBand10;
    @JsonProperty("oto_detection_amplitude_band11")
    private BigDecimal otoDetectionAmplitudeBand11;
    @JsonProperty("oto_detection_amplitude_band12")
    private BigDecimal otoDetectionAmplitudeBand12;
    @JsonProperty("oto_detection_amplitude_band13")
    private BigDecimal otoDetectionAmplitudeBand13;
    @JsonProperty("oto_detection_amplitude_band14")
    private BigDecimal otoDetectionAmplitudeBand14;
    @JsonProperty("oto_detection_amplitude_band15")
    private BigDecimal otoDetectionAmplitudeBand15;
    @JsonProperty("oto_detection_amplitude_band16")
    private BigDecimal otoDetectionAmplitudeBand16;
    @JsonProperty("oto_detection_amplitude_band17")
    private BigDecimal otoDetectionAmplitudeBand17;
    @JsonProperty("oto_detection_amplitude_band18")
    private BigDecimal otoDetectionAmplitudeBand18;
    @JsonProperty("oto_detection_amplitude_band19")
    private BigDecimal otoDetectionAmplitudeBand19;
    @JsonProperty("oto_detection_amplitude_band20")
    private BigDecimal otoDetectionAmplitudeBand20;
    @JsonProperty("oto_detection_amplitude_band21")
    private BigDecimal otoDetectionAmplitudeBand21;
    @JsonProperty("oto_detection_amplitude_band22")
    private BigDecimal otoDetectionAmplitudeBand22;
    @JsonProperty("oto_detection_amplitude_band23")
    private BigDecimal otoDetectionAmplitudeBand23;
    @JsonProperty("oto_detection_amplitude_band24")
    private BigDecimal otoDetectionAmplitudeBand24;
    @JsonProperty("oto_detection_amplitude_band25")
    private BigDecimal otoDetectionAmplitudeBand25;
    @JsonProperty("oto_detection_amplitude_band26")
    private BigDecimal otoDetectionAmplitudeBand26;
    @JsonProperty("oto_detection_amplitude_band27")
    private BigDecimal otoDetectionAmplitudeBand27;
    @JsonProperty("oto_detection_amplitude_band28")
    private BigDecimal otoDetectionAmplitudeBand28;
    @JsonProperty("oto_detection_amplitude_band30")
    private BigDecimal otoDetectionAmplitudeBand30;
    @JsonProperty("oto_background_amplitude_band1")
    private BigDecimal otoBackgroundAmplitudeBand1;
    @JsonProperty("oto_background_amplitude_band2")
    private BigDecimal otoBackgroundAmplitudeBand2;
    @JsonProperty("oto_background_amplitude_band3")
    private BigDecimal otoBackgroundAmplitudeBand3;
    @JsonProperty("oto_background_amplitude_band4")
    private BigDecimal otoBackgroundAmplitudeBand4;
    @JsonProperty("oto_background_amplitude_band5")
    private BigDecimal otoBackgroundAmplitudeBand5;
    @JsonProperty("oto_background_amplitude_band6")
    private BigDecimal otoBackgroundAmplitudeBand6;
    @JsonProperty("oto_background_amplitude_band7")
    private BigDecimal otoBackgroundAmplitudeBand7;
    @JsonProperty("oto_background_amplitude_band8")
    private BigDecimal otoBackgroundAmplitudeBand8;
    @JsonProperty("oto_background_amplitude_band9")
    private BigDecimal otoBackgroundAmplitudeBand9;
    @JsonProperty("oto_background_amplitude_band10")
    private BigDecimal otoBackgroundAmplitudeBand10;
    @JsonProperty("oto_background_amplitude_band11")
    private BigDecimal otoBackgroundAmplitudeBand11;
    @JsonProperty("oto_background_amplitude_band12")
    private BigDecimal otoBackgroundAmplitudeBand12;
    @JsonProperty("oto_background_amplitude_band13")
    private BigDecimal otoBackgroundAmplitudeBand13;
    @JsonProperty("oto_background_amplitude_band14")
    private BigDecimal otoBackgroundAmplitudeBand14;
    @JsonProperty("oto_background_amplitude_band15")
    private BigDecimal otoBackgroundAmplitudeBand15;
    @JsonProperty("oto_background_amplitude_band16")
    private BigDecimal otoBackgroundAmplitudeBand16;
    @JsonProperty("oto_background_amplitude_band17")
    private BigDecimal otoBackgroundAmplitudeBand17;
    @JsonProperty("oto_background_amplitude_band18")
    private BigDecimal otoBackgroundAmplitudeBand18;
    @JsonProperty("oto_background_amplitude_band19")
    private BigDecimal otoBackgroundAmplitudeBand19;
    @JsonProperty("oto_background_amplitude_band20")
    private BigDecimal otoBackgroundAmplitudeBand20;
    @JsonProperty("oto_background_amplitude_band21")
    private BigDecimal otoBackgroundAmplitudeBand21;
    @JsonProperty("oto_background_amplitude_band22")
    private BigDecimal otoBackgroundAmplitudeBand22;
    @JsonProperty("oto_background_amplitude_band23")
    private BigDecimal otoBackgroundAmplitudeBand23;
    @JsonProperty("oto_background_amplitude_band24")
    private BigDecimal otoBackgroundAmplitudeBand24;
    @JsonProperty("oto_background_amplitude_band25")
    private BigDecimal otoBackgroundAmplitudeBand25;
    @JsonProperty("oto_background_amplitude_band26")
    private BigDecimal otoBackgroundAmplitudeBand26;
    @JsonProperty("oto_background_amplitude_band27")
    private BigDecimal otoBackgroundAmplitudeBand27;
    @JsonProperty("oto_background_amplitude_band28")
    private BigDecimal otoBackgroundAmplitudeBand28;
    @JsonProperty("oto_background_amplitude_band30")
    private BigDecimal otoBackgroundAmplitudeBand30;
    @JsonProperty("oto_background_adaptive_amplitude_band1")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand1;
    @JsonProperty("oto_background_adaptive_amplitude_band2")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand2;
    @JsonProperty("oto_background_adaptive_amplitude_band3")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand3;
    @JsonProperty("oto_background_adaptive_amplitude_band4")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand4;
    @JsonProperty("oto_background_adaptive_amplitude_band5")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand5;
    @JsonProperty("oto_background_adaptive_amplitude_band6")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand6;
    @JsonProperty("oto_background_adaptive_amplitude_band7")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand7;
    @JsonProperty("oto_background_adaptive_amplitude_band8")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand8;
    @JsonProperty("oto_background_adaptive_amplitude_band9")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand9;
    @JsonProperty("oto_background_adaptive_amplitude_band10")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand10;
    @JsonProperty("oto_background_adaptive_amplitude_band11")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand11;
    @JsonProperty("oto_background_adaptive_amplitude_band12")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand12;
    @JsonProperty("oto_background_adaptive_amplitude_band13")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand13;
    @JsonProperty("oto_background_adaptive_amplitude_band14")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand14;
    @JsonProperty("oto_background_adaptive_amplitude_band15")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand15;
    @JsonProperty("oto_background_adaptive_amplitude_band16")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand16;
    @JsonProperty("oto_background_adaptive_amplitude_band17")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand17;
    @JsonProperty("oto_background_adaptive_amplitude_band18")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand18;
    @JsonProperty("oto_background_adaptive_amplitude_band19")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand19;
    @JsonProperty("oto_background_adaptive_amplitude_band20")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand20;
    @JsonProperty("oto_background_adaptive_amplitude_band21")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand21;
    @JsonProperty("oto_background_adaptive_amplitude_band22")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand22;
    @JsonProperty("oto_background_adaptive_amplitude_band23")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand23;
    @JsonProperty("oto_background_adaptive_amplitude_band24")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand24;
    @JsonProperty("oto_background_adaptive_amplitude_band25")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand25;
    @JsonProperty("oto_background_adaptive_amplitude_band26")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand26;
    @JsonProperty("oto_background_adaptive_amplitude_band27")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand27;
    @JsonProperty("oto_background_adaptive_amplitude_band28")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand28;
    @JsonProperty("oto_background_adaptive_amplitude_band30")
    private BigDecimal otoBackgroundAdaptiveAmplitudeBand30;
    @JsonProperty("fingerprint")
    private String fingerprint;
    @JsonProperty("detection_file_path_01")
    private String detectionFilePath01;
    @JsonProperty("detection_file_path_02")
    private String detectionFilePath02;
    @JsonProperty("background_file_path")
    private String backgroundFilePath;
    @JsonProperty("background_adaptive_file_path")
    private String backgroundAdaptiveFilePath;
    @JsonProperty("pressure_detection_level")
    private String pressureDetectionLevel;
    @JsonProperty("pressure_detection_duration")
    private BigDecimal pressureDetectionDuration;
    @JsonProperty("pressure_background_amplitude")
    private String pressureBackgroundAmplitude;
    @JsonProperty("pressure_background_period")
    private BigDecimal pressureBackgroundPeriod;
    @JsonProperty("pressure_detection_file_path ")
    private String pressureDetectionFilePath;
    @JsonProperty("pressure_background_file_path")
    private String pressureBackgroundFilePath;
    @JsonProperty("magnetic_detection_level_max")
    private BigDecimal magneticDetectionLevelMax;
    @JsonProperty("magnetic_detection_level_min")
    private BigDecimal magneticDetectionLevelMin;
    @JsonProperty("magnetic_detection_duration")
    private BigDecimal magneticDetectionDuration;
    @JsonProperty("magnetic_detection_file_path")
    private String magneticDetectionFilePath;
    @JsonProperty("magnetic_background_file_path")
    private String magneticBackgroundFilePath;
    @JsonProperty("tag_1")
    private String tag1;
    @JsonProperty("tag_2 ")
    private String tag2;
    @JsonProperty("tag_3")
    private String tag3;
    @JsonProperty("tag_4")
    private String tag4;
    @JsonProperty("tag_5")
    private String tag5;
    @JsonProperty("tag_6")
    private String tag6;
    @JsonProperty("tag_7")
    private String tag7;
    @JsonProperty("tag_8")
    private String tag8;
    @JsonProperty("tag_9")
    private String tag9;
    @JsonProperty("tag_10")
    private String tag10;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getBuoyNumber() {
        return buoyNumber;
    }

    public void setBuoyNumber(String buoyNumber) {
        this.buoyNumber = buoyNumber;
    }

    public LocalDateTime getDetectionTimestamp() {
        return detectionTimestamp;
    }

    public void setDetectionTimestamp(LocalDateTime detectionTimestamp) {
        this.detectionTimestamp = detectionTimestamp;
    }

    public String getMissionNumber() {
        return missionNumber;
    }

    public void setMissionNumber(String missionNumber) {
        this.missionNumber = missionNumber;
    }

    public BigDecimal getDetectionRms() {
        return detectionRms;
    }

    public void setDetectionRms(BigDecimal detectionRms) {
        this.detectionRms = detectionRms;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BigDecimal getBackgroundRms() {
        return backgroundRms;
    }

    public void setBackgroundRms(BigDecimal backgroundRms) {
        this.backgroundRms = backgroundRms;
    }

    public LocalDateTime getBackgroundTimestamp() {
        return backgroundTimestamp;
    }

    public void setBackgroundTimestamp(LocalDateTime backgroundTimestamp) {
        this.backgroundTimestamp = backgroundTimestamp;
    }

    public BigDecimal getBackgroundAdaptiveRms() {
        return backgroundAdaptiveRms;
    }

    public void setBackgroundAdaptiveRms(BigDecimal backgroundAdaptiveRms) {
        this.backgroundAdaptiveRms = backgroundAdaptiveRms;
    }

    public LocalDateTime getBackgroundAdaptiveTimestamp() {
        return backgroundAdaptiveTimestamp;
    }

    public void setBackgroundAdaptiveTimestamp(LocalDateTime backgroundAdaptiveTimestamp) {
        this.backgroundAdaptiveTimestamp = backgroundAdaptiveTimestamp;
    }

    public BigDecimal getOtoDetectionAmplitudeBand1() {
        return otoDetectionAmplitudeBand1;
    }

    public void setOtoDetectionAmplitudeBand1(BigDecimal otoDetectionAmplitudeBand1) {
        this.otoDetectionAmplitudeBand1 = otoDetectionAmplitudeBand1;
    }

    public BigDecimal getOtoDetectionAmplitudeBand2() {
        return otoDetectionAmplitudeBand2;
    }

    public void setOtoDetectionAmplitudeBand2(BigDecimal otoDetectionAmplitudeBand2) {
        this.otoDetectionAmplitudeBand2 = otoDetectionAmplitudeBand2;
    }

    public BigDecimal getOtoDetectionAmplitudeBand3() {
        return otoDetectionAmplitudeBand3;
    }

    public void setOtoDetectionAmplitudeBand3(BigDecimal otoDetectionAmplitudeBand3) {
        this.otoDetectionAmplitudeBand3 = otoDetectionAmplitudeBand3;
    }

    public BigDecimal getOtoDetectionAmplitudeBand4() {
        return otoDetectionAmplitudeBand4;
    }

    public void setOtoDetectionAmplitudeBand4(BigDecimal otoDetectionAmplitudeBand4) {
        this.otoDetectionAmplitudeBand4 = otoDetectionAmplitudeBand4;
    }

    public BigDecimal getOtoDetectionAmplitudeBand5() {
        return otoDetectionAmplitudeBand5;
    }

    public void setOtoDetectionAmplitudeBand5(BigDecimal otoDetectionAmplitudeBand5) {
        this.otoDetectionAmplitudeBand5 = otoDetectionAmplitudeBand5;
    }

    public BigDecimal getOtoDetectionAmplitudeBand6() {
        return otoDetectionAmplitudeBand6;
    }

    public void setOtoDetectionAmplitudeBand6(BigDecimal otoDetectionAmplitudeBand6) {
        this.otoDetectionAmplitudeBand6 = otoDetectionAmplitudeBand6;
    }

    public BigDecimal getOtoDetectionAmplitudeBand7() {
        return otoDetectionAmplitudeBand7;
    }

    public void setOtoDetectionAmplitudeBand7(BigDecimal otoDetectionAmplitudeBand7) {
        this.otoDetectionAmplitudeBand7 = otoDetectionAmplitudeBand7;
    }

    public BigDecimal getOtoDetectionAmplitudeBand8() {
        return otoDetectionAmplitudeBand8;
    }

    public void setOtoDetectionAmplitudeBand8(BigDecimal otoDetectionAmplitudeBand8) {
        this.otoDetectionAmplitudeBand8 = otoDetectionAmplitudeBand8;
    }

    public BigDecimal getOtoDetectionAmplitudeBand9() {
        return otoDetectionAmplitudeBand9;
    }

    public void setOtoDetectionAmplitudeBand9(BigDecimal otoDetectionAmplitudeBand9) {
        this.otoDetectionAmplitudeBand9 = otoDetectionAmplitudeBand9;
    }

    public BigDecimal getOtoDetectionAmplitudeBand10() {
        return otoDetectionAmplitudeBand10;
    }

    public void setOtoDetectionAmplitudeBand10(BigDecimal otoDetectionAmplitudeBand10) {
        this.otoDetectionAmplitudeBand10 = otoDetectionAmplitudeBand10;
    }

    public BigDecimal getOtoDetectionAmplitudeBand11() {
        return otoDetectionAmplitudeBand11;
    }

    public void setOtoDetectionAmplitudeBand11(BigDecimal otoDetectionAmplitudeBand11) {
        this.otoDetectionAmplitudeBand11 = otoDetectionAmplitudeBand11;
    }

    public BigDecimal getOtoDetectionAmplitudeBand12() {
        return otoDetectionAmplitudeBand12;
    }

    public void setOtoDetectionAmplitudeBand12(BigDecimal otoDetectionAmplitudeBand12) {
        this.otoDetectionAmplitudeBand12 = otoDetectionAmplitudeBand12;
    }

    public BigDecimal getOtoDetectionAmplitudeBand13() {
        return otoDetectionAmplitudeBand13;
    }

    public void setOtoDetectionAmplitudeBand13(BigDecimal otoDetectionAmplitudeBand13) {
        this.otoDetectionAmplitudeBand13 = otoDetectionAmplitudeBand13;
    }

    public BigDecimal getOtoDetectionAmplitudeBand14() {
        return otoDetectionAmplitudeBand14;
    }

    public void setOtoDetectionAmplitudeBand14(BigDecimal otoDetectionAmplitudeBand14) {
        this.otoDetectionAmplitudeBand14 = otoDetectionAmplitudeBand14;
    }

    public BigDecimal getOtoDetectionAmplitudeBand15() {
        return otoDetectionAmplitudeBand15;
    }

    public void setOtoDetectionAmplitudeBand15(BigDecimal otoDetectionAmplitudeBand15) {
        this.otoDetectionAmplitudeBand15 = otoDetectionAmplitudeBand15;
    }

    public BigDecimal getOtoDetectionAmplitudeBand16() {
        return otoDetectionAmplitudeBand16;
    }

    public void setOtoDetectionAmplitudeBand16(BigDecimal otoDetectionAmplitudeBand16) {
        this.otoDetectionAmplitudeBand16 = otoDetectionAmplitudeBand16;
    }

    public BigDecimal getOtoDetectionAmplitudeBand17() {
        return otoDetectionAmplitudeBand17;
    }

    public void setOtoDetectionAmplitudeBand17(BigDecimal otoDetectionAmplitudeBand17) {
        this.otoDetectionAmplitudeBand17 = otoDetectionAmplitudeBand17;
    }

    public BigDecimal getOtoDetectionAmplitudeBand18() {
        return otoDetectionAmplitudeBand18;
    }

    public void setOtoDetectionAmplitudeBand18(BigDecimal otoDetectionAmplitudeBand18) {
        this.otoDetectionAmplitudeBand18 = otoDetectionAmplitudeBand18;
    }

    public BigDecimal getOtoDetectionAmplitudeBand19() {
        return otoDetectionAmplitudeBand19;
    }

    public void setOtoDetectionAmplitudeBand19(BigDecimal otoDetectionAmplitudeBand19) {
        this.otoDetectionAmplitudeBand19 = otoDetectionAmplitudeBand19;
    }

    public BigDecimal getOtoDetectionAmplitudeBand20() {
        return otoDetectionAmplitudeBand20;
    }

    public void setOtoDetectionAmplitudeBand20(BigDecimal otoDetectionAmplitudeBand20) {
        this.otoDetectionAmplitudeBand20 = otoDetectionAmplitudeBand20;
    }

    public BigDecimal getOtoDetectionAmplitudeBand21() {
        return otoDetectionAmplitudeBand21;
    }

    public void setOtoDetectionAmplitudeBand21(BigDecimal otoDetectionAmplitudeBand21) {
        this.otoDetectionAmplitudeBand21 = otoDetectionAmplitudeBand21;
    }

    public BigDecimal getOtoDetectionAmplitudeBand22() {
        return otoDetectionAmplitudeBand22;
    }

    public void setOtoDetectionAmplitudeBand22(BigDecimal otoDetectionAmplitudeBand22) {
        this.otoDetectionAmplitudeBand22 = otoDetectionAmplitudeBand22;
    }

    public BigDecimal getOtoDetectionAmplitudeBand23() {
        return otoDetectionAmplitudeBand23;
    }

    public void setOtoDetectionAmplitudeBand23(BigDecimal otoDetectionAmplitudeBand23) {
        this.otoDetectionAmplitudeBand23 = otoDetectionAmplitudeBand23;
    }

    public BigDecimal getOtoDetectionAmplitudeBand24() {
        return otoDetectionAmplitudeBand24;
    }

    public void setOtoDetectionAmplitudeBand24(BigDecimal otoDetectionAmplitudeBand24) {
        this.otoDetectionAmplitudeBand24 = otoDetectionAmplitudeBand24;
    }

    public BigDecimal getOtoDetectionAmplitudeBand25() {
        return otoDetectionAmplitudeBand25;
    }

    public void setOtoDetectionAmplitudeBand25(BigDecimal otoDetectionAmplitudeBand25) {
        this.otoDetectionAmplitudeBand25 = otoDetectionAmplitudeBand25;
    }

    public BigDecimal getOtoDetectionAmplitudeBand26() {
        return otoDetectionAmplitudeBand26;
    }

    public void setOtoDetectionAmplitudeBand26(BigDecimal otoDetectionAmplitudeBand26) {
        this.otoDetectionAmplitudeBand26 = otoDetectionAmplitudeBand26;
    }

    public BigDecimal getOtoDetectionAmplitudeBand27() {
        return otoDetectionAmplitudeBand27;
    }

    public void setOtoDetectionAmplitudeBand27(BigDecimal otoDetectionAmplitudeBand27) {
        this.otoDetectionAmplitudeBand27 = otoDetectionAmplitudeBand27;
    }

    public BigDecimal getOtoDetectionAmplitudeBand28() {
        return otoDetectionAmplitudeBand28;
    }

    public void setOtoDetectionAmplitudeBand28(BigDecimal otoDetectionAmplitudeBand28) {
        this.otoDetectionAmplitudeBand28 = otoDetectionAmplitudeBand28;
    }

    public BigDecimal getOtoDetectionAmplitudeBand30() {
        return otoDetectionAmplitudeBand30;
    }

    public void setOtoDetectionAmplitudeBand30(BigDecimal otoDetectionAmplitudeBand30) {
        this.otoDetectionAmplitudeBand30 = otoDetectionAmplitudeBand30;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand1() {
        return otoBackgroundAmplitudeBand1;
    }

    public void setOtoBackgroundAmplitudeBand1(BigDecimal otoBackgroundAmplitudeBand1) {
        this.otoBackgroundAmplitudeBand1 = otoBackgroundAmplitudeBand1;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand2() {
        return otoBackgroundAmplitudeBand2;
    }

    public void setOtoBackgroundAmplitudeBand2(BigDecimal otoBackgroundAmplitudeBand2) {
        this.otoBackgroundAmplitudeBand2 = otoBackgroundAmplitudeBand2;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand3() {
        return otoBackgroundAmplitudeBand3;
    }

    public void setOtoBackgroundAmplitudeBand3(BigDecimal otoBackgroundAmplitudeBand3) {
        this.otoBackgroundAmplitudeBand3 = otoBackgroundAmplitudeBand3;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand4() {
        return otoBackgroundAmplitudeBand4;
    }

    public void setOtoBackgroundAmplitudeBand4(BigDecimal otoBackgroundAmplitudeBand4) {
        this.otoBackgroundAmplitudeBand4 = otoBackgroundAmplitudeBand4;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand5() {
        return otoBackgroundAmplitudeBand5;
    }

    public void setOtoBackgroundAmplitudeBand5(BigDecimal otoBackgroundAmplitudeBand5) {
        this.otoBackgroundAmplitudeBand5 = otoBackgroundAmplitudeBand5;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand6() {
        return otoBackgroundAmplitudeBand6;
    }

    public void setOtoBackgroundAmplitudeBand6(BigDecimal otoBackgroundAmplitudeBand6) {
        this.otoBackgroundAmplitudeBand6 = otoBackgroundAmplitudeBand6;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand7() {
        return otoBackgroundAmplitudeBand7;
    }

    public void setOtoBackgroundAmplitudeBand7(BigDecimal otoBackgroundAmplitudeBand7) {
        this.otoBackgroundAmplitudeBand7 = otoBackgroundAmplitudeBand7;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand8() {
        return otoBackgroundAmplitudeBand8;
    }

    public void setOtoBackgroundAmplitudeBand8(BigDecimal otoBackgroundAmplitudeBand8) {
        this.otoBackgroundAmplitudeBand8 = otoBackgroundAmplitudeBand8;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand9() {
        return otoBackgroundAmplitudeBand9;
    }

    public void setOtoBackgroundAmplitudeBand9(BigDecimal otoBackgroundAmplitudeBand9) {
        this.otoBackgroundAmplitudeBand9 = otoBackgroundAmplitudeBand9;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand10() {
        return otoBackgroundAmplitudeBand10;
    }

    public void setOtoBackgroundAmplitudeBand10(BigDecimal otoBackgroundAmplitudeBand10) {
        this.otoBackgroundAmplitudeBand10 = otoBackgroundAmplitudeBand10;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand11() {
        return otoBackgroundAmplitudeBand11;
    }

    public void setOtoBackgroundAmplitudeBand11(BigDecimal otoBackgroundAmplitudeBand11) {
        this.otoBackgroundAmplitudeBand11 = otoBackgroundAmplitudeBand11;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand12() {
        return otoBackgroundAmplitudeBand12;
    }

    public void setOtoBackgroundAmplitudeBand12(BigDecimal otoBackgroundAmplitudeBand12) {
        this.otoBackgroundAmplitudeBand12 = otoBackgroundAmplitudeBand12;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand13() {
        return otoBackgroundAmplitudeBand13;
    }

    public void setOtoBackgroundAmplitudeBand13(BigDecimal otoBackgroundAmplitudeBand13) {
        this.otoBackgroundAmplitudeBand13 = otoBackgroundAmplitudeBand13;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand14() {
        return otoBackgroundAmplitudeBand14;
    }

    public void setOtoBackgroundAmplitudeBand14(BigDecimal otoBackgroundAmplitudeBand14) {
        this.otoBackgroundAmplitudeBand14 = otoBackgroundAmplitudeBand14;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand15() {
        return otoBackgroundAmplitudeBand15;
    }

    public void setOtoBackgroundAmplitudeBand15(BigDecimal otoBackgroundAmplitudeBand15) {
        this.otoBackgroundAmplitudeBand15 = otoBackgroundAmplitudeBand15;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand16() {
        return otoBackgroundAmplitudeBand16;
    }

    public void setOtoBackgroundAmplitudeBand16(BigDecimal otoBackgroundAmplitudeBand16) {
        this.otoBackgroundAmplitudeBand16 = otoBackgroundAmplitudeBand16;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand17() {
        return otoBackgroundAmplitudeBand17;
    }

    public void setOtoBackgroundAmplitudeBand17(BigDecimal otoBackgroundAmplitudeBand17) {
        this.otoBackgroundAmplitudeBand17 = otoBackgroundAmplitudeBand17;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand18() {
        return otoBackgroundAmplitudeBand18;
    }

    public void setOtoBackgroundAmplitudeBand18(BigDecimal otoBackgroundAmplitudeBand18) {
        this.otoBackgroundAmplitudeBand18 = otoBackgroundAmplitudeBand18;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand19() {
        return otoBackgroundAmplitudeBand19;
    }

    public void setOtoBackgroundAmplitudeBand19(BigDecimal otoBackgroundAmplitudeBand19) {
        this.otoBackgroundAmplitudeBand19 = otoBackgroundAmplitudeBand19;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand20() {
        return otoBackgroundAmplitudeBand20;
    }

    public void setOtoBackgroundAmplitudeBand20(BigDecimal otoBackgroundAmplitudeBand20) {
        this.otoBackgroundAmplitudeBand20 = otoBackgroundAmplitudeBand20;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand21() {
        return otoBackgroundAmplitudeBand21;
    }

    public void setOtoBackgroundAmplitudeBand21(BigDecimal otoBackgroundAmplitudeBand21) {
        this.otoBackgroundAmplitudeBand21 = otoBackgroundAmplitudeBand21;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand22() {
        return otoBackgroundAmplitudeBand22;
    }

    public void setOtoBackgroundAmplitudeBand22(BigDecimal otoBackgroundAmplitudeBand22) {
        this.otoBackgroundAmplitudeBand22 = otoBackgroundAmplitudeBand22;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand23() {
        return otoBackgroundAmplitudeBand23;
    }

    public void setOtoBackgroundAmplitudeBand23(BigDecimal otoBackgroundAmplitudeBand23) {
        this.otoBackgroundAmplitudeBand23 = otoBackgroundAmplitudeBand23;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand24() {
        return otoBackgroundAmplitudeBand24;
    }

    public void setOtoBackgroundAmplitudeBand24(BigDecimal otoBackgroundAmplitudeBand24) {
        this.otoBackgroundAmplitudeBand24 = otoBackgroundAmplitudeBand24;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand25() {
        return otoBackgroundAmplitudeBand25;
    }

    public void setOtoBackgroundAmplitudeBand25(BigDecimal otoBackgroundAmplitudeBand25) {
        this.otoBackgroundAmplitudeBand25 = otoBackgroundAmplitudeBand25;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand26() {
        return otoBackgroundAmplitudeBand26;
    }

    public void setOtoBackgroundAmplitudeBand26(BigDecimal otoBackgroundAmplitudeBand26) {
        this.otoBackgroundAmplitudeBand26 = otoBackgroundAmplitudeBand26;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand27() {
        return otoBackgroundAmplitudeBand27;
    }

    public void setOtoBackgroundAmplitudeBand27(BigDecimal otoBackgroundAmplitudeBand27) {
        this.otoBackgroundAmplitudeBand27 = otoBackgroundAmplitudeBand27;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand28() {
        return otoBackgroundAmplitudeBand28;
    }

    public void setOtoBackgroundAmplitudeBand28(BigDecimal otoBackgroundAmplitudeBand28) {
        this.otoBackgroundAmplitudeBand28 = otoBackgroundAmplitudeBand28;
    }

    public BigDecimal getOtoBackgroundAmplitudeBand30() {
        return otoBackgroundAmplitudeBand30;
    }

    public void setOtoBackgroundAmplitudeBand30(BigDecimal otoBackgroundAmplitudeBand30) {
        this.otoBackgroundAmplitudeBand30 = otoBackgroundAmplitudeBand30;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand1() {
        return otoBackgroundAdaptiveAmplitudeBand1;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand1(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand1) {
        this.otoBackgroundAdaptiveAmplitudeBand1 = otoBackgroundAdaptiveAmplitudeBand1;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand2() {
        return otoBackgroundAdaptiveAmplitudeBand2;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand2(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand2) {
        this.otoBackgroundAdaptiveAmplitudeBand2 = otoBackgroundAdaptiveAmplitudeBand2;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand3() {
        return otoBackgroundAdaptiveAmplitudeBand3;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand3(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand3) {
        this.otoBackgroundAdaptiveAmplitudeBand3 = otoBackgroundAdaptiveAmplitudeBand3;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand4() {
        return otoBackgroundAdaptiveAmplitudeBand4;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand4(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand4) {
        this.otoBackgroundAdaptiveAmplitudeBand4 = otoBackgroundAdaptiveAmplitudeBand4;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand5() {
        return otoBackgroundAdaptiveAmplitudeBand5;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand5(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand5) {
        this.otoBackgroundAdaptiveAmplitudeBand5 = otoBackgroundAdaptiveAmplitudeBand5;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand6() {
        return otoBackgroundAdaptiveAmplitudeBand6;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand6(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand6) {
        this.otoBackgroundAdaptiveAmplitudeBand6 = otoBackgroundAdaptiveAmplitudeBand6;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand7() {
        return otoBackgroundAdaptiveAmplitudeBand7;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand7(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand7) {
        this.otoBackgroundAdaptiveAmplitudeBand7 = otoBackgroundAdaptiveAmplitudeBand7;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand8() {
        return otoBackgroundAdaptiveAmplitudeBand8;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand8(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand8) {
        this.otoBackgroundAdaptiveAmplitudeBand8 = otoBackgroundAdaptiveAmplitudeBand8;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand9() {
        return otoBackgroundAdaptiveAmplitudeBand9;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand9(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand9) {
        this.otoBackgroundAdaptiveAmplitudeBand9 = otoBackgroundAdaptiveAmplitudeBand9;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand10() {
        return otoBackgroundAdaptiveAmplitudeBand10;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand10(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand10) {
        this.otoBackgroundAdaptiveAmplitudeBand10 = otoBackgroundAdaptiveAmplitudeBand10;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand11() {
        return otoBackgroundAdaptiveAmplitudeBand11;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand11(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand11) {
        this.otoBackgroundAdaptiveAmplitudeBand11 = otoBackgroundAdaptiveAmplitudeBand11;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand12() {
        return otoBackgroundAdaptiveAmplitudeBand12;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand12(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand12) {
        this.otoBackgroundAdaptiveAmplitudeBand12 = otoBackgroundAdaptiveAmplitudeBand12;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand13() {
        return otoBackgroundAdaptiveAmplitudeBand13;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand13(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand13) {
        this.otoBackgroundAdaptiveAmplitudeBand13 = otoBackgroundAdaptiveAmplitudeBand13;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand14() {
        return otoBackgroundAdaptiveAmplitudeBand14;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand14(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand14) {
        this.otoBackgroundAdaptiveAmplitudeBand14 = otoBackgroundAdaptiveAmplitudeBand14;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand15() {
        return otoBackgroundAdaptiveAmplitudeBand15;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand15(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand15) {
        this.otoBackgroundAdaptiveAmplitudeBand15 = otoBackgroundAdaptiveAmplitudeBand15;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand16() {
        return otoBackgroundAdaptiveAmplitudeBand16;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand16(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand16) {
        this.otoBackgroundAdaptiveAmplitudeBand16 = otoBackgroundAdaptiveAmplitudeBand16;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand17() {
        return otoBackgroundAdaptiveAmplitudeBand17;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand17(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand17) {
        this.otoBackgroundAdaptiveAmplitudeBand17 = otoBackgroundAdaptiveAmplitudeBand17;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand18() {
        return otoBackgroundAdaptiveAmplitudeBand18;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand18(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand18) {
        this.otoBackgroundAdaptiveAmplitudeBand18 = otoBackgroundAdaptiveAmplitudeBand18;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand19() {
        return otoBackgroundAdaptiveAmplitudeBand19;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand19(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand19) {
        this.otoBackgroundAdaptiveAmplitudeBand19 = otoBackgroundAdaptiveAmplitudeBand19;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand20() {
        return otoBackgroundAdaptiveAmplitudeBand20;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand20(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand20) {
        this.otoBackgroundAdaptiveAmplitudeBand20 = otoBackgroundAdaptiveAmplitudeBand20;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand21() {
        return otoBackgroundAdaptiveAmplitudeBand21;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand21(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand21) {
        this.otoBackgroundAdaptiveAmplitudeBand21 = otoBackgroundAdaptiveAmplitudeBand21;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand22() {
        return otoBackgroundAdaptiveAmplitudeBand22;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand22(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand22) {
        this.otoBackgroundAdaptiveAmplitudeBand22 = otoBackgroundAdaptiveAmplitudeBand22;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand23() {
        return otoBackgroundAdaptiveAmplitudeBand23;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand23(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand23) {
        this.otoBackgroundAdaptiveAmplitudeBand23 = otoBackgroundAdaptiveAmplitudeBand23;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand24() {
        return otoBackgroundAdaptiveAmplitudeBand24;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand24(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand24) {
        this.otoBackgroundAdaptiveAmplitudeBand24 = otoBackgroundAdaptiveAmplitudeBand24;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand25() {
        return otoBackgroundAdaptiveAmplitudeBand25;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand25(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand25) {
        this.otoBackgroundAdaptiveAmplitudeBand25 = otoBackgroundAdaptiveAmplitudeBand25;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand26() {
        return otoBackgroundAdaptiveAmplitudeBand26;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand26(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand26) {
        this.otoBackgroundAdaptiveAmplitudeBand26 = otoBackgroundAdaptiveAmplitudeBand26;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand27() {
        return otoBackgroundAdaptiveAmplitudeBand27;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand27(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand27) {
        this.otoBackgroundAdaptiveAmplitudeBand27 = otoBackgroundAdaptiveAmplitudeBand27;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand28() {
        return otoBackgroundAdaptiveAmplitudeBand28;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand28(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand28) {
        this.otoBackgroundAdaptiveAmplitudeBand28 = otoBackgroundAdaptiveAmplitudeBand28;
    }

    public BigDecimal getOtoBackgroundAdaptiveAmplitudeBand30() {
        return otoBackgroundAdaptiveAmplitudeBand30;
    }

    public void setOtoBackgroundAdaptiveAmplitudeBand30(
            BigDecimal otoBackgroundAdaptiveAmplitudeBand30) {
        this.otoBackgroundAdaptiveAmplitudeBand30 = otoBackgroundAdaptiveAmplitudeBand30;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getDetectionFilePath01() {
        return detectionFilePath01;
    }

    public void setDetectionFilePath01(String detectionFilePath01) {
        this.detectionFilePath01 = detectionFilePath01;
    }

    public String getDetectionFilePath02() {
        return detectionFilePath02;
    }

    public void setDetectionFilePath02(String detectionFilePath02) {
        this.detectionFilePath02 = detectionFilePath02;
    }

    public String getBackgroundFilePath() {
        return backgroundFilePath;
    }

    public void setBackgroundFilePath(String backgroundFilePath) {
        this.backgroundFilePath = backgroundFilePath;
    }

    public String getBackgroundAdaptiveFilePath() {
        return backgroundAdaptiveFilePath;
    }

    public void setBackgroundAdaptiveFilePath(String backgroundAdaptiveFilePath) {
        this.backgroundAdaptiveFilePath = backgroundAdaptiveFilePath;
    }

    public String getPressureDetectionLevel() {
        return pressureDetectionLevel;
    }

    public void setPressureDetectionLevel(String pressureDetectionLevel) {
        this.pressureDetectionLevel = pressureDetectionLevel;
    }

    public BigDecimal getPressureDetectionDuration() {
        return pressureDetectionDuration;
    }

    public void setPressureDetectionDuration(BigDecimal pressureDetectionDuration) {
        this.pressureDetectionDuration = pressureDetectionDuration;
    }

    public String getPressureBackgroundAmplitude() {
        return pressureBackgroundAmplitude;
    }

    public void setPressureBackgroundAmplitude(String pressureBackgroundAmplitude) {
        this.pressureBackgroundAmplitude = pressureBackgroundAmplitude;
    }

    public BigDecimal getPressureBackgroundPeriod() {
        return pressureBackgroundPeriod;
    }

    public void setPressureBackgroundPeriod(BigDecimal pressureBackgroundPeriod) {
        this.pressureBackgroundPeriod = pressureBackgroundPeriod;
    }

    public String getPressureDetectionFilePath() {
        return pressureDetectionFilePath;
    }

    public void setPressureDetectionFilePath(String pressureDetectionFilePath) {
        this.pressureDetectionFilePath = pressureDetectionFilePath;
    }

    public String getPressureBackgroundFilePath() {
        return pressureBackgroundFilePath;
    }

    public void setPressureBackgroundFilePath(String pressureBackgroundFilePath) {
        this.pressureBackgroundFilePath = pressureBackgroundFilePath;
    }

    public BigDecimal getMagneticDetectionLevelMax() {
        return magneticDetectionLevelMax;
    }

    public void setMagneticDetectionLevelMax(BigDecimal magneticDetectionLevelMax) {
        this.magneticDetectionLevelMax = magneticDetectionLevelMax;
    }

    public BigDecimal getMagneticDetectionLevelMin() {
        return magneticDetectionLevelMin;
    }

    public void setMagneticDetectionLevelMin(BigDecimal magneticDetectionLevelMin) {
        this.magneticDetectionLevelMin = magneticDetectionLevelMin;
    }

    public BigDecimal getMagneticDetectionDuration() {
        return magneticDetectionDuration;
    }

    public void setMagneticDetectionDuration(BigDecimal magneticDetectionDuration) {
        this.magneticDetectionDuration = magneticDetectionDuration;
    }

    public String getMagneticDetectionFilePath() {
        return magneticDetectionFilePath;
    }

    public void setMagneticDetectionFilePath(String magneticDetectionFilePath) {
        this.magneticDetectionFilePath = magneticDetectionFilePath;
    }

    public String getMagneticBackgroundFilePath() {
        return magneticBackgroundFilePath;
    }

    public void setMagneticBackgroundFilePath(String magneticBackgroundFilePath) {
        this.magneticBackgroundFilePath = magneticBackgroundFilePath;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getTag4() {
        return tag4;
    }

    public void setTag4(String tag4) {
        this.tag4 = tag4;
    }

    public String getTag5() {
        return tag5;
    }

    public void setTag5(String tag5) {
        this.tag5 = tag5;
    }

    public String getTag6() {
        return tag6;
    }

    public void setTag6(String tag6) {
        this.tag6 = tag6;
    }

    public String getTag7() {
        return tag7;
    }

    public void setTag7(String tag7) {
        this.tag7 = tag7;
    }

    public String getTag8() {
        return tag8;
    }

    public void setTag8(String tag8) {
        this.tag8 = tag8;
    }

    public String getTag9() {
        return tag9;
    }

    public void setTag9(String tag9) {
        this.tag9 = tag9;
    }

    public String getTag10() {
        return tag10;
    }

    public void setTag10(String tag10) {
        this.tag10 = tag10;
    }
}
