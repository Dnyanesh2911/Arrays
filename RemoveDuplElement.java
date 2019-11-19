package Arrays;

import java.util.Arrays;

//20.To Remove Duplicate element in an array.

//A.Using Temp Array(Given Array is Ascending order)
/*	public class RemoveDuplElement {
		
		public static int getData(int arr[], int n) {
			
			if(n == 0 || n == 1)
				return n;
			
			int[] temp = new int[n];
			int j = 0;
			
			for(int i = 0; i < n-1; i++) {
				if(arr[i] != arr[i+1]) {
					temp[j++] = arr[i];
				}
			}
			
			temp[j++] = arr[n-1];
			
			for(int i = 0; i < j; i++) {
				arr[i] = temp[i];
			}
			return j;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = new int[] {10,20,20,30,40,50,50}; 
			
			int length = getData(arr, arr.length);
			System.out.println("After Removing Duplicate Element in Array : ");
			for(int i = 0; i < length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	After Removing Duplicate Element in Array : 
	10 20 30 40 50 
*/

//B.Using Seperate index(Given Array is Ascending order)
/* 	public class RemoveDuplElement {
		
		public static int getData(int arr[], int n) {
			
			if(n == 0 || n == 1)
				return n;
			
			int j = 0;
			for(int i = 0; i < n-1; i++) {
				if(arr[i] != arr[i+1]) {
					arr[j++] = arr[i];
				}
			}
			
			arr[j++] = arr[n-1];
			return j;
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = new int[] {10,20,20,30,40,50,50}; 
			
			int length = getData(arr, arr.length);
			System.out.println("After Removing Duplicate Element in Array : ");
			for(int i = 0; i < length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	After Removing Duplicate Element in Array : 
	10 20 30 40 50 
*/

//C.Using Temp Array(Given Array is Ascending order)
	public class RemoveDuplElement {
		
		public static int getData(int arr[], int n) {
			
			if(n == 0 || n == 1)
				return n;
			
			int[] temp = new int[n];
			int j = 0;
			
			for(int i = 0; i < n-1; i++) {
				if(arr[i] != arr[i+1]) {
					temp[j++] = arr[i];
				}
			}
			
			temp[j++] = arr[n-1];
			
			for(int i = 0; i < j; i++) {
				arr[i] = temp[i];
			}
			return j;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,70,30,90,20,20,10}; 
		
		Arrays.sort(arr);//
		
		int length = getData(arr, arr.length);
		System.out.println("After Removing Duplicate Element in Array : ");
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	}

//After Removing Duplicate Element in Array : 
//10 20 30 70 90 