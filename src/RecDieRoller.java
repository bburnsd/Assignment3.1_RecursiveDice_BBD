import java.util.Random;
import java.text.NumberFormat;
/**
 * @author Brad Davis
 * This class has methods to roll a die and check if it lands on 2
 */
public class RecDieRoller {
Random gen = new Random();
NumberFormat p = NumberFormat.getPercentInstance();
int rollcount = 0;
int twocount = 0;

/**
 * Instantiates the RecDieRoller
 */
public RecDieRoller() {
	
}//end default constructor

/**
 * This method rolls the die until it lands on 2
 */
public void roll() {
	int face = gen.nextInt(6)+1;
	if(face==2) {
		System.out.println("Dice landed on " + face);
	}
	else {
		System.out.println("Dice landed on " + face);
		roll();
	}
}//end roll

/**
 * This method rolls the die 1000 times and keeps count of how many times the die lands on 2
 */
public void roll2() {
	int face = gen.nextInt(6)+1;
	if(rollcount>=1000) {
		float twoFacePercent = (float)twocount/1000;
		System.out.println("Rolls complete." + "\nNumber of 2s: " + twocount + "\nPercentage of 2s: " + p.format(twoFacePercent));
		rollcount=0;
		twocount=0;
	}
	else if(face==2) {
		rollcount++;
		twocount++;
		roll2();
	}
	else {
		rollcount++;
		roll2();
	}
	
}//end roll2
}//end RecDieRoller