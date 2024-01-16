package upGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uppgift01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIn1;
	private JTextField txtIn2;
	private JTextField txtOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift01 frame = new Uppgift01();
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
	public Uppgift01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Term 1");
		lblNewLabel.setBounds(10, 11, 49, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Term 2");
		lblNewLabel_1.setBounds(124, 11, 49, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setBounds(260, 11, 49, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Choose operator");
		lblNewLabel_3.setBounds(10, 79, 146, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblErrorTarget = new JLabel("");
		lblErrorTarget.setBounds(366, 36, 280, 20);
		contentPane.add(lblErrorTarget);

		txtIn1 = new JTextField();
		txtIn1.setBounds(10, 36, 96, 20);
		contentPane.add(txtIn1);
		txtIn1.setColumns(10);

		txtIn2 = new JTextField();
		txtIn2.setBounds(124, 36, 96, 20);
		contentPane.add(txtIn2);
		txtIn2.setColumns(10);

		txtOut = new JTextField();
		txtOut.setBounds(260, 36, 96, 20);
		contentPane.add(txtOut);
		txtOut.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");

		btnCalculate.setBounds(260, 94, 89, 23);
		contentPane.add(btnCalculate);


		String[] operators = {"Sum", "Difference", "Multiplication", "Division"};

		JComboBox operatorChoice = new JComboBox(operators);	
		operatorChoice.setMaximumRowCount(6);
		operatorChoice.setToolTipText("Choose operator");
		operatorChoice.setBounds(10, 104, 96, 23);
		contentPane.add(operatorChoice);
		
		JLabel lblErrorMessage = new JLabel("");
		lblErrorMessage.setEnabled(false);
		lblErrorMessage.setBounds(366, 79, 253, 14);
		contentPane.add(lblErrorMessage);

		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtTerm1 = txtIn1.getText();
				String txtTerm2 = txtIn2.getText();

				double term1 = 0;
				double term2 = 0;

				try {
					term1 = Double.valueOf(txtTerm1);
					term2 = Double.valueOf(txtTerm2);
				} catch(NumberFormatException event) {
					
					lblErrorTarget.setText(event.getMessage());
					lblErrorMessage.setText("Enter value of term 1 and/or term 2. Check so the value is written with '.', and not ','");
					System.out.println("Enter value of term 1 and/or term 2. Check so the value is written with '.', and not ','");
				}

				double answer;
				String txtAnswer = "Error";

				String chosedOperator = (String) operatorChoice.getSelectedItem();

				if(chosedOperator.equals("Sum")) {
					answer = term1 + term2;
					txtAnswer = Double.toString(answer);
				}
				else if(chosedOperator.equals("Difference")) {
					answer = term1 - term2;
					txtAnswer = Double.toString(answer);
				}
				else if(chosedOperator.equals("Multiplication")) {
					answer = term1 * term2;
					txtAnswer = Double.toString(answer);
				}
				else if(chosedOperator.equals("Division")) {
					answer = term1 / term2;
					txtAnswer = Double.toString(answer);
				}

				txtOut.setText(txtAnswer);
			}
		});
	}
}
