package Homework;
import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Shell.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	} 
}

abstract class AbstractSort {
	public static void sort(Comparable[] a) {
	};

	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	protected static void exch(int[] arr, int i, int j) {
		Comparable t = arr[i];
		arr[i] = arr[j];
		arr[j] = (int) t;
	}

	protected static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	protected static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

}

class Shell extends AbstractSort {
	public static void sort(int[] arr) {

		int N = arr.length;
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			for (int i = h; i < N; i++)
				for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h)
					exch(arr, j, j - h);
			h /= 3;
		}
	}

}
