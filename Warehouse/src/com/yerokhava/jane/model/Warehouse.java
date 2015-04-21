package com.yerokhava.jane.model;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

	private static Warehouse instance;
	
	private Warehouse(){

        goods = new ArrayList<Good>();
    }
	
	public static Warehouse getInstance(){
		if(null == instance){
			instance = new Warehouse();
		}
		return instance;
	}
	
	private List<Good> goods;

	public List<Good> getGood() {
		return goods;
	}


    //передавать list<good>??
	public void setGood(Good thing) {

        this.goods.add(thing);
	}
	
	
	
	
}
