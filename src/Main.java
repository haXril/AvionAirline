package com.nt.gui;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		welcomePage welcome;
		register Register;
		
		try {
			welcome = new welcomePage();
			Register = new register();
			
			welcome.setVisible(true);
			welcome.setLocationRelativeTo(null);
			Thread.sleep(2000);
			welcome.progressBar.setVisible(true);
		
			try {
				for (int i = 0; i <= 100; i += 4) {
			
				Thread.sleep(20);
				welcome.progressBar.setValue(i);
				welcome.lblNewLabel.setText( i + "%");
				}
				Thread.sleep(1000);
				welcome.setVisible(false);
				Register.setVisible(true);
				Register.setLocationRelativeTo(null);
			} catch (Exception e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
