import java.util.*;
class collection{
	Scanner sc=new Scanner(System.in);
	public void Link(){
		LinkedList lk=new LinkedList();
		int data;
		System.out.println("Enter data in List");
		for(int i=0;i<5;i++){
			int input=sc.nextInt();
			lk.add(input);		
		}
	}
}
class m{
	public static void main(){
		collection c=new collection();
		c.Link();
	}
}
