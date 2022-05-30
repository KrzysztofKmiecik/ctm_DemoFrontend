package pl.kmiecik.ctm_demofrontend.ais;

import java.time.LocalDateTime;
import java.util.UUID;

public class SearchingResult {

  private UUID resourceId;
  private Location location;
  private LocalDateTime timeStart;
  private LocalDateTime timeEnd;
  private String description;
  private String buoyNumber;
  private String missionNumber;

  public UUID getResourceId() {
    return resourceId;
  }

  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public LocalDateTime getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(LocalDateTime timeStart) {
    this.timeStart = timeStart;
  }

  public LocalDateTime getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(LocalDateTime timeEnd) {
    this.timeEnd = timeEnd;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getBuoyNumber() {
    return buoyNumber;
  }

  public void setBuoyNumber(String buoyNumber) {
    this.buoyNumber = buoyNumber;
  }

  public String getMissionNumber() {
    return missionNumber;
  }

  public void setMissionNumber(String missionNumber) {
    this.missionNumber = missionNumber;
  }



}
