package frame.dropdownmenu;

import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.EntityMenuListener;

public class EntityMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem strongEntity = null;
	JMenuItem weakEntity = null;

	public EntityMenu() {
		EntityMenuListener entityMenu = new EntityMenuListener();

		setText("Entitet");
		setFont(new Font("Arial", Font.PLAIN, 12));

		strongEntity = new JMenuItem("Čvrsti Entitet");
		strongEntity.setActionCommand("Strong entity");
		strongEntity.setFont(new Font("Arila", Font.PLAIN, 12));
		strongEntity.setFocusable(false);
		strongEntity.addActionListener(entityMenu);
		add(strongEntity);

		weakEntity = new JMenuItem("Slabi Entitet");
		weakEntity.setActionCommand("Weak entity");
		weakEntity.setFont(new Font("Arila", Font.PLAIN, 12));
		weakEntity.setFocusable(false);
		weakEntity.addActionListener(entityMenu);
		add(weakEntity);

	}

}
