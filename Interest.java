package comp200;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Interest {

	public static void main(String[]args) {
	
	JFrame frame=new JFrame("Discount Application");
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JButton button1=new JButton("Calculate");
	JButton button2=new JButton("Exit");
	JTextField num1Field=new JTextField(5);
	JLabel label1=new JLabel("Amount: ");
	JLabel label2=new JLabel("[17% discount granted]");
	JLabel label3=new JLabel("Discounted Amount: ");
	JTextField num2Field=new JTextField(5);
	num2Field.setHorizontalAlignment(JTextField.RIGHT);
	JPanel panel3=new JPanel();
	
	
		ActionListener action=new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double num1=Double.parseDouble(num1Field.getText());
				
				double rate=num1-num1*0.17;
				num2Field.setText(String.valueOf(rate));
				
			}
		};
		ActionListener action2=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
	button1.addActionListener(action);
	button2.addActionListener(action2);
	
	panel1.add(label1);
	panel1.add(num1Field);
	panel1.add(label2);

	panel2.add(label3);
	panel2.add(num2Field);
	
	panel3.add(button1);
	panel3.add(button2);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(400,300);
	frame.setLayout(new GridLayout(3,1));
	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);
    }
}	
