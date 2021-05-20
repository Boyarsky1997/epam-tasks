package com.github.boyarsky1997.task.collections;

class MyClass implements Comparable<MyClass> {
    private String nameCountry;
    private String nameCapital;

    public MyClass(String nameCountry, String nameCapital) {
        this.nameCountry = nameCountry;
        this.nameCapital = nameCapital;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "nameCountry='" + nameCountry + '\'' +
                ", nameCapital='" + nameCapital + '\'' +
                '}';
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    @Override
    public int compareTo(MyClass that) {
        return this.nameCountry.compareTo(that.nameCountry);
    }
}
