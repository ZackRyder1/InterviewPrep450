package StringPrep;

import java.util.Arrays;
import java.util.Map;

public class WordWrap {
    public static void main(String[] args) {
        String [] sentences = {"Tushar","Roy","likes","to","code"};
        int lineWidth = 10;
        String sentence = findWordWrap(sentences,lineWidth);
        System.out.println("The Sentence after word wrap looks like this: ");
        System.out.println(sentence);
    }

    private static String findWordWrap(String[] sentence, int lineWidth) {

        int [][] costTable = new int [sentence.length][sentence.length];
        int [] minCost = new int [sentence.length];
        int [] split = new int [sentence.length];

        Arrays.fill(minCost, Integer.MAX_VALUE);



        for(int i=0;i<sentence.length;i++)
            for(int j=i;j<sentence.length;j++)
            {
                int width  = findWidth(sentence,i,j);
                if(width>lineWidth)
                    costTable[i][j] = Integer.MAX_VALUE;
                else
                    costTable[i][j] = (lineWidth - width) * (lineWidth - width);
            }

        for(int i=sentence.length-1;i>=0;i--)
        {
            if(costTable[i][sentence.length-1] != Integer.MAX_VALUE)
            {
                minCost[i] = costTable[i][sentence.length-1];
                split[i] = sentence.length;
                continue;
            }
            for(int j=sentence.length-1;j>i;j--)
            {
                if(costTable[i][j-1] != Integer.MAX_VALUE)
                {
                        int cost = minCost[j] + costTable[i][j-1];
                        if(minCost[i] > cost) {
                            minCost[i] = cost;
                            split[i] = j;
                        }
                }
            }
        }


        return buildSolution(split,sentence);
    }

    private static String buildSolution(int[] split,String [] sentence) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while(i<split.length)
        {
            int currLineWords = split[i];
            for(;i<currLineWords;i++)
                result.append(sentence[i]).append(' ');
            result.append('\n');
        }
        return result.toString();
    }

    private static int findWidth(String[] sentence, int start, int end) {
        int width = sentence[start].length();
        for(int i=start+1;i<=end;i++)
            width +=1 + sentence[i].length();
        return width;
    }
}
