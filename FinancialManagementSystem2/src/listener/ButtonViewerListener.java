package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.AccountViewer;
import gui.WindowFrame;
import manager.FinancialManager;

public class ButtonViewerListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewerListener(WindowFrame frame) {
		
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AccountViewer accountViewer = frame.getAccountviewer();
		FinancialManager financialManager = getObject("financialManager.ser");
		accountViewer.setFinancialManager(financialManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(accountViewer);
		frame.revalidate();
		frame.repaint();
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
}
