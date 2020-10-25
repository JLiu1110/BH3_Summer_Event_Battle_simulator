package com.company;

public class shangxian extends Valkyrie {
    int oppAccuracyDecrease;
    public shangxian(){
        atk=17;
        spd=16;
        def=15;
        n=1;
    }
    public void attack(Valkyrie a){
        counter++;
        //skill counter
        if(status==true){
            //atk check
            if(counter>=3){
                counter=0;
                //skill cooldown
                a.setHealth(a.Health-18);
                oppAccuracyDecrease+=25;
                usedUlt=true;
            }else{
                a.setHealth(a.Health-atk);
                usedUlt=false;
            }
        }else{
            statusCounter--;
            if(statusCounter==0){
                status=true;
            }
        }
    }
}
