package com.sys.api.modules.envapi.beans;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.aid
     *
     * @mbg.generated
     */
    private Integer aid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.zans
     *
     * @mbg.generated
     */
    private Integer zans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.comments
     *
     * @mbg.generated
     */
    private Integer comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.artreads
     *
     * @mbg.generated
     */
    private Integer artreads;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.adddate
     *
     * @mbg.generated
     */
    private Date adddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.upddate
     *
     * @mbg.generated
     */
    private Date upddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.delflg
     *
     * @mbg.generated
     */
    private Integer delflg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.labels
     *
     * @mbg.generated
     */
    private String labels;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.eclass
     *
     * @mbg.generated
     */
    private Integer eclass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.simg
     *
     * @mbg.generated
     */
    private String simg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.scontent
     *
     * @mbg.generated
     */
    private String scontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.aid
     *
     * @return the value of article.aid
     *
     * @mbg.generated
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.aid
     *
     * @param aid the value for article.aid
     *
     * @mbg.generated
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.zans
     *
     * @return the value of article.zans
     *
     * @mbg.generated
     */
    public Integer getZans() {
        return zans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.zans
     *
     * @param zans the value for article.zans
     *
     * @mbg.generated
     */
    public void setZans(Integer zans) {
        this.zans = zans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.comments
     *
     * @return the value of article.comments
     *
     * @mbg.generated
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.comments
     *
     * @param comments the value for article.comments
     *
     * @mbg.generated
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.artreads
     *
     * @return the value of article.artreads
     *
     * @mbg.generated
     */
    public Integer getArtreads() {
        return artreads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.artreads
     *
     * @param artreads the value for article.artreads
     *
     * @mbg.generated
     */
    public void setArtreads(Integer artreads) {
        this.artreads = artreads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.adddate
     *
     * @return the value of article.adddate
     *
     * @mbg.generated
     */
    public Date getAdddate() {
        return adddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.adddate
     *
     * @param adddate the value for article.adddate
     *
     * @mbg.generated
     */
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.upddate
     *
     * @return the value of article.upddate
     *
     * @mbg.generated
     */
    public Date getUpddate() {
        return upddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.upddate
     *
     * @param upddate the value for article.upddate
     *
     * @mbg.generated
     */
    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.delflg
     *
     * @return the value of article.delflg
     *
     * @mbg.generated
     */
    public Integer getDelflg() {
        return delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.delflg
     *
     * @param delflg the value for article.delflg
     *
     * @mbg.generated
     */
    public void setDelflg(Integer delflg) {
        this.delflg = delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.userid
     *
     * @return the value of article.userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.userid
     *
     * @param userid the value for article.userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.labels
     *
     * @return the value of article.labels
     *
     * @mbg.generated
     */
    public String getLabels() {
        return labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.labels
     *
     * @param labels the value for article.labels
     *
     * @mbg.generated
     */
    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.eclass
     *
     * @return the value of article.eclass
     *
     * @mbg.generated
     */
    public Integer getEclass() {
        return eclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.eclass
     *
     * @param eclass the value for article.eclass
     *
     * @mbg.generated
     */
    public void setEclass(Integer eclass) {
        this.eclass = eclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.simg
     *
     * @return the value of article.simg
     *
     * @mbg.generated
     */
    public String getSimg() {
        return simg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.simg
     *
     * @param simg the value for article.simg
     *
     * @mbg.generated
     */
    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.scontent
     *
     * @return the value of article.scontent
     *
     * @mbg.generated
     */
    public String getScontent() {
        return scontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.scontent
     *
     * @param scontent the value for article.scontent
     *
     * @mbg.generated
     */
    public void setScontent(String scontent) {
        this.scontent = scontent == null ? null : scontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", title=").append(title);
        sb.append(", zans=").append(zans);
        sb.append(", comments=").append(comments);
        sb.append(", artreads=").append(artreads);
        sb.append(", adddate=").append(adddate);
        sb.append(", upddate=").append(upddate);
        sb.append(", delflg=").append(delflg);
        sb.append(", userid=").append(userid);
        sb.append(", labels=").append(labels);
        sb.append(", eclass=").append(eclass);
        sb.append(", simg=").append(simg);
        sb.append(", content=").append(content);
        sb.append(", scontent=").append(scontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}