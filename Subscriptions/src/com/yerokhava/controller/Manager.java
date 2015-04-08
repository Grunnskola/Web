package com.yerokhava.controller;
import com.yerokhava.logic.Action;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jane S on 25.03.2015.
 */
public class Manager {


    public Object Execute(int Selector){

        switch (Selector){
            case(1):
                return  Action.viewAll();

            case(2):
                return Action.showTime();
        }
        return  null;
    }

    public void Execute(String time){
        Action.addTime(time);
    }


    public void Execute(int selector, String type, String name, int price, String param1, String param2) {
        switch (selector) {
            case (1):
                    Action.addEdition(type, name, price, param1, param2);
            break;
        }
    }


}
