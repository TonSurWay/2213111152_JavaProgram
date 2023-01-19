import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setTitle("Calculate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber1.setBounds(45, 11, 145, 55);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(200, 18, 175, 45);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber2.setBounds(44, 77, 145, 55);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(200, 84, 175, 45);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResult.setBounds(398, 276, 89, 30);
		contentPane.add(lblResult);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOperator.setBounds(45, 143, 145, 55);
		contentPane.add(lblOperator);

		final JComboBox chOperator = new JComboBox();
		chOperator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chOperator.setBounds(200, 159, 85, 25);

		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");

		contentPane.add(chOperator);

		JLabel lblDigit = new JLabel("How to show Digit");
		lblDigit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDigit.setBounds(45, 191, 145, 55);
		contentPane.add(lblDigit);

		final JRadioButton OneDigit = new JRadioButton("1 Digit");
		OneDigit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OneDigit.setBounds(285, 200, 85, 25);
		contentPane.add(OneDigit);

		final JRadioButton TwoDigit = new JRadioButton("2 Digit");
		TwoDigit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TwoDigit.setBounds(285, 231, 85, 25);
		contentPane.add(TwoDigit);

		ButtonGroup group = new ButtonGroup();
		group.add(OneDigit);
		group.add(TwoDigit);

		JLabel lblOption = new JLabel("Option to show");
		lblOption.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOption.setBounds(45, 269, 145, 45);
		contentPane.add(lblOption);

		final JCheckBox chckDialog = new JCheckBox("Show Result at DialogBox");
		chckDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckDialog.setBounds(200, 282, 175, 25);
		contentPane.add(chckDialog);

		final JButton btnBotton = new JButton("Ok");
		btnBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				Object Operator;
				// JButton
				if (e.getSource() == btnBotton) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					Operator = chOperator.getSelectedItem();
					if (Operator.equals("+"))
						sum = num1 + num2;
					if (Operator.equals("-"))
						sum = num1 - num2;
					if (Operator.equals("*"))
						sum = num1 * num2;
					if (Operator.equals("/"))
						sum = num1 / num2;

					// JRadioBotton
					DecimalFormat frmNumber = null;
					if (OneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					if (TwoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}

					lblResult.setText(frmNumber.format(sum));

					// JCheckBox
					if (chckDialog.isSelected()) {
						JOptionPane.showMessageDialog(null, "Result is : " + frmNumber.format(sum));
					}
				}
			}
		});
		btnBotton.setBounds(113, 320, 100, 30);
		contentPane.add(btnBotton);

		JButton btnButton1 = new JButton("Exit");
		btnButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnButton1.setBounds(387, 320, 100, 30);
		contentPane.add(btnButton1);

	}
}
