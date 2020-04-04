package com.company;

public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(int minutes, int seconds){
        String value;
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if(hours < 10){
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if(remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }
            value = hoursString + " " + minutesString + " " + secondsString + "";
            return value;
        }
    }

    public static String getDurationString( int seconds) {
        String value;
        if ( seconds < 0){
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            value = getDurationString(minutes, remainingSeconds);
            return value;
        }
    }
}
