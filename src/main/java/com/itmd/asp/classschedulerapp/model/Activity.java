package com.itmd.asp.classschedulerapp.model;
 import java.io.Serializable;
 import java.util.Date;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.Table;
 import javax.persistence.Temporal;
 import javax.persistence.TemporalType;
 import org.springframework.data.annotation.CreatedDate;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="activities")
@JsonIgnoreProperties(value = {"activityDateCreated"},
        allowGetters = true)

public class Activity implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long activityId;
    private String activityCourseId;
    private String activityCourse;
    private String activityName;
    private String activityStartDate;
    private String activityEndDate;
    //	private String activityStartTime;
//	private String activityEndTime;
//	private String activityDocument;
//	private String activityComment;
    private boolean activityFinished;
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date activityDateCreated;


    public Activity() {

    }

    public Activity(String activityCourseId, String activityCourse, String activityName, String activityStartDate,
                    String activityEndDate, boolean activityFinished, Date activityDateCreated) {
        super();
        this.activityCourseId = activityCourseId;
        this.activityCourse = activityCourse;
        this.activityName = activityName;
        this.activityStartDate = activityStartDate;
        this.activityEndDate = activityEndDate;
        this.activityFinished = activityFinished;
        this.activityDateCreated = activityDateCreated;
    }

    public long getActivityId() {
        return activityId;
    }
    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }
    public String getActivityCourseId() {
        return activityCourseId;
    }
    public void setActivityCourseId(String activityCourseId) {
        this.activityCourseId = activityCourseId;
    }
    public String getActivityCourse() {
        return activityCourse;
    }
    public void setActivityCourse(String activityCourse) {
        this.activityCourse = activityCourse;
    }
    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public String getActivityStartDate() {
        return activityStartDate;
    }
    public void setActivityStartDate(String activityStartDate) {
        this.activityStartDate = activityStartDate;
    }
    public String getActivityEndDate() {
        return activityEndDate;
    }
    public void setActivityEndDate(String activityEndDate) {
        this.activityEndDate = activityEndDate;
    }
    public boolean isActivityFinished() {
        return activityFinished;
    }
    public void setActivityFinished(boolean activityFinished) {
        this.activityFinished = activityFinished;
    }
    public Date getActivityDateCreated() {
        return activityDateCreated;
    }
    public void setActivityDateCreated(Date activityDateCreated) {
        this.activityDateCreated = activityDateCreated;
    }

    @Override
    public String toString() {
        return "Activity [activityId=" + activityId + ", activityCourseId=" + activityCourseId + ", activityCourse="
                + activityCourse + ", activityName=" + activityName + ", activityStartDate=" + activityStartDate
                + ", activityEndDate=" + activityEndDate + ", activityFinished=" + activityFinished
                + ", activityDateCreated=" + activityDateCreated + "]";
    }

}
