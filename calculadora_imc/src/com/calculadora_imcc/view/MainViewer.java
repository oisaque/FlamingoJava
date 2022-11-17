package com.calculadora_imcc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.calculadora_imc.control.ImcController;

import java.awt.Color;
import javax.swing.SwingConstants;

public class MainViewer {

	private JFrame appFrame;
	private JTextField PesoField;
	private JTextField AlturaField;
	private JTextPane txtpnResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.setTitle("IMC App");
		appFrame.setBounds(100, 100, 300, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		lblNewLabel.setBounds(44, 28, 196, 49);
		appFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso:");
		lblNewLabel_1.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(44, 110, 44, 26);
		appFrame.getContentPane().add(lblNewLabel_1);
		
		PesoField = new JTextField();
		PesoField.setHorizontalAlignment(SwingConstants.CENTER);
		PesoField.setText("0.0");
		PesoField.setBounds(114, 110, 126, 26);
		appFrame.getContentPane().add(PesoField);
		PesoField.setColumns(10);
		
		AlturaField = new JTextField();
		AlturaField.setHorizontalAlignment(SwingConstants.CENTER);
		AlturaField.setText("0.0");
		AlturaField.setColumns(10);
		AlturaField.setBounds(114, 157, 126, 26);
		appFrame.getContentPane().add(AlturaField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Altura:");
		lblNewLabel_1_1.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(44, 157, 57, 26);
		appFrame.getContentPane().add(lblNewLabel_1_1);
		
		JButton ResultadoButton = new JButton("Calcular");
		ResultadoButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		ResultadoButton.addActionListener(new ImcController(this));
		ResultadoButton.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		ResultadoButton.setBounds(44, 212, 196, 50);
		appFrame.getContentPane().add(ResultadoButton);
		
		txtpnResultado = new JTextPane();
		txtpnResultado.setBorder(new EmptyBorder(8, 8, 0, 8));
		txtpnResultado.setFont(new Font("Arial", Font.BOLD, 12));
		txtpnResultado.setText("Resultado");
		txtpnResultado.setBounds(44, 287, 196, 63);
		appFrame.getContentPane().add(txtpnResultado);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getTextField() {
		return PesoField;
	}

	public void setTextField(JTextField textField) {
		this.PesoField = textField;
	}

	public JTextField getTextField_1() {
		return AlturaField;
	}

	public void setTextField_1(JTextField textField_1) {
		this.AlturaField = textField_1;
	}

	public JTextPane getTxtpnResultado() {
		return txtpnResultado;
	}

	public void setTxtpnResultado(JTextPane txtpnResultado) {
		this.txtpnResultado = txtpnResultado;
	}
	
}
