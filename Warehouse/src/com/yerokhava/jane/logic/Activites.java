package com.yerokhava.jane.logic;
import com.sun.java.util.jar.pack.*;
import com.yerokhava.jane.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jane S on 21.04.2015.
 */
public class Activites {


    //poisk na sklade
    public boolean searchOnWarhouse(Good goodForSearch) {

        Warehouse whouse = Warehouse.getInstance();
        List<Good> listOfGood = whouse.getGood();

        boolean check = false;
        if (listOfGood.contains(goodForSearch)) {
            check = true;
        }

        return check;
    }

    //sortirovka predmetov na sklade po priznaku: code 
    public List<Good> sortOnWarehouse() {

        Warehouse whouse = Warehouse.getInstance();
        List<Good> listOfGood = whouse.getGood();

        boolean sorting = false;
        if(listOfGood.sort(listOfGood,new Comparator<Good>() {
            public int compare(Good g1, Good g2) {
                int result =0;
                if (g1.getCode() != null && g2.getCode() != null && g1.getCode().compareTo(g1.getCode()) != 0) {
                    result =  g1.getCode().compareTo(g2.getCode());
                }
              if(result != 0) return result;
            } //пытается вернуть int из метода compare()
        })){
            return listOfGood;
    }
        return listOfGood;
    }


    //poisk sovpadenii
    public List<Good> searchCoincidence (String coincidence) {

        Warehouse whouse = Warehouse.getInstance();
        List<Good> listOfGood = whouse.getGood();
        List<Good> myList = new ArrayList<Good>();
        Good temp;
        for(Good a : listOfGood) {
            if(a.getDate() == coincidence || a.getCode() == coincidence || a.getAnnotation() == coincidence || a.getCategory() == coincidence) {
               myList.add(a) ;
            }

        }

        return  myList;
    }


    //dobavlenie na sklad
    public void addIntoList(Good goodForInput) {

        Warehouse whouse = Warehouse.getInstance();
        List<Good> listOfGood = whouse.getGood();

        listOfGood.add(goodForInput);
    }


    //zagruzka iz file
    public void loadDataFromFile(String filepath) {

        Warehouse whouse = Warehouse.getInstance();
        List<Good> listOfGood = whouse.getGood();

        ArrayList<String> tempList = new ArrayList<String>();
        try {
            Scanner s = new Scanner(new File(filepath));
            while ((s.hasNextLine())) {
                tempList.add(s.next());
            }
            s.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

     //   listOfGood = (ArrayList<Good>)tempList;
    }
}