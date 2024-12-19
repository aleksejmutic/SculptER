package frame.workspace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

import frame.MainFrame;

public class Workspace extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	public Workspace() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBorder(new EmptyBorder(0,0,0,0));
		setPreferredSize(new Dimension(screenSize.width * 3 / 4, screenSize.height));
		this.AddTabs();

	}

	public void AddTabs() {

		JScrollPane projectPane = new JScrollPane(new TabPanel("ProjectPhotos/Bolnica.png"));
		projectPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		projectPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		projectPane.getVerticalScrollBar().setBackground(Color.decode("#B88675"));
		projectPane.getHorizontalScrollBar().setBackground(Color.decode("#B88675"));
	    
		projectPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
	        @Override
	        protected void configureScrollBarColors() {
	            this.thumbColor = Color.decode("#EFDAC2");
	        }
	    });
		projectPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
	        @Override
	        protected void configureScrollBarColors() {
	            this.thumbColor = Color.decode("#EFDAC2");
	        }
	    });
		
		this.addTab("Proba.qvi", projectPane);
		this.setTabComponentAt(this.indexOfComponent(projectPane), tabHeader("BolnicaKoncModel.qvi"));
		JScrollPane scrollPane1 = new JScrollPane(new TabPanel("ProjectPhotos/Biblioteka.png"));
		

		scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		scrollPane1.getVerticalScrollBar().setBackground(Color.decode("#B88675"));
		scrollPane1.getHorizontalScrollBar().setBackground(Color.decode("#B88675"));
	    
		scrollPane1.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
	        @Override
	        protected void configureScrollBarColors() {
	            this.thumbColor = Color.decode("#EFDAC2");
	        }
	    });
		scrollPane1.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
	        @Override
	        protected void configureScrollBarColors() {
	            this.thumbColor = Color.decode("#EFDAC2");
	        }
	    });
		
		this.addTab("ProdavnicaKoncModel.qvi", scrollPane1);
		this.setTabComponentAt(this.indexOfComponent(scrollPane1), tabHeader("BibliotekaKoncModel.qvi"));

		this.setFont(new Font("Arial", Font.PLAIN, 12));

		this.setFocusable(false);
		setVisible(true);

	}

	private JPanel tabHeader(String title) {
		JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		titlePanel.setOpaque(false);

		JLabel titleLbl = new JLabel(title);
		titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10)); // Add space on the right
		titlePanel.add(titleLbl);

		JButton closeButton = new JButton("X");
		closeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());

				JOptionPane.showMessageDialog(frame , "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		closeButton.setFont(new Font("Arial", Font.BOLD, 12));
		closeButton.setOpaque(false);
		closeButton.setContentAreaFilled(false);
		closeButton.setMargin(new Insets(0, 0, 0, 0));
		closeButton.setBorderPainted(false);
		closeButton.setFocusable(false);
		titlePanel.add(closeButton);

		return titlePanel;

	}
}
