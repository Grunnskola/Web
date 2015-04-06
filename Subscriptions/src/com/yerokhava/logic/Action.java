package com.yerokhava.logic;
import  com.yerokhava.entity.MapOfEdition;


/**
 * Created by Jane S on 26.03.2015.
 */
public class Action {

  public static void Add (Object obj){

     MapOfEdition.listOfEdition.add(obj);
  }

  public static void Exclude (Object obj) {

        MapOfEdition.listOfEdition.remove(obj);
  }



}
