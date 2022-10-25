package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 304, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		textField.setBounds(10, 25, 270, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder (textField.getText());
		            str.deleteCharAt(textField.getText().length()-1);
		            backspace = str.toString();
		            textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(10, 103, 60, 53);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number); 
			}
		});
		btn7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn7.setBounds(10, 173, 60, 53);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number); 
			} 
		});
		btn4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn4.setBounds(10, 237, 60, 53);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number); 
			}
		});
		btn1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn1.setBounds(10, 301, 60, 53);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number); 
			}
		});
		btn0.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn0.setBounds(10, 365, 60, 53);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnClear.setBounds(80, 103, 60, 53);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number); 
			}
		});
		btn8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn8.setBounds(80, 173, 60, 53);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number); 
			}
		});
		btn5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn5.setBounds(80, 237, 60, 53);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number); 
			}
		});
		btn2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn2.setBounds(80, 301, 60, 53);
		frame.getContentPane().add(btn2);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDecimal.getText();
				textField.setText(number); 
			}
		});
		btnDecimal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnDecimal.setBounds(80, 365, 60, 53);
		frame.getContentPane().add(btnDecimal);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number); 
			}
		});
		btn00.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn00.setBounds(150, 103, 60, 53);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number); 
			}
		});
		btn9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn9.setBounds(150, 173, 60, 53);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number); 
			}
		});
		btn6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn6.setBounds(150, 237, 60, 53);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number); 
			}
		});
		btn3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn3.setBounds(150, 301, 60, 53);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnEqual.setBounds(150, 365, 60, 53);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnPlus.setBounds(220, 103, 60, 53);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnMinus.setBounds(220, 173, 60, 53);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnMultiply.setBounds(220, 237, 60, 53);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnDivide.setBounds(220, 301, 60, 53);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnPercent.setBounds(220, 365, 60, 53);
		frame.getContentPane().add(btnPercent);
	}
}
