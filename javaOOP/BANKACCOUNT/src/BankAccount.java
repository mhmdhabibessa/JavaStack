import java.util.Random;

public class  BankAccount {
    private String accountNumbers ; 
    private double checkingbalance ;
    private double savingbalane;
    private static int account = 0 ; 
    private static double totalamount;

public BankAccount() {
        this.account += 1 ; 
        this.totalamount += savingbalane+checkingbalance ; 
        this.accountNumbers = randomNumb();
}

//setter 



//Getter

private String randomNumb(){
    Random r = new Random();
    String accountNum = new String();
    for (int i=0 ; i<10 ; i++){
        accountNum+= r.nextInt();
    }
}



public double getCheckingbalance() {
	return checkingbalance;
}

public void setCheckingbalance(double checkingbalance) {
	this.checkingbalance = checkingbalance;
}

public double getSavingbalane() {
	return savingbalane;
}

public void setSavingbalane(double savingbalane) {
	this.savingbalane = savingbalane;
}

public double getcheckingbalnce(){
    return this.checkingbalance;
}
public double getsavingbalance(){
    return this.savingbalane;

}



public void desposit(double amount) {
	  double newBalance = checkingbalance + amount;
	  checkingbalance = newBalance;	
	  double newsaving = savingbalane + amount;
	  savingbalane =  newsaving ;
	  
	
}
public void withdraw(double insufficient,double amount) {
	if(checkingbalance>insufficient) {
		double newBalance = checkingbalance - amount;
		checkingbalance = newBalance;	
	}
}
public double see_value() {
	return checkingbalance ; 
}

}




    
    
}