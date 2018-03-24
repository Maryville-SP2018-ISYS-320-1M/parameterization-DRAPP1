/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 4.) My prediction is that the code will print out the text (all together) that has been assigned to the
 to the variables used in the code using string.
  
  
 */

/*
 6. I was correct! I learned how parameters connected the text through the string commands.
 
 
 */

public class P4_MysteryTouch {
	public static void main(String[] args) {
        String head = "shoulders";
        String knees = "toes"; 
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye"; 
        
        touch(ear, elbow);
        touch(elbow, ear); 
        touch(head, "elbow"); 
        touch(eye, eye);
        touch(knees, "Toes"); 
        touch(head, "knees " + knees );
    }
    
    public static void touch(String elbow, String ear) { 
        System.out.println( "touch your " + elbow + " to your " + ear );
    }


}
