package Datastrukturer_algoritmer_Ordkedjor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Input {
    private ArrayList<Word> words;
    /**
     * This class creates an ArrayList<Word>  and fills this ArrayList with the words from a text file.
     */

    public Input(String filename){
        words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String newLine;
            while ((newLine = br.readLine()) != null) {
                words.add(new Word(newLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Word> getWords(){
        return this.words;
    }



}
