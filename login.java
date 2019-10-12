import java.util.*;
class SignUp{
	Scanner sc=new Scanner(System.in);
	ArrayList<String> username=new ArrayList<String>();
	ArrayList<String> password=new ArrayList<String>();
	public void user_id(){
		Iterator itr=username.iterator();
		System.out.println("enter username");
		String newuser=sc.next();
		int flag=0;
		while(itr.hasNext()){
			String preuser=(String)itr.next();
			if(preuser.equals(newuser)){
				System.out.println("Already use");
				flag=1;
			}
		}if(flag==0)
		username.add(newuser);else
			System.out.println("enter new");
	}
	public void user_password(){
		System.out.println("Enter password");
		String s=sc.next();
		password.add(s);
	}
	public void display(){
		Iterator itr=username.iterator();
		Iterator itr1=password.iterator();
		while(itr.hasNext()&&itr1.hasNext()){
			System.out.println(itr.next()+" "+itr1.next());
		}
	}
	public int verify_id(){
		Iterator user=username.iterator();
		Iterator pass=password.iterator();
		while(user.hasNext()&&pass.hasNext()){
			String s=(String)user.next();
			String p=(String)pass.next();
			if(s.equals(p));
			return 1;
		}
		return 0;
	}
}
class MainDemo{
	public static void main(String args[]){
		SignUp sign=new SignUp();
		while(true){
		sign.user_id();
		sign.user_password();
	//	sign.display();
		int f=sign.verify_id();
		System.out.println(f);
		}
	}
}
