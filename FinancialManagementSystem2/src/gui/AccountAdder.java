package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.AccountAdderCancelListener;
import listener.AccountAdderListener;
import manager.FinancialManager;

public class AccountAdder extends JPanel {
	
	WindowFrame frame;
	
	FinancialManager financialManager;
	
	public AccountAdder(WindowFrame frame, FinancialManager financialManager) {
		this.frame = frame;
		this.financialManager =  financialManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelNumber = new JLabel("Number: ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AccountAdderListener(fieldID, fieldName, fieldNumber, financialManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AccountAdderCancelListener(frame));

		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		panel.add(saveButton);	
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		
		
	}

}
