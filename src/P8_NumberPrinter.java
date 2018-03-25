/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P8_NumberPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers(5);
		System.out.println();
	}

	public static void printNumbers(int max) {
		for (int i = 1; i <= max; i++)
			System.out.print("[" + i + "]" + " ");
	}

}
