package com.spartaglobal.eng76.framework.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.spartaglobal.eng76.framework.connectionmanager.ConnectionManager;

import java.net.http.HttpResponse;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "coord",
        "weather",
        "base",
        "main",
        "visibility",
        "wind",
        "clouds",
        "rain",
        "snow",
        "dt",
        "sys",
        "timezone",
        "id",
        "name",
        "cod"
})

public class WeatherDTO {

    @JsonProperty("coord")
    private HashMap<String, String> coord;

    @JsonProperty("weather")
    private List<HashMap<String, String>> weather;

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private HashMap<String, String> main;

    @JsonProperty("visibility")
    private String visibility;

    @JsonProperty("wind")
    private HashMap<String, String> wind;

    @JsonProperty("clouds")
    private HashMap<String, String> clouds;

    @JsonProperty("rain")
    private HashMap<String, String> rain;

    @JsonProperty("snow")
    private HashMap<String, String> snow;

    @JsonProperty("dt")
    private String dt;

    @JsonProperty("sys")
    private HashMap<String, String> sys;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private String cod;

    @JsonIgnore
    private ConnectionManager connectionManager;

    public WeatherDTO() {

    }



    public HashMap<String, String> getCoord() {
        return coord;
    }

    public List<HashMap<String, String>> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public HashMap<String, String> getMain() {
        return main;
    }

    public String getVisibility() {
        return visibility;
    }

    public HashMap<String, String> getWind() {
        return wind;
    }

    public HashMap<String, String> getClouds() {
        return clouds;
    }

    public HashMap<String, String> getRain() {
        return rain;
    }

    public HashMap<String, String> getSnow() {
        return snow;
    }

    public String getDt() {
        return dt;
    }

    public HashMap<String, String> getSys() {
        return sys;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCod() {
        return cod;
    }

    public void setConnectionManager(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public ConnectionManager getConnectionManager() {
        return connectionManager;
    }

    private Date localDate;

    public LocalDate getLocalDate() {
        localDate = new Date(Long.parseLong(getDt())*1000);
        return localDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}

