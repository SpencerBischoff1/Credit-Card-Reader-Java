import java.util.Scanner;
public class CardReader {
		public static void main(String[] args) {
			// Initialize your variables 
			String creditCardUserFullName ="";
			String creditCardUserActualName = "Robert Bruce";
			String creditCardNumber = "";
			String creditCardZipcode = "";
			float creditCardMaximum = 1000f;
			float creditCardPurchaseAmount = 0.0f;
			
			boolean userProvidedValidName = false;
			boolean userProvidedGoodCreditCard = false;
			boolean userProvidedGoodAmount = false;
			
			
		
			while(true) {
				Scanner reader = new Scanner(System.in);
				
				
			System.out.println("What is the credit card holder's full name");
			creditCardUserFullName = reader.nextLine();
			
			System.out.println("What is the credit card number?");
			creditCardNumber = reader.nextLine();
			
			System.out.println("How much should be charged on the credit card?");
			creditCardPurchaseAmount = reader.nextFloat();
			
		if(creditCardUserFullName.equals(creditCardUserActualName)) {
			userProvidedValidName = true;
			}
		if(isThisCreditCardValid(creditCardNumber)) {
			userProvidedGoodCreditCard = true;
		}
		if(creditCardPurchaseAmount <= creditCardMaximum) {
			userProvidedGoodAmount = true;
		}
		if(userProvidedValidName)
			if(userProvidedGoodCreditCard)
				if(userProvidedGoodAmount) {
					System.out.printf("You have sucessfully processed the payment in the amount of $%6.2f", creditCardPurchaseAmount);
					break;
				}
					System.out.println("You entered an invalid name or a credit card number or an amount. Please try again.\n\r\n\r");
			}
		}
			
	public static boolean isThisCreditCardValid(String ccNumber) {
		
		int sum = 0;
		boolean alternate = false;
		for(int i=ccNumber.length()-1; i>=0; i--) {
			int n = Integer.parseInt(ccNumber.substring(i, i+1));
			
			if(alternate) {
				n*= 2;
				if(n>9) {
					n = (n%10) + 1;
				}
			}
			sum +=n;
			alternate = !alternate;
		}
		return(sum % 10 == 0);
	}
	}			

			
			

