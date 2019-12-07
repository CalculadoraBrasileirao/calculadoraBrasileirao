package gui;



import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import controllers.ResultadoController;
import controllers.TimeController;
import modelsVO.Resultado;
import modelsVO.Time;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resultados {

	private JFrame frmCalculadoraBrasileirao;


	/**
	 * Create the application.
	 */
	public void inicia() {
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
	 * Launch the application.
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
		lblTimeEmCasa.setBounds(254, 119, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblTimeEmCasa);
		
		JLabel lblGolsMarcados = new JLabel("Gols Marcados");
		lblGolsMarcados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGolsMarcados.setBounds(130, 194, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblGolsMarcados);
		
		JComboBox<String> comboBoxVisitante = new JComboBox<String>();
		ArrayList<Time> times = new TimeController().iniciaConexao().getAllTime();
		for (Time time : times) {
			comboBoxVisitante.addItem(time.getNome());
		}
		comboBoxVisitante.setBounds(34, 149, 135, 22);
		frmCalculadoraBrasileirao.getContentPane().add(comboBoxVisitante);
		
		JComboBox<String> comboBoxCasa = new JComboBox<String> ();
		ArrayList<Time> timesCasa = new TimeController().iniciaConexao().getAllTime();
		for (Time time : timesCasa) {
			comboBoxCasa.addItem(time.getNome());
		}
		comboBoxCasa.setBounds(237, 149, 131, 22);
		frmCalculadoraBrasileirao.getContentPane().add(comboBoxCasa);
		
		JLabel label = new JLabel("Time Visitante");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(36, 238, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Time em Casa");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(240, 236, 194, 31);
		frmCalculadoraBrasileirao.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculadoraBrasileirao.dispose();
				new MenuPrincipal().inicia();;
			}
		});
		
		
		JSpinner spinnerVisitante = new JSpinner();
		spinnerVisitante.setBounds(34, 266, 88, 20);
		frmCalculadoraBrasileirao.getContentPane().add(spinnerVisitante);
		
		JSpinner spinnerCasa = new JSpinner();
		spinnerCasa.setBounds(240, 264, 88, 20);
		frmCalculadoraBrasileirao.getContentPane().add(spinnerCasa);
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(34, 386, 89, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnNewButton);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				System.out.println(spinnerVisitante.getValue());
				System.out.println(spinnerCasa.getValue());
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(237, 386, 103, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnCadastrar);
		
		JLabel lblDataDaPartida = new JLabel("Data da partida");
		lblDataDaPartida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDaPartida.setBounds(34, 323, 103, 28);
		frmCalculadoraBrasileirao.getContentPane().add(lblDataDaPartida);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(237, 332, 87, 19);
		frmCalculadoraBrasileirao.getContentPane().add(label_2);
		
		
	}
}
