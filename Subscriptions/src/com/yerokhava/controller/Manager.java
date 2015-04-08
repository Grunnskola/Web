package com.yerokhava.controller;
import com.yerokhava.entity.Edition;
import com.yerokhava.logic.Action;
import com.yerokhava.logic.EditionFactory;

import java.util.List;

/**
 * Created by Jane S on 25.03.2015.
 */
public class Manager {


    public Object Execute(int Selector){

        switch (Selector){
            case(1):
                return  Action.viewAll();

            case(2):
                return Action.ShowTime();
        }
        return  null;
    }

    public void Execute(String time){
        Action.AddTime(time);
    }



    public void Execute(int selector, String type, String name, int price, String param1, String param2) {
        switch (selector) {
            case (1):
                Action.AddEdition(type, name, price, param1, param2);

                break;
        }
    }


}
