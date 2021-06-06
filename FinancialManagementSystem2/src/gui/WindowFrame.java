package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.FinancialManager;

public class WindowFrame extends JFrame {
	
	FinancialManager financialManager;
	MenuSelection menuselection;
	AccountAdder accountadder;
	AccountViewer accountviewer;

	public WindowFrame(FinancialManager financialManager) {
		this.financialManager = financialManager;
		this.menuselection = new MenuSelection(this);
		this.accountadder = new AccountAdder(this);
		this.accountviewer = new AccountViewer(this, this.financialManager);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AccountAdder getAccountadder() {
		return accountadder;
	}

	public void setAccountadder(AccountAdder accountadder) {
		this.accountadder = accountadder;
	}

	public AccountViewer getAccountviewer() {
		return accountviewer;
	}

	public void setAccountviewer(AccountViewer accountviewer) {
		this.accountviewer = accountviewer;
	}
}
