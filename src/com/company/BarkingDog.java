package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeup;
        if(barking == true && ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23)){
            wakeup = true;
        } else if(hourOfDay < 0 || hourOfDay > 23){
            wakeup = false;
        } else {
            wakeup = false;
        }

        return wakeup;
    }
}
