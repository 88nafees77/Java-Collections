import java.util.*;
class vector{
	public void v(){
	Vector v=new Vector();
	for(int i=0;i<3;i++)
		v.add(i);
	System.out.println(v);
	Vector vv=new Vector();
	vv(Object)=(Object)v.clone();
	System.out.println(vv);
	}
/*	Enumeration itr=v.elements();
	while(itr.hasMoreElements()){
		Integer i=(Integer)itr.nextElement();
		System.out.println(i);
	}
	v.set(1,76);
	System.out.println(v);
	Stack st=new Stack();
	st.push(5);
	st.push(6);
	int i=st.search(5);
	System.out.println(i);
	}*/
}
class m{
	public static void main(String args[]){
		vector v=new vector();
		v.v();
	}
}
