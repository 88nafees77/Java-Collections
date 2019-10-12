import java.util.*;
interface mathod{
	 int x=10;
	public void sum();
}
class Array implements mathod{
	public void array(){
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("ENter Elements");
		al.add(sc.nextInt());
		System.out.println(x);
	}
	public void sum(){
		System.out.println("sum");
	}
}
class Vec extends Array{
	public void vector(){
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		v.addElement(sc.nextInt());
		System.out.println(v);
		sum();
	}
}
class password{
	public void pass(){
		Random r=new Random();
		String num="123456789";
		String pas=num;
		char[] c=new char[4];
		for(int i=0;i<=3;i++){
			c[i]=pas.charAt(r.nextInt(pas.length()));
		}
		System.out.println(c);
	}
}
class mainfun{
	public static void main(String args[]){
		password p=new password();
		p.pass();
	}
}
