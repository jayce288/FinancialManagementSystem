package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exceptions.AccountNumberFormatException;
import financial.AccountInput;
import financial.FinancialKind;
import financial.IBK기업은행;
import manager.FinancialManager;

public class AccountAdderListener implements ActionListener {
	FinancialManager financialManager;
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldNumber;
	
	public AccountAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldNumber, FinancialManager financialManager) {
		this.financialManager =  financialManager;
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldNumber = fieldNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		AccountInput account = new IBK기업은행(FinancialKind.IBK기업은행);

		try {
			account.setId(Integer.parseInt(fieldID.getText()));
			account.setName(fieldName.getText());
			account.setNumber(fieldNumber.getText());
			financialManager.addAccount(account);
			putObject(financialManager, "financialManager.ser");
			account.printinfo();
		} catch (AccountNumberFormatException e1) {
			e1.printStackTrace();
		}
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
