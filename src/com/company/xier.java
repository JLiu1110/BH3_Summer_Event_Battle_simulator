package com.company;

public class xier extends Valkyrie {
    public xier(){
        atk=23;
        spd=26;
        def=13;
        n=1;
    }
    boolean form = true;
    //true=white;false=black
    public void attack(Valkyrie a) {
        //counter++;
        //skill counter
        if (status == true) {
            //atk check
            if (form == true) {
                form = false;
                atk += 10;
                def -= 5;

            } else {
                form = true;
                atk -= 10;
                def += 5;
                Health += (int) (Math.random() * 15 + 1);
            }

            a.setHealth(a.Health - atk + a.def);

        } else {
            statusCounter--;
            if (statusCounter == 0) {
                status = true;
            }
        }
    }
}
