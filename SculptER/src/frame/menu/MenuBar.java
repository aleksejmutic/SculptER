package frame.menu;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import frame.dropdownmenu.AddObject;
import frame.dropdownmenu.FileMenuТransform;
import frame.menubar.EditMenu;
import frame.menubar.FileMenu;
import frame.menubar.HelpMenu;
import frame.menubar.ModelMenu;
import frame.menubar.UserMenu;
import frame.menubar.WindowMenu;

public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	FileMenu file=new FileMenu();
	ModelMenu model=new ModelMenu();
	EditMenu editMenu=new EditMenu();
	AddObject addObject=new AddObject();
	WindowMenu windowMenu=new WindowMenu();
	UserMenu userMenu=new UserMenu();
	HelpMenu helpMenu=new HelpMenu();
	
	public MenuBar()
	{
		
		add(file);
		add(model);
		add(editMenu);
		add(windowMenu);
		add(userMenu);
		add(helpMenu);
		

	}
}
