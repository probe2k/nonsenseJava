/*
 * Code to demonstrate my power to do shit!
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JustBSing extends JFrame {
	
	// Constructor
	public JustBSing() {
		JButton button = new JButton("Click!");
		JPanel panel = new JPanel();
		add(panel);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				panel.removeAll();
				panel.updateUI();
				JButton button2 = new JButton("New Stuff!");
				JButton button3 = new JButton("Exit!");
				panel.add(button2);
				panel.add(button3);
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						panel.setBackground(Color.GREEN);
					}
				});
				button3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						System.exit(0);
					}
				});
			}
		});
	}
	
	// main() method
	public static void main(String[] args) {
		JFrame f = new JustBSing();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 300);
	}
}