package frame.dropdownmenu;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.WorkspaceSettingMenuListener;

public class WorkscapeSetting extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem changeColor = null;
	JMenuItem changeScalability = null;

	public WorkscapeSetting() {
		WorkspaceSettingMenuListener workcpaceMenu = new WorkspaceSettingMenuListener();

		setText("Podešavanje radne površine");
		setFont(new Font("Arial", Font.PLAIN, 12));

		changeColor = new JMenuItem("Promijeni boju");
		changeColor.setActionCommand("Change color");
		changeColor.setFont(new Font("Arial", Font.PLAIN, 12));
		changeColor.setFocusable(false);
		changeColor.addActionListener(workcpaceMenu);
		add(changeColor);

		changeScalability = new JMenuItem("Promijeni skalabilnost");
		changeScalability.setActionCommand("Change scalability");
		changeScalability.setFont(new Font("Arial", Font.PLAIN, 12));
		changeScalability.setFocusable(false);
		changeScalability.addActionListener(workcpaceMenu);
		add(changeScalability);

	}

}
