package org.mgenterprises.friendfinder.library;

/**
 * Created by mgauto on 10/8/14.
 */
public class Location {
    private String description;
    private double gpsLat;
    private double gpsLong;
    private double gpsAlt;
    private long timestamp;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(double gpsLat) {
        this.gpsLat = gpsLat;
    }

    public double getGpsLong() {
        return gpsLong;
    }

    public void setGpsLong(double gpsLong) {
        this.gpsLong = gpsLong;
    }

    public double getGpsAlt() {
        return gpsAlt;
    }

    public void setGpsAlt(double gpsAlt) {
        this.gpsAlt = gpsAlt;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
