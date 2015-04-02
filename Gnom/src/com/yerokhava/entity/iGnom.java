package com.yerokhava.entity;

/**
 * Created by Jane S on 26.02.2015.
 */
public class iGnom {

    public void setName(String name) {
        this.Name = name;
    }

    public  iGnom(){};

    private String Name;
    public String getName() {
        return Name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    private String skill;


}
