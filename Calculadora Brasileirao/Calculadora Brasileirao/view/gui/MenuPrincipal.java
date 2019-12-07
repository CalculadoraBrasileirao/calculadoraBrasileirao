package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class MenuPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
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
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMwnu = new JLabel("Menu");
		lblMwnu.setBounds(0, 30, 434, 31);
		lblMwnu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMwnu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblMwnu);
		
		JLabel lblSelecioneOCampeonato = new JLabel("Selecione o campeonato");
		lblSelecioneOCampeonato.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelecioneOCampeonato.setBounds(125, 95, 199, 22);
		frame.getContentPane().add(lblSelecioneOCampeonato);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(125, 141, 186, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultas.setBounds(46, 189, 90, 14);
		frame.getContentPane().add(lblConsultas);
		
		JLabel lblCadastros = new JLabel("Cadastros");
		lblCadastros.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastros.setBounds(280, 189, 98, 14);
		frame.getContentPane().add(lblCadastros);
		
		JButton btnConsultarCampeonato = new JButton("Consultar Campeonato");
		btnConsultarCampeonato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultarCampeonato.setBounds(12, 227, 172, 23);
		frame.getContentPane().add(btnConsultarCampeonato);
		
		JButton btnConsultarClassificao = new JButton("Consultar Classifica\u00E7\u00E3o");
		btnConsultarClassificao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultarClassificao.setBounds(12, 267, 172, 23);
		frame.getContentPane().add(btnConsultarClassificao);
		
		JButton btnConsultarResultados = new JButton("Consultar Resultados");
		btnConsultarResultados.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultarResultados.setBounds(12, 302, 172, 23);
		frame.getContentPane().add(btnConsultarResultados);
		
		JButton btnCadastroDeCampeonato = new JButton("Cadastro de Campeonato");
		btnCadastroDeCampeonato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastroDeCampeonato.setBounds(224, 227, 200, 23);
		frame.getContentPane().add(btnCadastroDeCampeonato);
		
		JButton btnCadastroDeTimes = new JButton("Cadastro de Times");
		btnCadastroDeTimes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastroDeTimes.setBounds(224, 261, 200, 23);
		frame.getContentPane().add(btnCadastroDeTimes);
		
		JButton btnCadastroDeResultados = new JButton("Cadastro de Resultados");
		btnCadastroDeResultados.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastroDeResultados.setBounds(224, 295, 200, 23);
		frame.getContentPane().add(btnCadastroDeResultados);
		
		JButton btnDefinirRodadas = new JButton("Definir Rodadas");
		btnDefinirRodadas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDefinirRodadas.setBounds(224, 329, 200, 23);
		frame.getContentPane().add(btnDefinirRodadas);
	}
}
