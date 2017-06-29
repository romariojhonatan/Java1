package view;

import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Di�logo sobre. 
 */
public class AboutDialog extends JDialog {
	
	/**
	 * Construtor.
	 * 
	 * @param mainFrame Janela principal.
	 */
	public AboutDialog(MainFrame mainFrame) {
		build(mainFrame);
	}

	/**
	 * Constr�i o di�logo.
	 * 
	 * @param mainFrame Janela principal do sistema,
	 */
	private void build(MainFrame mainFrame) {
		addComponents();
		setSize(300, 200);
		setIconImage();
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Adiciona os componentes no di�logo.
	 */
	private void addComponents() {
		String s = "Programa de Gest�o de Clientes - Vers�o 1.0";
		JLabel label = new JLabel(s);
		add(label);
	}

	/**
	 * Define a imagem da logo.
	 */
	private void setIconImage() {
		URL iconURL = getClass().getResource("/images/logo.png");
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
