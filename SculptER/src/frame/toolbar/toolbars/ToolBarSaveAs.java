package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarSaveAs extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton SaveAs = null;

	public ToolBarSaveAs() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image saveAs = toolkit.getImage("Icons/SaveAs.png");
		saveAs.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		SaveAs = new JButton(new ImageIcon(saveAs));
		SaveAs.setToolTipText("Sačuvaj kao");
		SaveAs.setActionCommand("Save as");
		SaveAs.setFocusable(false);
		SaveAs.addActionListener(toolBar);
		add(SaveAs);
	}
}
