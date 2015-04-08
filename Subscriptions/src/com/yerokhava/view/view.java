package com.yerokhava.view;
import com.yerokhava.controller.Manager;
import com.yerokhava.entity.DateOfEdition;
import com.yerokhava.entity.Edition;
import com.yerokhava.entity.Journal;
import com.yerokhava.entity.Newspaper;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jane S on 25.03.2015.
 */
public class View {

    private static Manager mng;

    public View(Manager mng){
       this.mng = mng;
   }

    public static void addEdition( String type, String name , int price , String param1, String param2){

        if(chekInput((name))) {
            mng.Execute(1, type, name, price, param1, param2);
        }
    }

    public static void addData(String data){

        mng.Execute(data);
    }

    public static boolean chekInput(String s) {

        Pattern namePatern = Pattern.compile("[a-zA-Z]+");
        Matcher nameMatcher = namePatern.matcher(s);
        return nameMatcher.matches();

    }
    public static void showMeData(){
        DateOfEdition data = (DateOfEdition)mng.Execute(2);
        System.out.println(data.getYear());
    }

    public static void showMeMapOfEdition() {
        List<Edition> editionList=(List<Edition>)mng.Execute(1);
        for (Edition e : editionList){
            if(e instanceof Journal){
                System.out.println(e.getName()+" "+e.getPrice()+"$" +" "+((Journal) e).getCover()+" "+((Journal) e).getVersion());
            } else  {
                if( e instanceof Newspaper) {
                    System.out.println(e.getName() + " " + e.getPrice() +"$"+ " " + ((Newspaper) e).getEfficiency() + " " + ((Newspaper) e).getCrossword());
                }
            }
        }
    }

}
