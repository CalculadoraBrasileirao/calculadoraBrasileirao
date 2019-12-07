package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Classificacao {

	private JFrame frmCalculadoraBrasileirao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JLabel lblClassificao = new JLabel("Classificacao");
		lblClassificao.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassificao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblClassificao.setBounds(10, 11, 434, 31);
		frmCalculadoraBrasileirao.getContentPane().add(lblClassificao);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 90, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prototipo");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(78, 90, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPts = new JLabel("PTS");
		lblPts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPts.setBounds(156, 69, 48, 21);
		frmCalculadoraBrasileirao.getContentPane().add(lblPts);
		
		JLabel lblVit = new JLabel("VIT");
		lblVit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVit.setBounds(214, 69, 48, 21);
		frmCalculadoraBrasileirao.getContentPane().add(lblVit);
		
		JLabel lblEmp = new JLabel("EMP");
		lblEmp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmp.setBounds(270, 69, 48, 21);
		frmCalculadoraBrasileirao.getContentPane().add(lblEmp);
		
		JLabel lblDer = new JLabel("DER");
		lblDer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDer.setBounds(323, 69, 48, 21);
		frmCalculadoraBrasileirao.getContentPane().add(lblDer);
		
		JLabel lblSg = new JLabel("SG");
		lblSg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSg.setBounds(381, 69, 48, 21);
		frmCalculadoraBrasileirao.getContentPane().add(lblSg);
		
		JLabel label = new JLabel("2");
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		label.setBounds(20, 115, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Prototipo");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_1.setBounds(78, 115, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Prototipo");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_2.setBounds(78, 162, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3.setBounds(20, 162, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Prototipo");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_4.setBounds(78, 137, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("3");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_5.setBounds(20, 137, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("5");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_6.setBounds(20, 187, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Prototipo");
		label_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_7.setBounds(78, 187, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("6");
		label_8.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_8.setBounds(20, 212, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Prototipo");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_9.setBounds(78, 212, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Prototipo");
		label_10.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_10.setBounds(78, 259, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("8");
		label_11.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_11.setBounds(20, 259, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Prototipo");
		label_12.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_12.setBounds(78, 234, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("7");
		label_13.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_13.setBounds(20, 234, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("9");
		label_14.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_14.setBounds(20, 277, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Prototipo");
		label_15.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_15.setBounds(78, 277, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("10");
		label_16.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_16.setBounds(20, 302, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("Prototipo");
		label_17.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_17.setBounds(78, 302, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("Prototipo");
		label_18.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_18.setBounds(78, 349, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("12");
		label_19.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_19.setBounds(20, 349, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("Prototipo");
		label_20.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_20.setBounds(78, 324, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("11");
		label_21.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_21.setBounds(20, 324, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("13");
		label_22.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_22.setBounds(20, 374, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("Prototipo");
		label_23.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_23.setBounds(78, 374, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("14");
		label_24.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_24.setBounds(20, 399, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("Prototipo");
		label_25.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_25.setBounds(78, 399, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("Prototipo");
		label_26.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_26.setBounds(78, 446, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("16");
		label_27.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_27.setBounds(20, 446, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("Prototipo");
		label_28.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_28.setBounds(78, 421, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("15");
		label_29.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_29.setBounds(20, 421, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("17");
		label_30.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_30.setBounds(20, 471, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("Prototipo");
		label_31.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_31.setBounds(78, 471, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("18");
		label_32.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_32.setBounds(20, 496, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("Prototipo");
		label_33.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_33.setBounds(78, 496, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("Prototipo");
		label_34.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_34.setBounds(78, 543, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("20");
		label_35.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_35.setBounds(20, 543, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("Prototipo");
		label_36.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_36.setBounds(78, 518, 75, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("19");
		label_37.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_37.setBounds(20, 518, 133, 14);
		frmCalculadoraBrasileirao.getContentPane().add(label_37);
	}

}
