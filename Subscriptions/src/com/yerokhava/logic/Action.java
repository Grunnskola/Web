package com.yerokhava.logic;
import com.yerokhava.entity.DateOfEdition;
import com.yerokhava.entity.Edition;
import  com.yerokhava.entity.MapOfEdition;

import java.util.List;

/**
 * Created by Jane S on 26.03.2015.
 */
public class Action {

  public static void addEdition(String type, String name, int price, String param1, String param2){
    Edition obj  = EditionFactory.getEdition(type,name,price,param1,param2);
    MapOfEdition.listOfEdition.add(obj);
  }
  public static  List<Edition> viewAll(){
        return MapOfEdition.getListOfEdition();
    }

  public static void addTime(String years) {
        DateOfEdition date = new DateOfEdition();
        date.setYear(years);
        MapOfEdition.setDateOfEdition(date);
  }

  public  static DateOfEdition showTime(){
        return MapOfEdition.getDateOfEdition();
    }
}
