package Arrays;

//10.To Print elements of an array present on Even position.
public class ElementEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Elements on even position : ");
		for(int i = 2; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}

}

/*
Elements on even position : 
3 5
*/