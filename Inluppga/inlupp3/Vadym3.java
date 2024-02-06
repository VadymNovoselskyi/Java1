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
		load(); //läser in sparat data

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name"); //Name label
		lblName.setBounds(20, 25, 77, 20);
		contentPane.add(lblName);

		JLabel lblNumber = new JLabel("Telephone number"); //Telephone number label
		lblNumber.setBounds(171, 27, 146, 17);
		contentPane.add(lblNumber);

		JLabel lblNewName = new JLabel("Enter new name"); //New name label
		lblNewName.setBounds(20, 25, 108, 20);
		contentPane.add(lblNewName);
		lblNewName.setVisible(false);

		JLabel lblNewNumber = new JLabel("Enter new number"); //New number label
		lblNewNumber.setBounds(149, 25, 146, 17);
		contentPane.add(lblNewNumber);
		lblNewNumber.setVisible(false);

		txtInName = new JTextField(); //Inmatning av namn
		txtInName.setBounds(20, 56, 96, 20);
		contentPane.add(txtInName);
		txtInName.setColumns(10);

		txtInNumber = new JTextField(); //inmatning av nummer
		txtInNumber.setBounds(171, 56, 96, 20);
		contentPane.add(txtInNumber);
		txtInNumber.setColumns(10);

		JTextField txtInNewName = new JTextField(); //inmatning av nytt namn
		txtInNewName.setBounds(20, 56, 96, 20);
		contentPane.add(txtInNewName);
		txtInNewName.setColumns(10);
		txtInNewName.setVisible(false);

		JTextField txtInNewNumber = new JTextField(); //inmatning av nytt nummer
		txtInNewNumber.setBounds(149, 56, 96, 20);
		contentPane.add(txtInNewNumber);
		txtInNewNumber.setColumns(10);
		txtInNewNumber.setVisible(false);

		JButton btnAdd = new JButton("Add"); //button att lägga till personen
		btnAdd.setBounds(577, 108, 126, 23);
		contentPane.add(btnAdd);

		JButton btnShowAll = new JButton("Show all"); //button som visa ralla personers data
		btnShowAll.setBounds(577, 142, 126, 23);
		contentPane.add(btnShowAll);

		JButton btnEdit = new JButton("Edit"); //button som ändrar personens upppgifter
		btnEdit.setBounds(577, 108, 126, 23);
		contentPane.add(btnEdit);
		btnEdit.setVisible(false);

		JButton btnErase = new JButton("Erase"); //button som raderar personens data
		btnErase.setBounds(577, 142, 126, 23);
		contentPane.add(btnErase);
		btnErase.setVisible(false);

		JButton btnSearch = new JButton("Search number"); //button som leter efter personen efter dess namn
		btnSearch.setBounds(577, 178, 126, 23);
		contentPane.add(btnSearch);

		JButton btnProceed = new JButton("Proceed"); //button som tar användaren tillbaka till add-show all pane
		btnProceed.setBounds(577, 178, 126, 23);
		contentPane.add(btnProceed);
		btnProceed.setVisible(false);

		JTextArea textArea = new JTextArea(); //text area där allt data visas
		textArea.setBounds(24, 107, 470, 304);
		contentPane.add(textArea);

		int[] searchedIndex = {-1}; //index som föst letas och sen sparas när man trycker på search number

		btnAdd.addActionListener(new ActionListener() { //action listener till 'Add' button
			public void actionPerformed(ActionEvent e) {
				String txtName = txtInName.getText(); //extradera namn från textField
				String txtNumber = txtInNumber.getText(); //extradera nummer från textField

				if(txtName.equals("") || txtNumber.equals("")) { //om något av textFields ät tumm
					JOptionPane.showMessageDialog(null, "Please fill both name and number fields"); //visar popup dialog
				}
				else { //om både textFields är fyllda
					if(personList.size() != 0) { //personList är inte tumm
						for(int i = 0; i < personList.size(); i++) { //for loop som går genom alla personer
							if(txtNumber.equals(personList.get(i).getNumber()) || txtName.equals(personList.get(i).getName())) { //om det redan finns person men nummer man försöker att mätta in
								JOptionPane.showMessageDialog(null, "This name/number already exists in the phone book");//visar popup dialog
							}
							else if(i == personList.size() - 1) { //om namnet man mätter in finns inte redan, och for looper är på sista indexen						
								personList.add(new Person (txtName)); //skapar person i personList
								personList.get(personList.size() - 1).setNumber(txtNumber); //lägger till nummer
								textArea.setText("Succesfully added " +txtName); //Succes messsage i tetArea
								break; //breakar föregående if-blocken, så att det visar inte fel meddelande i onödan
							}
						}
					}
					else { //om det finns inga inmättningar
						personList.add(new Person (txtName)); //skapar person i personList
						personList.get(personList.size() - 1).setNumber(txtNumber); //lägger till nummer
						textArea.setText("Succesfully added " +txtName); //Succes messsage i tetArea
					}
				}
				save(); //sparar personer i external fil
			}
		});

		btnEdit.addActionListener(new ActionListener() { //action listener till 'Edit' button
			public void actionPerformed(ActionEvent e) {
				String txtNewName = txtInNewName.getText(); //extradera new namn från textField
				String txtNewNumber = txtInNewNumber.getText(); //extradera new number från textField

				if(txtNewName.equals("") || txtNewNumber.equals("")) { //om något av textFields ät tumm
					JOptionPane.showMessageDialog(null, "Please fill both name and number fields"); //visar popup dialog
				}
				else {	//om både textFields är fyllda
					//Utmattar personuppgifter av sökte person
					textArea.setText("The searched person is: \r\nOld name: " +personList.get(searchedIndex[0]).getName() +"; Old number: " +personList.get(searchedIndex[0]).getNumber() +"");

					//uppdaterar personuppgifter
					personList.get(searchedIndex[0]).setName(txtNewName);
					personList.get(searchedIndex[0]).setNumber(txtNewNumber);

					//Utmattar nya personuppgifter
					textArea.append("\n\rNew name is: " +personList.get(searchedIndex[0]).getName() +"; New number is: " +personList.get(searchedIndex[0]).getNumber());

					//skiftar till huvud-contentPane
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

					//nollställer tetx i textFields
					txtInName.setText("");
					txtInNumber.setText("");
				}
			}
		});

		btnErase.addActionListener(new ActionListener() { //action listener till 'Erase' button
			public void actionPerformed(ActionEvent e) {
				//Utmattar raderade personuppgifter
				textArea.setText("The erased person is: \r\nName: " +personList.get(searchedIndex[0]).getName() +"; Number: " +personList.get(searchedIndex[0]).getNumber());
				personList.remove(searchedIndex[0]); //raderar personen

				//skiftar till huvud-contentPane
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

				//nollställer tetx i textFields
				txtInName.setText("");
				txtInNumber.setText("");
			}
		});

		btnShowAll.addActionListener(new ActionListener() { //action listener till 'Erase' button
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""); //nollställer textArea
				for(int i = 0; i < personList.size(); i++) { //for satsen som går genom alla personer i personList				
					textArea.append("Name: " +personList.get(i).getName() +"; Number: " +personList.get(i).getNumber() +"\r\n"); //utmattar personuppgifter på sepat rad
				}
			}
		});

		btnProceed.addActionListener(new ActionListener() { //action listener till 'Erase' button
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Proceeded without changes"); //sätter text i TextArea

				//skiftar till huvud-contentPane
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

				//nollställer tetx i textFields
				txtInName.setText("");
				txtInNumber.setText("");
			}
		});

		btnSearch.addActionListener(new ActionListener() { //action listener till 'Search' button
			public void actionPerformed(ActionEvent e) {
				String txtName = txtInName.getText(); //extradera new namn från textField

				searchedIndex[0] = -1; //nollställer searchedIndex om det ändrades innan
				for(int i = 0; i < personList.size(); i++) { //går genom hela personList
					if(txtName.equals(personList.get(i).getName())) { //om sökt namn förekommer i personList
						searchedIndex[0] = i; //sparar index
					}
				}
				if(searchedIndex[0] != -1) { //om for-loopen hittar egtersökte namn:
					//utmattar eftersökte uppgifter
					textArea.setText("The searched person is: \r\nName: " +personList.get(searchedIndex[0]).getName() +"; Number: " +personList.get(searchedIndex[0]).getNumber());

					//skiftar till sökte person-contentPane
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

					//nollställer tetx i textFields
					txtInNewName.setText("");
					txtInNewNumber.setText("");
				}
				else { //om for-looper hittar egtersökte namn:
					JOptionPane.showMessageDialog(null, "No person found, try again"); //visar popup dialog
				}	
			}
		});

	}
	public void save() { //sparar personList till customer.txt
		try {
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("customer.txt"));
			oos.writeObject(personList);
			oos.flush();
			oos.close();
		}catch(Exception exeption) {
			exeption.printStackTrace();
		}
	}

	public void load() { //laddar ner personList från customer.txt
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.txt"));
			personList = (ArrayList)ois.readObject();
			ois.close();
		}catch(Exception exeption) {
			exeption.printStackTrace();
		}
	}
}

