package com.example.retrofit2;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescPytania;





    @SerializedName("odpa")
    private String odpA;
    @SerializedName("odpb")
    private String odpB;

    @SerializedName("odpc")
    private String odpC;

    public Pytanie(String trescPytania, String odpA, String odpB, String odpC) {
        this.trescPytania = trescPytania;
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
    }

    public String getOdpC() {
        return odpC;
    }

    public void setOdpC(String odpC) {
        this.odpC = odpC;
    }

    public String getOdpB() {
        return odpB;
    }

    public void setOdpB(String odpB) {
        this.odpB = odpB;
    }

    public String getOdpA() {
        return odpA;
    }

    public void setOdpA(String odpA) {
        this.odpA = odpA;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public void setTrescPytania(String trescPytania) {
        this.trescPytania = trescPytania;
    }


}
