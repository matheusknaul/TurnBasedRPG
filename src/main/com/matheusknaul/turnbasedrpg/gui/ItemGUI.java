package main.com.matheusknaul.turnbasedrpg.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.com.matheusknaul.turnbasedrpg.itens.Item;

public class ItemGUI extends JFrame{
	private Item item;
	
	public ItemGUI(){
		setTitle("Configuração de Item");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridLayout(3,2));
		
		panel.add(new JLabel("Id:"));
		JTextField idField = new JTextField();
		panel.add(idField);
		
		panel.add(new JLabel("Nome:"));
		JTextField nameField = new JTextField();
		panel.add(nameField);
		
		panel.add(new JLabel("Nível necessário:"));
		JTextField requiredLevelField = new JTextField();
		panel.add(requiredLevelField);
		
		JButton saveButton = new JButton("Salvar");
		
		saveButton.addActionListener(null);
		
		add(panel, BorderLayout.CENTER);
		add(saveButton, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void showItemGUI() {
		new ItemGUI();
	}
}
