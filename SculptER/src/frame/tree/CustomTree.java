package frame.tree;

import javax.swing.tree.DefaultMutableTreeNode;

public class CustomTree extends DefaultMutableTreeNode {

	private static final long serialVersionUID = 1L;

	public CustomTree() {
		super("root");
		DefaultMutableTreeNode fakultet = new DefaultMutableTreeNode("Bolnica");
		add(fakultet);
		DefaultMutableTreeNode konceptualni2 = new DefaultMutableTreeNode("BolnicaKoncModel.qvi");
		fakultet.add(konceptualni2);
		DefaultMutableTreeNode logicki2 = new DefaultMutableTreeNode("BolnicaLogModel.qvi");
		fakultet.add(logicki2);
		DefaultMutableTreeNode skripta2 = new DefaultMutableTreeNode("BolnicaSQLSkripta.sql");
		fakultet.add(skripta2);

		DefaultMutableTreeNode prodavnica = new DefaultMutableTreeNode("Biblioteka");
		add(prodavnica);
		DefaultMutableTreeNode konceptualni1 = new DefaultMutableTreeNode("BibliotekaKoncModel.qvi");
		prodavnica.add(konceptualni1);
		DefaultMutableTreeNode logicki1 = new DefaultMutableTreeNode("BibliotekaLogModel.qvi");
		prodavnica.add(logicki1);
		DefaultMutableTreeNode skripta1 = new DefaultMutableTreeNode("BibliotekaSQLSkripta.sql");
		prodavnica.add(skripta1);

	}
}
