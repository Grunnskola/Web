package com.yerokhava.entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jane S on 26.03.2015.
 */
public class MapOfEdition {

    public static List<Object> listOfEdition = new ArrayList<Object>();

    public static List<Object> getListOfEdition() {
        return listOfEdition;
    }

    public static void setListOfEdition(List<Object> listOfEdition) {
        MapOfEdition.listOfEdition = listOfEdition;
    }

}
