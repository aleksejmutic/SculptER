package listeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import frame.MainFrame;

public class FileMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
		switch (e.getActionCommand()) {
		case "New project":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Open project":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Save project":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Save as":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Import":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Export":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Exit":

			String[] opcije = { "Da", "Ne", "Odustani" };
			int result = JOptionPane.showOptionDialog(frame, "Da li želite da sačuvate promjene?", "Izlaz",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcije, opcije[0]);
			if (result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
						JOptionPane.INFORMATION_MESSAGE);

			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}

			break;

		}

	}

}
