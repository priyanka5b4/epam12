import java.util.ArrayList;
import java.util.List;


class firstclass {
	  int findAvg(List<Integer> list) {
		  int avg = 0; 
		  for(int i=0;i<list.size();i++)
		    	avg+=list.get(i);
		  return avg;
		  
	  }
}
class Secondclass {
	  List<String> ThreeLeterFun(List<String> list) {
		    List<String> res = new ArrayList<String>();
		  for(int i=0;i<list.size();i++)
		  { 
			  String str = list.get(i);
			  if(str.length() == 3)
				  res.add(str);
			  
		  }
			  
		    	
		  return res;
		  
	  }
}

class Thirdclass {
	boolean Ispalindrome(String str) {
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i) != str.charAt(j))
				return false;
				
		}
		return true;
	}
	
	List<String> palindormecheck(List<String> list) {
		    List<String> res = new ArrayList<String>();
		  for(int i=0;i<list.size();i++)
		  { 
			  String str = list.get(i);
			  if(Ispalindrome(str))
				  res.add(str);
		  }
			  
		    	
		  return res;
		  
	  }
}


public class javaexample {
      public static void main(String args[]) {
    	
    	    List<Integer> list1 = new ArrayList<Integer>();
    	    list1.add(1);
    	    list1.add(2);
    	    list1.add(3);
    	    firstclass ft1 = new firstclass();
    	    System.out.println(ft1.findAvg(list1));
    	    
         List<String> list2 = new ArrayList<String>();
         list2.add("pri");
         list2.add("mmm");
         list2.add("ama");
         list2.add("a");
    	Secondclass st1 = new Secondclass();
    	System.out.println(st1.ThreeLeterFun(list2));
    	
    	Thirdclass tc1 = new Thirdclass();
    	System.out.println(tc1.palindormecheck(list2));
    	  
      }
}
