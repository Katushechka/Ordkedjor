package Datastrukturer_algoritmer_Ordkedjor;
import java.util.ArrayList;
import java.util.LinkedList;

public class BreadthFirstSearch {
	private LinkedList<Word> queue = new LinkedList<Word>();
    private ArrayList<Word> words;
    private Word startWord;
    private Word endWord;

    /**
     * This class searches for the shortest route between a start-word and an end-word.
     */

    public BreadthFirstSearch(Word startWord, Word endWord, ArrayList words) {
        this.startWord = startWord;
        this.endWord = endWord;
        this.words = words;
        search();
    }


    public void search() {
        startWord.setDistance(0);
        startWord.setVisited(true);
        queue.add(startWord);
        boolean reached = false;
        while (queue.size() != 0) {
            startWord = queue.poll();
            if (startWord.getWord().equals(endWord.getWord())) {
                reached = true;
                System.out.println(startWord.getDistance());
                break;
            }
            for (int i = 0; i < startWord.getEdges().size(); i++) {
                if (!startWord.getEdges().get(i).isVisited()) {
                    startWord.getEdges().get(i).setVisited(true);
                    startWord.getEdges().get(i).setDistance(startWord.getDistance() + 1);
                    queue.add(startWord.getEdges().get(i));
                }
            }
        }
        if (!reached) {
            System.out.println(-1);
        }
    }
}
