package intro;

import javax.swing.JFrame;

public class ObjectTest {

	public static void main(String[] args) {
		//För att skapa objekt:
		
		//klassnamn egetnamn = new Konstruktor;
		JFrame window = new JFrame();
		
		window.setVisible(true); //Göra synlig
		
		//testar OwnObject
		OwnObject p1 = new OwnObject("Gösta", true);
		OwnObject p2= new OwnObject("Lisa Nordth", false);
		
		p1.newYear();
		
		System.out.println(p1.getGrade() +" " +p2.getGrade());
		
	}

}
