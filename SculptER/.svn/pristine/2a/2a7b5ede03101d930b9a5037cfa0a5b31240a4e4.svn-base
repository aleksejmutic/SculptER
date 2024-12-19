package frame.menubar;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import frame.dropdownmenu.FileMenuТransform;
import listeners.MenuModelListener;

public class ModelMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem newModel = null;
	JMenuItem OpenModel = null;
	JMenuItem Close = null;
	JMenuItem Delete = null;
	JMenuItem Save = null;
	JMenuItem SaveAs = null;
	JMenuItem Print = null;
	JMenuItem Import = null;
	JMenuItem Export = null;
	FileMenuТransform transformMenu = null;

	public ModelMenu() {

		MenuModelListener modelListenr = new MenuModelListener();

		setText("Model");
		setFont(new Font("Arial", Font.PLAIN, 12));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		newModel = new JMenuItem("Novi model");
		newModel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK));
		newModel.setActionCommand("New model");

		Image newModelIcon = toolkit.getImage("Icons/NewProject.png");
		newModel.setIcon(new ImageIcon(newModelIcon));

		newModel.setFont(new Font("Arial", Font.PLAIN, 12));
		newModel.setFocusable(false);
		newModel.addActionListener(modelListenr);
		add(newModel);

		OpenModel = new JMenuItem("Otvori model");
		OpenModel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.SHIFT_DOWN_MASK));
		OpenModel.setActionCommand("Open model");

		Image OpenModelIcon = toolkit.getImage("Icons/OpenProject.png");
		OpenModel.setIcon(new ImageIcon(OpenModelIcon));

		OpenModel.setFont(new Font("Arial", Font.PLAIN, 12));
		OpenModel.setFocusable(false);
		OpenModel.addActionListener(modelListenr);
		add(OpenModel);

		Close = new JMenuItem("Zatvori");
		Close.setActionCommand("Close");
		Close.setFont(new Font("Arial", Font.PLAIN, 12));
		Close.setFocusable(false);
		Close.addActionListener(modelListenr);
		add(Close);

		addSeparator();

		Delete = new JMenuItem("Obriši");
		Delete.setActionCommand("Delete");

		Image deleteIcon = toolkit.getImage("Icons/Delete.png");
		Delete.setIcon(new ImageIcon(deleteIcon));

		Delete.setFont(new Font("Arial", Font.PLAIN, 12));
		Delete.setFocusable(false);
		Delete.addActionListener(modelListenr);
		add(Delete);

		addSeparator();

		Save = new JMenuItem("Sačuvaj model");
		Save.setActionCommand("Save model");

		Image saveIcon = toolkit.getImage("Icons/Save.png");
		Save.setIcon(new ImageIcon(saveIcon));

		Save.setFont(new Font("Arial", Font.PLAIN, 12));
		Save.setFocusable(false);
		Save.addActionListener(modelListenr);
		add(Save);

		SaveAs = new JMenuItem("Sačuvaj kao");
		SaveAs.setActionCommand("Save as");

		Image saveAsIcon = toolkit.getImage("Icons/SaveAs.png");
		SaveAs.setIcon(new ImageIcon(saveAsIcon));

		SaveAs.setFont(new Font("Arial", Font.PLAIN, 12));
		SaveAs.setFocusable(false);
		SaveAs.addActionListener(modelListenr);
		add(SaveAs);

		addSeparator();

		Print = new JMenuItem("Štampaj");
		Print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.SHIFT_DOWN_MASK));
		Print.setActionCommand("Print");
		Print.setFont(new Font("Arial", Font.PLAIN, 12));
		Image printImage=toolkit.getImage("Icons/print.png");
		Print.setIcon(new ImageIcon(printImage));
		Print.setFocusable(false);
		Print.addActionListener(modelListenr);
		add(Print);

		addSeparator();

		Import = new JMenuItem("Importuj");
		Import.setActionCommand("Import");

		Image importIcon = toolkit.getImage("Icons/Import.png");
		Import.setIcon(new ImageIcon(importIcon));

		Import.setFont(new Font("Arial", Font.PLAIN, 12));
		Import.setFocusable(false);
		Import.addActionListener(modelListenr);
		add(Import);

		Export = new JMenuItem("Exportuj");
		Export.setActionCommand("Export");

		Image exportIcon = toolkit.getImage("Icons/Export.png");
		Export.setIcon(new ImageIcon(exportIcon));

		Export.setFont(new Font("Arial", Font.PLAIN, 12));
		Export.setFocusable(false);
		Export.addActionListener(modelListenr);
		add(Export);

		addSeparator();

		transformMenu = new FileMenuТransform();
		transformMenu.setFont(new Font("Arial", Font.PLAIN, 12));
		transformMenu.setFocusable(false);
		add(transformMenu);
	}
}
