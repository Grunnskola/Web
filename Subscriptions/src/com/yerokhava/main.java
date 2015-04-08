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

    View.addEdition("Journal", "Esquire", 10, "HardCover", "Big");
    View.addEdition("Newspaper", "Times", 5, "At the same time", "About science");

    View.addData("Valid for six months");

    View.showMeData();
    View.showMeMapOfEdition();

    }
}
