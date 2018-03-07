package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		String fileName = "words.txt";
		String line = null;
		
		
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            	BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            	
            	ArrayList<Integer> tallies = new ArrayList<Integer>(26);
            	ArrayList<Integer> moreTallies = new ArrayList<Integer>(26);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	tallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	moreTallies.add(0);
            	
            	   int longWord = 0;
                   String longWordText = null;
                   float totalChars = 0;
            while((line = bufferedReader.readLine()) != null) {
            	for(int ii =0; ii<line.length(); ii++){
            		if(line.charAt(ii) == 'a'){
            			tallies.set(0, (tallies.get(0) + 1));
            		}else if(line.charAt(ii) == 'b'){
            			tallies.set(1, (tallies.get(1) + 1));
            		}else if(line.charAt(ii) == 'c'){
            			tallies.set(2, (tallies.get(2) + 1));
            		}else if(line.charAt(ii) == 'd'){
            			tallies.set(3, (tallies.get(3) + 1));
            		}else if(line.charAt(ii) == 'e'){
            			tallies.set(4, (tallies.get(4) + 1));
            		}else if(line.charAt(ii) == 'f'){
            			tallies.set(5, (tallies.get(5) + 1));
            		}else if(line.charAt(ii) == 'g'){
            			tallies.set(6, (tallies.get(6) + 1));
            		}else if(line.charAt(ii) == 'h'){
            			tallies.set(7, (tallies.get(7) + 1));
            		}else if(line.charAt(ii) == 'i'){
            			tallies.set(8, (tallies.get(8) + 1));
            		}else if(line.charAt(ii) == 'j'){
            			tallies.set(9, (tallies.get(9) + 1));
            		}else if(line.charAt(ii) == 'k'){
            			tallies.set(10, (tallies.get(10) + 1));
            		}else if(line.charAt(ii) == 'l'){
            			tallies.set(11, (tallies.get(11) + 1));
            		}else if(line.charAt(ii) == 'm'){
            			tallies.set(12, (tallies.get(12) + 1));
            		}else if(line.charAt(ii) == 'n'){
            			tallies.set(13, (tallies.get(13) + 1));
            		}else if(line.charAt(ii) == 'o'){
            			tallies.set(14, (tallies.get(14) + 1));
            		}else if(line.charAt(ii) == 'p'){
            			tallies.set(15, (tallies.get(15) + 1));
            		}else if(line.charAt(ii) == 'q'){
            			tallies.set(16, (tallies.get(16) + 1));
            		}else if(line.charAt(ii) == 'r'){
            			tallies.set(17, (tallies.get(17) + 1));
            		}else if(line.charAt(ii) == 's'){
            			tallies.set(18, (tallies.get(18) + 1));
            		}else if(line.charAt(ii) == 't'){
            			tallies.set(19, (tallies.get(19) + 1));
            		}else if(line.charAt(ii) == 'u'){
            			tallies.set(20, (tallies.get(20) + 1));
            		}else if(line.charAt(ii) == 'v'){
            			tallies.set(21, (tallies.get(21) + 1));
            		}else if(line.charAt(ii) == 'w'){
            			tallies.set(22, (tallies.get(22) + 1));
            		}else if(line.charAt(ii) == 'x'){
            			tallies.set(23, (tallies.get(23) + 1));
            		}else if(line.charAt(ii) == 'y'){
            			tallies.set(24, (tallies.get(24) + 1));
            		}else if(line.charAt(ii) == 'z'){
            			tallies.set(25, (tallies.get(25) + 1));
            		}
            		
            		if(line.charAt(0) == 'a'){
            			moreTallies.set(0, (moreTallies.get(0) + 1));
            		}else if(line.charAt(0) == 'b'){
            			moreTallies.set(1, (moreTallies.get(1) + 1));
            		}else if(line.charAt(0) == 'c'){
            			moreTallies.set(2, (moreTallies.get(2) + 1));
            		}else if(line.charAt(0) == 'd'){
            			moreTallies.set(3, (moreTallies.get(3) + 1));
            		}else if(line.charAt(0) == 'e'){
            			moreTallies.set(4, (moreTallies.get(4) + 1));
            		}else if(line.charAt(0) == 'f'){
            			moreTallies.set(5, (moreTallies.get(5) + 1));
            		}else if(line.charAt(0) == 'g'){
            			moreTallies.set(6, (moreTallies.get(6) + 1));
            		}else if(line.charAt(0) == 'h'){
            			moreTallies.set(7, (moreTallies.get(7) + 1));
            		}else if(line.charAt(0) == 'i'){
            			moreTallies.set(8, (moreTallies.get(8) + 1));
            		}else if(line.charAt(0) == 'j'){
            			moreTallies.set(9, (moreTallies.get(9) + 1));
            		}else if(line.charAt(0) == 'k'){
            			moreTallies.set(10, (moreTallies.get(10) + 1));
            		}else if(line.charAt(0) == 'l'){
            			moreTallies.set(11, (moreTallies.get(11) + 1));
            		}else if(line.charAt(0) == 'm'){
            			moreTallies.set(12, (moreTallies.get(12) + 1));
            		}else if(line.charAt(0) == 'n'){
            			moreTallies.set(13, (moreTallies.get(13) + 1));
            		}else if(line.charAt(0) == 'o'){
            			moreTallies.set(14, (moreTallies.get(14) + 1));
            		}else if(line.charAt(0) == 'p'){
            			moreTallies.set(15, (moreTallies.get(15) + 1));
            		}else if(line.charAt(0) == 'q'){
            			moreTallies.set(16, (moreTallies.get(16) + 1));
            		}else if(line.charAt(0) == 'r'){
            			moreTallies.set(17, (moreTallies.get(17) + 1));
            		}else if(line.charAt(0) == 's'){
            			moreTallies.set(18, (moreTallies.get(18) + 1));
            		}else if(line.charAt(0) == 't'){
            			moreTallies.set(19, (moreTallies.get(19) + 1));
            		}else if(line.charAt(0) == 'u'){
            			moreTallies.set(20, (moreTallies.get(20) + 1));
            		}else if(line.charAt(0) == 'v'){
            			moreTallies.set(21, (moreTallies.get(21) + 1));
            		}else if(line.charAt(0) == 'w'){
            			moreTallies.set(22, (moreTallies.get(22) + 1));
            		}else if(line.charAt(0) == 'x'){
            			moreTallies.set(23, (moreTallies.get(23) + 1));
            		}else if(line.charAt(0) == 'y'){
            			moreTallies.set(24, (moreTallies.get(24) + 1));
            		}else if(line.charAt(0) == 'z'){
            			moreTallies.set(25, (moreTallies.get(25) + 1));
            		}
            	}
            	totalChars += line.length();
            	if(line.length() > longWord){
                	longWord = line.length();
                	longWordText = line;
                }
            }  
            //bufferedReader.close();

            Integer mostUsedLetter = Collections.max(tallies);
            for(int j=0; j<(tallies.size()); j++){
            	if((tallies.get(j)) == mostUsedLetter){
            		if(j == 0){
            			System.out.println("Most used letter is a");
            		}if(j == 1){
            			System.out.println("Most used letter is b");
            		}if(j == 2){
            			System.out.println("Most used letter is c");
            		}if(j == 3){
            			System.out.println("Most used letter is d");
            		}if(j == 4){
            			System.out.println("Most used letter is e");
            		}if(j == 5){
            			System.out.println("Most used letter is f");
            		}if(j == 6){
            			System.out.println("Most used letter is g");
            		}if(j == 7){
            			System.out.println("Most used letter is h");
            		}if(j == 8){
            			System.out.println("Most used letter is i");
            		}if(j == 9){
            			System.out.println("Most used letter is j");
            		}if(j == 10){
            			System.out.println("Most used letter is k");
            		}if(j == 11){
            			System.out.println("Most used letter is l");
            		}if(j == 12){
            			System.out.println("Most used letter is m");
            		}if(j == 13){
            			System.out.println("Most used letter is n");
            		}if(j == 14){
            			System.out.println("Most used letter is o");
            		}if(j == 15){
            			System.out.println("Most used letter is p");
            		}if(j == 16){
            			System.out.println("Most used letter is q");
            		}if(j == 17){
            			System.out.println("Most used letter is r");
            		}if(j == 18){
            			System.out.println("Most used letter is s");
            		}if(j == 19){
            			System.out.println("Most used letter is t");
            		}if(j == 20){
            			System.out.println("Most used letter is u");
            		}if(j == 21){
            			System.out.println("Most used letter is v");
            		}if(j == 22){
            			System.out.println("Most used letter is w");
            		}if(j == 23){
            			System.out.println("Most used letter is x");
            		}if(j == 24){
            			System.out.println("Most used letter is y");
            		}if(j == 25){
            			System.out.println("Most used letter is z");
            		}
            	}
            }
            
            Integer leastUsedLetter = Collections.min(tallies);
            for(int j=0; j<(tallies.size()); j++){
            	if((tallies.get(j)) == leastUsedLetter){
            		if(j == 0){
            			System.out.println("Least used letter is a");
            		}if(j == 1){
            			System.out.println("Least used letter is b");
            		}if(j == 2){
            			System.out.println("Least used letter is c");
            		}if(j == 3){
            			System.out.println("Least used letter is d");
            		}if(j == 4){
            			System.out.println("Least used letter is e");
            		}if(j == 5){
            			System.out.println("Least used letter is f");
            		}if(j == 6){
            			System.out.println("Least used letter is g");
            		}if(j == 7){
            			System.out.println("Least used letter is h");
            		}if(j == 8){
            			System.out.println("Least used letter is i");
            		}if(j == 9){
            			System.out.println("Least used letter is j");
            		}if(j == 10){
            			System.out.println("Least used letter is k");
            		}if(j == 11){
            			System.out.println("Least used letter is l");
            		}if(j == 12){
            			System.out.println("Least used letter is m");
            		}if(j == 13){
            			System.out.println("Least used letter is n");
            		}if(j == 14){
            			System.out.println("Least used letter is o");
            		}if(j == 15){
            			System.out.println("Least used letter is p");
            		}if(j == 16){
            			System.out.println("Least used letter is q");
            		}if(j == 17){
            			System.out.println("Least used letter is r");
            		}if(j == 18){
            			System.out.println("Least used letter is s");
            		}if(j == 19){
            			System.out.println("Least used letter is t");
            		}if(j == 20){
            			System.out.println("Least used letter is u");
            		}if(j == 21){
            			System.out.println("Least used letter is v");
            		}if(j == 22){
            			System.out.println("Least used letter is w");
            		}if(j == 23){
            			System.out.println("Least used letter is x");
            		}if(j == 24){
            			System.out.println("Least used letter is y");
            		}if(j == 25){
            			System.out.println("Least used letter is z");
            		}
            	}
            }
            
            Integer mostUsedStartLetter = Collections.max(moreTallies);
            for(int j=0; j<(moreTallies.size()); j++){
            	if((moreTallies.get(j)) == mostUsedStartLetter){
            		if(j == 0){
            			System.out.println("Most used start letter is a");
            		}if(j == 1){
            			System.out.println("Most used start letter is b");
            		}if(j == 2){
            			System.out.println("Most used start letter is c");
            		}if(j == 3){
            			System.out.println("Most used start letter is d");
            		}if(j == 4){
            			System.out.println("Most used start letter is e");
            		}if(j == 5){
            			System.out.println("Most used start letter is f");
            		}if(j == 6){
            			System.out.println("Most used start letter is g");
            		}if(j == 7){
            			System.out.println("Most used start letter is h");
            		}if(j == 8){
            			System.out.println("Most used start letter is i");
            		}if(j == 9){
            			System.out.println("Most used start letter is j");
            		}if(j == 10){
            			System.out.println("Most used start letter is k");
            		}if(j == 11){
            			System.out.println("Most used start letter is l");
            		}if(j == 12){
            			System.out.println("Most used start letter is m");
            		}if(j == 13){
            			System.out.println("Most used start letter is n");
            		}if(j == 14){
            			System.out.println("Most used start letter is o");
            		}if(j == 15){
            			System.out.println("Most used start letter is p");
            		}if(j == 16){
            			System.out.println("Most used start letter is q");
            		}if(j == 17){
            			System.out.println("Most used start letter is r");
            		}if(j == 18){
            			System.out.println("Most used start letter is s");
            		}if(j == 19){
            			System.out.println("Most used start letter is t");
            		}if(j == 20){
            			System.out.println("Most used start letter is u");
            		}if(j == 21){
            			System.out.println("Most used start letter is v");
            		}if(j == 22){
            			System.out.println("Most used start letter is w");
            		}if(j == 23){
            			System.out.println("Most used start letter is x");
            		}if(j == 24){
            			System.out.println("Most used start letter is y");
            		}if(j == 25){
            			System.out.println("Most used start letter is z");
            		}
            	}
            }
            float numOfWords = 234937;
            float avgLength = 0;
            avgLength = (totalChars/numOfWords);
            System.out.println("Average word length is " + round(avgLength, 2));
            
           System.out.println("The longest word is " + longWordText + " with " + longWord + " letters.");
            
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
	}

	public static float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
