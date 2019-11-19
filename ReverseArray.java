package Arrays;

//9.To Print elements of an array in Reverse Order.
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Original Array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Array in Reverse order : ");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
Original Array : 
1 2 3 4 5 
Array in Reverse order : 
5 4 3 2 1 
 */