package com.company;

public class caolv extends Valkyrie {
    public caolv(){
        atk=24;
        spd=23;
        def=11;
        n=1;
        duyaMult=100;
    }
    public void attack(Valkyrie a){
        counter++;
        //skill counter
        if(status==true){
            //atk check
            if(counter>=2){
                counter=0;
                //skill cooldown
                a.setHealth(a.Health-atk-a.getDef());
                double r = Math.random()*100;
                if(r<=35.0){
                    status=false;
                    statusCounter=1;
                }
                usedUlt=true;
            }else{
                a.setHealth(a.Health-atk+a.def);
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
