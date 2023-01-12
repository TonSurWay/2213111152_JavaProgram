import javax.swing.*;
import java.awt.*;

public class TestGUI extends JFrame {

	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	// Components
	private JLabel lblLenght, lblWidght, lblArea, lblPerimeter;
	private JTextField txtLenght,txtWidght,txtArea,txtPerimeter;
	// Constructor Method

	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Properties for Components
		lblLenght = new JLabel("Enter the lenght:",SwingConstants.CENTER); //SwingConstants = ย้ายตำแหน่ง(Input)
		lblWidght = new JLabel("Enter the Widght:",SwingConstants.CENTER);
		lblArea = new JLabel("Area:",SwingConstants.CENTER);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.CENTER);
		
		//TextFields
		/*txtLenght = new JTextField(10);
		txtWidght = new JTextField(10);
		txtArea = new JTextField(10);
		txtPerimeter = new JTextField(10);*/
				
		

		GridLayout Lay = new GridLayout(4, 1);
		setLayout(Lay);
		add(lblLenght);
		add(lblWidght);
		add(lblArea);
		add(lblPerimeter);
	}

	public static void main(String[] args) {
		TestGUI prog = new TestGUI();

	}
}
