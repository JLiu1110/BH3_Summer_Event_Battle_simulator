package com.company;

public class duya extends Valkyrie {
    public double multiplier=1.0;
    public duya(){
        atk=23;
        spd=14;
        def=14;
        n=1;
    }
    public void attack(Valkyrie a){
        counter++;
        //skill counter
        if(status==true){
            //atk check
            if((Math.random()*100)<duyaMult){
                multiplier=1.25;
            }
            //multiplier check
            if(counter>=3){
                counter=0;
                //skill cooldown
                if(a.def<16) {
                    a.setHealth(a.Health - (int)(multiplier*(16*7+a.def*7)));
                }
                usedUlt=true;
            }else{
                a.setHealth(a.Health-(int)(multiplier*(atk+a.def)));
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
