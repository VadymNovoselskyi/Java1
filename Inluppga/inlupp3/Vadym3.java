package inlupp3;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bank.Account;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Vadym3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInName;
	private JTextField txtInNumber;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vadym3 frame = new Vadym3();
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
	public Vadym3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 25, 77, 20);
		contentPane.add(lblName);

		JLabel lblNumber = new JLabel("Telephone number");
		lblNumber.setBounds(149, 25, 146, 17);
		contentPane.add(lblNumber);

		txtInName = new JTextField();
		txtInName.setBounds(20, 56, 96, 20);
		contentPane.add(txtInName);
		txtInName.setColumns(10);

		txtInNumber = new JTextField();
		txtInNumber.setBounds(149, 56, 96, 20);
		contentPane.add(txtInNumber);
		txtInNumber.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(577, 108, 126, 23);
		contentPane.add(btnAdd);

/*		JButton btnErase = new JButton("Erase");
		btnErase.setBounds(577, 107, 126, 23);
		contentPane.add(btnErase);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(577, 152, 126, 23);
		contentPane.add(btnEdit); */

		JButton btnShowAll = new JButton("Show all");
		btnShowAll.setBounds(577, 142, 126, 23);
		contentPane.add(btnShowAll);

		JButton btnSearch = new JButton("Search number");

		btnSearch.setBounds(577, 178, 126, 23);
		contentPane.add(btnSearch);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 107, 470, 304);
		contentPane.add(textArea);
		
		ArrayList<Person> personList = new ArrayList<>();

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtName = txtInName.getText();
				String txtNumber = txtInNumber.getText();

				int currentIndex = personList.size();
				personList.add(new Person (txtName));
				personList.get(currentIndex).setNumber(txtNumber);
			}
		});

/*		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String txtName = txtInName.getText();
				
				int searchedIndex = -1;
				for(int i = 0; i < personList.size(); i++) {
					if(txtName.equals(personList.get(i).getName())) {
						searchedIndex = i;
					}
				}
				
				personList.remove(searchedIndex);
				textArea.setText(txtName +" is now removed from data");
			}
		});
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String txtName = txtInName.getText();
				
				int searchedIndex = -1;
				for(int i = 0; i < personList.size(); i++) {
					if(txtName.equals(personList.get(i).getName())) {
						searchedIndex = i;
					}
				}
				String replacementName = JOptionPane.showInputDialog("Enter name you want to change the name to");
				
				personList.get(searchedIndex).setName(replacementName);
			}
		}); */
		
		btnShowAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				for(int i = 0; i < personList.size(); i++) {					
					textArea.append("Name: " +personList.get(i).getName() +"; Number: " +personList.get(i).getNumber() +"\r\n");
				}
			}
		});

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtName = txtInName.getText();

				int searchedIndex = -1;
				for(int i = 0; i < personList.size(); i++) {
					if(txtName.equals(personList.get(i).getName())) {
						searchedIndex = i;
					}
				}
				textArea.setText("");
				textArea.append("Name: " +personList.get(searchedIndex).getName() +"; Number: " +personList.get(searchedIndex).getNumber());
				
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

				setContentPane(contentPane);
				contentPane.setLayout(null);
			}
		});

	}
}
