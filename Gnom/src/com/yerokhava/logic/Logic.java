package com.yerokhava.logic;

import com.yerokhava.entity.iGnom;
import com.yerokhava.entity.gnomConteiner;


import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Jane S on 11.03.2015.
 */
public final class Logic {

    public static boolean Contain(String s,String s1) //проверить содержит ли контейнер гнома
    {
        gnomConteiner gn = gnomConteiner.getInstance();
        List<iGnom> listGnomov = gn.getGnomHome();
        iGnom individuum = new iGnom();
        boolean chek = false;
        individuum.setName((s));
        individuum.setSkill((s1));
        for(iGnom gnml:listGnomov)
        {
            if ( gnml.getSkill().equals(s1) && gnml.getName().equals(s)   )
       // if (gnml.equals(individuum))
           chek = true;
        }
        return  chek;
    }

    public static void AddGnom(String name, String power) {

        gnomConteiner gConteiner = gnomConteiner.getInstance();
        List<iGnom> listGnomov = gConteiner.getGnomHome();
        iGnom individuum = new iGnom();
        individuum.setName(name);
        individuum.setSkill(power);
        listGnomov.add(individuum);
        //return listGnomov;

    }

    public  static List<iGnom> ShowAll(){

        gnomConteiner gC = gnomConteiner.getInstance();
        List<iGnom> spisok = gC.getGnomHome();
        return  spisok;
    }

    public static List<iGnom> SearchSuperGnom( String power) {
        gnomConteiner gConteiner = gnomConteiner.getInstance();
        List<iGnom> storeTempGnom = new ArrayList<iGnom>();
        List<iGnom> listGnomov = gConteiner.getGnomHome();

        for (iGnom gn : listGnomov) {
            if(gn.getSkill() == power) {
                storeTempGnom.add(gn);
            }
        }
        return storeTempGnom;
    }

}

