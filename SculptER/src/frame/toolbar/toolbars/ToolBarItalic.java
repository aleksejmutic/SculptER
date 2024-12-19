package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarItalic extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Italic = null;

	public ToolBarItalic() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image bold = toolkit.getImage("Icons/Italic.png");
		bold.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Italic = new JButton(new ImageIcon(bold));
		Italic.setToolTipText("Zakrivi slova");

		Italic.setActionCommand("Italic");
		Italic.setFocusable(false);
		Italic.addActionListener(toolBar);
		add(Italic);
	}

}
