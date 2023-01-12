import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversion extends JFrame {

	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOF = 9.0 / 5.0;
	private static final int OFFSET = 32;

	// Components
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;

	// TextFields
	private JTextField tfCelsius;
	private JTextField tfFahrenheit;
	

	public TempConversion() {

		Container con = getContentPane();
		con.setLayout(new GridLayout(1, 4));

		lblCelsius = new JLabel("Temp in Celsius:");
		lblFahrenheit = new JLabel("temp in Fahrenheit:");

		tfCelsius = new JTextField(10);
		tfFahrenheit = new JTextField(10);
		
		con.add(lblCelsius);
		con.add(tfCelsius);
		con.add(lblFahrenheit);
		con.add(tfFahrenheit);
		
		CelsHandler celsiusHandler = new CelsHandler();
		tfCelsius.addActionListener(celsiusHandler);
		
		FahrenHandler fahHandler = new FahrenHandler();
		tfFahrenheit.addActionListener(fahHandler);
		
		setTitle("Temperature Convension");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			celsius = Double.parseDouble(tfCelsius.getText());
			fahrenheit = celsius * CTOF + OFFSET;
			tfFahrenheit.setText(String.format("%.2f",fahrenheit));
			
		}
	}
	private class FahrenHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			fahrenheit = Double.parseDouble(tfFahrenheit.getText());
			celsius = (fahrenheit - OFFSET) * FTOC;
			tfCelsius.setText(String.format("%.2f",celsius));
		}
	}

	public static void main(String[] args) {
		TempConversion Temp = new TempConversion();

	}
}
