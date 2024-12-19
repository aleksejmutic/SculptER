package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarZoomOut extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton ZoomOut = null;

	public ToolBarZoomOut() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image zoomOut = toolkit.getImage("Icons/Zoom-out.png");
		zoomOut.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		ZoomOut = new JButton(new ImageIcon(zoomOut));
		ZoomOut.setToolTipText("Odzumiraj");

		ZoomOut.setActionCommand("Zoom out");
		ZoomOut.setFocusable(false);
		ZoomOut.addActionListener(toolBar);
		add(ZoomOut);
	}
}
