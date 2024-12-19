package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarUnderline extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Underline = null;

	public ToolBarUnderline() {

		ToolBarListener toolBar = new ToolBarListener();

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Image underline = toolkit.getImage("Icons/Underline.png");
		underline.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Underline = new JButton(new ImageIcon(underline));
		Underline.setToolTipText("Podvuci slova");

		Underline.setActionCommand("Underline");
		Underline.setFocusable(false);
		Underline.addActionListener(toolBar);
		add(Underline);
	}
}
