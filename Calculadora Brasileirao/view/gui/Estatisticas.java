package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Estatisticas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void inicia() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estatisticas frame = new Estatisticas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Estatisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstatisticas = new JLabel("Estatisticas ");
		lblEstatisticas.setBounds(5, 5, 424, 31);
		lblEstatisticas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstatisticas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblEstatisticas);
		
		JLabel lblNewLabel = new JLabel("Melhor ataque");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(44, 111, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMelhorDefesa = new JLabel("Melhor defesa");
		lblMelhorDefesa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMelhorDefesa.setBounds(44, 144, 115, 14);
		contentPane.add(lblMelhorDefesa);
		
		JLabel lblPiorAtaque = new JLabel("Pior ataque");
		lblPiorAtaque.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPiorAtaque.setBounds(44, 181, 115, 14);
		contentPane.add(lblPiorAtaque);
		
		JLabel lblPiorDefesa = new JLabel("Pior defesa");
		lblPiorDefesa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPiorDefesa.setBounds(44, 214, 115, 14);
		contentPane.add(lblPiorDefesa);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00E3o definido");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(300, 111, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00E3o definido");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(300, 144, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00E3o definido");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(300, 181, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("N\u00E3o definido");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(300, 214, 97, 14);
		contentPane.add(lblNewLabel_4);
	}
}
