package com.company;

public class zhufan extends Valkyrie {
    public zhufan(){
        atk=22;
        spd=30;
        def=12;
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
                a.setHealth(a.Health-15);
                if(Math.random()<=0.3){
                    a.status=false;
                    a.statusCounter=1;
                }
                usedUlt=true;
            }else{
                a.setHealth(a.Health-atk);
                if(Math.random()<=0.3){
                    a.status=false;
                    a.statusCounter=1;
                }
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
