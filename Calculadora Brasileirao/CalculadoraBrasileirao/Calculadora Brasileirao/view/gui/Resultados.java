package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Resultados {

	private JFrame frmCalculadoraBrasileirao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados window = new Resultados();
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
	public Resultados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraBrasileirao = new JFrame();
		frmCalculadoraBrasileirao.setTitle("Calculadora Brasileir\u00E3o");
		frmCalculadoraBrasileirao.setBounds(100, 100, 415, 487);
		frmCalculadoraBrasileirao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraBrasileirao.getContentPane().setLayout(null);
		
		JLabel lblCadastroDeResultados = new JLabel("Cadastro de Resultados");
		lblCadastroDeResultados.setBounds(0, 22, 434, 31);
		lblCadastroDeResultados.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeResultados.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frmCalculadoraBrasileirao.getContentPane().add(lblCadastroDeResultados);
		
		JLabel lblSelecione = new JLabel("Selecione os times");
		lblSelecione.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelecione.setBounds(130, 77, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblSelecione);
		
		JLabel lblTimeVisitantes = new JLabel("Time Visitante");
		lblTimeVisitantes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTimeVisitantes.setBounds(50, 119, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblTimeVisitantes);
		
		JLabel lblTimeEmCasa = new JLabel("Time em Casa");
		lblTimeEmCasa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTimeEmCasa.setBounds(237, 119, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblTimeEmCasa);
		
		JLabel lblGolsMarcados = new JLabel("Gols Marcados");
		lblGolsMarcados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGolsMarcados.setBounds(146, 196, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblGolsMarcados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(34, 149, 135, 22);
		frmCalculadoraBrasileirao.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(237, 149, 131, 22);
		frmCalculadoraBrasileirao.getContentPane().add(comboBox_1);
		
		JLabel label = new JLabel("Time Visitante");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(36, 238, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(label);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(34, 265, 135, 22);
		frmCalculadoraBrasileirao.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(237, 265, 131, 22);
		frmCalculadoraBrasileirao.getContentPane().add(comboBox_3);
		
		JLabel label_1 = new JLabel("Time em Casa");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(237, 238, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(80, 361, 89, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnNewButton);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(237, 361, 103, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnCadastrar);
	}
}
