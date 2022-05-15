package Singleton;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main extends JFrame {
	private JPanel Pane;

	public static void main(String[] args) {
					Main frame = new Main();
					frame.Create();
					frame.setVisible(true);
					
	}
	public  void Create() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 374);
		Pane = new JPanel();
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);
		
		JLabel Label = new JLabel("主窗口");
		Label.setBounds(297, 13, 107, 43);
		Pane.add(Label);
		
		JButton Button = new JButton("建立子窗口");
		Button.setBounds(267, 239, 113, 27);
		Pane.add(Button);
		Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Child child=Child.getChild();
				child.Create();
				child.setVisible(true);
			}
		});
	}
}
