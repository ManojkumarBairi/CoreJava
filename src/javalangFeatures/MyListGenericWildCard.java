package javalangFeatures;

import java.util.ArrayList;
import java.util.List;

public class MyListGenericWildCard {

	public static void displayElements(List<? super Integer> li)
	{
		System.out.println(li);//line 4
	}
	public static void main(String[] args) {
	
List<Number> i1=new ArrayList<Number>();
i1.add(1009.9f);            //line 1
i1.add(200);                //line 2
i1.add(new Double(300));    //line 3
displayElements(i1);
	}

}
