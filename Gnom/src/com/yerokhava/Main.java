package com.yerokhava;

import com.yerokhava.controller.Manager;
import  com.yerokhava.view.Validation;


/**
 * Created by Jane S on 11.03.2015.
 */
public class Main{
public static void main(String[] args) {

    Manager myMng = new Manager();
    Validation myValid;
    myValid = new Validation(myMng);
    myValid.addGnomus( "Sam", "middle");
    myValid.addGnomus("Paul", "senior");
    myValid.addGnomus("Ricko", "middle");
    myValid.addGnomus("Alex", "junior");
    myValid.addGnomus("Bin", "senior");
    myValid.addGnomus("Dag", "junior");
    myValid.addGnomus("Norb", "senior");

    myValid.SuperGnomFind("middle");
    myValid.ControlValue("Sam", "middle");
    myValid.ShowGnoms();

}
}
