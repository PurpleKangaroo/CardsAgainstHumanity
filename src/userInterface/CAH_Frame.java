package userInterface;

import game.CAH_Game;
import game.RuleConflictException;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JFrame;

/**
 * A class of object that makes the frame that a Cards Against Humanity game is run in.
 * @author Nick Walker
 * @author Holt Maki
 * @since CAH1.0
 * @version CAH1.0
 *
 */
public class CAH_Frame extends JFrame implements Runnable {
	private static final long serialVersionUID = -3033860031108235857L;
	private CAH_Game game;

	/**
	 * Creates a new frame in which a cards against of humanity game is shown in.
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws RuleConflictException Thrown if there is a rule conflict. Handle by telling the user that they used an invalid combination of rules.
	 */
	public CAH_Frame() throws IOException, URISyntaxException, RuleConflictException
	{
		super("Cards Against Humanity");
		super.setLayout(new BorderLayout());
		add(new CAH_MenuBar(), BorderLayout.NORTH);
		//PathFinder a = new PathFinder();
		setDefaultLookAndFeelDecorated(true);
		//setIconImage(new ImageIcon(a.getCAH_Path("/Cards Against Humanity/src/CAH_GraphicsFiles/CAHIcon.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CAH_Panel_STARTGAME start = new CAH_Panel_STARTGAME();
		super.add(start);
		
		setMinimumSize(new Dimension(800,600));
		super.pack();
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		super.setVisible(true);
		
		//Then we start up the game.
		
		game = start.getGame();
		CAH_Panel_GAME panel = new CAH_Panel_GAME(10, game.getPlayers().get(0));//FIXME We have to find a way to identify which player is which
		//super.remove(start);
		
		//TODO change to get the number of players
		super.add(panel);
		
	}
	
	public void run()
	{
		
	}
	
	public static void main(String [] args) throws URISyntaxException, IOException, RuleConflictException
	{
		//PathFinder a = new PathFinder();
		CAH_Frame a = new CAH_Frame();
	}

}
