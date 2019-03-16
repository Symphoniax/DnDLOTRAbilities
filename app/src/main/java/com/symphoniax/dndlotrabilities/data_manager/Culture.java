package com.symphoniax.dndlotrabilities.data_manager;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Culture {
    @SerializedName("descrizione")
    private String description;

    @SerializedName("nomi_maschili")
    private List<String> maleNames;

    @SerializedName("nomi_femminili")
    private List<String> femaleNames;

    private String tenore;

    @SerializedName("equip_bonus")
    private String bonusEquip;

    @SerializedName("eta")
    private String age;

    @SerializedName("taglia")
    private String size;

    @SerializedName("volocita")
    private String velocity;

    @SerializedName("linguaggi")
    private List<String> languages;

    @SerializedName("tratti")
    private List<String> traits;

    @SerializedName("sottorazze")
    private List<String> subcultures;

    public Culture(String description, List<String> maleNames, List<String> femaleNames, String tenore, String bonusEquip, String age, String size, String velocity, List<String> languages, List<String> traits, List<String> subcultures) {
        this.description = description;
        this.maleNames = maleNames;
        this.femaleNames = femaleNames;
        this.tenore = tenore;
        this.bonusEquip = bonusEquip;
        this.age = age;
        this.size = size;
        this.velocity = velocity;
        this.languages = languages;
        this.traits = traits;
        this.subcultures = subcultures;
    }
}
