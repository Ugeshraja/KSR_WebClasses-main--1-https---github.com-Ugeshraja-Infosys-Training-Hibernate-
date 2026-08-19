package model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    
    @Id
    @Column(name="usrname", length = 100)
    private String username;
    
    @Column(name="password", length = 50)
    private String password;
    
    @Column(name="gender", length = 10)
    private String gender;
    
    @Column(name="tech", length = 150)
    private String tech;
    
    @Column(name="ctry", length = 100)
    private String ctry;
    
    @Column(name="dte", length = 50)
    private String date1;
    
    @Column(name="datetime", length = 50)
    private String date_time;
    
    @Column(name="mnth", length = 50)
    private String month;
    
    @Column(name="number", length = 10)
    private String number;
    
    @Column(name="clr", length = 20)
    private String color;
    
    @Column(name="rng", length = 10)
    private String range;
    
    @Column(name="emailid", length = 150)
    private String emailid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getCtry() {
        return ctry;
    }

    public void setCtry(String ctry) {
        this.ctry = ctry;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    
    
    
}
