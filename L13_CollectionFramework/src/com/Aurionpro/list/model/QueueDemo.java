package com.Aurionpro.list.model;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

public class QueueDemo {
    public static void main(String[] args) {
        // Define a custom comparator based on priority (descending order)
        Comparator<Element> priorityComparator = new Comparator<Element>() {
            @Override
            public int compare(Element element1, Element element2) {
                return element1.getPriority()-element2.getPriority() ;
            }
        };
        
        // Create priority queue with custom comparator
        PriorityQueue<Element> pq = new PriorityQueue<>(priorityComparator);
        
        pq.add(new Element(3, "Task 1"));
        pq.add(new Element(4, "Task 2"));
        pq.add(new Element(2, "Task 3"));
        pq.add(new Element(0, "task 5"));
        pq.add(new Element(1, "Task 4"));
        
        System.out.println(pq);
        
        Iterator<Element> iterator =pq.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());
        }
        System.out.println("remove element");
        System.out.println(pq.poll());
        
        // Polling elements from the priority queue
        while (!pq.isEmpty()) {
            Element nextElement = pq.poll();
            System.out.println(nextElement.getValue() +" " +nextElement.getPriority());
        }
        
       
    }
}

