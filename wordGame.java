package Homework_3;

import java.util.Scanner;

public class wordGame {
    public static String[][] questions = {{"a wide round container that is open at the top, used to hold liquids, food, flowers etc(4)","a very young child; an infant(4)","a round object that is thrown, kicked, or hit in a game or sport(4)"},{"a place or part at which two or more things are joined(5)","the point, edge, or line beyond which something ends, may not go, or is not allowed(5)","a sequence of images processed electronically into an analog or digital format and displayed on a screen(5)"},{"a growth of trees and other plants covering a large area.(6)","a fundamental social group in society typically consisting of one or two parents and their children.(6)"," an encounter between opposing forces(6)"}};
    public static String[][] answers = {{"bowl","baby","ball"},{"joint","limit","video"},{"forest","family","battle"}};
    public static String[][] starredAnswers = {{"****","****","****"},{"*****","*****","*****"},{"******","******","******"}};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int indexNumber;
        int letterCounter = 0;
        int points = 0;
        char[] transformedIntoCharArray;
        int[] randomNoRep;
        char[] letterChangedStar;
        System.out.println("Good Luck!");
        int answerOrLetter;
        for (int i = 0; i< answers.length; i++){
            int counter = 0;
            indexNumber = x.askQuestion(letterCounter);
            System.out.println("1 for entering the answer \n2 for requesting a letter");
            while (!input.hasNextInt()){
                System.out.println("invalid entry, please choose among 1 and 2");
                String invalidValue= input.next();
            }
            answerOrLetter = input.nextInt();
            while (answerOrLetter < 0 || answerOrLetter > 2) {
                System.out.println("invalid entry, please choose among 1 and 2");
                answerOrLetter = input.nextInt();
            }
            randomNoRep = x.randomNoRep(letterCounter);
            transformedIntoCharArray = x.stringToArray(starredAnswers,letterCounter,indexNumber);
            while (answerOrLetter ==2){
                letterChangedStar = x.changeStarToLetter(transformedIntoCharArray,letterCounter,indexNumber,randomNoRep[counter]);
                System.out.print(letterChangedStar);
                transformedIntoCharArray = letterChangedStar;
                counter++;
                System.out.println("\n1 for entering the answer \n2 for requesting a letter");
                while (!input.hasNextInt()){
                    System.out.println("invalid entry, please choose among 1 and 2");
                    String invalidValue= input.next();
                }
                answerOrLetter = input.nextInt();
                while (answerOrLetter < 0 || answerOrLetter > 2) {
                    System.out.println("invalid number, please choose among 1 and 2");
                    answerOrLetter = input.nextInt();
                }
            }
            if (answerOrLetter == 1){
                System.out.println(transformedIntoCharArray);
                System.out.println("Enter your answer");
                String userAnswer;
                userAnswer = input.next();
                points += x.calculatePoints(answers[letterCounter][indexNumber].length(),counter,answers[letterCounter][indexNumber].equalsIgnoreCase(userAnswer));
                letterCounter++;
            }
        }
        System.out.printf("End of the contest. Your final score: %d",points);
    }
}
