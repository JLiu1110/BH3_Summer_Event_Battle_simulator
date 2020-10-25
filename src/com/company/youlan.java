package com.company;

public class youlan extends Valkyrie {
    boolean oppUlt=false;
    public youlan(){
        atk=19;
        spd=15;
        def=10;
        n=2;
        Health=100;

    }
    public void attack(Valkyrie a){
        //special skill
        if(oppUlt==true){
            if((Math.random()*100)<16.0){
                oppUlt=false;
                a.setHealth(a.Health-30+a.def);
            }
        }else {
            //skill counter
            if (status == true) {
                //atk check
                atk += 3;
                a.setHealth(a.Health - atk + a.def);

            } else {
                statusCounter--;
                if (statusCounter == 0) {
                    status = true;
                }
            }
        }
    }
}
