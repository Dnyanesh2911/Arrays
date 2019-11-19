package Arrays;


//8.To Print Sum of all elements in an array.
public class SumElementAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = new int[] {1,2,3,4,5};
		 int sum = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 sum = sum + arr[i];
		 }
		 
		 System.out.println("Sum of all Elements of an array : " + sum);
	}

}

//Sum of all Elements of an array : 15
