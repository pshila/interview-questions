package health_care;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDublicatCharSaparataly {

	public static void main(String[] args ) {
		 String s="my name is shila patel i am married ,i got married in 2016 with drigendra prashad patel";
		 hashmapCountChar(s);
    }
	public static void hashmapCountChar(String s){
		
		Map<Character,Integer> map= new HashMap<>();
		
		     for(int i=0;i<s.length();i++){
		    	  
		    	  if(map.containsKey(s.charAt(i))){
		    		  map.put(s.charAt(i), map.get(s.charAt(i))+1);
		    	  }
		    	  else{
		    		  map.put(s.charAt(i), 1);
		    	  }
		     }
		     Set<Entry<Character,Integer>> list= map.entrySet();
		               for(Entry<Character,Integer> val:list){
		            	     System.out.println(val.getKey()+"-->"+val.getValue());
		                     }
	}
	
		
	}


