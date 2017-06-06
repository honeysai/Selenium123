package oops;


class  bank{
	int a=40;int b=60;
		
		
	}
//	void m2(){
//		
//	}
	


public class Inheritance  extends bank{

	int a=100;int b=200;`

//void m2(){
//	System.out.println("m2 child method");
//}
void add(int a,int b){
	System.out.println(a+b);
	System.out.println(this.a+this.b);
	System.out.println(super.a+super.b);
	
	
}


	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		i.add(1000, 2000);

	}

}
