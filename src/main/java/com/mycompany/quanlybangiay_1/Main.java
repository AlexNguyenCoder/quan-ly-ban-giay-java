/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlybangiay_1;

import javax.swing.JFrame;

/**
 *
 * @author minhq
 */
public class Main {
	public static void main(String[] args) {
		// JFrame window = new JFrame();
		// window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// window.setResizable(false);
		// window.add(new Login());
		// window.pack();
		// window.setVisible(true);

		// Database db = new Database();
		// db.getConnection();
		Login login = new Login();
		login.setResizable(false);
		login.setLocationRelativeTo(null);
		login.setVisible(true);
	}
}
