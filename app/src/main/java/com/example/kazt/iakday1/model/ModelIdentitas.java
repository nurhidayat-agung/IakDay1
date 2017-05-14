package com.example.kazt.iakday1.model;

import java.io.Serializable;

/**
 * Created by kazt on 5/13/17.
 */

public class ModelIdentitas implements Serializable{
    private String nama,nim,email;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
