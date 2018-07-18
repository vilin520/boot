package com.moon.system.pojo;

import javax.persistence.*;

@Table(name = "m_userinfo")
public class MUserinfo {
    @Id
    private String userid;

    private String errcode;

    private String errmsg;

    private String name;

    private String department;

    private String position;

    private String mobile;

    private String gender;

    private String email;

    private String avatar;

    private String status;

    private String isleader;

    private String extattr;

    @Column(name = "english_name")
    private String englishName;

    private String telephone;

    private String enable;

    @Column(name = "hide_mobile")
    private String hideMobile;

    private String orders;

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return errcode
     */
    public String getErrcode() {
        return errcode;
    }

    /**
     * @param errcode
     */
    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    /**
     * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
     * @param errmsg
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
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
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return isleader
     */
    public String getIsleader() {
        return isleader;
    }

    /**
     * @param isleader
     */
    public void setIsleader(String isleader) {
        this.isleader = isleader;
    }

    /**
     * @return extattr
     */
    public String getExtattr() {
        return extattr;
    }

    /**
     * @param extattr
     */
    public void setExtattr(String extattr) {
        this.extattr = extattr;
    }

    /**
     * @return english_name
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }

    /**
     * @return hide_mobile
     */
    public String getHideMobile() {
        return hideMobile;
    }

    /**
     * @param hideMobile
     */
    public void setHideMobile(String hideMobile) {
        this.hideMobile = hideMobile;
    }

    /**
     * @return orders
     */
    public String getOrders() {
        return orders;
    }

    /**
     * @param orders
     */
    public void setOrders(String orders) {
        this.orders = orders;
    }
}