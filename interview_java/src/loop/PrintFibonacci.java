package loop;

public class PrintFibonacci {

	public static void main(String[] args) {

		System.out.println(printFibonacci(6));

	}

	private static int printFibonacci(int num) {

		if (num <= 1) {
			return num;
		}

		return printFibonacci(num - 1) + printFibonacci(num - 2);
	}

}

//0 1 1 2 3 5 8 13