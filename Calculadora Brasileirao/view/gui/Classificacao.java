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

public class Classificacao {

	private JFrame frmCalculadoraBrasileirao;
	private JTable table;

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
		
				table = new JTable();
				table.setBackground(Color.WHITE);
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
						"Coloca\u00E7\u00E3o", "Time", "PTS", "VIT", "EMP", "DER", "SG"
					}
				) {
					Class[] columnTypes = new Class[] {
						Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
					};
					
					
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
				table.getColumnModel().getColumn(0).setPreferredWidth(79);
				table.setBounds(470, 53, -439, 468);
				
				
		frmCalculadoraBrasileirao.getContentPane().add(table);
		
		JLabel lblClassificao = new JLabel("Classificacao");
		lblClassificao.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassificao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblClassificao.setBounds(10, 11, 434, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblClassificao);
	}
}
