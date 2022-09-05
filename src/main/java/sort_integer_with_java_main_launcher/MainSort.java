package sort_integer_with_java_main_launcher;

import sort_integer_with_java.SortIntegers;

public class MainSort {
	public static void main(String[] args) {
		int[] myInts = {5,4,6};
		System.out.print(myInts[0]+" ");
		System.out.print(myInts[1]+" ");
		System.out.println(myInts[2]);
		System.out.println("=== sorting array of int...");
		SortIntegers.sort(myInts);
		System.out.print(myInts[0]+" ");
		System.out.print(myInts[1]+" ");
		System.out.println(myInts[2]);
	}
}
