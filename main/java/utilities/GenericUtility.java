package utilities;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class GenericUtility {


	public static void currenttime(){
		Calendar calendar = Calendar.getInstance();
		Date currentDateTime = (Date) calendar.getTime();
		System.out.println(currentDateTime);

		}

	//random string
	public static String getRandomString(int count) {

	        String alphabet= "abcdefghijklmnopqrstuvwxyz";
	        String s = "";
	        Random random = new Random();
	        for (int i = 0; i < count; i++) {
	        char c = alphabet.charAt(random.nextInt(26));
	        s+=c;
	        }
	         //System.out.println(s);
	         return s;
	     }
	   
	//random number
	    public static void CreateRandomnumber(int count) {
	   
	    Random rand = new Random();
	    // Generate random integers in range 0 to 999
	    int rand_int= rand.nextInt(count);
	    System.out.println(rand_int);
	    //return(rand_int);
	    }


	    

}
