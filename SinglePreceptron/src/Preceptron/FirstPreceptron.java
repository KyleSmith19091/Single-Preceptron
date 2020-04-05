package Preceptron;

import Data.CoordinatesDataSet;
import Data.WriteToFile;

import java.util.Scanner;

public class FirstPreceptron {

    public static void main(String[] args) {
        // Create data set
        CoordinatesDataSet dataSet = new CoordinatesDataSet(100);

        // Create Preceptron
        Preceptron brain = new Preceptron(3);

        // Train the preceptron aka find the right weight values
        for (int i = 0; i < dataSet.getPoints().length; i++) {
            String guessValue = brain.Train(new float[]{dataSet.getPoints()[i].getX(), dataSet.getPoints()[i].getY(), dataSet.BIAS},dataSet.getPoints()[i].getLabel());
            dataSet.getPoints()[i].setGuessValue(guessValue);
        }

        // Write results to file
        new WriteToFile(dataSet.getPoints(), 't');

        // Create guess set
        CoordinatesDataSet guessSet = new CoordinatesDataSet(10);

        // Guess the values
        for (int i = 0; i < guessSet.getPoints().length; i++) {
            float x = guessSet.getPoints()[i].getX();
            float y = guessSet.getPoints()[i].getY();
            int guess = brain.Guess(new float[]{x,y,1});
            if(guessSet.getPoints()[i].getLabel()==guess){
                guessSet.getPoints()[i].setGuessValue("✅");
            }else{
                guessSet.getPoints()[i].setGuessValue("❌");
            }

        }

        // Write results to file
        new WriteToFile(guessSet.getPoints(), 'g');


    }

}
