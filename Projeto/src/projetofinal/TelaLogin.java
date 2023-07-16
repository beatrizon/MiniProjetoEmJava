package projetofinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	private JFrame frame;
	private JTextField inputUsario;
	private JPasswordField inputSenha;
	private JButton btnSair;
	private JButton btnLogar;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 489, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela de login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 21, 453, 25);
		frame.getContentPane().add(lblNewLabel);
		
		inputUsario = new JTextField();
		inputUsario.setBounds(235, 72, 90, 25);
		frame.getContentPane().add(inputUsario);
		inputUsario.setColumns(10);
		
		JLabel IdUsuario = new JLabel("Usuario:");
		IdUsuario.setBounds(144, 72, 90, 25);
		frame.getContentPane().add(IdUsuario);
		
		JLabel IdSenha = new JLabel("Senha:");
		IdSenha.setBounds(144, 131, 90, 25);
		frame.getContentPane().add(IdSenha);
		
		inputSenha = new JPasswordField();
		inputSenha.setBounds(235, 131, 90, 25);
		frame.getContentPane().add(inputSenha);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(44, 209, 100, 45);
		frame.getContentPane().add(btnSair);
		
		btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogar.setBounds(347, 209, 100, 45);
		frame.getContentPane().add(btnLogar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputUsario.setText(null);
				inputSenha.setText(null);
				
			}
		});
		btnLimpar.setBounds(197, 209, 100, 45);
		frame.getContentPane().add(btnLimpar);
	}
}
