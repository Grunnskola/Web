package com.yerokhava.controller;
import com.yerokhava.entity.Edition;
import com.yerokhava.logic.Action;
import com.yerokhava.logic.EditionFactory;

/**
 * Created by Jane S on 25.03.2015.
 */
public class Manager {

    public Object ResolveFactory(String s) {

        return EditionFactory.getEdition(s);
    }

    public void Execute(int selector,Object obj) {

        switch (selector) {

            case (1):
                Action.Add(obj);
            case (2):
                Action.Exclude(obj);
        }
    }
}
