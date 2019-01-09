import java.net.InetAddress;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

public class CheckIP {

	JLabel label;
	JTextField tf;

	public CheckIP() {
		JFrame frame = new JFrame("FindMyIP");
		JButton button = new JButton("Find IP");
		frame.setLayout(new FlowLayout());
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					String s = tf.getText();
					InetAddress ip = InetAddress.getByName(new URL(s).getHost());
					label.setText("IP is " + ip);
				} catch (UnknownHostException exc) {
					label.setText("Wrong URL!");
				} catch (MalformedURLException e) {
					label.setText("Wrong URL!");
				}
			}
		});
		label = new JLabel("Enter the URL : ");
		tf = new JTextField(15);
		frame.add(label);
		frame.add(tf);
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
	}

	public static void main(String[] args) {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					new CheckIP();
				}
			});
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}