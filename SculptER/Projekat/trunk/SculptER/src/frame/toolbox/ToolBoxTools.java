package frame.toolbox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.tools.Tool;

import listeners.ToolBoxListener;

public class ToolBoxTools extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton entity = null;
	JButton weakEntity = null;
	JButton relationship = null;
	JButton weakRelationship = null;
	JButton atribute = null;
	JButton line = null;

	public ToolBoxTools() {

		ToolBoxListener toolBox = new ToolBoxListener();
		setPreferredSize(new Dimension(150, 0));
		//setBackground(Color.decode("#b88675"));
		setLayout(new FlowLayout(FlowLayout.LEFT));

		setBorder(new EmptyBorder(5, 5, 5, 5));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Image entityIcon = toolkit.getImage("Icons/Entity.png");
		entityIcon = entityIcon.getScaledInstance(60, 60, Image.SCALE_SMOOTH);

		entity = new JButton();
		entity.setIcon(new ImageIcon(entityIcon));
		entity.setPreferredSize(new Dimension(60, 60));
		entity.setToolTipText("Čvrsti entitet");
		entity.setActionCommand("Entity");
		entity.setOpaque(false);
		entity.setContentAreaFilled(false);
		entity.setBorderPainted(false);
		entity.setFocusable(false);
		entity.addActionListener(toolBox);
		add(entity);

		Image weakEntityIcon = toolkit.getImage("icons/WeakEntity.png");
		weakEntityIcon = weakEntityIcon.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		weakEntity = new JButton();
		weakEntity.setIcon(new ImageIcon(weakEntityIcon));
		weakEntity.setPreferredSize(new Dimension(60, 60));
		weakEntity.setToolTipText("Slabi entitet");
		weakEntity.setActionCommand("Weak entity");
		weakEntity.setOpaque(false);
		weakEntity.setContentAreaFilled(false);
		weakEntity.setBorderPainted(false);
		weakEntity.setFocusable(false);
		weakEntity.addActionListener(toolBox);
		add(weakEntity);

		Image relationshipIcon = toolkit.getImage("icons/Relationship.png");
		relationshipIcon = relationshipIcon.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		relationship = new JButton();
		relationship.setIcon(new ImageIcon(relationshipIcon));
		relationship.setPreferredSize(new Dimension(60, 60));
		relationship.setToolTipText("Veza");
		relationship.setActionCommand("Relationship");
		relationship.setOpaque(false);
		relationship.setContentAreaFilled(false);
		relationship.setBorderPainted(false);
		relationship.setFocusable(false);
		relationship.addActionListener(toolBox);
		add(relationship);

		Image atributeIcon = toolkit.getImage("icons/Atribute.png");
		atributeIcon = atributeIcon.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		atribute = new JButton();
		atribute.setIcon(new ImageIcon(atributeIcon));
		atribute.setPreferredSize(new Dimension(60, 60));
		atribute.setToolTipText("Aatribut");
		atribute.setActionCommand("Atribute");
		atribute.setOpaque(false);
		atribute.setContentAreaFilled(false);
		atribute.setBorderPainted(false);
		atribute.setFocusable(false);
		atribute.addActionListener(toolBox);
		add(atribute);

		Image lineIcon = toolkit.getImage("Icons/Line.png");
		lineIcon = lineIcon.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		line = new JButton();
		line.setIcon(new ImageIcon(lineIcon));
		line.setPreferredSize(new Dimension(60, 60));
		line.setToolTipText("Spojnica");
		line.setActionCommand("Connector");
		line.setOpaque(false);
		line.setContentAreaFilled(false);
		line.setFocusable(false);
		line.setBorderPainted(false);
		line.addActionListener(toolBox);
		add(line);

	}

}
