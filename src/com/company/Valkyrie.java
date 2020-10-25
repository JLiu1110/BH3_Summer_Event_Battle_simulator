package com.company;

public class Valkyrie {
    int Health = 100;
    int n;
    int def;
    int atk;
    int spd;
    boolean status=true;
    int statusCounter;
    int counter = 0;
    boolean usedUlt=false;
    int duyaMult = 25;

//    public Valkyrie(){
//    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
