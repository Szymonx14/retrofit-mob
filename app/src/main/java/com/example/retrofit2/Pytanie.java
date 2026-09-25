package com.example.retrofit2;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescPytania;
    @SerializedName("odp_a")
    private String odpA;
    @SerializedName("odp_b")
    private String odpB;
    @SerializedName("odp_c")
    private String odpC;
    @SerializedName("poprawna")
    private int poprawne;
    public Pytanie(String trescPytania, String odpA, String odpB, String odpC, int poprawne) {
        this.trescPytania = trescPytania;
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.poprawne = poprawne;
    }
}
