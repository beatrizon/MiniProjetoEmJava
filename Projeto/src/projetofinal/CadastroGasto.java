package projetofinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroGasto {

	private JFrame frame;
	private JTextField inputCategoria;
	private JTextField inputDescricao;
	private JTextField inputValor;
	private JTextField inputData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGasto window = new CadastroGasto();
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
	public CadastroGasto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTelaDeCadastro = new JLabel("Tela de cadastro de gastos");
		lblTelaDeCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeCadastro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelaDeCadastro.setBounds(0, 0, 434, 25);
		frame.getContentPane().add(lblTelaDeCadastro);
		
		JLabel lblNewLabel = new JLabel("Descrição:");
		lblNewLabel.setBounds(128, 60, 60, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor R$:");
		lblNewLabel_1.setBounds(128, 100, 60, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria:");
		lblNewLabel_2.setBounds(128, 142, 60, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data:");
		lblNewLabel_3.setBounds(128, 181, 60, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		inputCategoria = new JTextField();
		inputCategoria.setBounds(209, 140, 90, 25);
		frame.getContentPane().add(inputCategoria);
		inputCategoria.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(181, 219, 112, 31);
		frame.getContentPane().add(btnCadastrar);
		
		inputDescricao = new JTextField();
		inputDescricao.setColumns(10);
		inputDescricao.setBounds(209, 55, 90, 25);
		frame.getContentPane().add(inputDescricao);
		
		inputValor = new JTextField();
		inputValor.setColumns(10);
		inputValor.setBounds(209, 98, 90, 25);
		frame.getContentPane().add(inputValor);
		
		inputData = new JTextField();
		inputData.setColumns(10);
		inputData.setBounds(209, 176, 90, 25);
		frame.getContentPane().add(inputData);
	}

}
