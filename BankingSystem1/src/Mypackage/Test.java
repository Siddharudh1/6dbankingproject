package Mypackage;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2  = new Scanner(System.in);
		int ch =0;
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("press 1 to create customer Account");
			System.out.println("press 2 to Bank opearation to AddMoney , WithdrawMoney, CloseAccount");
			System.out.println("press 3 to ATM operation to ViewBalance,WithdrawBalance");
			System.out.println("Enter your choice");
			ch = sc1.nextInt();
			
			switch(ch) {
			case 1 :System.out.println("***Creating a customer account***");
					System.out.println("Enter the FirstName");
					String firstName = sc2.nextLine();
					System.out.println("Enter username");
					String username = sc2.nextLine();
					System.out.println("Enter lastname");
					String lastName = sc2.nextLine();
					System.out.println("Enter the Customer age");
					int age = sc1.nextInt();
					System.out.println("Enter the address");
					String address = sc2.nextLine();
					System.out.println("Enter mobile number");
					String mobileNumber = sc2.nextLine();
					System.out.println("Enter emialId");
					String eMailID = sc2.nextLine();
					System.out.println("Enter the date of birth");
					String dateofbirth = sc2.nextLine();
					
					AccountOperation.CreateCustomerAccount(firstName, username, lastName, age, address, mobileNumber, eMailID, dateofbirth);
					break;
			
			case 2 :
					int ch1 =0,flag1=0;
					while(flag1==0) {
					System.out.println("********BANK OPERATION**********");
					System.out.println("press 1 to Add money");
					System.out.println("press 2 to withdraw money");
					System.out.println("press 3 to close Account");
					System.out.println("press 4 to Goback");
					ch1 = sc1.nextInt();
					switch(ch1) {
				
					case 1 :
							System.out.println("Enter Username");
							String username1 = sc2.nextLine();
							System.out.println("Enter amount");
							double amount = sc1.nextDouble();
							AccountOperation.addMoney(username1, amount);
							
					break;
				
					case 2 :System.out.println("enter username");
							String username2 = sc2.nextLine();
							System.out.println("Enter tha amount to withdraw");
							double amount1 = sc1.nextDouble();
							if(username2.equals(username2))
								AccountOperation.withDrawMoney(username2, amount1);
							else System.out.println("Invalid username");
					break;
				 
					case 3 :System.out.println("Enter usename");
							String username11 = sc2.nextLine();
							System.out.println("Enter pin");
							long pin3 = sc1.nextLong();
							if(username11.equals(username11) || pin3 == pin3)
								AccountOperation.closeAccount(username11, pin3);
							else System.out.println("Invalid username or pin"); 
					break;
				
					case 4 :++flag1;
					break;
				
					default : System.out.println("INVALID INPUT");
					
				}
			}
			break;
			
			case 3 :
					int ch2 =0,flag=0;
					while(flag == 0) {
					System.out.println("***ATM OPERATION****");
					System.out.println("Enter 1 to view balance");
					System.out.println("Enter 2 to withdraw balance");
					System.out.println("Enter 3 to go back");
					ch2 = sc1.nextInt();
					
					switch(ch2) {
					case 1 :System.out.println("Enter Username");
							String username111 = sc2.nextLine();
							System.out.println("Enter pin");
							long pin = sc1.nextLong();
							if(username111.equals(username111) && pin == pin )
							AccountOperation.viewBalance(username111,pin);
							else System.out.println("USERNAME or PIN mismatch");
							
					break;
					
					case 2 :System.out.println("Enter Username");
							String username4 = sc2.nextLine();
							System.out.println("Enter pin");
							long pin2 = sc1.nextLong();
							System.out.println("Enter amount to withdraw");
							double amount2 = sc1.nextDouble();
							if(username4.equals(username4) && pin2 == pin2)
								AccountOperation.withdrawMoney(username4,pin2, amount2);
							else System.out.println("USERNAME or PIN mismatch");
							
					break;
					
					case 3:
							++flag;
					break;
					
					}
				}
			break;
			
			default:System.out.println("INVALID INPUT");
					
			}
		}
		
	}
}

