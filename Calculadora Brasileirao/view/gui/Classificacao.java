package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Classificacao {

	private JFrame frmCalculadoraBrasileirao;
	private JTable table;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public void inicia() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classificacao window = new Classificacao();
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
	public Classificacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraBrasileirao = new JFrame();
		frmCalculadoraBrasileirao.setTitle("Calculadora Brasileir\u00E3o");
		frmCalculadoraBrasileirao.setBounds(100, 100, 490, 600);
		frmCalculadoraBrasileirao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraBrasileirao.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 91, 454, 540);
		frmCalculadoraBrasileirao.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), null, null, null, null, null, null},
				{new Integer(2), null, null, null, null, null, null},
				{new Integer(3), null, null, null, null, null, null},
				{new Integer(4), null, null, null, null, null, null},
				{new Integer(5), null, null, null, null, null, null},
				{new Integer(6), null, null, null, null, null, null},
				{new Integer(7), null, null, null, null, null, null},
				{new Integer(8), null, null, null, null, null, null},
				{new Integer(9), null, null, null, null, null, null},
				{new Integer(10), null, null, null, null, null, null},
				{new Integer(11), null, null, null, null, null, null},
				{new Integer(12), null, null, null, null, null, null},
				{new Integer(13), null, null, null, null, null, null},
				{new Integer(14), null, null, null, null, null, null},
				{new Integer(15), null, null, null, null, null, null},
				{new Integer(16), null, null, null, null, null, null},
				{new Integer(17), null, null, null, null, null, null},
				{new Integer(18), null, null, null, null, null, null},
				{new Integer(19), null, null, null, null, null, null},
				{new Integer(20), null, null, null, null, null, null},
			},
			new String[] {
				"Coloca\u00E7\u00E3o", "Time", "PTS", "VIT", "DER", "EMP", "SG"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Classifica\u00E7\u00E3o");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(113, 28, 223, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new MenuPrincipal().inicia();
				frmCalculadoraBrasileirao.dispose();
			}
		});
		btnNewButton.setBounds(14, 57, 89, 23);
		frmCalculadoraBrasileirao.getContentPane().add(btnNewButton);
	}
}
