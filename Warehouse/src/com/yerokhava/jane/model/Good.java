package com.yerokhava.jane.model;


import com.yerokhava.jane.logic.Command;

public class Good extends Command{


    public Good(String cat, String num, String day, String article) {

        this.setCategory(cat);
        this.setCode(num);
        this.setDate(day);
        this.setAnnotation(article);
    }

    private String category;
	private String code;
	private String date;
	private String annotation;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
	public void execute(){

        Warehouse warhome = Warehouse.getInstance();

    }
	
}
