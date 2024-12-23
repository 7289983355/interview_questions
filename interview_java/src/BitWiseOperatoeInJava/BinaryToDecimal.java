package BitWiseOperatoeInJava;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String binaryString = "1011"; // Binary representation of 11  //0123
		int decimal = binaryToDecimal(binaryString);
		System.out.println("Decimal value: " + decimal);
	}

	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int length = binary.length();

		for (int i = 0; i < length; i++) {
			// Get the digit at the current position
			char bit = binary.charAt(length - 1 - i);
			if (bit == '1') {
				decimal += Math.pow(2, i);
			}
		}
		return decimal;
	}
}

// i=0
    //4-1-0 =3

//i=1
    //4-1-1=