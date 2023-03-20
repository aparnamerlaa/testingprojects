package old;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("Aparna");
	a.add("Meenu");
	a.add(2);
	a.add("Anjali");
	System.out.println(a);
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				

	}

}
