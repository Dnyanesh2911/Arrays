package Arrays;

import java.util.Arrays;

//19.To Find Second Smallest No. in an array.

//Method 1.Using Temp Varible/Swapping
//public class SecondSmallest {
//	
//	public static int getLarg(int[] a, int total) {
//		int temp;
//		
//		for(int i = 0; i < total; i++) {
//			for(int j = i+1; j < total; j++) {
//				
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		return a[1];
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int[] arr = new int[]{1,2,5,6,3,2};
//		
//		System.out.println("Second Smallest : " + getLarg(arr,arr.length));
//	}
//
//}
//
//Second Smallest : 2



//Method 2. Using Array.sort()
	public class SecondSmallest {
		public static int getLarg(int[] a, int total) {
			Arrays.sort(a);
			return a[1];
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,2,5,6,3,2};
		
		System.out.println("Second Smallest : " + getLarg(arr,arr.length));
	}
	
	}

//Second Smallest : 2