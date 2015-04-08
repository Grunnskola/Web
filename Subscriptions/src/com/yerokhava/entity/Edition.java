package com.yerokhava.entity;

/**
 * Created by Jane S on 26.03.2015.
 */
public abstract class Edition {

    public int Price;
    public String Name;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
  //  public void includeInSubscribe(){};
  //public void excludeFromSubscribe(){};

}
