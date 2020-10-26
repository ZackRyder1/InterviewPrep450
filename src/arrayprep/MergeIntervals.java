package arrayprep;

import java.util.*;

public class MergeIntervals {
    private static class Interval implements Comparable<Interval> {

        private final int startInterval;
        private final int endInterval;

        public Interval(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

        @Override
        public int compareTo(Interval o) {
            return Integer.compare(this.startInterval, o.startInterval);
        }

        @Override
        public String toString() {
            return "[" + this.startInterval + "," + this.endInterval + "]";
        }
    }

    private static boolean checkIntervalOverLap(Interval first, Interval second){

        return second.startInterval<first.endInterval && first.endInterval<second.endInterval;

    }

    private static Interval mergeIntervals(Interval first, Interval second) {
        return new Interval(first.startInterval, second.endInterval);
    }



    private static void mergeIntervals(ArrayList<Interval> intervals) {

        Collections.sort(intervals);

        int i=0;

        while(i+1<intervals.size())
        {
            Interval first = intervals.get(i);
            Interval second =intervals.get(i+1);
            if(checkIntervalOverLap(first,second))
            {
                intervals.set(i,mergeIntervals(first,second));
                intervals.remove(i+1);
            }
            else
                i++;
        }

    }

    private static void printResult(ArrayList<Interval> result)
    {
        System.out.println("------------------------------------");
        System.out.println("Result of Merging Intervals is: ");
        System.out.println(result);
        System.out.println("------------------------------------");
    }




    public static void main(String[] args) {

        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(9, 12));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(11, 15));
        intervals.add(new Interval(16, 20));
        intervals.add(new Interval(5, 8));

        mergeIntervals(intervals);
        printResult(intervals);




    }


}
