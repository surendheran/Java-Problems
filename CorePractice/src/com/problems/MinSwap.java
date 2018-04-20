package com.problems;


//https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
//Java program to find  minimum number of swaps
//required to sort an array
import java.util.ArrayList;
import java.util.*;

class GfG
{
 // Function returns the minimum number of swaps
 // required to sort the array
 public static int minSwaps(int[] arr)
 {
     int n = arr.length;

     // Create two arrays and use as pairs where first
     // array is element and second array
     // is position of first element
     ArrayList <Pair <Integer, Integer> > arrpos =
               new ArrayList <Pair <Integer, Integer> > ();
     for (int i = 0; i < n; i++)
          arrpos.add(new Pair <Integer, Integer> (arr[i], i));

     // Sort the array by array element values to
     // get right position of every element as the
     // elements of second array.
     Collections.sort(arrpos);
     /*arrpos.sort(new Comparator<Pair<Integer, Integer>>()
     {
         @Override
         public int compare(Pair<Integer, Integer> o1,
                            Pair<Integer, Integer> o2)
         {
             if (o1.getValue() > o2.getValue())
                 return -1;

             // We can change this to make it then look at the
             // words alphabetical order
             else if (o1.getValue().equals(o2.getValue()))
                 return 0;

             else
                 return 1;
         }
     });*/

     // To keep track of visited elements. Initialize
     // all elements as not visited or false.
     Boolean[] vis = new Boolean[n];
     Arrays.fill(vis, false);

     // Initialize result
     int ans = 0;

     // Traverse array elements
     for (int i = 0; i < n; i++)
     {
         // already swapped and corrected or
         // already present at correct pos
         if (vis[i] || arrpos.get(i).getValue() == i)
             continue;

         // find out the number of  node in
         // this cycle and add in ans
         int cycle_size = 0;
         int j = i;
         while (!vis[j])
         {
             vis[j] = true;

             // move to next node
             j = arrpos.get(j).getValue();
             cycle_size++;
         }

         // Update answer by adding current cycle.
         ans += (cycle_size - 1);
     }

     // Return result
     return ans;
 }
}

class Pair<K extends Comparable<K>, V> implements Comparable<Pair<K, V>>{
	
	K t1;
	V t2;
	
	public Pair(K t1, V t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public V getValue(){
		return t2;
	}
	
	public K getK(){
		return t1;
	}

	@Override
	public int compareTo(Pair<K, V> o) {
		if (getK().compareTo(o.getK())>0)
			return -1;
		else if (getK().compareTo(o.getK())==0)
			return 0;
		else
			return 1;
	}
}

//Driver class
public class MinSwap
{
 // Driver program to test the above function
 public static void main(String[] args)
 {
     int []a = {1, 5, 2, 3, 4}; 
     System.out.println(GfG.minSwaps(a));
 }
}