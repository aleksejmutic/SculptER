package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarNewModel extends JToolBar {

	JButton createNewModel = null;

	public ToolBarNewModel() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image newModel = toolkit.getImage("Icons/NewDiagram.png");
		newModel.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		createNewModel = new JButton(new ImageIcon(newModel));
		createNewModel.setToolTipText("Kreiraj novi model");
		createNewModel.setActionCommand("Create new model");
		createNewModel.setFocusable(false);
		createNewModel.addActionListener(toolBar);
		add(createNewModel);

	}

}
