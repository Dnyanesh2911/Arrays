package Arrays;

//11.To Print elements of an array present on Odd position.
public class ElementOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Elements on odd position : ");
		for(int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
Elements on odd position : 
2 4 
*/
