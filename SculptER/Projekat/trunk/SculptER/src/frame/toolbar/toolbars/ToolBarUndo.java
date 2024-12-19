package frame.toolbar.toolbars;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import listeners.ToolBarListener;

public class ToolBarUndo extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Undo = null;
	//JSeparator separator = new JSeparator(SwingConstants.VERTICAL);

	public ToolBarUndo() {
		//separator.setBorder(new LineBorder(Color.black, 20));

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image undo = toolkit.getImage("Icons/Undo.png");
		undo.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Undo = new JButton(new ImageIcon(undo));

		Undo.setToolTipText("Vrati korak unazad");
		Undo.setActionCommand("Undo");
		Undo.setFocusable(false);
		Undo.addActionListener(toolBar);
		//add(separator);
		addSeparator();
		add(Undo);
	}
}
