package p1;

public class Account {
	private long accountNumber;
	private String userName;
	private String password;
	private int balance;
	private int cashback;
	private ContactDetails cd;
	private  kycVerification Kyc;
	private int deposite(int amount) {
		return 0;
	}
	private int withdraw(int amount) {
		return 0;
	}
	public Account(long accountNumber,String userName,String password,int balance,int cashback,ContactDetails cd,KycVerification kyc) {
		super();
		this.accountNumber = accountNumber;
		this.userName=userName;
		this.password=password;
		this.balance=balance;
		this.cashback=cashback;
		this.cd=cd;
		this.Kyc=kyc;
	}
	public Account() {
		super();
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public int getBalance() {
		return balance=balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getCashback() {
		return cashback;
	}
	public void setCashback(int cashback) {
		this.cashback=cashback;
	}
	public ContactDetails getCd() {
		return cd;
	}
	public void setCd(ContactDetails cd) {
		this.cd=cd;
	}
	public KycVerification getKyc() {
		return Kyc;
	}
	public void setKyc(KycVerification Kyc) {
		this.Kyc=Kyc;
	}
	
	}
	
	


