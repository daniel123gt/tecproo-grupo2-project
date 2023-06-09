package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Login extends JFrame implements MouseListener {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblIniciarSesin = new JLabel("INICIAR SESI\u00D3N");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblUsuario = new JLabel("USUARIO");
	private final JTextField txtIngreseSuNombre = new JTextField();
	private final JSeparator separator = new JSeparator();
	private final JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
	private final JSeparator separator_1 = new JSeparator();
	private final JPasswordField pwdAsdasd = new JPasswordField();
	private final JPanel btnEntrar = new JPanel();
	private final JLabel lblEntrar = new JLabel("ENTRAR");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/logoSolo.png")));
		txtIngreseSuNombre.setFont(new Font("SansSerif", Font.PLAIN, 24));
		txtIngreseSuNombre.setForeground(Color.GRAY);
		txtIngreseSuNombre.setText("Ingrese su nombre de usuario");
		txtIngreseSuNombre.setBorder(null);
		txtIngreseSuNombre.setBounds(15, 292, 457, 35);
		txtIngreseSuNombre.setColumns(10);
		Color darkBlue = new Color(202, 240, 248);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel.setBorder(null);
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 643, 669);
			contentPane.add(panel);
		}
		panel.setLayout(null);
		{
			lblIniciarSesin.setFont(new Font("SansSerif", Font.BOLD, 28));
			lblIniciarSesin.setBounds(21, 155, 224, 43);
			panel.add(lblIniciarSesin);
		}
		{
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon(Login.class.getResource("/images/logoSolo.png")).getImage().getScaledInstance(240, 240, Image.SCALE_DEFAULT)));
			lblNewLabel_1.setBounds(15, 19, 127, 115);
			panel.add(lblNewLabel_1);
		}
		{
			lblUsuario.setFont(new Font("SansSerif", Font.BOLD, 20));
			lblUsuario.setBounds(15, 246, 201, 43);
			panel.add(lblUsuario);
		}
		{
			panel.add(txtIngreseSuNombre);
		}
		{
			separator.setBounds(15, 344, 457, 2);
			panel.add(separator);
		}
		{
			lblContrasea.setFont(new Font("SansSerif", Font.BOLD, 20));
			lblContrasea.setBounds(15, 380, 201, 43);
			panel.add(lblContrasea);
		}
		{
			separator_1.setBounds(15, 494, 457, 2);
			panel.add(separator_1);
		}
		{
			pwdAsdasd.setFont(new Font("SansSerif", Font.PLAIN, 24));
			pwdAsdasd.setEchoChar('*');
			pwdAsdasd.setText("ASDASD");
			pwdAsdasd.setForeground(Color.GRAY);
			pwdAsdasd.setBorder(null);
			pwdAsdasd.setBounds(15, 444, 457, 35);
			panel.add(pwdAsdasd);
		}
		{
			btnEntrar.addMouseListener(this);
			btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnEntrar.setBackground(new Color(240, 240, 240));
			btnEntrar.setBounds(15, 605, 294, 43);
			panel.add(btnEntrar);
		}
		btnEntrar.setBackground(new Color(27, 156, 228));
		btnEntrar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblEntrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblEntrar.setFont(new Font("SansSerif", Font.PLAIN, 24));
		lblEntrar.setForeground(Color.WHITE);
		btnEntrar.add(lblEntrar);
		{
			panel_1.setBounds(641, 0, 377, 669);
			panel_1.setBackground(darkBlue);
			contentPane.add(panel_1);
		}
		panel_1.setLayout(null);
		{
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			//lblNewLabel.setIcon(new ImageIcon(new ImageIcon(Login.class.getResource("/images/Health Care.png")).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
			lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/Health Care.png")));
			lblNewLabel.setBounds(0, 140, 377, 359);
			panel_1.add(lblNewLabel);
		}
	}
	public void mouseClicked(MouseEvent arg0) {
		JOptionPane.showMessageDialog(null, "Hola usuario");
	}
	public void mouseEntered(MouseEvent arg0) {
		if (arg0.getSource() == btnEntrar) {
			do_btnEntrar_mouseEntered(arg0);
		}
	}
	public void mouseExited(MouseEvent arg0) {
		btnEntrar.setBackground(new Color(27, 156, 228));
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_btnEntrar_mouseEntered(MouseEvent arg0) {
		btnEntrar.setBackground(new Color(0, 126, 228));
	}
}
