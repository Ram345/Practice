package practice;

import java.util.Scanner;

public class NumberSqaureSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int x=1; long i=2;
		NumberSqaureSeries ns = new NumberSqaureSeries();
		System.out.println("Enter Number:");
		ns.returnNumberSeries(sc.nextInt(), x, i);
		//System.out.println("result===>>"+n);
	}
	
	public void returnNumberSeries(int n, int x, long i){
	     
	      while(x<=n){
	    	  System.out.println(x+":"+i);
	    	  x++;
	    	  i*=i;
	      }
	}

}
		