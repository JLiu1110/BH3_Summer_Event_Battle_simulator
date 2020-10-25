package com.company;

public class ying extends Valkyrie {
    public ying(){
        atk=20;
        spd=18;
        def=9;
        n=2;
    }
    public void attack(Valkyrie a) {
        counter++;
        //skill counter
        if (status == true) {
            double r = Math.random() * 100;
            if (r <= 30.0) {
                //fantuan
                if (Health >= 75) {
                    Health = 100;
                } else {
                    Health += 25;
                }
            }

            //atk check
            if (counter >= 2) {
                counter=0;
                //skill cooldown
                a.setHealth(a.Health - 25);
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