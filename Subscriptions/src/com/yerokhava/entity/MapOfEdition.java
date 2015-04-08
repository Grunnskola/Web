package com.yerokhava.entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jane S on 26.03.2015.
 */
public class MapOfEdition {



    public static List<Edition> listOfEdition = new ArrayList<Edition>();


    public static List<Edition> getListOfEdition() {
        return listOfEdition;

    }

    private static   DateOfEdition date = new DateOfEdition();
    public static DateOfEdition getDateOfEdition() {
        return date;
    }
    public static void setDateOfEdition(DateOfEdition time) {
       date = time;
    }


    /*public static void setListOfEdition(List<Edition> listOfEdition) {
        MapOfEdition.listOfEdition = listOfEdition;
    }*/

}
