import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInView extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblEnterEmailAnd;

	/**
	 * Create the frame.
	 */
	public LogInView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(SystemColor.textHighlight);
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent login)
			{}
		});
		btnLogin.setBounds(5, 233, 424, 23);
		contentPane.add(btnLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Enter Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(228, 108, 140, 72);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 23, 120, 38);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(0, 0, 120, 38);
		panel_2.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Enter Email", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(78, 108, 140, 72);
		contentPane.add(panel);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		textArea.setBounds(10, 23, 120, 38);
		panel.add(textArea);
		
		lblEnterEmailAnd = new JLabel("Enter Email and Password");
		lblEnterEmailAnd.setForeground(SystemColor.textHighlight);
		lblEnterEmailAnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterEmailAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterEmailAnd.setBounds(78, 61, 290, 36);
		contentPane.add(lblEnterEmailAnd);
		
		JLabel lblSchoaibAirwaysLlc = new JLabel("Schoaib Airways LLC");
		lblSchoaibAirwaysLlc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSchoaibAirwaysLlc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoaibAirwaysLlc.setBounds(45, 11, 354, 54);
		contentPane.add(lblSchoaibAirwaysLlc);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
