package com.haytham.example.guava_haytham;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! \n From over there \n" );
        
        Multiset<String> animals = HashMultiset.create();
        animals.add("cat");
        animals.add("dog");
        animals.add("hen");
        
        animals.forEach(System.out::println);
    }
}
