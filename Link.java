import java.util.*;
class link{
	TreeSet l=new TreeSet();
}
class main{
        public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Vector lk=new Vector();
                int data;
                System.out.println("Enter data in List");
                for(int i=0;i<5;i++){
                        int input=sc.nextInt();
                        lk.add(input);          
                }
		ListIterator itr=lk.listIterator();
		while(itr.hasNext()){
			Integer i=(Integer)itr.next();
		//	itr.set(101010);
			System.out.println(i);
		}
		itr.set(1,0909);
		System.out.println(lk);
        }
}


