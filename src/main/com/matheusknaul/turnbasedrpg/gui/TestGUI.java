package main.com.matheusknaul.turnbasedrpg.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TestGUI {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() ->{
			JFrame mainFrame = new JFrame("Game Engine");
			mainFrame.setSize(800, 600);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainFrame.setLayout(new FlowLayout());
			
			JButton createEnemyButton = new JButton("Criar inimigo");
			createEnemyButton.addActionListener(e-> EnemyGUI.showEnemyGUI());
			
			JButton createItemButton = new JButton("Criar item");
			createItemButton.addActionListener(e-> ItemGUI.showItemGUI());
			
			mainFrame.add(createEnemyButton);
			mainFrame.add(createItemButton);
			mainFrame.setVisible(true);
		});
	}
}
