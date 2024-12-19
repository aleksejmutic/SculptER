package frame.menubar;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.HelpMenuListener;

public class HelpMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem onlineHelp = null;
	JMenuItem faq = null;
	JMenuItem aboutSculptER = null;

	public HelpMenu() {

		HelpMenuListener helpMenu = new HelpMenuListener();
		setText("Pomoć");
		setFont(new Font("Arial", Font.PLAIN, 12));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		onlineHelp = new JMenuItem("Onlajn pomoć");
		onlineHelp.setActionCommand("Online help");

		Image onlineHelpIcon = toolkit.getImage("Icons/OnlineHelp.png");
		onlineHelpIcon = onlineHelpIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		onlineHelp.setIcon(new ImageIcon(onlineHelpIcon));

		onlineHelp.setFont(new Font("Arial", Font.PLAIN, 12));
		onlineHelp.setFocusable(false);
		onlineHelp.addActionListener(helpMenu);
		add(onlineHelp);

		faq = new JMenuItem("FAQ");
		faq.setActionCommand("Faq");

		Image faqIcon = toolkit.getImage("Icons/Faq.png");
		faqIcon = faqIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		faq.setIcon(new ImageIcon(faqIcon));

		faq.setFont(new Font("Arial", Font.PLAIN, 12));
		faq.setFocusable(false);
		faq.addActionListener(helpMenu);
		add(faq);

		aboutSculptER = new JMenuItem("O alatu SculptER");
		aboutSculptER.setActionCommand("About SculptER");

		Image aboutSculptERIcon = toolkit.getImage("Icons/AboutSculptER.png");
		aboutSculptERIcon = aboutSculptERIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		aboutSculptER.setIcon(new ImageIcon(aboutSculptERIcon));

		aboutSculptER.setFont(new Font("Arial", Font.PLAIN, 12));
		aboutSculptER.setFocusable(false);
		aboutSculptER.addActionListener(helpMenu);
		add(aboutSculptER);
	}

}
