
package mybankaccount;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Wallet {
    public double moneyAmount;
    private double debts;//fields
    
    public Wallet(double moneyAmount,double debts){
        this.moneyAmount = moneyAmount;
        this.debts = debts;
        //Constructor
    }

    /**
     * @return the moneyAmount
     */
    public double getMoneyAmount() {
        return moneyAmount;
    }

    /**
     * @param debts the debts to set
     */
    public void setDebts(double debts) {
        this.debts = debts;
        //Getters and Setters
    }
    
    public static void myWallet(double moneyAmount,double debts) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a money amount: ");
        moneyAmount = scan.nextDouble();
        System.out.println("Please enter a debt amount: ");
        debts = scan.nextDouble();//Giving input
        
        BufferedWriter myWriter = new BufferedWriter(new FileWriter("output.txt"));
        myWriter.write("Your money amount is" + "\t" + moneyAmount + "\n");
        myWriter.write("Your debt is" + "\t" + debts);
        myWriter.close();//Storing money and debt in a file
        
    }
    
}
