package com.yerokhava.logic;

import com.yerokhava.entity.Edition;
import com.yerokhava.entity.Journal;
import com.yerokhava.entity.Newspaper;

/**
 * Created by Jane S on 25.03.2015.
 */
public class EditionFactory {

public static Edition getEdition(String type, String name , int price , String param1, String param2){

  // Edition subscr = null; //equi
    if(type.equals("Journal")) {
        return new Journal(name,price,param1,param2);
    }
    if(type.equals("Newspaper")) {
       return new Newspaper(name,price,param1,param2);
    }
    return null;
}

}
