package com.java;

public class FindElementsInArray {

	public boolean findArray(int[] largeArray, int[] subArray) {

        if (subArray.length > largeArray.length) {
            return false;
        }

        for (int i = 0; i < largeArray.length; i++) {
            if (largeArray[i] == subArray[0]) {

            	boolean subArrayFound = true;
                for (int j = 0; j < subArray.length; j++) {
                	  if (subArray[j] != largeArray[i+j]) {  
                    	subArrayFound = false;
                        break;
                    }
                }
                if (subArrayFound) {
                    return true;
                }

            }
        }

        return false;
    }


	public static void main(String[] args) {

		FindElementsInArray fa = new FindElementsInArray();
		int[] largeArray = {1,2,3,4,5,6,7};
        int[] subArray = {2,3,4,5, 9};

        boolean result = fa.findArray(largeArray, subArray);
        
        System.out.println(result);
	}
}
