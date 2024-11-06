package oops;


class P{
	static int num=100;
	static void print(){
		System.out.println("p");
	}
}

class C extends P{
	
	
}



public class InheritaceTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       C.print();
       System.out.println(C.num);
	}

}
