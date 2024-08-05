package com.Aurionpro.list.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(3);
    deque.add(1);
    deque.add(4);
    deque.add(7);
    deque.add(5);
    deque.add(9);
    
    System.out.println(deque);
    
    deque.addFirst(6);
    deque.addLast(2);
    System.out.println("adding element from both end :");
    System.out.println(deque);
    
    System.out.println("Removing element from both end :");
    int first = deque.removeFirst();
    int last = deque.removeLast();
    System.out.println("First: " + first + ", Last: " + last);
    System.out.println(deque);
  }
}
