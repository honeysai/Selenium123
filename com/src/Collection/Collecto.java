package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;



public class Collecto {
	public static void main(String[] args) {
			ArrayList<String> array=new ArrayList<String>();
			
			array.add("java");
			array.add("spring");
			array.add("Hiber");
			
			
			array.add("spring");
			array.add("Hiber");
			array.add("spring");
			array.add("Hiber");
          ArrayList<String> array1=new ArrayList<String>();
			
			array1.add("java");
			array1.add("spring");
			array1.add("Hiber");
			
			
			array1.add("spring");
			array1.add("Hiber");
			array1.add("spring1");
			array1.add("Hiber");
			//array.addAll(array1);
			array.removeAll(array1);
			
//			Iterator itr=array.iterator(); 
//			while (itr.hasNext()) {
//				System.out.println(itr.next());
//				
//			}
				
			
			for (String string : array) {
				System.out.println(string);
				
			}
			}
			
	}


