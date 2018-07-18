package com.moon.system.pojo;

import javax.persistence.*;

@Table(name = "e_map")
public class EMap {
    @Id
    private Integer id;

    private String name;

    private String lat;

    private String lng;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }
}