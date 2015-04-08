package com.yerokhava.entity;

/**
 * Created by Jane S on 23.03.2015.
 */
public class Newspaper extends Edition {

    private String Efficiency; //оперативность предоставления информации: самая последняя или за неделю
    private String Crossword;

    public String getCrossword() {
        return Crossword;
    }

    public void setCrossword(String crossword) {
        Crossword = crossword;
    }

    public String getEfficiency() {
        return Efficiency;
    }

    public void setEfficiency(String efficiency) {
        Efficiency = efficiency;
    }

    public Newspaper( String name , int price , String efficiency, String crossword){
        this.setName(name);
        this.setPrice(price);
        this.setEfficiency(efficiency);
        this.setCrossword(crossword);
    }


}
