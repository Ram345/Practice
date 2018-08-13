package practice;

public class CompareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5, 6, 7};
		int b[] = {3, 6, 9};
		CompareTriplets ct = new CompareTriplets();
		ct.findResults(a, b);
	}
	
	public void findResults(int a[], int b[]){
		int a1 = 0;
		int b1 = 0;
		
		for(int i=0; i<a.length; i++){
			if(a[i] > b[i]){
				a1++;
			}else if(b[i] > a[i]){
				b1++;
			}
		}
		System.out.println(a1+" "+b1);
	}
}
