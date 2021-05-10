package com.github.boyarsky1997.task.oop;

import com.github.boyarsky1997.task.exceptions.MyExceptionClass;

public class Droid {
    private String name;
    private int haveHealth;
    private int energyLevel;
    private int impactLevel;
    private boolean impotent = false;
    private boolean status = false;

    public Droid(String name, int haveHealth, int energyLevel, int impactLevel) {
        this.name = name;
        this.haveHealth = haveHealth;
        this.energyLevel = energyLevel;
        this.impactLevel = impactLevel;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isImpotent() {
        return impotent;
    }

    public void setImpotent(boolean impotent) {
        this.impotent = impotent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHaveHealth() {
        return haveHealth;
    }

    public void setHaveHealth(int haveHealth) {
        this.haveHealth = haveHealth;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getImpactLevel() {
        return impactLevel;
    }

    public void setImpactLevel(int impactLevel) {
        this.impactLevel = impactLevel;
    }

    public void attack(Droid droid) throws MyExceptionClass {
        if (droid.getHaveHealth() > 0 && this.haveHealth > 0) {
            int kik = droid.haveHealth - this.impactLevel;
            if (kik <= 0) {
                droid.setHaveHealth(0);
                throw new MyExceptionClass("Nulllllll");
            } else {
                droid.setHaveHealth(kik);
            }
            this.setEnergyLevel(this.energyLevel - 5);
            System.out.println("after " + this.name + " attack, " + droid.name + " had " + droid.haveHealth + " left");

        } else {
            if (this.getEnergyLevel() == 0) {
                System.out.println("the droid " + this.name + " ran out of energy");
                this.setImpotent(true);
                return;
            }
            if (droid.getHaveHealth() == 0) {
                droid.setStatus(true);
                System.out.println(this.name + " killed " + droid.name);
                System.out.println("The end of the battle!!!");
                System.out.println(this.name + " Win!!");
            }
        }
    }
}
