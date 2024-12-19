package frame.toolbar.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.ToolBarListener;

public class ToolBarNewProject extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton createNewProject = null;

	public ToolBarNewProject() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ToolBarListener toolBar = new ToolBarListener();

		Image newProject = toolkit.getImage("Icons/NewProject.png");
		newProject.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		createNewProject = new JButton(new ImageIcon(newProject));
		createNewProject.setToolTipText("Kreiraj novi projekat");
		createNewProject.setActionCommand("Create new project");
		createNewProject.setFocusable(false);
		createNewProject.addActionListener(toolBar);
		add(createNewProject);

	}

}
