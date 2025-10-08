abstract class Bank{
	abstract void getBalance();

}
class BankA extends Bank{
	void getBalance(){
	System.out.println("Balance in A is 10000");
	}
}
class BankB extends Bank{
	void getBalance(){
	System.out.println("Balance in B is 15000");
	}
}
class BankC extends Bank{
	void getBalance(){
	System.out.println("Balance in B is 20000");
	}
}
public class TestBank{
	public static void main(String args[]){
		System.out.println("Twarit, 24csu331");
	BankA a= new BankA();
	a.getBalance();
	BankB b= new BankB();
	b.getBalance();
	BankC c= new BankC();
	c.getBalance();
	}
}