package frame.dropdownmenu;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.AddObjectListener;

public class AddObject extends JMenu {

	private static final long serialVersionUID = 1L;

	EntityMenu entityMenu = null;
	JMenuItem linkMenu = null;
	JMenuItem attributemenu = null;
	JMenuItem connectorMenu = null;

	public AddObject() {
		AddObjectListener addObjectMenu = new AddObjectListener();

		setText("Dodaj objekat");
		setFont(new Font("Arial", Font.PLAIN, 12));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		entityMenu = new EntityMenu();
		add(entityMenu);

		linkMenu = new JMenuItem("Veza");
		linkMenu.setActionCommand("Link");
		linkMenu.setFont(new Font("Arial", Font.PLAIN, 12));
		linkMenu.setFocusable(false);
		linkMenu.addActionListener(addObjectMenu);
		add(linkMenu);

		attributemenu = new JMenuItem("Atribut");
		attributemenu.setActionCommand("Attribute");
		attributemenu.setFont(new Font("Arial", Font.PLAIN, 12));
		attributemenu.setFocusable(false);
		attributemenu.addActionListener(addObjectMenu);
		add(attributemenu);

		connectorMenu = new JMenuItem("Spojnica");
		connectorMenu.setActionCommand("Connector");
		connectorMenu.setFont(new Font("Arial", Font.PLAIN, 12));
		connectorMenu.setFocusable(false);
		connectorMenu.addActionListener(addObjectMenu);
		add(connectorMenu);

	}

}
