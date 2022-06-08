package framedemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JLabel lblNewLabel = new JLabel("Vehicle");
		lblNewLabel.setBounds(46, 59, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Plan");
		lblNewLabel_1.setBounds(46, 101, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(170, 56, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Daily", "Weekly", "Monthly", "Yearly"}));
		comboBox.setToolTipText("sbsvsvs");
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(180, 87, 54, 22);
		contentPane.add(comboBox);
		
		JComboBox type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"2 - Wheelers", "4 - Wheelers", "6 - Wheelers"}));
		type.setBounds(190, 131, 66, 22);
		contentPane.add(type);
		
		JLabel lblNewLabel_2 = new JLabel("V\u200Eehicle type");
		lblNewLabel_2.setBounds(34, 135, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnTollPlazaMesra = new JTextPane();
		txtpnTollPlazaMesra.setText("Toll Plaza Mesra");
		txtpnTollPlazaMesra.setBounds(162, 11, 94, 20);
		contentPane.add(txtpnTollPlazaMesra);
		
		JButton btnNewButton = new JButton("Calcu*late*");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(62, 172, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 173, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(134, 215, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
