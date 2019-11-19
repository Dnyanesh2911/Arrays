package Arrays;


//6.To Right Rotate elements of an array.
public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5};
		int n = 3;
		
		System.out.println("Original Array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < n; i++) {
			int j, last;
			
			last = arr[arr.length-1];
			for(j = arr.length-1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last ;
			}
		System.out.println();
		
		System.out.println("Array After Right Rotation :");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
Original Array : 
1 2 3 4 5 
Array After Right Rotation :
3 4 5 1 2 
*/
