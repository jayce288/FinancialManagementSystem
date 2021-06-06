package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = getObject("financialManager.ser");
		if (financialManager == null) {
			financialManager = new FinancialManager(input);
		}
		else {
			financialManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(financialManager);
		selectMenu(input, financialManager);
		putObject(financialManager, "financialManager.ser");
	}
	
	public static void selectMenu(Scanner input, FinancialManager financialManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					financialManager.addAccount();
					logger.log("add an account");
					break;
				case 2:
					financialManager.deleteAccount();
					logger.log("delete an account");
					break;
				case 3:
					financialManager.editAccount();
					logger.log("edit an account");
					break;
				case 4:
					financialManager.viewAccounts();
					logger.log("edit an list of account");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 to 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Financial Management System Menu***");
		System.out.println("1.Add Account");
		System.out.println("2.Delete Account");
		System.out.println("3.Edit Account");
		System.out.println("4.View Account");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5 :");
	}
	
	public static FinancialManager getObject(String filename) {
		FinancialManager financialManager = null; 
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			financialManager = (FinancialManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return financialManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return financialManager;
		
	}
	
	public static void putObject(FinancialManager financialManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(financialManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
