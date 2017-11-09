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
        
    }
}
