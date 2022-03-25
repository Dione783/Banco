import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Account;
import Exceptions.AccountExceptions;

public class Application {

	private static List<Account> users = new ArrayList<Account>();
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Account data:");
			Integer number = scan.nextInt();
			System.out.println("Holder:");
			String holder = scan.next();
			System.out.println("\nInitial Balance:");
			double balance = scan.nextDouble();
			System.out.println("withdrawLimit:");
			double withdrawLimit = scan.nextDouble();
			users.add(new Account(holder,number,balance,withdrawLimit));
			System.out.println("Enter the amount for widthdraw:");
			double withdraw = scan.nextDouble();
			for(int i=0;i < users.size();i++) {
				Account user = users.get(i);
				if(user.getHolder() == holder) {
					user.withdraw(withdraw);
				}
			}
		}catch(AccountExceptions e){
			System.out.println("Error in Account:" + e.getMessage());
		}
	}
	
}