package com.gojek.gotix;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LOCATION.
 */
public class Location {

    private Long id;
    private Integer location_id;
    private String name;
    private String venue_name;
    private String address;
    private String district;
    private String region;
    private String province;
    private Double latitude;
    private Double longitude;
    private long event_id;

    public Location() {
    }

    public Location(Long id) {
        this.id = id;
    }

    public Location(Long id, Integer location_id, String name, String venue_name, String address, String district, String region, String province, Double latitude, Double longitude, long event_id) {
        this.id = id;
        this.location_id = location_id;
        this.name = name;
        this.venue_name = venue_name;
        this.address = address;
        this.district = district;
        this.region = region;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
        this.event_id = event_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue_name() {
        return venue_name;
    }

    public void setVenue_name(String venue_name) {
        this.venue_name = venue_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

}
