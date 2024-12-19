package frame.tree;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.EventObject;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeCellRenderer;



public class TreeRander extends JLabel implements TreeCellRenderer{

	private static final long serialVersionUID = 1L;
	DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();

	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {
		this.setText(value.toString());
		this.setFont(new Font("Arial",Font.PLAIN,12));
		
		
		this.setFocusable(false);
	

		
		//podesavanje izgleda ikonica elemenata stabla u zavisnosti od naziva fajla
		if (value.toString().endsWith(".qvi")) {

			if (value.toString().contains("Konc") || value.toString().contains("Conc")) {
				Image conceptualIcon = toolkit.getImage("icons/conceptual model.png");
				this.setIcon(new ImageIcon(conceptualIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			} else if (value.toString().contains("Log")) {
				Image logicalIcon = toolkit.getImage("icons/logical model.png");
				this.setIcon(new ImageIcon(logicalIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			}
		} else if (value.toString().endsWith(".sql")) {
			Image scriptIcon = toolkit.getImage("icons/sql_icon.png");
			this.setIcon(new ImageIcon(scriptIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		} else {
			Image folderImage = toolkit.getImage("icons/Folder.png");
			this.setIcon(new ImageIcon(folderImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}

		this.setOpaque(true);
		
		//definisanje ponasanja prilikom selektovanja elementa stabla
		if (selected) {
			this.setBackground(Color.lightGray);
		} else {
			this.setBackground(Color.white);
		}
		return this;
	}

	

	
	

	
}
