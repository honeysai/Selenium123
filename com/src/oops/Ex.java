package oops;

public class Ex {
enum result {pass, fail, absent};
public static void main(String[] args) {
	
int totalmarks =30;
if(totalmarks >=75)
	System.out.println(result.pass);
	
else
System.out.println(result.fail);
}
}