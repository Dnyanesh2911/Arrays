package Arrays;

// 2.To copy all elements of one array into another array.

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Original Array : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("New Array : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}

/*

Original Array : 
1 2 3 4 5 
New Array : 
1 2 3 4 5 

*/
