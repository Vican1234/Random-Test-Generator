import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Author 			: Cillían Vickers
//Date 			    : April-2023
//Purpose 			: Will create a display to show the results

public class TestValueDisplay extends JFrame{
    private JButton generateTestsButton;
    private JPanel testDisplay;
    private JLabel TestDataLong;
    private JLabel TestDataFloat;
    private JLabel TestDataDouble;
    private JLabel TestDataInt;
    private JLabel TestDataChar;
    private JLabel TestDataString;
    private JLabel jlString;
    private JLabel jlChar;
    private JLabel jlInt;
    private JLabel jlDouble;
    private JLabel jlFloat;
    private JLabel jlLong;

    public TestValueDisplay() {
        setContentPane(testDisplay);
       setTitle("Generated Tests");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
       setLocationRelativeTo(null);
       setVisible(true);
       randomTest createData = new randomTest();
        generateTestsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // fills in the labels on the gui with random values from the randomTest class
                TestDataString.setText(createData.createStringTest());
                TestDataChar.setText(String.valueOf(createData.createCharTest()));
                TestDataInt.setText(String.valueOf(createData.createIntTest()));
                TestDataDouble.setText(String.valueOf(createData.createDoubleTest()));
                TestDataFloat.setText(String.valueOf(createData.createFloatTest()));
                TestDataLong.setText(String.valueOf(createData.createLongTest()));
            }
        });
    }

   public static void main(String[] args){
       new TestValueDisplay();
   }
}
