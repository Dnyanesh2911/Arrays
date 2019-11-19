package Arrays;

//12.To Print Odd & Even No. from an array.
public class OddEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,5,6,3,2};
		
		System.out.println("Odd Numbers : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}

		System.out.println("\nEven Numbers : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}

}
