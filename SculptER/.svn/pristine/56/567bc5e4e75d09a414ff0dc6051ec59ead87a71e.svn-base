package frame.menubar;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.UserMenuListener;

public class UserMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem Login = null;
	JMenuItem Registration = null;
	JMenuItem Logout = null;
	JMenuItem ChangePassword = null;

	public UserMenu() {
		UserMenuListener userMenu = new UserMenuListener();

		setText("Korisnik");
		setFont(new Font("Arial", Font.PLAIN, 12));

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Login = new JMenuItem("Prijava");
		Login.setActionCommand("Log in");
		Image loginIcon = toolkit.getImage("Icons/LogIn.png");
		loginIcon = loginIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		Login.setIcon(new ImageIcon(loginIcon));
		Login.setFont(new Font("Arial", Font.PLAIN, 12));
		Login.setFocusable(false);
		Login.addActionListener(userMenu);
		add(Login);

		Registration = new JMenuItem("Registracija");
		Registration.setActionCommand("Sign in");
		Image RegistrationIcon = toolkit.getImage("Icons/Registration.png");
		RegistrationIcon = RegistrationIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		Registration.setIcon(new ImageIcon(RegistrationIcon));
		Registration.setFont(new Font("Arial", Font.PLAIN, 12));
		Registration.setFocusable(false);
		Registration.addActionListener(userMenu);
		add(Registration);

		ChangePassword = new JMenuItem("Promjena lozinke");
		ChangePassword.setActionCommand("Change password");
		ChangePassword.setFont(new Font("Arial", Font.PLAIN, 12));
		ChangePassword.setFocusable(false);
		ChangePassword.addActionListener(userMenu);
		add(ChangePassword);

		Logout = new JMenuItem("Odjava");
		Logout.setActionCommand("Log out");
		Image LogoutIcon = toolkit.getImage("Icons/LogOut.png");
		LogoutIcon = LogoutIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		Logout.setIcon(new ImageIcon(LogoutIcon));
		Logout.setFont(new Font("Arial", Font.PLAIN, 12));
		Logout.setFocusable(false);
		Logout.addActionListener(userMenu);
		add(Logout);

	}
}
