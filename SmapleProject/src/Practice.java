import java.util.Calendar;

public class Practice {

	
	public String solution(){
		
		System.out.println(" Hello Nacl Solution how are you");
		
		return null;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar myDate = Calendar.getInstance(); // set this up however you need it.
		int dow = myDate.get (Calendar.DAY_OF_WEEK);
		//boolean isWeekday = ((dow >= Calendar.MONDAY) && (dow <= Calendar.FRIDAY));
		
		if(myDate.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
	         System.out.println("Wednedday");
	         String a = "fuzz";
	         StringBuffer sb = new StringBuffer("fuzz"); 
	         sb.replace(0, 2, "bi");
	         String b="";
	         b= a.replace('f', 'b');
	         System.out.println("value of a is"+a+" "+b +" sb "+sb);
	         
	     } else {
	        System.out.println("Weekday");
	     }
		System.out.println("Things are Done and solutions are bit enough");
		
			Practice pt = new Practice();
			pt.solution();
	}
	
  private void Syso() {
		// TODO Auto-generated method stub
       System.out.println("******** ");
	}


}




