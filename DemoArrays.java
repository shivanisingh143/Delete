public class DemoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Here we're trying to create an array of arbitrary elements
		 */
		
		int b [] = {12,34,56,65,54,37,88,90,0,11,10,99,41,45,18};
		int arr_len = b.length; // this calclutates the number of elements in array b
		
		/*
		 * We'd now try printing the array 
		 * For that, we shall need the for() loop
		 */
		for(int i = 0; i < arr_len; i+=1){
			System.out.println(b[i]);
			
		}

	}

}
