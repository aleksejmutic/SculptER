package frame.menubar;

import java.awt.Font;
import java.text.Normalizer.Form;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import frame.dropdownmenu.WorkscapeSetting;
import listeners.WindowMenuListener;

public class WindowMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem languageSetting = null;
	JMenuItem fontSetting = null;
	WorkscapeSetting workspaceSetting = null;

	public WindowMenu() {
		WindowMenuListener windowMenu = new WindowMenuListener();

		setText("Prozor");
		setFont(new Font("Arial", Font.PLAIN, 12));

		languageSetting = new JMenuItem("Podešavanje jezika");
		languageSetting.setFont(new Font("Arial", Font.PLAIN, 12));
		languageSetting.setActionCommand("Language setting");
		languageSetting.setFocusable(false);
		languageSetting.addActionListener(windowMenu);
		add(languageSetting);

		fontSetting = new JMenuItem("Podešavanje fonta");
		fontSetting.setFont(new Font("Arial", Font.PLAIN, 12));
		fontSetting.setActionCommand("Font setting");
		fontSetting.setFocusable(false);
		fontSetting.addActionListener(windowMenu);
		add(fontSetting);

		workspaceSetting = new WorkscapeSetting();

		add(workspaceSetting);
	}
}
