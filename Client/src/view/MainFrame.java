package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * Janela principal do sistema.
 */
public class MainFrame extends JFrame {

	/**
	 * Contrutor.
	 */
	public MainFrame() {
		build();
	}

	/**
	 * Constrói a Janela.
	 */
	private void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		buildComponets();
		setTitle("Gestão de Clientes");
		setSize(400, 300);
		setIconImage();
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Esse método chama os outros métodos que pupulam a frame.
	 */
	private void buildComponets() {
		buildButton();
		buildSearchPanel();
	}

	/**
	 * Esse método constroi o menu de busca.
	 */
	private void buildSearchPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		String[] a = { "Nome", "CPF" };
		JComboBox<String> comboBox = new JComboBox<>(a);
		panel.add(comboBox, new GBC(0, 0));
		JTextField textField = new JTextField(20);
		panel.add(textField, new GBC(1, 0).horizontal());
		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable();
		scrollPane.add(table);
		panel.add(scrollPane, new GBC(0, 1).gridwh(2, 0).both());

		add(panel, new GBC(0, 0).both());
	}

	/**
	 * Esse método constroi e coloca os butões no painel.
	 */
	private void buildButton() {
		JPanel panel = new JPanel(new GridBagLayout());
		JButton newButton = new JButton("Novo");
		newButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddClientDialog(MainFrame.this);
			}
		});
		panel.add(newButton, new GBC(0, 0).horizontal());
		JButton editButton = new JButton("Alterar");
		panel.add(editButton, new GBC(0, 1));
		JButton deleteButton = new JButton("Excluir");
		panel.add(deleteButton, new GBC(0, 2));
		add(panel, new GBC(1, 0).top());
	}

	/**
	 * Constrói o menu.
	 */
	private void buildMenu() {
		JMenuBar menuBar = new JMenuBar();

		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);

		JMenuItem aboutItem = new JMenuItem("Sobre");
		aboutItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new AboutDialog(MainFrame.this);
			}
		});
		helpMenu.add(aboutItem);

		JMenuItem exitItem = new JMenuItem("Sair");
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		helpMenu.add(exitItem);

		setJMenuBar(menuBar);
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
