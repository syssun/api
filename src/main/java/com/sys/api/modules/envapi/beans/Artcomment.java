package com.sys.api.modules.envapi.beans;

import java.io.Serializable;
import java.util.Date;

public class Artcomment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.acid
     *
     * @mbg.generated
     */
    private Integer acid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.aid
     *
     * @mbg.generated
     */
    private Integer aid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.adddate
     *
     * @mbg.generated
     */
    private Date adddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.upddate
     *
     * @mbg.generated
     */
    private Date upddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.delflg
     *
     * @mbg.generated
     */
    private Integer delflg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column artcomment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table artcomment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.acid
     *
     * @return the value of artcomment.acid
     *
     * @mbg.generated
     */
    public Integer getAcid() {
        return acid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.acid
     *
     * @param acid the value for artcomment.acid
     *
     * @mbg.generated
     */
    public void setAcid(Integer acid) {
        this.acid = acid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.aid
     *
     * @return the value of artcomment.aid
     *
     * @mbg.generated
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.aid
     *
     * @param aid the value for artcomment.aid
     *
     * @mbg.generated
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.userid
     *
     * @return the value of artcomment.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.userid
     *
     * @param userid the value for artcomment.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.adddate
     *
     * @return the value of artcomment.adddate
     *
     * @mbg.generated
     */
    public Date getAdddate() {
        return adddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.adddate
     *
     * @param adddate the value for artcomment.adddate
     *
     * @mbg.generated
     */
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.upddate
     *
     * @return the value of artcomment.upddate
     *
     * @mbg.generated
     */
    public Date getUpddate() {
        return upddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.upddate
     *
     * @param upddate the value for artcomment.upddate
     *
     * @mbg.generated
     */
    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.delflg
     *
     * @return the value of artcomment.delflg
     *
     * @mbg.generated
     */
    public Integer getDelflg() {
        return delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.delflg
     *
     * @param delflg the value for artcomment.delflg
     *
     * @mbg.generated
     */
    public void setDelflg(Integer delflg) {
        this.delflg = delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artcomment.content
     *
     * @return the value of artcomment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artcomment.content
     *
     * @param content the value for artcomment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artcomment
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acid=").append(acid);
        sb.append(", aid=").append(aid);
        sb.append(", userid=").append(userid);
        sb.append(", adddate=").append(adddate);
        sb.append(", upddate=").append(upddate);
        sb.append(", delflg=").append(delflg);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}