package abstracts;

public class CreditCardPayment extends Payment{
	@Override
	public void processPayment(){
		System.out.println("신용 카드로 결제합니다");
	}
}
