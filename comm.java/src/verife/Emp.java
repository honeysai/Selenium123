package verife;

public class Emp {
	int empno ;
	double sal;
	String empname;
	Emp( int no, double empsal, String name){
		empno=no;
		sal=empsal;
	empname=name;
		
		
	}
	
void dispaly(){
	
	System.out.println("Name :"+empname);
	System.out.println("empno :"+empno);
	System.out.println("salary :"+sal);
}

public static void main(String[] args) {
	Emp e =new Emp(9, 4500.521, "divya");
	e.dispaly();
	
	
	
}

}
