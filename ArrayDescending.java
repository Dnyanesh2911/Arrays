package Arrays;

//14.To sort elements of an array in Descending order.
public class ArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {5,2,8,7,1};
		int temp = 0;
		
		System.out.println("Original Array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Sorted in Descending : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/* 
Original Array : 
5 2 8 7 1 
Sorted in Descending : 
8 7 5 2 1 
*/
