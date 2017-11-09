package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner kb = new Scanner(new File('StudentScores.txt'));
        int maxIndx = -1;
        String scores[] = new String[1000];
        while (kb.hasNext()){
            maxIndx++;
            scores[maxIndx] = kb.nextLine();
        }
        // I closed the porject in IntelliJ to look at the one from yesterday for reference, but when I re-opened this project,
	    //It said, error loading module, so I am going to do it on GitHub itself
	    //Since I am bad at coding, I am going to add comments instead
	    
	    //I want to take the numbers of each line in the txt file and take the sum of them. Then I want to take that sum
	    //and divide by the length of it. I could make the ints an array and use .length of the array, however I am dumb
	    //Once I find the average of the array, I want to print out the name part of the string array called scores
	    //and concatenate the student's name with an SOP saying System.out.println(name + "," + " average = " + avgScore);
    }
}
