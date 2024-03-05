package leJOS;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class RobotsTe2bNoVa {

	public static void main(String[] args) {
		  	 /**
		  	  * Skapar motorerobjekt till hjulen.
		  	  * Kontrollera att portarna är rätt för din EV3!
		  	  */
		  	 RegulatedMotor leftWeel = new EV3LargeRegulatedMotor(MotorPort.B);
		  	 RegulatedMotor rightWeel = new EV3LargeRegulatedMotor(MotorPort.C);

		  	 /** Kör framåt */
		  	 leftWeel.forward();
		  	 rightWeel.forward();
		  	
		  	 /** Pausar, så att roboten kör framåt i 4 sekunder */
		  	 Delay.msDelay(4000);

		  	 /** Stoppar båda motorerna */
		  	 leftWeel.stop();
		  	 
		  	 rightWeel.stop();
		   	
		  	 /** Roterar höger hjul 360° */
		  	 rightWeel.rotate(360);
		  	 rightWeel.waitComplete(); // För att vi inte skall backa innan rotationen är klar.

		  	 /** Backar */
		  	 leftWeel.backward();
		  	 rightWeel.backward();
		  	
		  	 /** Pausar, så att roboten kör bakåt i 2 sekunder */
		  	 Delay.msDelay(2000);
		  	
		  	 /** Stoppar båda motorerna */
		  	 leftWeel.stop();
		  	 rightWeel.stop();
		  	
		  	 /** Programmet slutar */

	}

}
