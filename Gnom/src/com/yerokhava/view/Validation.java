package com.yerokhava.view;
import com.yerokhava.controller.Manager;
import com.yerokhava.entity.iGnom;
import  com.yerokhava.entity.gnomConteiner;

import java.util.List;

/**
 * Created by Jane S on 11.03.2015.
 */
public class Validation {

  public Validation(Manager mng)
    {
        this.mng = mng;
    }


    private static Manager mng;


    public static void addGnomus(String name, String skil) {

        mng.execute(3, name, skil);
        System.out.print("Add gnom with name: "+name+" &skill: "+skil+"\n");
    }

    public static void ControlValue(String name, String skil) {

        System.out.print("\nResult of check: " + name + " " + skil + " = " );
        System.out.println(mng.execute(1, name, skil));
    }

    public static void SuperGnomFind(String skil){

        List<iGnom> gnome = (List<iGnom>)mng.execute(2, skil);
        System.out.print("\n");
        for( iGnom gnm: gnome) {
            System.out.println("Super gnome: " + gnm.getName() + " " + gnm.getSkill());
        }
    }

    public  static void  ShowGnoms(){

         System.out.print("\n");
         List<iGnom> spisok1 = (List<iGnom>)mng.execute(4);
         for(iGnom t: spisok1) {
             System.out.println(t.getName());
         }
        }

    }




