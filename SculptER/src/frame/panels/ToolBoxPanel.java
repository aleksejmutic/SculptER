package frame.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import frame.toolbox.ToolBoxTools;

public class ToolBoxPanel extends JPanel {

	private JButton button = new JButton("Paleta sa objektima");
	ToolBoxTools tools = new ToolBoxTools();

	public ToolBoxPanel() {

		setPreferredSize(new Dimension(160, 0));
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(23, 5, 5, 5));

		Font font = button.getFont();
		button.setFont(font.deriveFont(font.getStyle() | font.BOLD));
		button.setPreferredSize(new Dimension(150, 50));
		button.setBackground(Color.decode("#EFDAC2"));
		button.revalidate();
		button.setFocusable(false);

		// da nestanu elementi kada se pritisne dugme

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tools.setVisible(!tools.isVisible());

			}
		});

		add(button, BorderLayout.NORTH);
		add(tools, BorderLayout.CENTER);
	}

}
