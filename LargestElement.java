package Arrays;

//15.To Print Largest elements in an array.

//Method 1
//public class LargestElement {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = new int[] {22,11,33,44,55};
//		int max = arr[0];
//		
//		for(int i = 0; i < arr.length; i ++) {
//			
//			if(arr[i] > max)
//				max = arr[i];
//		}
//		System.out.println("Largest Element : " + max);
//	}
//
//}

//Largest Element : 55


//Method 2 : Using swapping/ Temp variable
public class LargestElement {
	public static int getLarg(int[] a, int total) {
		int temp;
		for(int i = 0; i < total; i++) {
			for(int j = i+1; j < total; j++) {
				
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {22,11,33,44,55};
		
		System.out.println("Largest Element : " + getLarg(arr,5));
	}

}

//Largest Element : 55