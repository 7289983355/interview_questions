package trickey;

public class Sum_odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end = -76;

		int start = 1;

		int OddSum = 0;
		int evenSum = 0;

		while (start <= end) {

			if (start % 2 == 0) {
				evenSum += start;
			} else {
				OddSum += start;
			}

			start++;
		}
		
		System.out.println("OddSum  : "+OddSum);
		System.out.println("evenSum : "+evenSum);
	}

}
