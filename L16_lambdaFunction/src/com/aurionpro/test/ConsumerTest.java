package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
public static void main(String[] args) {
	
	Consumer<Integer> consumer =(Integer number) -> System.out.println("Square is "+ number *number);
	
	consumer.accept(5);
	
	BiConsumer<Integer,Integer> biconsumer =(Integer number1,Integer number2) -> System.out.println(number1+number2);
	biconsumer.accept(50,80);
}
}
