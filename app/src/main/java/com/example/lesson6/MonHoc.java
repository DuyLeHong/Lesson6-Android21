package com.example.lesson6;

import java.io.Serializable;

public class MonHoc implements Serializable {

    private String sName;
    private int numCredit;
    private boolean isNewCourse2022;

    public MonHoc(String sName, int numCredit, boolean isNewCourse2022) {
        this.sName = sName;
        this.numCredit = numCredit;
        this.isNewCourse2022 = isNewCourse2022;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getNumCredit() {
        return numCredit;
    }

    public void setNumCredit(int numCredit) {
        this.numCredit = numCredit;
    }

    public boolean isNewCourse2022() {
        return isNewCourse2022;
    }

    public void setNewCourse2022(boolean newCourse2022) {
        isNewCourse2022 = newCourse2022;
    }
}
