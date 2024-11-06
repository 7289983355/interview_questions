package oops;


class Q{
	 int num=100;
	 void print(){
		System.out.println("p");
	}
}

class R extends Q{
	 int num=10;
	
}



public class InheritaceTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Q p=new R();
		
		System.out.println(p.num);
		
		R r=new R();
		
		System.out.println(r.num);
	}

}
