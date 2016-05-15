	/**
	 * Launch the view by typing **


	 	PassengerView window = new PassengerView();
		window.frame.setVisible(true);
					
	*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.SystemColor;

public class PassengerView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	// If there's only one passenger
	public PassengerView() {
		initialize(1);
	}
	
	// If there's more than one passengers
	public PassengerView(int nrOfThisPassenger) {
		initialize(nrOfThisPassenger);
	}

	// Initialize the contents of the frame.
	private void initialize(int nrOfThisPassenger) {
		
		// Frame
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Button for next
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Controller
			}
		});
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setBounds(278, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		// First name label && textfield
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(64, 105, 89, 14);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(222, 102, 145, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Last name label
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(64, 146, 89, 14);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 143, 145, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		// Gender label & combobox
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(64, 66, 89, 14);
		frame.getContentPane().add(lblGender);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(222, 64, 145, 18);
		frame.getContentPane().add(comboBox);
		
		// Text
		JLabel lblAddPassengerDetails = new JLabel("Add passenger details");
		lblAddPassengerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddPassengerDetails.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAddPassengerDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddPassengerDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAddPassengerDetails.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblAddPassengerDetails.setBounds(62, 11, 205, 23);
		frame.getContentPane().add(lblAddPassengerDetails);
		JLabel lblPassenger = new JLabel("Passenger Nr: " + nrOfThisPassenger);
		lblPassenger.setBounds(64, 30, 145, 14);
		frame.getContentPane().add(lblPassenger);
	}
}
