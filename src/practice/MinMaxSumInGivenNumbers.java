package practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSumInGivenNumbers {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long max = 0;
		long min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				min += arr[i];
			}
			if (i > 0 && i <= arr.length - 1) {
				max += arr[i];
			}
		}
		System.out.println(min + "  " + max);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};

//		String[] arrItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		

		for (int i = 0; i < 5; i++) {
			int arrItem = arr[i];
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}