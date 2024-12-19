package frame.menubar;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import listeners.FileMenuListener;

public class FileMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem newProject = null;
	JMenuItem OpenFile = null;
	JMenuItem Save = null;
	JMenuItem SaveAs = null;
	JMenuItem Import = null;
	JMenuItem Export = null;
	JMenuItem exit = null;

	public FileMenu() {

		FileMenuListener fileListenr = new FileMenuListener();

		setText("Fajl");
		setFont(new Font("Arial", Font.PLAIN, 12));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		newProject = new JMenuItem("Novi projekat");

		newProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		newProject.setActionCommand("New project");

		Image NewProjectIcon = toolkit.getImage("Icons/NewProject.png");
		newProject.setIcon(new ImageIcon(NewProjectIcon));

		newProject.setFont(new Font("Arial", Font.PLAIN, 12));
		newProject.setFocusable(false);
		newProject.addActionListener(fileListenr);

		add(newProject);

		OpenFile = new JMenuItem("Otvori projekat");
		OpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		OpenFile.setActionCommand("Open project");

		Image OpenFileIcon = toolkit.getImage("Icons/OpenProject.png");
		OpenFile.setIcon(new ImageIcon(OpenFileIcon));

		OpenFile.setFont(new Font("Arial", Font.PLAIN, 12));
		OpenFile.setFocusable(false);
		OpenFile.addActionListener(fileListenr);

		add(OpenFile);

		Save = new JMenuItem("Sačuvaj projekat");
		Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		Save.setActionCommand("Save project");

		Image saveIcon = toolkit.getImage("Icons/Save.png");
		Save.setIcon(new ImageIcon(saveIcon));

		addSeparator();

		Save.setFont(new Font("Arial", Font.PLAIN, 12));
		Save.setFocusable(false);

		Save.addActionListener(fileListenr);
		add(Save);

		SaveAs = new JMenuItem("Sačuvaj kao");
		SaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.SHIFT_DOWN_MASK));
		SaveAs.setActionCommand("Save as");

		Image saveAsIcon = toolkit.getImage("Icons/SaveAs.png");
		SaveAs.setIcon(new ImageIcon(saveAsIcon));

		SaveAs.setFont(new Font("Arial", Font.PLAIN, 12));
		SaveAs.setFocusable(false);
		SaveAs.addActionListener(fileListenr);

		add(SaveAs);

		addSeparator();

		Import = new JMenuItem("Importuj");
		Import.setActionCommand("Import");

		Image importIcon = toolkit.getImage("Icons/Import.png");
		Import.setIcon(new ImageIcon(importIcon));

		Import.setFont(new Font("Arial", Font.PLAIN, 12));
		Import.setFocusable(false);
		Import.addActionListener(fileListenr);

		add(Import);

		Export = new JMenuItem("Exportuj");
		Export.setActionCommand("Export");

		Image exportIcon = toolkit.getImage("Icons/Export.png");
		Export.setIcon(new ImageIcon(exportIcon));

		Export.setFont(new Font("Arial", Font.PLAIN, 12));
		Export.setFocusable(false);
		Export.addActionListener(fileListenr);

		add(Export);
		addSeparator();

		exit = new JMenuItem("Izađi");
		exit.setActionCommand("Exit");

		Image exitIcon = toolkit.getImage("Icons/Exit.png");

		exit.setIcon(new ImageIcon(exitIcon));

		exit.setFont(new Font("Arial", Font.PLAIN, 12));
		exit.setFocusable(false);
		exit.addActionListener(fileListenr);

		add(exit);

		setVisible(true);

	}
}
