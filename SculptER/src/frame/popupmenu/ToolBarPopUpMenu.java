package frame.popupmenu;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import frame.MainFrame;

public class ToolBarPopUpMenu extends JPopupMenu {
	
	JCheckBoxMenuItem menuItem=null;
	
	private static final long serialVersionUID = 1L;

	public ToolBarPopUpMenu()
	{
		menuItem=new JCheckBoxMenuItem("Prikaži paletu sa alatima");
		menuItem.setFont(new Font("Arial",Font.PLAIN,12));
		menuItem.setActionCommand("PopUp");
		menuItem.setVisible(true);
		menuItem.setBounds(100,100,50,50);
		
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				JOptionPane.showMessageDialog(frame,"Finkcionalnost u fazi implementacije","Poruka",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(menuItem);
	}
	

}
