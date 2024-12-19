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

public class ToolBarCut extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton Cut = null;
	//JSeparator separator = new JSeparator(SwingConstants.VERTICAL);

	public ToolBarCut() {
		//separator.setBorder(new LineBorder(Color.black, 20));

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image cut = toolkit.getImage("Icons/Cut.png");
		cut.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		Cut = new JButton(new ImageIcon(cut));
		Cut.setToolTipText("Isijeci");

		Cut.setActionCommand("Cut");
		Cut.setFocusable(false);
		Cut.addActionListener(toolBar);
		//add(separator);
		addSeparator();
		add(Cut);
	}
}
