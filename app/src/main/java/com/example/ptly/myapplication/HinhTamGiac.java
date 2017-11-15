package com.example.ptly.myapplication;

/**
 * Created by ptly on 11/14/2017.
 */

public class HinhTamGiac {
    private int chieucao;
    private  String khoangTrang = " ";
    private  String kyTu = "*";

    public HinhTamGiac(int chieucao) {
        this.chieucao = chieucao;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    public String getKhoangTrang() {
        return khoangTrang;
    }

    public void setKhoangTrang(String khoangTrang) {
        this.khoangTrang = khoangTrang;
    }

    public String getKyTu() {
        return kyTu;
    }

    public void setKyTu(String kyTu) {
        this.kyTu = kyTu;
    }

    public void veHinh() {
        for (int i = 0; i < chieucao / 2; i++) {
            int khoangTrang = i;
            int soKyTu = chieucao - 2 * khoangTrang;
            for (int j = 0; i < khoangTrang; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < soKyTu; j++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < chieucao / 2; i++) {
            int soKyTu = 2 * i + 1;
            int khoangTrang = (chieucao - soKyTu) / 2;
            for (int j = 0; i < khoangTrang; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < soKyTu; j++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

}