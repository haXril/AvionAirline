package com.nt.gui;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		
		welcomePage WelcomePanel;
		register register;
		
		try {
			WelcomePanel = new welcomePage();
			register = new register();
			
			WelcomePanel.setVisible(true);
			WelcomePanel.setLocationRelativeTo(null);
			Thread.sleep(2000);
			WelcomePanel.progressBar.setVisible(true);
		
			try {
				for (int i = 0; i <= 100; i += 4) {
			
				Thread.sleep(20);
				WelcomePanel.progressBar.setValue(i);
				WelcomePanel.lblNewLabel.setText(i + "%");
				}
				Thread.sleep(1000);
				WelcomePanel.setVisible(false);
				register.setVisible(true);
				register.setLocationRelativeTo(null);
			} catch (Exception e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
