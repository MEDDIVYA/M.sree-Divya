package p1;
import java.util.Random;
import java.util.Scanner;

public class MainApplication {
	
	Account allAccount[]=new Account[5000];
	int noOfAccount=0;
	
	Scanner sc=new Scanner(System.in);
			Scanner sc1=new Scanner(System.in);
			
			public static void main(String[] args) {
				MainApplication app=new MainApplication();
				
				while(true) {
					System.out.println("----------------------------");
					System.out.println("----------------------------");
					System.out.println("1. TO Add Bank Account:");
					System.out.println("2. View All Account Details:");
					System.out.println("3. Deposit Amount:");
					System.out.println("4. View All Account Details");
					System.out.println("5. View All KYCDocument Details:");
					System.out.println("6. Check Balance:");
					System.out.println("7. Change Mobile Number:");
					System.out.println("8. Change emailID:");
					System.out.println("0.Exit");
					
					System.out.println("Enter ur choice:");
					
					switch(app.sc1.nextInt()) {
					
					case 1:
						app.submitUserDetails();
						break;
					case 2:
						app.printUserAllDetails();
						break;
					case 3:
						app.doDepositOperation();
						break;
					case 4:
						app.printUserContactDetails();
						break;
					case 5:
						app. printUserKYCDocumentDetails();
						break;
					case 6:
						app.printBalance();
						break;
					case 7:
						app.changemobileNumber();
						break;
					case 8:
						app.changeemailID();
						break;
						
						default:
							System.out.println("Exit");
							System.exit(0);
					}//End of switch
				}
			}
			private void submitUserDetails() {
				Scanner sc=new Scanner(System.in);
				Scanner sc1=new Scanner(System.in);
				
				
				System.out.print("2. Enter Your Account Number:");
				long accountNumber=sc1.nextInt();
				
				//account
				
				System.out.print("Enter Your Name:"); 
				String userName=sc.nextLine();
				
				System.out.print("3. Enter Your password:");
				String password=sc.nextLine();
				
				System.out.print("4. Enter Your Balance:");
				int balance=sc1.nextInt();
				System.out.print("5.Enter Your cashback:");
				String cashback=sc.nextLine();
				
				//contact Details
				
				System.out.print("6. Enter Your House Number:");
				int houseNumber=sc1.nextInt();
				
				System.out.print("7. Enter Your City Name:");
				String cityName=sc.nextLine();
				
				System.out.print("8. Enter Your State Name:");
				String stateName=sc.nextLine();
				
				System.out.print("9. Enter Your Country Name:");
				String countryName=sc.nextLine();
				
				System.out.print("10.Enter Your pin Code:");
				int pinCode=sc1.nextInt();
				
				System.out.print("11. Enter Your emailID:");
				String emailID=sc.nextLine();
				
				System.out.print("12. Enter Your Mobile Number");
				long mobileNumber=sc.nextInt();
				
				//KYC
				
				System.out.print("13. Enter Your Pan Number:");
				String panNumber=sc.nextLine();
				System.out.print("14. Enter Your Aadhar Number:");
				long aadharNumber=sc1.nextInt();
				System.out.print("15. Enter Your Document Type:");
				String documentType=sc.nextLine();
				
				System.out.print("===>To add More Account Press'1' otherwise press '0'/n";
				
				// allAccount[noOfAccount++]=new Account(userName,accountNumber,password,balance,cashback);
				KycVerification KYC=new
			KycVerification(panNumber.aadharNumber,documentType);
				ContactDetails cd=new
		    ContactDetails(houseNumber,cityName,stateName,countryName,pinCode,emailID,mobileNumber);
				
				Account ac=new Account(int)
						accountNumber,userName,password,balance,cashback);
				ac.setCd(cd);
				ac.setKyc(KYC);
				ac.setAccountNumber(accountNumber);
				ac.setBalance(balance);
				ac.setUserName(userName);
				ac.getCashback();
				ac.setPassword(password);
				
				
				allAccount[noOfAccount++]=ac;
				System.out.println(""+ac);
				System.out.println("Added in the List");
				System.out.println("To add anotherStudent Record Press 1 otherwise press 6");
			}
			public Account getAllDetail(long searchAcNumber)
			{
				for(long i=0;i<nOfAccount;i++)
				{
					Account ac=allAcount[(int)i];
					
					boolean isFound=(ac.getAccountNumber()==searchAcNumber)?true:false;
					
					if(isFound)
					{
						return ac;
					}
				}
				return null;
			}
			
			
			private void printUserDetails() {
				
				System.out.print("Enter Searched Account Number");
				long searchAcNumber=sc.nextInt();
				
				Account ac=getAllDetail(searchAccnumber);
				System.out.println("--------------------------------------");
				System.out.println(ac);
				System.out.println("--------------------------------------");
			}
			
			private void changeemailID() {
				System.out.println("Enter the Account Number");
				long accNo=sc1.nextInt();
				
				Account ac=getAllDetail(accNo);
				System.out.println("----Enter new email id----");
				String eID=sc.nextLine();
				
				ac.getCd().setemailID(eID);
				System.out.print("----------------------------------------");
				System.out.println("--->>Succesful..!:");
				System.out.println("Your new email ID-"+ac.getCd().getemailID());
				
				System.out.println("-------------------------------------");
			}
			
			
			private void printBalance() {
				System.out.println("Enter Account Number");
				long accNo=sc1.nextInt();
				
				Account ac=getAllDetail(accNo);
				System.out.print(ac.getCd());
				
			}
			
			private void doDepositOperation() {
				
				System.out.print("Enter Account Number");
				long accNo=sc1.nextInt();
				
				Account ac=getAllDetail(accNo);
				
				System.out.print("Enter the Amount:");
				int AmountDeposit=sc.nextInt();
				
				ac.setBalance(ac.getBalance()+AmountDeposit);
				
				System.out.println("--------------------------");
				System.out.print("Money has been deposited.Current Balance:"+ac.getBalance()+"\n");
				System.out.print("--------------------------------------");
			}
			
			private void displayAllAcc(Account ac) {
				System.out.println("---------------------------------------");
				System.out.println("\n"+ac.getUserName()+"\t");
				System.out.println(ac.getAccountNumber()+"\t");
				System.out.println(ac.getBalance()+"\t");
				System.out.println(ac.getPassword()+"\t");
				System.out.println("\n-------------------------------------");
				//TODO Auto-generated method stub
			}
			
}
				
				
				
			
				
				
					
				
				
				
			
				
				
				
				
				
						
						
						
						
					
			
	


