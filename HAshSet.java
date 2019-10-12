import java.util.*;
class hashSet{
	LinkedHashMap<Integer,String> hs=new LinkedHashMap<Integer,String>();
	HashSet lhs=new HashSet();
	public void set(){
		hs.put(1,"nafees");
		hs.put(2,"ahmad");
		hs.put(1,"ansari");
//		hs.add(20);
	System.out.println(hs.keys());
//	print(hs);
	}
	public void link(){
		lhs.add(265);
		lhs.add(266);
		lhs.add(267);
		lhs.add("nafees");
		System.out.println(lhs);
	}
}
class m{
	public static void main(String args[]){
		hashSet h=new hashSet();
		h.set();
//		h.link();
	}
}
