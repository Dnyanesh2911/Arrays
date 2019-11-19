package Arrays;


//18.To Print Smallest elements in an array.
public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {22,11,33,44,55};
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest Element : " + min);
	}

}

//Smallest Element : 11