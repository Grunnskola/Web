package com.yerokhava.jane.view;
import com.yerokhava.jane.controller.Manager;
import com.yerokhava.jane.model.Good;

/**
 * Created by Jane S on 21.04.2015.
 */
public class view {

    private static Manager mng;

  public view(Manager mng) {
      this.mng = mng;
  }

    public static void loadInformation(String filepath) {

        mng.processing(1, filepath);

    }

    public static void findConcideince(String word) {

        mng.processing(2, word);

    }

    public  static void addInWarehouse(String name, String code, String day, String  article) {

        //"device", "1002", "friday", "device for transfer data")
        Good device = new Good(name, code, day, article );
        mng.processing(3, device) ;
    }

    public  static void sortingGoodsByCode() {
        mng.processing(4);
    }

    public static void searchSubject(String name, String code, String day, String  article) {

        Good subj = new Good(name, code, day, article);
        mng.processing(5, subj);
    }
}
