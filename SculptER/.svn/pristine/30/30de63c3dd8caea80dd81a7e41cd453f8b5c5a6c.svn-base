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

public class ToolBarBold extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Bold = null;
	//JSeparator separator = new JSeparator(SwingConstants.VERTICAL);

	public ToolBarBold() {

		ToolBarListener toolBar = new ToolBarListener();

		//separator.setBorder(new LineBorder(Color.black, 20));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Image bold = toolkit.getImage("Icons/Bold.png");
		bold.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Bold = new JButton(new ImageIcon(bold));
		Bold.setToolTipText("Boldiraj slova");

		Bold.setActionCommand("Bold");
		Bold.setFocusable(false);
		Bold.addActionListener(toolBar);
		//add(separator);
		addSeparator();

		add(Bold);
	}
}
