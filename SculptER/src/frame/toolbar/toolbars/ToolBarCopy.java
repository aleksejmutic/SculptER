package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarCopy extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Copy = null;

	public ToolBarCopy() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image copy = toolkit.getImage("Icons/Copy.png");
		copy.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Copy = new JButton(new ImageIcon(copy));
		Copy.setToolTipText("Kopiraj");

		Copy.setActionCommand("Copy");
		Copy.setFocusable(false);
		Copy.addActionListener(toolBar);
		add(Copy);
	}

}
