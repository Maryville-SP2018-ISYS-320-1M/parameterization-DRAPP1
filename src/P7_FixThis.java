/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 7. I have run this code and looked at it ten times and it runs and complies perfectly! When
 I loaded the cod into Eclipse there were no red x's and then as I mentioned the code returned
 the exact design shown in the canvas assignment. Did I miss something here?
 
 
 */

public class P7_FixThis {

	public static void main(String[] args) {
		for( int line = 0; line < 10; line++ ) {
			int starsToWrite = line % 5 + 1 ;
			writeChar( '*', starsToWrite );
			System.out.println();
		}

	}
	
	public static void writeChar( char characterToPrint, int numOfTimesToPrint  ) {
		for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numOfTimesToPrint; numOfTimesPrinted++ ) {
			System.out.print( characterToPrint );
		}
	}
}
