package frame.panels;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import frame.popupmenu.ToolBarPopUpMenu;
import frame.toolbar.toolbars.ToolBarBold;
import frame.toolbar.toolbars.ToolBarCopy;
import frame.toolbar.toolbars.ToolBarCut;
import frame.toolbar.toolbars.ToolBarItalic;
import frame.toolbar.toolbars.ToolBarNewModel;
import frame.toolbar.toolbars.ToolBarNewProject;
import frame.toolbar.toolbars.ToolBarPaste;
import frame.toolbar.toolbars.ToolBarRedo;
import frame.toolbar.toolbars.ToolBarSave;
import frame.toolbar.toolbars.ToolBarSaveAs;
import frame.toolbar.toolbars.ToolBarUnderline;
import frame.toolbar.toolbars.ToolBarUndo;
import frame.toolbar.toolbars.ToolBarZoomIn;
import frame.toolbar.toolbars.ToolBarZoomOut;
import listeners.ToolBarListener;

public class ToolBarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ToolBarNewProject newProject = null;
	ToolBarNewModel newModel = null;
	ToolBarSave Save = null;
	ToolBarSaveAs SaveAs = null;
	ToolBarUndo Undo = null;
	ToolBarRedo Redo = null;
	ToolBarCut Cut = null;
	ToolBarCopy Copy = null;
	ToolBarPaste Paste = null;
	ToolBarZoomIn ZoomIn = null;
	ToolBarZoomOut ZoomOut = null;
	ToolBarBold Bold = null;
	ToolBarItalic Italic = null;
	ToolBarUnderline Underline = null;
	ToolBarPopUpMenu menu = null;

	public ToolBarPanel() {

		setBackground(Color.decode("#EFDAC2"));

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		newProject = new ToolBarNewProject();
		newProject.setFloatable(false);
		add(newProject);

		newModel = new ToolBarNewModel();
		newModel.setFloatable(false);
		add(newModel);

		Save = new ToolBarSave();
		Save.setFloatable(false);
		add(Save);

		SaveAs = new ToolBarSaveAs();
		SaveAs.setFloatable(false);
		add(SaveAs);

		Undo = new ToolBarUndo();
		Undo.setFloatable(false);
		add(Undo);

		Redo = new ToolBarRedo();
		Redo.setFloatable(false);
		add(Redo);

		Cut = new ToolBarCut();
		Cut.setFloatable(false);
		add(Cut);

		Copy = new ToolBarCopy();
		Copy.setFloatable(false);
		add(Copy);

		Paste = new ToolBarPaste();
		Paste.setFloatable(false);
		add(Paste);

		ZoomIn = new ToolBarZoomIn();
		ZoomIn.setFloatable(false);
		add(ZoomIn);

		ZoomOut = new ToolBarZoomOut();
		ZoomOut.setFloatable(false);
		add(ZoomOut);

		Bold = new ToolBarBold();
		Bold.setFloatable(false);
		add(Bold);

		Italic = new ToolBarItalic();
		Italic.setFloatable(false);
		add(Italic);

		Underline = new ToolBarUnderline();
		Underline.setFloatable(false);
		add(Underline);

		setComponentPopupMenu(new ToolBarPopUpMenu());
		// Treba pop up meni
		// Treba sta se nalayi u toolbar-u

	}

}
