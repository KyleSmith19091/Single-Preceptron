package Data;

import Model.Point;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteToFile {

    public WriteToFile(Point[] inPointArr, char inType){
        try {
            FileWriter fileWriter;
            if(inType=='t'){
                fileWriter = new FileWriter("Training_Points.txt");
            }else{
                fileWriter = new FileWriter("Guess_Points.txt");
            }

            for(Point p : inPointArr){
                fileWriter.write("[ " + p.getX() + " ; " + p.getY() + " ] --> " + p.getGuessValue() + "\n");
            }
            fileWriter.close();
            System.out.println("> Write to file Points.txt successful!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
