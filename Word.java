package Datastrukturer_algoritmer_Ordkedjor;

import java.util.ArrayList;

public class Word {
    private ArrayList<Word> connectedWords = new ArrayList<Word>();
    private int distance = 0;
    private boolean visited;
    private String word;

    /**
     * The class "Word" represents the nodes in the graph (where each node is a word).
     */

    public Word(String word){
        this.word = word;
    }

    public ArrayList<Word> getConnectedWords(){
        return this.connectedWords;
    }
    
    public ArrayList<Word> getEdges(){
        return this.connectedWords;
    }

    public String getWord(){
        return word;
    }

    public void addEdge(Word word){
        connectedWords.add(word);
    }

    public boolean isVisited(){
        return visited;
    }
    
    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}

