package frame.popupmenu;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit.CutAction;

import frame.dropdownmenu.AddObject;
import frame.dropdownmenu.WorkscapeSetting;
import listeners.MenuPopUpListener;

public class MenuPopUp extends JPopupMenu {
	
	private static final long serialVersionUID = 1L;

	JMenuItem undo=null;
	JMenuItem redo=null;
	JMenuItem cut=null;
	JMenuItem copy=null;
	JMenuItem paste=null;
	JMenuItem selectAll=null;
	WorkscapeSetting workspaceSetting=null;
	
	public MenuPopUp()
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		MenuPopUpListener popUp=new MenuPopUpListener();
		
		undo=new JMenuItem("Vrati korak unazad");
		undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_DOWN_MASK));
		undo.setActionCommand("Undo");
		Image undoIcon=toolkit.getImage("Icons/Undo.png");
		undoIcon=undoIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		undo.setIcon(new ImageIcon(undoIcon));
		undo.setFont(new Font("Arial",Font.PLAIN,12));
		undo.setFocusable(false);
		undo.addActionListener(popUp);
		add(undo);
		
		redo=new JMenuItem("Vrati poništeni korak");
		redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,KeyEvent.CTRL_DOWN_MASK));
		redo.setActionCommand("Redo");
		Image redoIcon=toolkit.getImage("Icons/Redo.png");
		redoIcon=redoIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		redo.setIcon(new ImageIcon(redoIcon));
		redo.setFont(new Font("Arial",Font.PLAIN,12));
		redo.setFocusable(false);
		redo.addActionListener(popUp);
		add(redo);
		
		addSeparator();
		
		workspaceSetting=new WorkscapeSetting();
		add(workspaceSetting);
		addSeparator();
		
		cut=new JMenuItem("Isjeci");
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
		cut.setActionCommand("Cut");
		Image cutIcon=toolkit.getImage("Icons/Cut.png");
		cutIcon=cutIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		cut.setIcon(new ImageIcon(cutIcon));
		cut.setFont(new Font("Arial",Font.PLAIN,12));
		cut.setFocusable(false);
		cut.addActionListener(popUp);
		add(cut);
		
		copy=new JMenuItem("Kopiraj");
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
		copy.setActionCommand("Copy");
		Image copyIcon=toolkit.getImage("Icons/Copy.png");
		copyIcon=copyIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		copy.setIcon(new ImageIcon(copyIcon));
		copy.setFont(new Font("Arial",Font.PLAIN,12));
		copy.setFocusable(false);
		copy.addActionListener(popUp);
		add(copy);
		
		paste=new JMenuItem("Nalijepi");
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
		paste.setActionCommand("Paste");
		Image pasteIcon=toolkit.getImage("Icons/Paste.png");
		pasteIcon=pasteIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		paste.setIcon(new ImageIcon(pasteIcon));
		paste.setFont(new Font("Arial",Font.PLAIN,12));
		paste.setFocusable(false);
		paste.addActionListener(popUp);
		add(paste);
		
		addSeparator();
		
		selectAll=new JMenuItem("Selektuj sve");
		selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
		selectAll.setActionCommand("Select all");
		selectAll.setFont(new Font("Arial",Font.PLAIN,12));
		selectAll.setFocusable(false);
		selectAll.addActionListener(popUp);
		add(selectAll);
		
	}

}
