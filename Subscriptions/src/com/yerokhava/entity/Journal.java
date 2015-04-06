package com.yerokhava.entity;

import java.util.List;

/**
 * Created by Jane S on 23.03.2015.
 */
public class Journal extends Edition {

    private String Cover;

    private String Version;

    public String getCover() {
        return Cover;
    }

    public void setCover(String cover) {
        this.Cover = cover;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        this.Version = version;
    }


}
