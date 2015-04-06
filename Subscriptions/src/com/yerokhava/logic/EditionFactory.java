package com.yerokhava.logic;

import com.yerokhava.entity.Edition;
import com.yerokhava.entity.Journal;
import com.yerokhava.entity.Newspaper;

/**
 * Created by Jane S on 25.03.2015.
 */
public class EditionFactory {

public static Edition getEdition(String s){

  // Edition subscr = null; //equi
    if(s.equals("Journal")) {
        return new Journal();
    }
    if(s.equals("Newspaper")) {
       return new Newspaper();
    }
    return null;
}

}
