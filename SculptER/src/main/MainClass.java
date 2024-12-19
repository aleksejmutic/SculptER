package main;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import frame.MainFrame;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*	for(LookAndFeelInfo laInfo:UIManager.getInstalledLookAndFeels())
		{
		System.out.println(laInfo.getClassName());
		}*/
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MainFrame frame =new MainFrame();
	}

}
