package com.yerokhava.view;
import com.yerokhava.controller.Manager;

import java.util.Objects;

/**
 * Created by Jane S on 25.03.2015.
 */
public class view {

   private static Manager mng;

   public view(Manager mng){
       this.mng = mng;
   }

    public static void BuildSubscribe( String s){
        mng.Execute(1, mng.ResolveFactory(s));

    }

    public static void RebuildSubscribe(String s1) {
        mng.Execute(2, mng.ResolveFactory(s1));
    }

}
