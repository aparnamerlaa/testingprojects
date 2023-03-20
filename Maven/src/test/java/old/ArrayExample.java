package old;
import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Aparna");
		a.add(12);
		a.add("Rajesh");
		a.add(13);
		System.out.println(a);//[Aparna, 12, Rajesh, 13]
		System.out.println(a.size());
		System.out.println(a.remove(3));
		
		
	}

}
