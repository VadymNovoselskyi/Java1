package intro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

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
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Addition"); //lägger en titel på flnstret
		
		JLabel lblNewLabel = new JLabel("Term 1");
		lblNewLabel.setBounds(26, 11, 59, 24);
		contentPane.add(lblNewLabel);
		
		txtIn1 = new JTextField();
		txtIn1.setBounds(26, 36, 106, 30);
		contentPane.add(txtIn1);
		txtIn1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Term 2");
		lblNewLabel_1.setBounds(156, 11, 59, 24);
		contentPane.add(lblNewLabel_1);
		
		txtIn2 = new JTextField();
		txtIn2.setBounds(156, 36, 106, 30);
		contentPane.add(txtIn2);
		txtIn2.setColumns(10);
		
		JLabel lblTerm = new JLabel("Sum");
		lblTerm.setBounds(302, 11, 59, 24);
		contentPane.add(lblTerm);
		
		txtOut = new JTextField();
		txtOut.setBounds(302, 36, 106, 30);
		contentPane.add(txtOut);
		txtOut.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtTerm1 = txtIn1.getText(); //hämtar text från textrutan
				String txtTerm2 = txtIn2.getText();
				
				double term1 = Double.valueOf(txtTerm1); //omvandla till decemaler
				double term2 = Double.valueOf(txtTerm2);
				
				double sum = term1 + term2; //beräkningar
				String txtSum = Double.toString(sum);
				txtOut.setText(txtSum); //publicerar text i JTextField
			}
		});
		btnCalculate.setBounds(302, 96, 106, 30);
		contentPane.add(btnCalculate);
	}
}
