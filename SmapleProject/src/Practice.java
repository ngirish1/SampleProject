import java.util.Calendar;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar myDate = Calendar.getInstance(); // set this up however you need it.
		int dow = myDate.get (Calendar.DAY_OF_WEEK);
		//boolean isWeekday = ((dow >= Calendar.MONDAY) && (dow <= Calendar.FRIDAY));
		
		if(myDate.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
	         System.out.println("Wednedday");
	         String a = "fuzz";
	         StringBuffer sb = new StringBuffer("mall"); 
	         sb.replace(0, 0, "b");
	         String b="";
	         b= a.replace('f', 'b');
	         System.out.println("value of a is"+a+" "+b +" sb "+sb);
	         
	     } else {
	        System.out.println("Weekday");
	     }
		
	}

}




