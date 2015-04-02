package com.yerokhava.controller;
import com.yerokhava.logic.Logic;

/**
 * Created by Jane S on 11.03.2015.
 */
public class Manager
{

    public Object execute(int commandName, Object ... arg)
    {
       switch (commandName) {
           case (1):
               return Logic.Contain((String)arg[0], (String)arg[1]);

           case(2):
               return Logic.SearchSuperGnom((String)arg[0]);

           case (3):
               Logic.AddGnom((String)arg[0], (String)arg[1]);
               break;
           case(4):
              return  Logic.ShowAll();

       }
return null;
        }

    }
