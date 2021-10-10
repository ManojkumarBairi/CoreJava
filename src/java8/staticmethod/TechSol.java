package java8.staticmethod;

 interface Deduction{
	static void deduct() {
		System.out.println("dedcut");
	}
}
 
 class Customer implements Deduction{
	/*public static void deduct()
	 {
		 System.out.println("inside class");
	 }*/
	 public static void servicecharge()
	 {
		 Deduction.deduct();
	 }
 }
public class TechSol {

	public static void main(String[] args) {
		/*Deduction d=new Customer();
		d.de*/
		//here the deduct method is not visible
Customer c=new Customer();
		c.servicecharge();
	}

}
