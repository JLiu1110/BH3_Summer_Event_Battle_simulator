package com.company;

public class delisha extends Valkyrie {
    public delisha(){
        atk=19;
        spd=22;
        def=12;
        n=2;
    }
    public void attack(Valkyrie a){
        counter++;
        //skill counter
        if(status==true){
            //atk check
            if(counter>=3){
                counter=0;
                //skill cooldown
                //a.setHealth(a.Health - 16*5+a.def*5);
                    //seperate
                    for(int i = 0;i<4;i++){
                        a.setHealth(a.Health - 16+a.def);
                        if(a.def>0) {
                            if (Math.random() <= 0.3) {
                                a.def -= 5;
                                if(a.def<0){
                                    a.def=0;
                                }
                            }
                        }
                    }
                    a.setHealth(a.Health - 16+a.def);
                    //
                //decrease def
                if(a.def>0) {
                    if (Math.random() <= 0.3) {
                        a.def -= 5;
                        if(a.def<0){
                            a.def=0;
                        }
                    }
                }
                usedUlt=true;
            }else{
                a.setHealth(a.Health-atk+a.def);
                //decrease def
                int chance = (int)(Math.random()*100);
                if(chance<=30){
                    a.def-=5;
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
