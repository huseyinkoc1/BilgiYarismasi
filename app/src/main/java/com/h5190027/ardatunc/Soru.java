package com.h5190027.ardatunc;

public class Soru {

    private int soruId;
    private String soruBaslik;
    private String yanitA;
    private String yanitB;
    private String yanitC;
    private String yanitD;
    private String dogruYanit;

    public Soru(int soruId, String soruBaslik, String yanitA, String yanitB, String yanitC, String yanitD, String dogruYanit) {
        this.soruId = soruId;
        this.soruBaslik = soruBaslik;
        this.yanitA = yanitA;
        this.yanitB = yanitB;
        this.yanitC = yanitC;
        this.yanitD = yanitD;
        this.dogruYanit = dogruYanit;
    }

    public int getSoruId() {
        return soruId;
    }

    public void setSoruId(int soruId) {
        this.soruId = soruId;
    }

    public String getSoruBaslik() {
        return soruBaslik;
    }

    public void setSoruBaslik(String soruBaslik) {
        this.soruBaslik = soruBaslik;
    }

    public String getYanitA() {
        return yanitA;
    }

    public void setYanitA(String yanitA) {
        this.yanitA = yanitA;
    }

    public String getYanitB() {
        return yanitB;
    }

    public void setYanitB(String yanitB) {
        this.yanitB = yanitB;
    }

    public String getYanitC() {
        return yanitC;
    }

    public void setYanitC(String yanitC) {
        this.yanitC = yanitC;
    }

    public String getYanitD() {
        return yanitD;
    }

    public void setYanitD(String yanitD) {
        this.yanitD = yanitD;
    }

    public String getDogruYanit() {
        return dogruYanit;
    }

    public void setDogruYanit(String dogruYanit) {
        this.dogruYanit = dogruYanit;
    }
}
