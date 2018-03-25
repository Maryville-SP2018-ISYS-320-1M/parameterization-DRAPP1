/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1.) My prediction is that it would take the numbers attached to the variables and print the
 results of the equations in the print line statement.*/

/*
 3.) I was correct but I am still foggy as to how it worked! I was able to make an educated
 guess given the syntax being simple but and having trouble understanding the how the syntax
 works.*/

public class P1_MysteryNums {
	public static void main(String[] args) {
        int x = 15;
        sentence( x, 42 );
        
        int y = x - 5;
        sentence( y, x + y);
    }
    
    public static void sentence( int num1, int num2 ) {
        System.out.println( num1 + " " + num2 );
    }


}
