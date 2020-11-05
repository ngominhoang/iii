package com.example.myapplicationclothing;

public class Clothing {

    private int img;
    private String tenao;
    private String giatien;

    public Clothing(int img, String tenao, String giatien) {
        this.img = img;
        this.tenao = tenao;
        this.giatien = giatien;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTenao() {
        return tenao;
    }

    public void setTenao(String tenao) {
        this.tenao = tenao;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }
}
