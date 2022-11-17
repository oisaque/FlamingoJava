package com.calculadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Component;

public class Calculator {

	private JFrame frmCalculadora;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPercent;
	private JButton btnPlus;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnBackSpace;
	private JButton btnClear;
	private JButton btnEqual;
	private JButton btn0;
	private JButton btnDot;
	
	double firstNumber, secondNumber, result;
	String operations, answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setAlwaysOnTop(true);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 267, 410);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 230, 49);
		frmCalculadora.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 16));
		btn7.setBounds(10, 129, 50, 50);
		frmCalculadora.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 16));
		btn8.setBounds(70, 129, 50, 50);
		frmCalculadora.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 16));
		btn9.setBounds(130, 129, 50, 50);
		frmCalculadora.getContentPane().add(btn9);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Arial", Font.BOLD, 16));
		btnPercent.setBounds(130, 71, 50, 50);
		frmCalculadora.getContentPane().add(btnPercent);
		
		btnPlus = new JButton("+");
		btnPlus.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPlus.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Arial", Font.BOLD, 16));
		btnPlus.setBounds(190, 71, 50, 50);
		frmCalculadora.getContentPane().add(btnPlus);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Arial", Font.BOLD, 16));
		btnSub.setBounds(190, 129, 50, 50);
		frmCalculadora.getContentPane().add(btnSub);
		
		btnMult = new JButton("*");
		btnMult.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Arial", Font.BOLD, 16));
		btnMult.setBounds(190, 190, 50, 50);
		frmCalculadora.getContentPane().add(btnMult);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Arial", Font.BOLD, 16));
		btnDiv.setBounds(190, 251, 50, 50);
		frmCalculadora.getContentPane().add(btnDiv);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 16));
		btn4.setBounds(10, 190, 50, 50);
		frmCalculadora.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 16));
		btn5.setBounds(70, 190, 50, 50);
		frmCalculadora.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 16));
		btn6.setBounds(130, 190, 50, 50);
		frmCalculadora.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 16));
		btn1.setBounds(10, 251, 50, 50);
		frmCalculadora.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 16));
		btn2.setBounds(70, 251, 50, 50);
		frmCalculadora.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 16));
		btn3.setBounds(130, 251, 50, 50);
		frmCalculadora.getContentPane().add(btn3);
		
		btnBackSpace = new JButton("←");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				
				if (textField.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				backSpace = strB.toString();
				textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Arial", Font.BOLD, 16));
		btnBackSpace.setBounds(10, 71, 50, 50);
		frmCalculadora.getContentPane().add(btnBackSpace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Arial", Font.BOLD, 16));
		btnClear.setBounds(70, 71, 50, 50);
		frmCalculadora.getContentPane().add(btnClear);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				
				if (operations == "+") {
					
					result = firstNumber+secondNumber;
					answer = Double.valueOf(result).toString();
					textField.setText(answer);
				}
				
				else if (operations == "-") {
					
					result = firstNumber-secondNumber;
					answer = Double.valueOf(result).toString();
					textField.setText(answer);
				}
				
				else if (operations == "*") {
					
					result = firstNumber*secondNumber;
					answer = Double.valueOf(result).toString();
					textField.setText(answer);
				}
				
				else if (operations == "/") {
					
					result = firstNumber/secondNumber;
					answer = Double.valueOf(result).toString();
					textField.setText(answer);
				}
				
				else if (operations == "%") {
					
					result = firstNumber%secondNumber;
					answer = Double.valueOf(result).toString();
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Arial", Font.BOLD, 16));
		btnEqual.setBounds(130, 312, 110, 50);
		frmCalculadora.getContentPane().add(btnEqual);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 16));
		btn0.setBounds(10, 312, 50, 50);
		frmCalculadora.getContentPane().add(btn0);
		
		btnDot = new JButton(",");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Arial", Font.BOLD, 16));
		btnDot.setBounds(70, 312, 50, 50);
		frmCalculadora.getContentPane().add(btnDot);
	}
}
