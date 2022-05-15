package Singleton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Child extends JFrame {

	private JPanel contentPane;
	private static Child child=null;
	private Child()
	{
		
	}
	public static Child getChild()
	{
		if(child==null)
			child=new Child();
		return child;
			
	}
	public void  Create() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("×Ó´°¿Ú");
		lblNewLabel.setBounds(177, 13, 171, 52);
		contentPane.add(lblNewLabel);
	}

}
