package frame.Statusline;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusLine extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public StatusLine()
	{
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		setBackground(Color.decode("#EFDAC2"));
		setPreferredSize(new Dimension(0,20));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel status=new JLabel("Spreman");
		status.setFont(new Font("Times New Roman",1,12));
		status.setForeground(Color.black);
		status.setBounds(0,0,100,22);
		add(status);
		
	}
	

}
