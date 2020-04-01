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

        calculateScore(true, 800, 5, 100);

        if(score <5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }

        calculateScore(true, 1000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
