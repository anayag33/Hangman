package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //PART 4
        String word = randomWord();//generates a random word
        String y = "";
        Letter[] letters = new Letter[word.length()];//creates new letter array with the word length

        for (int i = 0; i<word.length(); i++){
            y = word.substring(i, i+1);//creates substring of individual letter
            letters[i] = new Letter(y, false);//creates Letter objects to hold the letter
        }

        play(letters, word);
    }
    public static void play(Letter[] a, String word){
        boolean win = false;
        int c = 0;
        String wrongAns = "";
        while (win == false && Board.wrongAnswers < 6){//will exit if win or lose
            int w = 0;//resets wrong answers
            Scanner s = new Scanner(System.in);
            System.out.println("Guess a letter? (lowercase)");
            String guess = s.nextLine();

            for (int i = 0; i < a.length; i++) {
                if (guess.compareTo(a[i].letter) == 0) {//if its the same
                    a[i].show = true;
                    c++;
                }
                if (guess.compareTo(a[i].letter) != 0) {//if its different
                    w++;
                }
            }
            if (w == a.length){//if no spaces had letter
                Board.wrongAnswers ++;//increases wrong answers
                wrongAns = wrongAns + " "+ guess + " ";//adds to wrong answer string
            }
            if(c == a.length){//if all letters guessed
                win = true;
            }

            Board.printBoard();//prints
            System.out.println(toString(a));
            System.out.println("Wrong Letters: " + wrongAns);
        }
        if (win == true){
            System.out.println("Congratulations, you won! The word was "+word);
        }
        if (win == false){
            System.out.println("You lost! The word was "+word);
        }
    }
    //PART 5
    public static String toString(Letter[] a){
        String rv = "";
        for (int i = 0;i<a.length; i++){
            if (a[i].show == false){
                rv = rv + " _ ";//if not guessed
            }
            if (a[i].show == true){
                rv = rv + " " + a[i].letter + " ";//if guessed
            }
        }
        return rv;
    }//end toString()

    //PART 3
    public static String randomWord(){
        String[] words = {"adult", "airport", "album", "alphabet", "apple", "backpack", "balloon", "barbecue", "book", "brain", "butterfly", "cappuccino", "carpet", "carrot", "chair", "chocolate", "church", "clock", "clown", "coffee", "college", "computer", "desk", "diamond", "dress", "earth", "elephant", "eraser", "family", "flower", "garden", "gloves", "grapes", "highway", "hammer", "horse", "kitchen", "library", "magnet", "manatee", "money", "needle", "pepper", "pizza", "pillow", "potato", "robot", "rocket", "school", "sandwich", "software", "square", "teeth", "telescope", "train", "triangle", "umbrella", "water", "window", "zebra"};
        int random = (int)(Math.random() * 60);
        return words[random];
    }
}
