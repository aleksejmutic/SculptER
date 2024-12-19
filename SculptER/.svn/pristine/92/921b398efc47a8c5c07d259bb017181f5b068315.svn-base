package frame.dropdownmenu;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.TransformMenuListener;

public class FileMenuТransform extends JMenu {

	JMenuItem conceptualMenuItem = null;
	JMenuItem logicalMenuItem = null;
	JMenuItem scriptMenuItem = null;

	private static final long serialVersionUID = 1L;

	public FileMenuТransform() {

		TransformMenuListener transformMenu = new TransformMenuListener();
		setText("Transformiši u...");

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		conceptualMenuItem = new JMenuItem("Konceptualni model");
		Image conceptualIcon = toolkit.getImage("icons/ConceptualModel.png");
		conceptualIcon = conceptualIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		conceptualMenuItem.setIcon(new ImageIcon(conceptualIcon));
		conceptualMenuItem.setActionCommand("Conceptual");
		conceptualMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		conceptualMenuItem.addActionListener(transformMenu);
		add(conceptualMenuItem);

		logicalMenuItem = new JMenuItem("Logički model");
		Image logicalIcon = toolkit.getImage("icons/LogicalModel.png");
		logicalIcon = logicalIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		logicalMenuItem.setIcon(new ImageIcon(logicalIcon));
		logicalMenuItem.setActionCommand("Logical");
		logicalMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		logicalMenuItem.addActionListener(transformMenu);
		add(logicalMenuItem);

		scriptMenuItem = new JMenuItem("SQL skriptu");
		Image scriptIcon = toolkit.getImage("icons/sql_icon.png");
		scriptIcon = scriptIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		scriptMenuItem.setIcon(new ImageIcon(scriptIcon));
		scriptMenuItem.setActionCommand("Script");
		scriptMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		scriptMenuItem.addActionListener(transformMenu);
		add(scriptMenuItem);
	}

}
