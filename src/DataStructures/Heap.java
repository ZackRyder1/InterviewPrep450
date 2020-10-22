package DataStructures;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {

    private boolean type;
    private PriorityQueue<Integer> heap;

    public Heap(boolean type){   //min - false , max -true
        this.type = type;
        if(this.type)
            this.heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        else
            this.heap = new PriorityQueue<Integer>();
    }

    public int getMin()
    {
        if(this.type)
            throw new Error("Max Heap is declared and requesting a min value");
        return this.heap.peek();
    }

    public int extractMin()
    {
        if(this.type)
            throw new Error("Max Heap is declared and requesting a min value");
        return this.heap.poll();
    }

    public int extractMax()
    {
        if(!this.type)
            throw new Error("Min Heap is declared and requesting a max value");

        return this.heap.poll();
    }

    public int getMax()
    {
        if(!this.type)
            throw new Error("Min Heap is declared and requesting a max value");

        return this.heap.peek();
    }

    public void addValue(int val)
    {
        this.heap.add(val);
    }

    public boolean isEmpty()
    {
        return this.heap.isEmpty();
    }

    public void ListValues()
    {
        System.out.println("Contents of the "+ (type?"max ":"min ") + "heap are:" );
        for(int s:this.heap)
        {
            System.out.println(s);
        }
    }

}
