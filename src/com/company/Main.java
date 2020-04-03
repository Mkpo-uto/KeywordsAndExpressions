package com.company;

public class Main {

    public static void main(String[] args) {
	// a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);

        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression");
        }

        int myVariable = 50; //statement
        myVariable++; //statement
        myVariable--; //statement

        System.out.println(" This is " +
                "another " +
                "still more");

        int anotherVariable = 50; myVariable--;System.out.println("This is another one");

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        if(score <5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }

        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Mkpo-uto", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Edima", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Etimbuk", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("InyeneObong", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("NAB", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Tyro", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("NASDAQ", position);

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        boolean wakeUpValue = BarkingDog.shouldWakeUp(true, 22);
        System.out.println(" Output " + wakeUpValue + " should be false");

        wakeUpValue = BarkingDog.shouldWakeUp(true, 44);
        System.out.println(" Output " + wakeUpValue + " should be false");

        wakeUpValue = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(" Output " + wakeUpValue + " should be false");

        System.out.println("Leap year is " + LeapYear.isLeapYear(-1600));
        System.out.println("Leap year is " + LeapYear.isLeapYear(1600));
        System.out.println("Leap year is " + LeapYear.isLeapYear(2017));
        System.out.println("Leap year is " + LeapYear.isLeapYear(2000));

        int newScore = calculateScore("Mkpo-uto", 500);
        System.out.println("New Score is " + newScore);

        calcFeetAndInchesToCentimeters(7,0);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){

//        if(playerScore >= 1000 ){
//            return  1;
//        } else if (playerScore >= 500 ){
//            return 2;
//        } else if (playerScore >= 100 ){
//            return 3;
//        }
//            return 4;

        int position = 4; //assuming position 4 will be returned

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }

        return position;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " +  score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters = -1;
        if(feet < 0 || (inches < 0) || (inches > 12 )){
            System.out.println("Invalid feet or inches parameter");
            return centimeters;
        } else {
            centimeters = inches * 2.54 + (feet * 12) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }



    public static double calcFeetAndInchesToCentimeters(double inches){
        double centimeters = -1; double feet = 1;
        if(inches < 0 ){
            return centimeters;
        } else {
            feet = (int) inches / 12;
            double remainingInches = (int)inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            centimeters = calcFeetAndInchesToCentimeters(feet,remainingInches);
            return centimeters;
        }
    }
}
