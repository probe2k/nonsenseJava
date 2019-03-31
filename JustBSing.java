/*
 * Code to demonstrate my power to do shit!
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.awt.Color;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JustBSing {
	
	// Constructor
	public JustBSing() {
		JFrame frame = new JFrame("BS!");
		JButton button = new JButton("Click!");
		JPanel panel = new JPanel();
		frame.add(panel);
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}
	
	// main() method - Edit to use SwingUtilities
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					new JustBSing();
				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
	}
}