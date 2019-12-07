package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import bin.Janela;

import javax.swing.JButton;


public class Menu{

	private JFrame frmCalculadoraBrasileirao;

	/**
	 * Launch the application.
	 */
	
	public void inicia() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmCalculadoraBrasileirao.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}


	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraBrasileirao = new JFrame();
		frmCalculadoraBrasileirao.setTitle("Calculadora Brasileir\u00E3o");
		frmCalculadoraBrasileirao.setBounds(100, 100, 450, 300);
		frmCalculadoraBrasileirao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraBrasileirao.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 434, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CLI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(53, 166, 89, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Interface Gr\u00E1fica");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(237, 166, 170, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnNewButton_1);
		
		JLabel lblEscolaUmaOpo = new JLabel("Escolha uma op\u00E7\u00E3o de Interface");
		lblEscolaUmaOpo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEscolaUmaOpo.setBounds(117, 91, 218, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblEscolaUmaOpo);
	}


	
}
