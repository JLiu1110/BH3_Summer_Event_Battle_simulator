package com.company;

public class shuangzi extends Valkyrie {
    public shuangzi(){
        atk=18;
        spd=10;
        def=10;
        n=2;
        Health=1000;
    }
    public void attack(Valkyrie a) {
        if (status == true) {
            //atk check
            if (Health <= 900 && Health>20) {
                Health = 20;
                int rand = (int) (Math.random() * 2);
                if (rand == 0) {
                    a.setHealth(a.Health - 50 + a.def);
                } else {
                    a.setHealth(a.Health - 233 + a.def);
                }
                usedUlt=true;
            } else {
                a.setHealth(a.Health - atk + a.def);
                usedUlt=false;
            }
        } else {
            statusCounter--;
            if (statusCounter == 0) {
                status = true;
            }
        }
    }
}
