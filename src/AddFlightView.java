import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AddFlightView extends JFrame {

	private JPanel contentPane;
	private JLabel lblAddFlight;
	private JLabel label;
	private JLabel label_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_2;
	private JTextField textField_2;
	private JLabel label_3;
	private JTextField textField_3;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFlightView frame = new AddFlightView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddFlightView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAddFlight = new JLabel("ADD FLIGHT");
		lblAddFlight.setForeground(SystemColor.textHighlight);
		lblAddFlight.setBackground(SystemColor.textHighlight);
		lblAddFlight.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddFlight.setBounds(112, 0, 133, 57);
		contentPane.add(lblAddFlight);
		
		label = new JLabel("FROM");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBackground(SystemColor.textHighlight);
		label.setBounds(31, 25, 133, 57);
		contentPane.add(label);
		
		label_1 = new JLabel("TO");
		label_1.setForeground(SystemColor.textHighlight);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBackground(SystemColor.textHighlight);
		label_1.setBounds(31, 70, 133, 57);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(31, 68, 292, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(31, 115, 292, 20);
		contentPane.add(textField_1);
		
		label_2 = new JLabel("DATE");
		label_2.setForeground(SystemColor.textHighlight);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBackground(SystemColor.textHighlight);
		label_2.setBounds(31, 138, 133, 20);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 169, 94, 20);
		contentPane.add(textField_2);
		
		label_3 = new JLabel("Number of Tickets");
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBackground(SystemColor.textHighlight);
		label_3.setBounds(174, 138, 133, 20);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 169, 94, 20);
		contentPane.add(textField_3);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(31, 210, 292, 40);
		contentPane.add(btnNewButton);
	}
}
