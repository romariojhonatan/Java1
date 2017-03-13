package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddClientDialog extends JDialog {
	
	/**
	 * Método construtor da frame.
	 * 
	 * @param mainFrame
	 */
	public AddClientDialog(MainFrame mainFrame) {
		buildComponets();
		setLayout(new GridBagLayout());
		pack();
		setTitle("Adicionar Cliente");
		setResizable(false);
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setModal(true);
		setVisible(true);
	}
	
	/**
	 * Esse método constroi os componentes da frame.
	 */
	private void buildComponets() {
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel labelName = new JLabel("Nome:");
		panel.add(labelName, new GBC(0, 0).left());
		JTextField nameField = new JTextField(20);
		panel.add(nameField, new GBC(1, 0).left().insets(5, 5, 5, 5));
		JLabel labelCPF = new JLabel("CFP:");
		panel.add(labelCPF, new GBC(0, 1).left());
		JTextField cpfField = new JTextField(20);
		panel.add(cpfField, new GBC(1, 1).left().insets(5, 5, 5, 5));
		JLabel brithdaylabel = new JLabel("Data de Nascimento:");
		panel.add(brithdaylabel, new GBC(0, 2).left());
		JTextField brithdayField = new JTextField(20);
		panel.add(brithdayField, new GBC(1, 2).left().insets(5, 5, 5, 5));
		JButton saveButton = new JButton("Salvar");
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
			}
		});
		panel.add(saveButton, new GBC(1, 3).right().insets(5, 0, 5, 5));
		
		

		add(panel);
	}
	
	/**
	 * Colocar imagem da tela.
	 */
	private void setIconImage() {
		URL iconURL = getClass().getResource("/images/Chrysanthemum.jpg");
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());
	}
}
