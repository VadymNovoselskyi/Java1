package inlupp3;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Vadym3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInName;
	private JTextField txtInNumber;
	ArrayList<Person> personList = new ArrayList<>();

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
		load();

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
		lblNumber.setBounds(171, 27, 146, 17);
		contentPane.add(lblNumber);

		JLabel lblNewName = new JLabel("Enter new name");
		lblNewName.setBounds(20, 25, 108, 20);
		contentPane.add(lblNewName);
		lblNewName.setVisible(false);

		JLabel lblNewNumber = new JLabel("Enter new number");
		lblNewNumber.setBounds(149, 25, 146, 17);
		contentPane.add(lblNewNumber);
		lblNewNumber.setVisible(false);

		txtInName = new JTextField();
		txtInName.setBounds(20, 56, 96, 20);
		contentPane.add(txtInName);
		txtInName.setColumns(10);

		txtInNumber = new JTextField();
		txtInNumber.setBounds(171, 56, 96, 20);
		contentPane.add(txtInNumber);
		txtInNumber.setColumns(10);

		JTextField txtInNewName = new JTextField();
		txtInNewName.setBounds(20, 56, 96, 20);
		contentPane.add(txtInNewName);
		txtInNewName.setColumns(10);
		txtInNewName.setVisible(false);

		JTextField txtInNewNumber = new JTextField();
		txtInNewNumber.setBounds(149, 56, 96, 20);
		contentPane.add(txtInNewNumber);
		txtInNewNumber.setColumns(10);
		txtInNewNumber.setVisible(false);

		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(577, 108, 126, 23);
		contentPane.add(btnAdd);

		JButton btnShowAll = new JButton("Show all");
		btnShowAll.setBounds(577, 142, 126, 23);
		contentPane.add(btnShowAll);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(577, 108, 126, 23);
		contentPane.add(btnEdit);
		btnEdit.setVisible(false);

		JButton btnErase = new JButton("Erase");
		btnErase.setBounds(577, 142, 126, 23);
		contentPane.add(btnErase);
		btnErase.setVisible(false);

		JButton btnSearch = new JButton("Search number");
		btnSearch.setBounds(577, 178, 126, 23);
		contentPane.add(btnSearch);

		JButton btnProceed = new JButton("Proceed");
		btnProceed.setBounds(577, 178, 126, 23);
		contentPane.add(btnProceed);
		btnProceed.setVisible(false);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 107, 470, 304);
		contentPane.add(textArea);

		int[] searchedIndex = {-1};

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtName = txtInName.getText();
				String txtNumber = txtInNumber.getText();

				if(txtName.equals("") || txtNumber.equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill both name and number fields");
				}
				else {
					if(personList.size() != 0) {						
						for(int i = 0; i < personList.size(); i++) {
							if(txtNumber.equals(personList.get(i).getNumber())) {
								JOptionPane.showMessageDialog(null, "This number already exists in the phone book");
							}
							else if(i == personList.size() - 1) {							
								personList.add(new Person (txtName));
								personList.get(personList.size() - 1).setNumber(txtNumber);
								textArea.setText("Succesfully added " +txtName);
								break;
							}
						}
					}
					else {
						personList.add(new Person (txtName));
						personList.get(personList.size() - 1).setNumber(txtNumber);
						textArea.setText("Succesfully added " +txtName);	
					}
				}
				save();
			}
		});

		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNewName = txtInNewName.getText();
				String txtNewNumber = txtInNewNumber.getText();

				if(txtNewName.equals("") || txtNewNumber.equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill both name and number fields");
				}
				else {					
					textArea.setText("The searched person is: \r\nOld name: " +personList.get(searchedIndex[0]).getName() +"; Old number: " +personList.get(searchedIndex[0]).getNumber() +"");

					personList.get(searchedIndex[0]).setName(txtNewName);
					personList.get(searchedIndex[0]).setNumber(txtNewNumber);

					textArea.append("\n\rNew name is: " +personList.get(searchedIndex[0]).getName() +"; New number is: " +personList.get(searchedIndex[0]).getNumber());

					lblName.setVisible(true);
					lblNumber.setVisible(true);
					txtInName.setVisible(true);
					txtInNumber.setVisible(true);
					btnAdd.setVisible(true);
					btnShowAll.setVisible(true);
					btnSearch.setVisible(true);

					lblNewName.setVisible(false);
					lblNewNumber.setVisible(false);
					txtInNewName.setVisible(false);
					txtInNewNumber.setVisible(false);
					btnEdit.setVisible(false);
					btnErase.setVisible(false);
					btnProceed.setVisible(false);

					txtInName.setText("");
					txtInNumber.setText("");
				}
			}
		});

		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("The erased person is: \r\nName: " +personList.get(searchedIndex[0]).getName() +"; Number: " +personList.get(searchedIndex[0]).getNumber());
				personList.remove(searchedIndex[0]);

				lblName.setVisible(true);
				lblNumber.setVisible(true);
				txtInName.setVisible(true);
				txtInNumber.setVisible(true);
				btnAdd.setVisible(true);
				btnShowAll.setVisible(true);
				btnSearch.setVisible(true);

				lblNewName.setVisible(false);
				lblNewNumber.setVisible(false);
				txtInNewName.setVisible(false);
				txtInNewNumber.setVisible(false);
				btnEdit.setVisible(false);
				btnErase.setVisible(false);
				btnProceed.setVisible(false);

				txtInName.setText("");
				txtInNumber.setText("");
			}
		});

		btnShowAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				for(int i = 0; i < personList.size(); i++) {					
					textArea.append("Name: " +personList.get(i).getName() +"; Number: " +personList.get(i).getNumber() +"\r\n");
				}
			}
		});

		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Proceeded without changes");

				lblName.setVisible(true);
				lblNumber.setVisible(true);
				txtInName.setVisible(true);
				txtInNumber.setVisible(true);
				btnAdd.setVisible(true);
				btnShowAll.setVisible(true);
				btnSearch.setVisible(true);

				lblNewName.setVisible(false);
				lblNewNumber.setVisible(false);
				txtInNewName.setVisible(false);
				txtInNewNumber.setVisible(false);
				btnEdit.setVisible(false);
				btnErase.setVisible(false);
				btnProceed.setVisible(false);

				txtInName.setText("");
				txtInNumber.setText("");
			}
		});

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtName = txtInName.getText();

				searchedIndex[0] = -1;
				for(int i = 0; i < personList.size(); i++) {
					if(txtName.equals(personList.get(i).getName())) {
						searchedIndex[0] = i;
					}
				}
				if(searchedIndex[0] != -1) {					
					textArea.setText("The searched person is: \r\nName: " +personList.get(searchedIndex[0]).getName() +"; Number: " +personList.get(searchedIndex[0]).getNumber());

					lblName.setVisible(false);
					lblNumber.setVisible(false);
					txtInName.setVisible(false);
					txtInNumber.setVisible(false);
					btnAdd.setVisible(false);
					btnShowAll.setVisible(false);
					btnSearch.setVisible(false);

					lblNewName.setVisible(true);
					lblNewNumber.setVisible(true);
					txtInNewName.setVisible(true);
					txtInNewNumber.setVisible(true);
					btnEdit.setVisible(true);
					btnErase.setVisible(true);
					btnProceed.setVisible(true);

					txtInNewName.setText("");
					txtInNewNumber.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, "No person was found, try again");
				}

			}
		});

	}
	public void save() {
		try {
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("customer.txt"));
			oos.writeObject(personList);
			oos.flush();
			oos.close();
		}catch(Exception exeption) {
			exeption.printStackTrace();
		}
	}

	public void load() {
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.txt"));
			personList = (ArrayList)ois.readObject();
			ois.close();
		}catch(Exception exeption) {
			exeption.printStackTrace();
		}
	}
}

