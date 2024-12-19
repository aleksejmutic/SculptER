package frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import frame.menu.MenuBar;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	
	Image logo;
	JLabel logoLabel;

	public MainFrame() {
		

		logo = Toolkit.getDefaultToolkit().getImage("Icons/logo.png").getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		logo.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
		Dimension dimension = getToolkit().getDefaultToolkit().getScreenSize();
		this.setLocation(dimension.width / 4 - this.getSize().width / 4,
				dimension.height / 6 - this.getSize().height / 2);
		

		setTitle("SculptER");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setIconImage(logo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(800, 600));
		
		setContentPane(new MainPanel());
		setJMenuBar(new MenuBar());
		
		 addWindowListener(new WindowAdapter() {
			  @Override
			  public void windowClosing(WindowEvent e) {
					MainFrame frame = (MainFrame) e.getSource();
					String[] opcije = { "Da", "Ne", "Odustani" };
					int result = JOptionPane.showOptionDialog(frame, "Da li želite da sačuvate promjene?", "Izlaz",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcije, opcije[0]);
					if (result == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
								JOptionPane.INFORMATION_MESSAGE);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					} else if  (result == JOptionPane.NO_OPTION) {
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}else if(result==JOptionPane.CANCEL_OPTION)
					{
						frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
					}
					
				}
			});
		

		setVisible(true);

	}

}
