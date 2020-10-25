package com.company;

public class jizi extends Valkyrie{
    int miss = 0;
    public jizi(){
        atk=23;
        spd=12;
        def=9;
        n=1;
    }
    public void attack(Valkyrie a){
        counter++;
        //skill counter
        if(status==true){
            //atk check
            if(counter>=2){
                counter=0;
                //skill cooldown
                atk*=2;
                miss+=35;
                int r = (int)(Math.random()*100);
                if(!(r<=miss)){
                    a.setHealth(a.Health-a.n*(atk-a.def));
                }
            }else{
                a.setHealth(a.Health-a.n*(atk-a.def));
            }
        }else{
            statusCounter--;
            if(statusCounter==0){
                status=true;
            }
        }
    }
}
