package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * A class of object that represents the menu bar at the top of the CAH_Frame.
 * @author Holt Maki
 * @since CAH1.0
 * @version CAH1.0
 * 
 */
public class CAH_MenuBar extends JMenuBar{
	private static final long serialVersionUID = -4687887555666164293L;
	
	/**
	 * Creates an object that represents the menu bar at the top of the CAH_Frame.
	 * @author Holt Maki
	 * @since CAH1.0
	 * @version CAH1.0
	 */
	public CAH_MenuBar()
	{
		super();
		
		JMenu file = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		
		JMenuItem exit = new JMenuItem("Exit", MouseEvent.MOUSE_CLICKED);
		JMenuItem help = new JMenuItem("Help", MouseEvent.MOUSE_CLICKED);
		
		exit.addActionListener(new ExitListener());
		help.addActionListener(new HelpListener());
		
		file.add(exit);
		helpMenu.add(help);
		
		super.add(file);
		super.add(helpMenu);
	}
	
	/**
	 * A listener for the exit button on the CAH_MenuBar
	 * Tells the program to exit when clicked.
	 * @author Holt Maki
	 * @since CAH1.0
	 * @version CAH1.0
	 *
	 */
	private class ExitListener implements ActionListener 
	{
		/*TODO: make a dialog that is liek are u sure you want to exit,
		 * And that will ask about saving so that if its exit is hit by accident its not that big a deal
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}
	
	/**
	 * A listener that will tell the program what to do when the JMenuItem help is clicked.
	 * @author Holt Maki
	 * @since CAH1.0
	 * @version CAH1.0
	 *
	 */
	private class HelpListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			//FIXME fill
		}
		
	}
	
}
