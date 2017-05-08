package com.java;

public class StockBuySellMultiple {
	public void func(int[] arr){
		int buy=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<arr[buy]){
				if(i-1 != buy){
					System.out.println("Buy on day "+buy);
					System.out.println("Sell on day "+(i-1));
					buy=i;
				}
				else{buy=i;}
			}
			if(i==arr.length-1 && buy!=i){
				System.out.println("Buy on day "+buy);
				System.out.println("Sell on day "+i);
			}
		}
	}	
	public void findBuySellDays(int[] arr){
		int buy=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<arr[buy]){
				if(i-1 != buy){
					System.out.println("Buy on day: "+buy+" and Sell on day "+(i-1));
					buy=i;
				}
				else{buy=i;}
			}
			if(i==arr.length-1 && buy!=i){
				System.out.println("Buy on day: "+buy+ " and Sell on day: "+i);
			}
		}
			
	}
	
	public static void main(String[] args) {
		//int[] arr={100,180,260,310,40,30,535,695};
		int[] arr={10,100,20,30,150,250,7,70,420,11};
		StockBuySellMultiple s=new StockBuySellMultiple();
		//s.findBuySellDays(arr);
		s.func(arr);
	}

}
