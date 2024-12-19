package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

import frame.Statusline.StatusLine;
import frame.menu.MenuBar;
import frame.panels.ToolBarPanel;
import frame.panels.ToolBoxPanel;
import frame.tree.TreePanel;
import frame.workspace.Workspace;

public class MainPanel extends JPanel {

	// private static final long serialVersionUID=1L;
	public MainPanel() {
		setLayout(new BorderLayout());
		add(new ToolBarPanel(), BorderLayout.NORTH);

		add(new ToolBoxPanel(), BorderLayout.EAST);

		add(new Workspace(), BorderLayout.CENTER);

		add(new StatusLine(), BorderLayout.SOUTH);

		JScrollPane scrollPane = new JScrollPane(new TreePanel());
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		scrollPane.getVerticalScrollBar().setBackground(Color.decode("#B88675"));
		scrollPane.getHorizontalScrollBar().setBackground(Color.decode("#B88675"));

		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = Color.decode("#EFDAC2");
			}
		});
		scrollPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = Color.decode("#EFDAC2");
			}
		});

		add(scrollPane, BorderLayout.WEST);

	}

}
