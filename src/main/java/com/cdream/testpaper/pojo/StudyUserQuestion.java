package com.cdream.testpaper.pojo;

import java.util.Date;

public class StudyUserQuestion {
    private Long id;

    private Integer userId;

    private Integer questionId;

    private Integer wrongTimes;

    private Integer meetTimes;

    private Integer passTimes;

    private String sammary;

    private Date createTimes;

    private Date updateTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getWrongTimes() {
        return wrongTimes;
    }

    public void setWrongTimes(Integer wrongTimes) {
        this.wrongTimes = wrongTimes;
    }

    public Integer getMeetTimes() {
        return meetTimes;
    }

    public void setMeetTimes(Integer meetTimes) {
        this.meetTimes = meetTimes;
    }

    public Integer getPassTimes() {
        return passTimes;
    }

    public void setPassTimes(Integer passTimes) {
        this.passTimes = passTimes;
    }

    public String getSammary() {
        return sammary;
    }

    public void setSammary(String sammary) {
        this.sammary = sammary == null ? null : sammary.trim();
    }

    public Date getCreateTimes() {
        return createTimes;
    }

    public void setCreateTimes(Date createTimes) {
        this.createTimes = createTimes;
    }

    public Date getUpdateTimes() {
        return updateTimes;
    }

    public void setUpdateTimes(Date updateTimes) {
        this.updateTimes = updateTimes;
    }
}