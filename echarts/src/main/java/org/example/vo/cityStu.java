package org.example.vo;

public class cityStu {
    private String cityName;
    private int studentNum;

    public cityStu() {
        super();
    }

    public cityStu(String cityName, int studentNum) {
        this.cityName = cityName;
        this.studentNum = studentNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "cityStu{" +
                "cityName='" + cityName + '\'' +
                ", studentNum=" + studentNum +
                '}';
    }
}
