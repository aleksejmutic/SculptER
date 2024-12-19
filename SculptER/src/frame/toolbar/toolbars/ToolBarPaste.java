package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarPaste extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Paste = null;

	public ToolBarPaste() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image paste = toolkit.getImage("Icons/Paste.png");
		paste.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Paste = new JButton(new ImageIcon(paste));
		Paste.setToolTipText("Zalijepi");

		Paste.setActionCommand("Paste");
		Paste.setFocusable(false);
		Paste.addActionListener(toolBar);

		add(Paste);
	}
}
