package com.company;

public class bronya extends Valkyrie {
    public bronya(){
        atk=21;
        spd=20;
        def=10;
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
                int dmg = (int)(Math.random()*100+1);
                a.setHealth(a.Health-dmg);
                usedUlt=true;
            }else{
                a.setHealth(a.Health-atk+a.def);
                usedUlt=false;
                if(Math.random()*100<25.0 && a.def<12){
                    for(int i = 0;i<4;i++) {
                        a.setHealth(a.Health - 12 + a.def);
                    }
                    usedUlt=true;
                }
            }
        }else{
            statusCounter--;
            if(statusCounter==0){
                status=true;
            }
        }
    }
}
