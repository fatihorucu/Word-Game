package Homework_3;

import java.util.Random;

public class x {

    public static int[] randomNoRep(int letterNumberMinus4){
        Random ran = new Random();
        int[] zeroToX = new int[letterNumberMinus4 + 4];
        int[] holdValue = new int[letterNumberMinus4 + 4];
        for (int x = 0; x < zeroToX.length; x++)
            zeroToX[x] = x;
        int roll;
        for (int x = 0; x < zeroToX.length; x++) {
            roll = ran.nextInt(letterNumberMinus4 + 4);
            while (zeroToX[roll] == -1)
                roll = ran.nextInt(letterNumberMinus4 + 4);
            if (zeroToX[roll] != -1)
                holdValue[x] = zeroToX[roll];
            zeroToX[roll] = -1;
    }
        return holdValue;
}
public static char[] stringToArray(String[][] array, int index1, int index2){
        String[] newStringArray = array[index1];
        String newStringArray2 = newStringArray[index2];
        char[] charArray;
        charArray = new char[newStringArray2.length()];
        for (int i = 0; i < newStringArray2.length(); i++)
            charArray[i] = newStringArray2.charAt(i);
        return charArray;
}
    public static char[] changeStarToLetter(char[] array, int index1, int index2, int index3){
        char letterToStar;
        char[] letterToStarArray;
        letterToStarArray = x.stringToArray(wordGame.answers,index1,index2);
        letterToStar = letterToStarArray[index3];
        array[index3] = letterToStar;
        return array;
    }
    public static int askQuestion(int resultOfLetterNumberMinus4) {
        Random random = new Random();
        int indexNum;
        indexNum = random.nextInt(3);
        System.out.printf("%s%n",wordGame.questions[resultOfLetterNumberMinus4][indexNum]);
        return indexNum;
    }
    public static int calculatePoints(int noOfLetters, int noOfLetterRequested, boolean answerComparison){
        int result=0;
        if (answerComparison){
            result = (noOfLetters - noOfLetterRequested)*100;
            System.out.printf("Congrats, true answer. You gained %d pts.%n",result);
        }

        else{
            result = (noOfLetterRequested-noOfLetters)*100;
            System.out.printf("Sorry,wrong answer. You lost %d pts.%n",-result);
        }
        return result;
    }
}