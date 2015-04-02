package com.yerokhava.entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.ListIterator;

/**
 * Created by Jane S on 26.02.2015.
 */

public class gnomConteiner {


    private static gnomConteiner instance;
    private  List<iGnom> gnomHome;

    private gnomConteiner (){
        gnomHome = new ArrayList<iGnom>();
    };

    public static gnomConteiner getInstance(){
        if(instance == null) instance = new gnomConteiner();
        return instance;
    }

    public List<iGnom> getGnomHome() {
        return gnomHome;
    }

    public void setGnomHome(List<iGnom> gnomHome) {
        this.gnomHome = gnomHome;
    }

}