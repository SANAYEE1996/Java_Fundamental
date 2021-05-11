package Homework;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		Calendar m = new Calendar(2020,1);
		m.print();
		
		int[] nums = {1,2,7,6,4};
		int[] cc = new int[combination(nums.length,3)];
		boolean[] visited = new boolean[nums.length];
		comb(nums,visited,0,nums.length,3,cc);
		
		int answer = -1;
		System.out.println(Arrays.toString(cc));
		answer = prim(cc);
		
		System.out.println("the answer is " +answer);

	}
	
	public static int combination(int n, int r) {
		if(n == r || r == 0) 
			return 1; 
		else 
			return combination(n - 1, r - 1) + combination(n - 1, r); 
	}
	public static int i = 0;
	static void comb(int[] arr, boolean[] visited, int start, int n, int r,int[] cc) {
        if (r == 0) {
            cc[i] = sum(arr, visited, n);
            i++;
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            comb(arr, visited, i + 1, n, r - 1,cc);
            visited[i] = false;
        }
    }
	
	static int sum(int[] arr, boolean[] visited, int n) {
		int sum = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sum += arr[i];
            }
        }
        return sum;
    }
	
	private static int prim(int[] arr) {
		int cnt = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 2; j < arr[i]; j++) {
				if(arr[i]%j == 0) break;
				if(j+1 == arr[i]) cnt++;
			}
		}
		
		return cnt;
	}

}
