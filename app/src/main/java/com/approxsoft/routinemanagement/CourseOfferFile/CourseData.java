package com.approxsoft.routinemanagement.CourseOfferFile;

public class CourseData {

    String CourseName,teacherName, Condition, CourseCredit;

    public CourseData()
    {

    }

    public CourseData(String courseName, String teacherName, String condition, String courseCredit) {
        CourseName = courseName;
        this.teacherName = teacherName;
        Condition = condition;
        CourseCredit = courseCredit;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getCourseCredit() {
        return CourseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        CourseCredit = courseCredit;
    }
}
