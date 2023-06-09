package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import colec.Historia;
import colec.Medicina;
import colec.Paciente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class V1 extends JFrame implements ActionListener, InputMethodListener, KeyListener {

	private JPanel contentPane;
	private final JLabel lblNombrePaciente = new JLabel("Nombre Paciente");
	private final JTextField txtNomPaciente = new JTextField();
	private final JLabel lblCdigoPaciente = new JLabel("C\u00F3digo Paciente");
	private final JTextField txtCodPaciente = new JTextField();
	private final JTextField txtDNI = new JTextField();
	private final JLabel lblDniPaciente = new JLabel("DNI Paciente");
	private final JTextField txtTlfPaciente = new JTextField();
	private final JLabel lblTelfonoPaciente = new JLabel("Tel\u00E9fono Paciente");
	private final JTextField txtCorrPaciente = new JTextField();
	private final JLabel lblCorreoPaciente = new JLabel("Correo Paciente");
	private final JComboBox comboSex = new JComboBox();
	private final JLabel lblSexoPaciente = new JLabel("Sexo Paciente");
	private final JLabel lblGestorDeHistorias = new JLabel("GESTOR DE HISTORIAS CLINICAS");
	private final JLabel lblDatosDelPaciente = new JLabel("DATOS DEL PACIENTE");
	private final JLabel lblCdigoHistoria = new JLabel("C\u00F3digo Historia");
	private final JTextField txtCodHistoria = new JTextField();
	private final JLabel lblFechaHistoria = new JLabel("Fecha Historia");
	private final JTextField txtFechaHistoria = new JTextField();
	private final JLabel lblDiagnosticoHistoria = new JLabel("Diagnostico Historia");
	private final JLabel lblDatosDeLa = new JLabel("DATOS DE LA HISTORIA");
	private final JTextArea txtDiag = new JTextArea();
	private final JLabel lblTratamiento = new JLabel("Tratamiento");
	private final JTextArea txtTrata = new JTextArea();
	private final JLabel lblMedicamentos = new JLabel("Medicamentos");
	private final JTextArea txtMediList = new JTextArea();
	private final JTextField txtNomMedi = new JTextField();
	private final JLabel lblNombre = new JLabel("Nombre");
	private final JTextField txtCodMedi = new JTextField();
	private final JLabel lblCodigo = new JLabel("Codigo");
	private final JButton btnAgregarMedicina = new JButton("Agregar Medicina");
	private final JTextArea txtS = new JTextArea();
	private final JButton btnProcesar = new JButton("Insertar Historia");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		txtBuscar.setBounds(15, 685, 146, 26);
		txtBuscar.setColumns(10);
		txtCodMedi.setBounds(502, 624, 146, 26);
		txtCodMedi.setColumns(10);
		txtNomMedi.setBounds(502, 545, 146, 26);
		txtNomMedi.setColumns(10);
		txtNomPaciente.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		txtNomPaciente.addKeyListener(this);
		txtNomPaciente.addInputMethodListener(this);
		txtNomPaciente.setBounds(164, 144, 146, 26);
		txtNomPaciente.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1470, 959);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNombrePaciente.setBounds(15, 147, 134, 20);
			contentPane.add(lblNombrePaciente);
		}
		{
			contentPane.add(txtNomPaciente);
		}
		{
			lblCdigoPaciente.setBounds(15, 202, 134, 20);
			contentPane.add(lblCdigoPaciente);
		}
		{
			txtCodPaciente.setColumns(10);
			txtCodPaciente.setBounds(164, 199, 146, 26);
			contentPane.add(txtCodPaciente);
		}
		{
			txtDNI.setColumns(10);
			txtDNI.setBounds(164, 256, 146, 26);
			contentPane.add(txtDNI);
		}
		{
			lblDniPaciente.setBounds(15, 259, 134, 20);
			contentPane.add(lblDniPaciente);
		}
		{
			txtTlfPaciente.setColumns(10);
			txtTlfPaciente.setBounds(164, 308, 146, 26);
			contentPane.add(txtTlfPaciente);
		}
		{
			lblTelfonoPaciente.setBounds(15, 311, 134, 20);
			contentPane.add(lblTelfonoPaciente);
		}
		{
			txtCorrPaciente.setColumns(10);
			txtCorrPaciente.setBounds(164, 373, 146, 26);
			contentPane.add(txtCorrPaciente);
		}
		{
			lblCorreoPaciente.setBounds(15, 376, 134, 20);
			contentPane.add(lblCorreoPaciente);
		}
		{
			comboSex.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
			comboSex.setBounds(164, 485, 146, 26);
			contentPane.add(comboSex);
		}
		{
			lblSexoPaciente.setBounds(15, 491, 134, 20);
			contentPane.add(lblSexoPaciente);
		}
		{
			lblGestorDeHistorias.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblGestorDeHistorias.setBounds(436, 16, 410, 20);
			contentPane.add(lblGestorDeHistorias);
		}
		{
			lblDatosDelPaciente.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblDatosDelPaciente.setBounds(15, 108, 410, 20);
			contentPane.add(lblDatosDelPaciente);
		}
		{
			lblCdigoHistoria.setBounds(514, 147, 134, 20);
			contentPane.add(lblCdigoHistoria);
		}
		{
			txtCodHistoria.setColumns(10);
			txtCodHistoria.setBounds(663, 144, 146, 26);
			contentPane.add(txtCodHistoria);
		}
		{
			lblFechaHistoria.setBounds(514, 202, 134, 20);
			contentPane.add(lblFechaHistoria);
		}
		{
			txtFechaHistoria.setColumns(10);
			txtFechaHistoria.setBounds(663, 199, 146, 26);
			contentPane.add(txtFechaHistoria);
		}
		{
			lblDiagnosticoHistoria.setBounds(514, 259, 134, 20);
			contentPane.add(lblDiagnosticoHistoria);
		}
		{
			lblDatosDeLa.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblDatosDeLa.setBounds(514, 108, 410, 20);
			contentPane.add(lblDatosDeLa);
		}
		{
			txtDiag.setBounds(663, 241, 146, 89);
			contentPane.add(txtDiag);
		}
		{
			lblTratamiento.setBounds(514, 364, 134, 20);
			contentPane.add(lblTratamiento);
		}
		{
			txtTrata.setBounds(663, 346, 146, 89);
			contentPane.add(txtTrata);
		}
		{
			lblMedicamentos.setBounds(514, 451, 134, 20);
			contentPane.add(lblMedicamentos);
		}
		{
			txtMediList.setBounds(663, 451, 146, 199);
			contentPane.add(txtMediList);
		}
		{
			contentPane.add(txtNomMedi);
		}
		{
			lblNombre.setBounds(502, 509, 69, 20);
			contentPane.add(lblNombre);
		}
		{
			contentPane.add(txtCodMedi);
		}
		{
			lblCodigo.setBounds(502, 588, 69, 20);
			contentPane.add(lblCodigo);
		}
		{
			btnAgregarMedicina.addActionListener(this);
			btnAgregarMedicina.setBounds(514, 666, 115, 29);
			contentPane.add(btnAgregarMedicina);
		}
		{
			txtS.setBounds(939, 112, 478, 717);
			contentPane.add(txtS);
		}
		{
			btnProcesar.setFont(new Font("Tahoma", Font.BOLD, 22));
			btnProcesar.addActionListener(this);
			btnProcesar.setBounds(561, 802, 285, 55);
			contentPane.add(btnProcesar);
		}
		{
			btnModificar.addActionListener(this);
			btnModificar.setBounds(15, 818, 178, 29);
			contentPane.add(btnModificar);
		}
		{
			lblBuscarHistoriacdigo.setBounds(15, 649, 295, 20);
			contentPane.add(lblBuscarHistoriacdigo);
		}
		{
			contentPane.add(txtBuscar);
		}
		{
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(176, 685, 178, 29);
			contentPane.add(btnBuscar);
		}
		{
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(216, 818, 178, 29);
			contentPane.add(btnEliminar);
		}
		{
			btnListar.addActionListener(this);
			btnListar.setBounds(1225, 858, 192, 29);
			contentPane.add(btnListar);
		}
		{
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(663, 714, 141, 35);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnListar) {
			do_btnListar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAgregarMedicina) {
			do_btnAgregarMedicina_actionPerformed(arg0);
		}
	}
	ArrayList<Medicina> mTemp = new ArrayList<Medicina>(); 
	public V1(ArrayList<Medicina> mTemp) throws HeadlessException {
		super();
		this.mTemp = mTemp;
	}
	
	public ArrayList<Medicina> getmTemp() {
		return mTemp;
	}

	public void setmTemp(ArrayList<Medicina> mTemp) {
		this.mTemp = mTemp;
	}
	File ruta = new File("C:/Users/Daniel/Documents/Historias");
	private final JButton btnModificar = new JButton("Modificar Historia");
	private final JLabel lblBuscarHistoriacdigo = new JLabel("Buscar Historia (C\u00F3digo de historia)");
	private final JTextField txtBuscar = new JTextField();
	private final JButton btnBuscar = new JButton("Buscar Historia");
	private final JButton btnEliminar = new JButton("Eliminar Historia");
	private final JButton btnListar = new JButton("Listar Historias");
	private final JButton btnNewButton = new JButton("New button");
	protected void do_btnAgregarMedicina_actionPerformed(ActionEvent arg0) {
		ArrayList<Medicina> m = new ArrayList<Medicina>(); 
		m.add(new Medicina(Integer.parseInt(txtCodMedi.getText()), txtNomMedi.getText()));
		for (int i = 0; i < m.size(); i++) {
			txtMediList.append(m.get(i).getNomMed()+"\n");
		}
		mTemp.add(new Medicina(Integer.parseInt(txtCodMedi.getText()), txtNomMedi.getText()));
		if(ruta.exists()){
			System.out.print(ruta.exists());
		}

	}
	protected void do_btnProcesar_actionPerformed(ActionEvent arg0) {
		V2 meddd = new V2();
		Paciente p = new Paciente(Integer.parseInt(txtCodPaciente.getText()), Integer.parseInt(txtDNI.getText()), Integer.parseInt(txtTlfPaciente.getText()), txtNomPaciente.getText(), txtCorrPaciente.getText(), comboSex.getSelectedItem().toString());
		Historia h = new Historia(Integer.parseInt(txtCodHistoria.getText()), txtFechaHistoria.getText(), txtDiag.getText(), txtTrata.getText(), p, meddd.mTemp);
		File archivoHistoria = new File("C:/Users/Daniel/Documents/Historias/"+h.getCodHistoria()+".txt");
		FileWriter archivoHistoriaEdit;
		archivoHistoria.getParentFile().mkdirs();
		
		try {
			archivoHistoria.createNewFile();
			archivoHistoriaEdit = new FileWriter(archivoHistoria, true);
			archivoHistoriaEdit.write("C�digo de Historia: "+h.getCodHistoria()+"\n"
					+ "Fecha de creacion: "+h.getFechaHistoria()+"\n"
					+ "Nombre de Paciente: "+h.getPacHistoria().getNomPaciente()+"\n"
					+ "C�digo de Paciente: "+h.getPacHistoria().getCodPaciente()+"\n"
					+ "Sexo de Paciente: "+h.getPacHistoria().getSexPaciente()+"\n"
					+ "DNI de Paciente: "+h.getPacHistoria().getDniPaciente()+"\n"
					+ "Tel�fono de Paciente: "+h.getPacHistoria().getTlfPaciente()+"\n"
					+ "Correo de Paciente: "+h.getPacHistoria().getCorrPaciente()+"\n"
					+ "Diagn�stico: "+h.getDiagHistoria()+"\n"
					+ "Tratamiento: "+h.getTratHistoria()+"\n"
					+ "Lista de Medicamentos: "+"\n");
			for (int i = 0; i < h.getMedicamentos().size(); i++) {
				archivoHistoriaEdit.write(h.getMedicamentos().get(i).getNomMed().toString()+"\n");
			}
			archivoHistoriaEdit.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Listado(h);
		
	}
	void Imprimir(){
		txtS.append("------------------------------------------------\n");
	}
	
	void Imprimir(String s){
		txtS.append(s+"\n");
	}
	
	void Listado(Historia h){
		Imprimir("Cod Historia"+h.getCodHistoria());
		Imprimir("Fecha Historia"+h.getFechaHistoria());
		Imprimir("Sexo Paciente"+h.getPacHistoria().getSexPaciente());
		Imprimir("Medicinas Historia:");
		for (int i = 0; i < h.getMedicamentos().size(); i++) {
			Imprimir(" "+i +": "+h.getMedicamentos().get(i).getNomMed().toString());
		}
	}
	
	
	
	protected void do_btnBuscar_actionPerformed(ActionEvent arg0) {
		boolean encontrado = false;
		File buscado = new File(ruta+"/"+txtBuscar.getText()+".txt");
		
			if(buscado.exists()){
				encontrado = true;
			}		
		if(encontrado){
			JOptionPane.showMessageDialog(null, "Historia Encontrada");
		}else{
			JOptionPane.showMessageDialog(null, "Historia no encontrada");
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent arg0) {
		boolean encontrado = false;
		File buscado = new File(ruta+"/"+txtBuscar.getText()+".txt");
		
			if(buscado.exists()){
				encontrado = true;
			}		
		if(encontrado){
			buscado.delete();
			JOptionPane.showMessageDialog(null, "Historia Eliminada");
		}else{
			JOptionPane.showMessageDialog(null, "Historia no encontrada");
		}
	}
	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
		boolean encontrado = false;
		File buscado = new File(ruta+"/"+txtBuscar.getText()+".txt");
		
			if(buscado.exists()){
				encontrado = true;
			}		
		if(encontrado){
			buscado.delete();
			Paciente p = new Paciente(Integer.parseInt(txtCodPaciente.getText()), Integer.parseInt(txtDNI.getText()), Integer.parseInt(txtTlfPaciente.getText()), txtNomPaciente.getText(), txtCorrPaciente.getText(), comboSex.getSelectedItem().toString());
			Historia h = new Historia(Integer.parseInt(txtCodHistoria.getText()), txtFechaHistoria.getText(), txtDiag.getText(), txtTrata.getText(), p, mTemp);
			File archivoHistoria = new File("C:/Users/Daniel/Documents/Historias/"+h.getCodHistoria()+".txt");
			FileWriter archivoHistoriaEdit;
			archivoHistoria.getParentFile().mkdirs();
			
			try {
				archivoHistoria.createNewFile();
				archivoHistoriaEdit = new FileWriter(archivoHistoria, true);
				archivoHistoriaEdit.write("C�digo de Historia: "+h.getCodHistoria()+"\n"
						+ "Fecha de creacion: "+h.getFechaHistoria()+"\n"
						+ "Nombre de Paciente: "+h.getPacHistoria().getNomPaciente()+"\n"
						+ "C�digo de Paciente: "+h.getPacHistoria().getCodPaciente()+"\n"
						+ "Sexo de Paciente: "+h.getPacHistoria().getSexPaciente()+"\n"
						+ "DNI de Paciente: "+h.getPacHistoria().getDniPaciente()+"\n"
						+ "Tel�fono de Paciente: "+h.getPacHistoria().getTlfPaciente()+"\n"
						+ "Correo de Paciente: "+h.getPacHistoria().getCorrPaciente()+"\n"
						+ "Diagn�stico: "+h.getDiagHistoria()+"\n"
						+ "Tratamiento: "+h.getTratHistoria()+"\n"
						+ "Lista de Medicamentos: "+"\n");
				for (int i = 0; i < h.getMedicamentos().size(); i++) {
					archivoHistoriaEdit.write(h.getMedicamentos().get(i).getNomMed().toString()+"\n");
				}
				archivoHistoriaEdit.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Listado(h);
			JOptionPane.showMessageDialog(null, "Historia Modificada");
		}else{
			JOptionPane.showMessageDialog(null, "Historia no encontrada");
		}
	}
	protected void do_btnListar_actionPerformed(ActionEvent arg0) {
		txtS.selectAll();
		txtS.replaceSelection("");
		for (int i = 0; i < ruta.list().length; i++) {
			txtS.append("C�digo de historia: "+ruta.list()[i].toString()+"\n");
		}
	}
	public void caretPositionChanged(InputMethodEvent arg0) {
	}
	public void inputMethodTextChanged(InputMethodEvent arg0) {
		if (arg0.getSource() == txtNomPaciente) {
			do_txtNomPaciente_inputMethodTextChanged(arg0);
		}
	}
	protected void do_txtNomPaciente_inputMethodTextChanged(InputMethodEvent arg0) {
		
	}
	public void keyPressed(KeyEvent arg0) {
		String text = txtNomPaciente.getText();
		txtS.setText(null);
		txtS.append(text);
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtNomPaciente) {
			do_txtNomPaciente_keyTyped(arg0);
		}
	}
	protected void do_txtNomPaciente_keyTyped(KeyEvent arg0) {
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		V2 emer = new V2();
		emer.show();
	}
}
