package ui;

import game.HouseRules;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class CAH_NewGame extends JLayeredPane {
//TODO: Create examples applet in the left area.
	/**
	 * Create the panel.
	 * @since CAH1.0
	 * @author Holt Maki
	 */
	public CAH_NewGame() {
		setBounds(new Rectangle(0, 0, 1450, 700));
		setMaximumSize(new Dimension(1450, 700));
		
		JPanel StartGameMenus = new JPanel();
		StartGameMenus.setOpaque(false);
		StartGameMenus.setBounds(299, 230, 636, 459);
		add(StartGameMenus);
		StartGameMenus.setLayout(null);
		
		JPanel Rules = new JPanel();
		Rules.setBounds(0, 0, 636, 115);
		Rules.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Rules", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		Rules.setOpaque(false);
		StartGameMenus.add(Rules);
		Rules.setLayout(null);
		
		JPanel HouseRulesPanel = new JPanel();
		HouseRulesPanel.setBounds(16, 16, 473, 81);
		HouseRulesPanel.setBorder(new TitledBorder(null, "House Rules", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		HouseRulesPanel.setOpaque(false);
		Rules.add(HouseRulesPanel);
		
		JCheckBox chckbxhappyEnding = new JCheckBox("<html><body style=\"color:WHITE\">Happy Ending</body></html>");
		chckbxhappyEnding.setToolTipText(wrap(HouseRules.HAPPY_ENDING.getDescription()));
		chckbxhappyEnding.setOpaque(false);
		HouseRulesPanel.add(chckbxhappyEnding);
		
		JCheckBox chckbxrebootingTheUniverse = new JCheckBox("<html><body style=\"color:WHITE\">Rebooting the Universe</body></html>");
		chckbxrebootingTheUniverse.setOpaque(false);
		chckbxrebootingTheUniverse.setToolTipText(wrap(HouseRules.REBOOTING_THE_UNIVERSE.getDescription()));
		HouseRulesPanel.add(chckbxrebootingTheUniverse);
		
		JCheckBox chckbxpackingHeat = new JCheckBox("<html><body style=\"color:WHITE\">Packing Heat</body></html>");
		chckbxpackingHeat.setOpaque(false);
		chckbxpackingHeat.setToolTipText(wrap(HouseRules.PACKING_HEAT.getDescription()));
		HouseRulesPanel.add(chckbxpackingHeat);
		
		JCheckBox chckbxrandoCardrissian = new JCheckBox("<html><body style=\"color:WHITE\">Rando Cardrissian</body></html>");
		chckbxrandoCardrissian.setOpaque(false);
		chckbxrandoCardrissian.setToolTipText(wrap(HouseRules.RANDO_CARDRISSIAN.getDescription()));
		HouseRulesPanel.add(chckbxrandoCardrissian);
		
		JCheckBox chckbxgodIsDead = new JCheckBox("<html><body style=\"color:WHITE\">God Is Dead</body></html>");
		chckbxgodIsDead.setOpaque(false);
		chckbxgodIsDead.setToolTipText(wrap(HouseRules.GOD_IS_DEAD.getDescription()));
		HouseRulesPanel.add(chckbxgodIsDead);
		
		JCheckBox chckbxsurvivalOfThe = new JCheckBox("<html><body style=\"color:WHITE\">Survival of the Fittest</body></html>");
		chckbxsurvivalOfThe.setOpaque(false);
		chckbxsurvivalOfThe.setToolTipText(wrap(HouseRules.SURVIVAL_OF_THE_FITTEST.getDescription()));
		HouseRulesPanel.add(chckbxsurvivalOfThe);
		
		JCheckBox chckbxseriousBuisness = new JCheckBox("<html><body style=\"color:WHITE\">Serious Buisness</body></html>");
		chckbxseriousBuisness.setOpaque(false);
		chckbxseriousBuisness.setToolTipText(wrap(HouseRules.SERIOUS_BUSINESS.getDescription()));
		HouseRulesPanel.add(chckbxseriousBuisness);
		
		JCheckBox chckbxneverHaveI = new JCheckBox("<html><body style=\"color:WHITE\">Never Have I Ever</body</html>");
		chckbxneverHaveI.setOpaque(false);
		chckbxneverHaveI.setToolTipText(wrap(HouseRules.NEVER_HAVE_I_EVER.getDescription()));
		HouseRulesPanel.add(chckbxneverHaveI);
		
		JPanel gamblingPanel = new JPanel();
		gamblingPanel.setBorder(new TitledBorder(null, "Gambling", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		gamblingPanel.setOpaque(false);
		gamblingPanel.setBounds(494, 33, 132, 50);
		Rules.add(gamblingPanel);
		
		ButtonGroup gamblingButtons = new ButtonGroup();
		
		JRadioButton rdbtnOn = new JRadioButton("<html><body style=\"color:WHITE\">On</body></html>");
		rdbtnOn.setOpaque(false);
		gamblingButtons.add(rdbtnOn);
		gamblingPanel.add(rdbtnOn);
		
		JRadioButton rdbtnoff = new JRadioButton("<html><body style=\"color:WHITE\">Off</body></html>");
		rdbtnoff.setOpaque(false);
		gamblingButtons.add(rdbtnoff);
		gamblingPanel.add(rdbtnoff);
		
		JPanel Decks = new JPanel();
		Decks.setBorder(new TitledBorder(null, "Decks", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		Decks.setOpaque(false);
		Decks.setBounds(0, 126, 636, 64);
		StartGameMenus.add(Decks);
		
		JCheckBox chckbxOriginal = new JCheckBox("<html><body style=\"color:WHITE\">Original</body></html>");
		chckbxOriginal.setOpaque(false);
		Decks.add(chckbxOriginal);
		
		JCheckBox chckbxExpansion = new JCheckBox("<html><body style=\"color:WHITE\">Expansion 1</body></html>");
		chckbxExpansion.setOpaque(false);
		Decks.add(chckbxExpansion);
		
		JCheckBox chckbxExpansion_1 = new JCheckBox("<html><body style=\"color:WHITE\">Expansion 2</body></html>");
		chckbxExpansion_1.setOpaque(false);
		Decks.add(chckbxExpansion_1);
		
		JCheckBox chckbxExpansion_2 = new JCheckBox("<html><body style=\"color:WHITE\">Expansion 3</body></html>");
		chckbxExpansion_2.setOpaque(false);
		Decks.add(chckbxExpansion_2);
		
		JCheckBox chckbxExpansion_3 = new JCheckBox("<html><body style=\"color:WHITE\">Expansion 4</body></hmtl>");
		chckbxExpansion_3.setOpaque(false);
		Decks.add(chckbxExpansion_3);
		
		JCheckBox chckbxHolidayExpansion = new JCheckBox("<html><body style=\"color:WHITE\">Holiday Expansion</body></html>");
		chckbxHolidayExpansion.setOpaque(false);
		Decks.add(chckbxHolidayExpansion);
		
		JPanel AddPlayerPanel = new JPanel();
		AddPlayerPanel.setBorder(new TitledBorder(null, "Players", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		AddPlayerPanel.setOpaque(false);
		AddPlayerPanel.setBounds(0, 201, 636, 226);
		StartGameMenus.add(AddPlayerPanel);
		AddPlayerPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 32, 616, 2);
		AddPlayerPanel.add(separator);
		
		JButton btnAddPlayer = new JButton("<html><h2 style=\"color:GREEN\">+</h2></html>");
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: fill
			}
		});
		btnAddPlayer.setOpaque(false);
		btnAddPlayer.setBounds(579, 11, 47, 23);
		AddPlayerPanel.add(btnAddPlayer);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(10, 45, 616, 170);
		AddPlayerPanel.add(scrollPane);
		
		JList PlayerList = new JList();
		scrollPane.setViewportView(PlayerList);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setOpaque(false);
		btnStartGame.setBounds(272, 425, 89, 23);
		StartGameMenus.add(btnStartGame);
		
		JLabel lblCardsAgainstHumanity = new JLabel("Cards Against Humanity");
		lblCardsAgainstHumanity.setBounds(83, 43, 1024, 139);
		add(lblCardsAgainstHumanity);
		lblCardsAgainstHumanity.setForeground(Color.WHITE);
		lblCardsAgainstHumanity.setFont(new Font("Arial Black", Font.BOLD, 70));
		
		JLabel NewGameBackground = new JLabel("");
		NewGameBackground.setIcon(new ImageIcon(CAH_NewGame.class.getResource("/graphics/signupbackground.jpg")));
		NewGameBackground.setAlignmentX(Component.CENTER_ALIGNMENT);
		NewGameBackground.setBounds(0, 0, 1450, 722);
		add(NewGameBackground);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{HouseRulesPanel, Rules, StartGameMenus, NewGameBackground, chckbxhappyEnding, chckbxrebootingTheUniverse, chckbxpackingHeat, chckbxrandoCardrissian, chckbxgodIsDead, chckbxsurvivalOfThe, chckbxseriousBuisness, chckbxneverHaveI, gamblingPanel, rdbtnOn, rdbtnoff, Decks, chckbxOriginal, chckbxExpansion, chckbxExpansion_1, chckbxExpansion_2, chckbxExpansion_3, chckbxHolidayExpansion, AddPlayerPanel}));
		
		UIManager.put("ToolTip.background", new ColorUIResource(253, 255, 166));
		
		
	}
	
	/**
	 * Wraps the string for the tool tips.
	 * The wrapping is done with HTML
	 * @param str - the string that will be wrapped with HTML.
	 * @return str + "<</html>/html>" - the String wrapped in HTML plus the closing "<</html>/html>".
	 * <html>
	 * @since CAH1.0
	 * @author Holt Maki
	 * 
	 */
	private String wrap(String str)
	{
		str = "<html>" + str;
		for(int i = 50; i<str.length(); i+=50)
		{
		
			try
			{
				while(str.charAt(i) != ' ' && i <str.length())
				{
					i++;
				}
				
				if (i<str.length())
				{
					str = str.substring(0,i) +"<br>" + str.substring(i);
				}
			}
			
			catch(Exception e)
			{
				
			}
						
		}
		
		return str + "</html>";
	}
}
