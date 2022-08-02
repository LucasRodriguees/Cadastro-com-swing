package Teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField jTxtNome;
	private JTextField jTxtEmail;
	private JTextField jTxtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
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
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 413, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(10, 20, 44, 20);
		frame.getContentPane().add(lblNewLabel);
		
		jTxtNome = new JTextField();
		jTxtNome.setBounds(56, 20, 241, 20);
		frame.getContentPane().add(jTxtNome);
		jTxtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(10, 67, 44, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		jTxtEmail = new JTextField();
		jTxtEmail.setBounds(56, 69, 241, 20);
		frame.getContentPane().add(jTxtEmail);
		jTxtEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 118, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		jTxtIdade = new JTextField();
		jTxtIdade.setBounds(56, 115, 241, 20);
		frame.getContentPane().add(jTxtIdade);
		jTxtIdade.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(jTxtNome.getText());
				cliente.setEmail(jTxtEmail.getText());
				cliente.setIdade(Integer.parseInt (jTxtIdade.getText()));
				JOptionPane.showMessageDialog(null, cliente.salvar());
				jTxtNome.setText("");
				jTxtEmail.setText("");
				jTxtIdade.setText("");
				
			}
		});
		btnNewButton.setBounds(181, 146, 117, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
