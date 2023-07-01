package com.example.cerebralpalsydetection;

public class profiledata {
    String name, diseaselevel, age, gender, weight;

    public profiledata(String name, String diseaselevel, String age, String gender, String weight) {
        this.name = name;
        this.diseaselevel = diseaselevel;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiseaselevel() {
        return diseaselevel;
    }

    public void setDiseaselevel(String diseaselevel) {
        this.diseaselevel = diseaselevel;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
