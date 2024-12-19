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

public class ToolBarSave extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton save = null;
	//JSeparator separator = new JSeparator(SwingConstants.VERTICAL);

	public ToolBarSave() {

		//separator.setBorder(new LineBorder(Color.black, 20));

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image Save = toolkit.getImage("Icons/Save.png");
		Save.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		save = new JButton(new ImageIcon(Save));
		save.setToolTipText("Sačuvaj");
		save.setActionCommand("Save");
		save.setFocusable(false);
		save.addActionListener(toolBar);
		//add(separator);
		addSeparator();
		add(save);

	}

}
