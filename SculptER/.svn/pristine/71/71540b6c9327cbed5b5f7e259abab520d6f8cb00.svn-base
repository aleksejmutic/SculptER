package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarRedo extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Redo = null;

	public ToolBarRedo() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image redo = toolkit.getImage("Icons/Redo.png");
		redo.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Redo = new JButton(new ImageIcon(redo));

		Redo.setToolTipText("Vrati poništeni korak");
		Redo.setActionCommand("Redo");
		Redo.setFocusable(false);
		Redo.addActionListener(toolBar);
		add(Redo);
	}

}
