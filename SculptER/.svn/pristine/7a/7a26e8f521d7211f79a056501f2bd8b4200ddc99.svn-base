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

public class ToolBarZoomIn extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton ZoomIn = null;
	//JSeparator separator = new JSeparator(SwingConstants.VERTICAL);

	public ToolBarZoomIn() {
		//separator.setBorder(new LineBorder(Color.black, 20));

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image zoomIn = toolkit.getImage("Icons/Zoom-in.png");
		zoomIn.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		ZoomIn = new JButton(new ImageIcon(zoomIn));
		ZoomIn.setToolTipText("Zumiraj");

		ZoomIn.setActionCommand("Zoom in");
		ZoomIn.setFocusable(false);
		ZoomIn.addActionListener(toolBar);
		//add(separator);
		addSeparator();
		add(ZoomIn);
	}
}
