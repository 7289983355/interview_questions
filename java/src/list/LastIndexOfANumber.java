package list;

public class LastIndexOfANumber {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70};
		int target=50;
		int index=-1;
		
		//iterate through the array
		for(int i=arr.length-1;i>=0;i--) {
			
			if(arr[i]==target) {
				index=i;
				break; //Exist the loop found
			}
		}
		  System.out.println("Index of " + target + " is: " + index);
	}

}
