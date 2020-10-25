package com.company;

public class Main {
    public static int countA = 0;
    public static int countB = 0;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Sample size 100000");


        for (int i = 0; i < 100000; i++) {
            battle();
        }

        System.out.println("The chance of competetor A winning is " + (double) countA / 1000.0 + "%");
        System.out.println("The chance of competetor B winning is " + (double) countB / 1000.0 + "%");
    }

    public static void battle() {
        //set contestants
        delisha a = new delisha();
        shangxian b = new shangxian();

        //special:shangxian
        //accuracy attribute change
//        if((int)(Math.random()*100)>b.oppAccuracyDecrease) {
//            a.attack(b);
//                if (b.Health <= 0) {
//                    countA++;
//                    break;
//                }
//        }else{
//            a.counter++;
//        }

        //special:youlandaier
//        int temp = b.Health;
//        a.attack(b);
//        if(a.usedUlt==true){
//            b.oppUlt=true;
//            b.attack(a);
//            if(b.oppUlt==false){
//                b.Health=temp;
//                if (a.Health <= 0) {
//                    countB++;
//                    break;
//                }
//            }
//            b.oppUlt=false;
//        }
//        if (b.Health <= 0) {
//            countA++;
//            break;
//        }


        int speedDif = a.getSpd() - b.getSpd();

        while (true) {
            if (speedDif > 0) {
                //shangxian
                if ((int) (Math.random() * 100) > b.oppAccuracyDecrease) {
                    a.attack(b);
                    if (b.Health <= 0) {
                        countA++;
                        break;
                    }
                }else{
                    a.counter++;
                }

                //youlan
//
//
//                int temp = b.Health;
//                a.attack(b);
//                if(a.usedUlt==true){
//                    b.oppUlt=true;
//                    b.attack(a);
//                    if(b.oppUlt==false){
//                        b.Health=temp;
//                        if (a.Health <= 0) {
//                            countB++;
//                            break;
//                        }
//                    }
//                    b.oppUlt=false;
//                }
//                if (b.Health <= 0) {
//                    countA++;
//                    break;
//                }
//                a.attack(b);
//                if (b.Health <= 0) {
//                    countA++;
//                    break;
//                }
                b.attack(a);
                if (a.Health <= 0) {
                    countB++;
                    break;
                }
            } else {
                b.attack(a);
                if (a.Health <= 0) {
                    countB++;
                    break;
                }
                if ((int) (Math.random() * 100) > b.oppAccuracyDecrease) {
                    a.attack(b);
                    if (b.Health <= 0) {
                        countA++;
                        break;
                    }
                }else{
                    a.counter++;
                }

                //youlan
//                int temp = b.Health;
//                a.attack(b);
//                if(a.usedUlt==true){
//                    b.oppUlt=true;
//                    b.attack(a);
//                    if(b.oppUlt==false){
//                        b.Health=temp;
//                        if (a.Health <= 0) {
//                            countB++;
//                            break;
//                        }
//                    }
//                    b.oppUlt=false;
//                }
//                if (b.Health <= 0) {
//                    countA++;
//                    break;
//                }


//                a.attack(b);
//                if (b.Health <= 0) {
//                    countA++;
//                    break;
//                }
            }
        }
    }
}
