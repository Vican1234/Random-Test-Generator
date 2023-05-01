package randomTestGenerator;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
//Author 			: Cillían Vickers
//Date 			    : April-2023
//Purpose 			: Will create a display to show the results

public class generatorDisplay extends JFrame{
	
	private JLabel intTest;
	private JLabel floatTest;
	private JLabel longTest;
	private JLabel doubleTest;
	private JLabel charTest;
	private JLabel stringTest;
	
	
	public generatorDisplay() {
		JFrame randomTests = new JFrame("Generated Tests");
		randomTests.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		randomTests.setSize(500,500);
	}
	

}
