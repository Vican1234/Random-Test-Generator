package randomTestGenerator;

import javax.swing.JFrame;

//Author 			: Cillían Vickers
//Date 			    : May-2023
//Purpose 			: Driver to run generator Display

public class generatorDisplayDriver {
	
	public static void main (String[] args) {
		
		generatorDisplay displayTestData = new generatorDisplay("Generated Tests");
		displayTestData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayTestData.setSize(500,500);
		displayTestData.setVisible(true);
		
		
	}

}
