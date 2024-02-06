/**
 * GameUpdate
 * Klassen uppdaterar spelfigurernas läge
 * De olika metoderna anropas då en specifik tangent trycks ner.
 * 
 * Skriv koden för att få interaktivitet i spelet
 * 
 * @author Henrik Bygren
 * @since  2016-05-10
 * @see    GameUpdate
 *
 */
public class GameUpdate {
	// Koordinater för spelfigurerna
	int greenX = 900, greenY = 200;
	int greyX = 12, greyY = 200;
	
	/**
	 * Anropas då vänster piltangent trycks ner
	 */
	public void leftKey(){
		if(greenX > 8) {			
			greenX -= 8;
		}
	}
	
	/**
	 * Anropas då höger piltangent trycks ner
	 */
	public void rightKey(){
		if(greenX < 896) {			
			greenX += 8;
		}
	}
	
	/**
	 * Anropas då upp piltangent trycks ner
	 */
	public void upKey(){
		if(greenY > 8) {			
			greenY -= 8;
		}
	}
	
	/**
	 * Anropas då ner piltangent trycks ner
	 */
	public void downKey(){
		if(greenY < 600) {			
			greenY += 8;
		}
	}
	
	/**
	 * Anropas då A tangenten trycks ner
	 */
	public void aKey(){
		if(greyX > 8) {			
			greyX -= 8;
		}
	}
	
	/**
	 * Anropas då D tangenten trycks ner
	 */
	public void dKey(){
		if(greyX < 896) {			
			greyX += 8;
		}
	}
	
	/**
	 * Anropas då W tangenten trycks ner
	 */
	public void wKey(){
		if(greyY > 8) {			
			greyY -= 8;
		}
	}
	
	/**
	 * Anropas då S tangenten trycks ner
	 */
	public void sKey(){
		if(greyY < 600) {			
			greyY += 8;
		}
	}
	
	//kolision-mekanik
	public boolean isCollided() { //kollar om flygplan har kolliderat	
		if(Math.abs(greenX - greyX) <= 120 && Math.abs(greenY - greyY) <= 34) { //om x/y koordinaterna för flygplanner krossar varandra
			return true;
		}
		else {
			return false;
		}
	}
	
	public void collision() {
		greenX = 900;
		greenY = 200;
		greyX = 12;
		greyY = 200;
	}
}
