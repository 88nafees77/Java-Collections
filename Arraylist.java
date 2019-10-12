import java.util.*;
interface inter{
	public void hello();
}
class p implements inter{
	public void hello(){
		System.out.println("hello");
	}
}
class array{
	public static void main(String args[]){
		Vector<Integer> a=new Vector<Integer>();
//		a.add("nafees");
//		a.set(0,"ansari");
	//	a.add(8);
//		Object o=a.remove(0);
	//	int sizd=a.size();
	//	System.out.println(a.get(0));
		for(int i=0;i<10;i++){
			a.add(i);	
		}
		Enumeration e=a.elements();
		while(e.hasMoreElements()){
			Integer i=(Integer)e.nextElement();
			System.out.println(i);
		}
	//	inter in=new inter();
	//	in.hello();	
	}
}
