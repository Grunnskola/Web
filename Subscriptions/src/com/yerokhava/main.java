package com.yerokhava;

import com.yerokhava.controller.Manager;
import com.yerokhava.view.View;

/**
 * Created by Jane S on 06.04.2015.
 */
public class Main {


    public static void main(String[] args){


        Manager myMng = new Manager();
        View vw = new View(myMng);

        vw.addEdition("Journal","Esquire", 9999999, "middle" , "some");
        vw.addEdition("Newspaper" ,"комсомолка" ,0 , "Putin is OK" , "nothing");

        vw.addData("unlim");

        vw.showMeData();
        vw.showMeMapOfEdition();

    }
}
