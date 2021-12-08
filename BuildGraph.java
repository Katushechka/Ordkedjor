package Datastrukturer_algoritmer_Ordkedjor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BuildGraph {
	private static ArrayList<Word> words;
 
    public BuildGraph(ArrayList<Word> words){
        this.words = words;
        buildGraph();
    }

    public void buildGraph(){
        for(int i = 0; i < words.size(); i++){
            for(int j = 0; j < words.size(); j++){
                if(!words.get(i).getWord().equals(words.get(j).getWord())){
                    int counter = 0;
                    boolean[] charFound = new boolean[5];
                    for(int k = words.get(i).getWord().length()-4; k < words.get(i).getWord().length(); k++){
                        for(int l = 0; l < words.get(j).getWord().length(); l++) {
                            if (words.get(i).getWord().charAt(k) == words.get(j).getWord().charAt(l) && !charFound[l]) {
                                charFound[l] = true;
                                counter++;
                                break;
                            }
                        }
                    }
                    if(counter == 4){
                        words.get(i).addEdge(words.get(j));
                        counter = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {   	
        Input input = new Input("file/words-5757-data.txt");
        BuildGraph digraph = new BuildGraph(input.getWords());
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("file/words-5757-test.txt")));
        while (true) {
            String line = r.readLine();
            if (line == null) {
                break;
            }
            assert line.length() == 11; 
            String start = line.substring(0, 5);
            String goal = line.substring(6, 11);

            Word wordStart = null;
            Word wordEnd = null;

            for(int j = 0; j < words.size(); j++){
                if(words.get(j).getWord().equals(start)){
                    wordStart = words.get(j);
                }
                if(words.get(j).getWord().equals(goal)){
                    wordEnd = words.get(j);
                }
            }
            for(int i = 0; i < words.size(); i++){
                words.get(i).setVisited(false);
            }
            BreadthFirstSearch bredthFirstSearch = new BreadthFirstSearch(wordStart, wordEnd,words);
        }

    }
}
