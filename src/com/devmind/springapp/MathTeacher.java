package com.devmind.springapp;

public class MathTeacher implements ITeacher {

    private String teacherName;

    public MathTeacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

    public String getTeacherName() {
        return teacherName;
    }

}
