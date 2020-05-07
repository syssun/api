package com.sys.api.modules.envapi.beans;

import java.io.Serializable;
import java.util.Date;

public class Euser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.usercode
     *
     * @mbg.generated
     */
    private String usercode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.sex
     *
     * @mbg.generated
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.age
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.adddate
     *
     * @mbg.generated
     */
    private Date adddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.upddate
     *
     * @mbg.generated
     */
    private Date upddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.delflg
     *
     * @mbg.generated
     */
    private Integer delflg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euser.umail
     *
     * @mbg.generated
     */
    private String umail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table euser
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.userid
     *
     * @return the value of euser.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.userid
     *
     * @param userid the value for euser.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.usercode
     *
     * @return the value of euser.usercode
     *
     * @mbg.generated
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.usercode
     *
     * @param usercode the value for euser.usercode
     *
     * @mbg.generated
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.username
     *
     * @return the value of euser.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.username
     *
     * @param username the value for euser.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.name
     *
     * @return the value of euser.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.name
     *
     * @param name the value for euser.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.password
     *
     * @return the value of euser.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.password
     *
     * @param password the value for euser.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.sex
     *
     * @return the value of euser.sex
     *
     * @mbg.generated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.sex
     *
     * @param sex the value for euser.sex
     *
     * @mbg.generated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.age
     *
     * @return the value of euser.age
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.age
     *
     * @param age the value for euser.age
     *
     * @mbg.generated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.adddate
     *
     * @return the value of euser.adddate
     *
     * @mbg.generated
     */
    public Date getAdddate() {
        return adddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.adddate
     *
     * @param adddate the value for euser.adddate
     *
     * @mbg.generated
     */
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.upddate
     *
     * @return the value of euser.upddate
     *
     * @mbg.generated
     */
    public Date getUpddate() {
        return upddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.upddate
     *
     * @param upddate the value for euser.upddate
     *
     * @mbg.generated
     */
    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.delflg
     *
     * @return the value of euser.delflg
     *
     * @mbg.generated
     */
    public Integer getDelflg() {
        return delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.delflg
     *
     * @param delflg the value for euser.delflg
     *
     * @mbg.generated
     */
    public void setDelflg(Integer delflg) {
        this.delflg = delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euser.umail
     *
     * @return the value of euser.umail
     *
     * @mbg.generated
     */
    public String getUmail() {
        return umail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euser.umail
     *
     * @param umail the value for euser.umail
     *
     * @mbg.generated
     */
    public void setUmail(String umail) {
        this.umail = umail == null ? null : umail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euser
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", usercode=").append(usercode);
        sb.append(", username=").append(username);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", adddate=").append(adddate);
        sb.append(", upddate=").append(upddate);
        sb.append(", delflg=").append(delflg);
        sb.append(", umail=").append(umail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}