import java.util.*;
class DemoP<T extends Comparable>{
	public static<T extends Comparable> void print(T a[], int n){
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();System.out.println();
	}
}

public class Ques3<E extends Comparable>{
	public static void main(String[] args){
		Integer[] ints={3,1,2,7,4,5};
		Float[] f={3.2f,1.3f,2.5f,7.1f,4.0f,5.9f,3.1f};
		Character[] c={'d','g','c','w','h','s'};
		String[] s={"adsd","fdff","grbb","cvbdf","efvss"};
		
		System.out.println("Integer class");System.out.println("======================");
		DemoP.print(ints,ints.length);

		System.out.println("Float class");System.out.println("======================");
		DemoP.print(f,f.length);

		System.out.println("Character class");System.out.println("======================");
		DemoP.print(c,c.length);

		System.out.println("String class");System.out.println("======================");
		DemoP.print(s,s.length);
	}
}