package com.beardfish.test.sort;

import com.beardfish.sort.BubbleSort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by christian on 2/14/2017.
 */
public class BubbleSortTest {
	
	@Test
	public void sortTestBubbleSortTrivial() {
		List<Integer> numbers = new LinkedList<Integer>() {{
			add(14);
			add(33);
			add(27);
			add(10);
			add(35);
			add(19);
			add(42);
			add(44);
		}};
		BubbleSort BubbleSort = new BubbleSort();
		BubbleSort.<Integer>sort(numbers, new IntegerComparator());
		System.out.println(numbers.toString());
	}

    @Test
    public void sortTestBubbleSortInt() {
       List<Integer> numbers = new LinkedList<Integer>()  {{
            add(1);
            add(10);
            add(27);
            add(7);
            add(3);
            add(0);
        }};
        BubbleSort BubbleSort = new BubbleSort();
        BubbleSort.<Integer>sort(numbers,new IntegerComparator());
        System.out.println(numbers.toString());
    }

    @Test
    public void sortTestBubbleSortString() {
        List<String> strings = new LinkedList<String>() {{
            add("garbage");
            add("apple");
            add("baby");
            add("revolution");
            add("baby");
            add("alpha");
            add("rock");
            add("orphan");
            add("xylophone");
        }};
        BubbleSort BubbleSort = new BubbleSort();
        BubbleSort.<String>sort(strings,new StringComparator());
        System.out.println(strings.toString());
    }
    
    @Test
    public void sortRandom1000Integers() {
    	List<Integer> randomNumbers = new ArrayList<Integer>(10000);
    	Random random =  new Random();
    	BubbleSort BubbleSort = new BubbleSort();
    	for(int i = 0; i<10000;i++) {
    		randomNumbers.add(random.nextInt());
    	}
    	long start = System.nanoTime();
    	BubbleSort.sort(randomNumbers, new IntegerComparator());
    	double elapsedTime = ((double)(System.nanoTime()-start))/1000000000;
    	System.out.println("Elapsed Time: "+(elapsedTime));
    }
}
