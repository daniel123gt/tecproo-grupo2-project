package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import colec.Medicina;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final JButton btnAgregar = new JButton("Agregar");
	private final JTextField txtNombre = new JTextField();
	private final JLabel lblNombre = new JLabel("Nombre");
	private final JTextField txtCodigo = new JTextField();
	private final JLabel lblCodigo = new JLabel("Codigo");
	private final JTextArea txtProducts = new JTextArea();
	private final JButton btnAceptar = new JButton("Aceptar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		txtCodigo.setBounds(42, 169, 186, 32);
		txtCodigo.setColumns(10);
		txtNombre.setBounds(42, 60, 186, 32);
		txtNombre.setColumns(10);
		setBounds(100, 100, 761, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnAgregar.addActionListener(this);
			btnAgregar.setBounds(69, 404, 141, 35);
			contentPane.add(btnAgregar);
		}
		{
			contentPane.add(txtNombre);
		}
		{
			lblNombre.setBounds(69, 21, 92, 26);
			contentPane.add(lblNombre);
		}
		{
			contentPane.add(txtCodigo);
		}
		lblCodigo.setBounds(69, 133, 92, 26);
		
		contentPane.add(lblCodigo);
		{
			txtProducts.setBounds(358, 26, 329, 357);
			contentPane.add(txtProducts);
		}
		{
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(519, 424, 141, 35);
			contentPane.add(btnAceptar);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			do_btnAceptar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(arg0);
		}
	}
	ArrayList<Medicina> mTemp = new ArrayList<Medicina>(); 
	public void do_btnAgregar_actionPerformed(ActionEvent arg0) {
		ArrayList<Medicina> m = new ArrayList<Medicina>(); 
		m.add(new Medicina(Integer.parseInt(txtCodigo.getText()), txtNombre.getText()));
		for (int i = 0; i < m.size(); i++) {
			txtProducts.append(m.get(i).getNomMed()+"\n");
		}
		mTemp.add(new Medicina(Integer.parseInt(txtCodigo.getText()), txtNombre.getText()));
		V1 principal = new V1();
		principal.setmTemp(mTemp);

	}
	protected void do_btnAceptar_actionPerformed(ActionEvent arg0) {
		this.setVisible(false);
	}
}









