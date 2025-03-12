package main.com.matheusknaul.turnbasedrpg.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.com.matheusknaul.turnbasedrpg.domain.Enemy;
import main.com.matheusknaul.turnbasedrpg.roles.EntityClass;

public class EnemyGUI extends JFrame{
	private Enemy enemy;
	
	public EnemyGUI() {
		setTitle("Configuração de Enemy");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridLayout(3,2));
		
		panel.add(new JLabel("Id:"));
		JTextField idField = new JTextField();
		panel.add(idField);
		
		panel.add(new JLabel("Nome:"));
		JTextField nameField = new JTextField();
		panel.add(nameField);
		
		panel.add(new JLabel("Classe:"));
		JTextField classField = new JTextField();
		panel.add(classField);
		
		JButton saveButton = new JButton("Salvar");
		
		String enemyClass = classField.getText();
		EntityClass entityClass = new EntityClass(enemyClass);
		
		saveButton.addActionListener(e->{
			Enemy enemy = new Enemy(Integer.valueOf(idField.getText()),nameField.getText(),entityClass);
			this.setEnemy(enemy);
		});
		
		add(panel, BorderLayout.CENTER);
		add(saveButton, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void showEnemyGUI() {
		new EnemyGUI();
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	
	
}
