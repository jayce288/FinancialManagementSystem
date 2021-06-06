package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import financial.AccountInput;
import manager.FinancialManager;

public class AccountViewer extends JPanel {
	
	WindowFrame frame;
	
	FinancialManager financialManager;

	public AccountViewer(WindowFrame frame, FinancialManager financialManager) {
		this.frame = frame;
		this.financialManager = financialManager;
		
		System.out.println("***" + financialManager.size() + "***");
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Account Number");
		
		for(int i = 0; i < financialManager.size(); i++) {
			Vector row = new Vector();
			AccountInput ai = financialManager.get(i);
			row.add(ai.getId());
			row.add(ai.getName());
			row.add(ai.getNumber());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
