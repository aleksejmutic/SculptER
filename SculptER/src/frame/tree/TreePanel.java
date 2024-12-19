package frame.tree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;



public class TreePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JTree tree = null;
	JLabel name=null;
	public TreePanel() {
		name=new JLabel();
		name.setText("Pretraživač");
		name.setFont(new Font("Arial",Font.PLAIN,15));
		setBackground(Color.decode("#EFDAC2"));
		Dimension size = new Dimension(200,750);
		setPreferredSize(size);
		
		tree = new JTree(new CustomTree()); 
		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		tree.setPreferredSize(size);
		tree.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));	
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setCellRenderer(new TreeRander());
		tree.setRowHeight(22);
		tree.setVisible(true);
		add(name);
		add(tree);
		

	}
}
