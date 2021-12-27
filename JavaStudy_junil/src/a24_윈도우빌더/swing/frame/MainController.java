package a24_孺紫辦網渦.swing.frame;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import a24_孺紫辦網渦.swing.frame.panel.AccountsPanel;
import a24_孺紫辦網渦.swing.frame.panel.IndexPanel;
import a24_孺紫辦網渦.swing.frame.panel.SigninPanel;
import a24_孺紫辦網渦.swing.frame.panel.SignupPanel;
import a24_孺紫辦網渦.swing.frame.panel.WelcomPanel;

public class MainController extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel;
	private CardLayout mainCard;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					MainController frame = new MainController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	public MainController() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 612);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainCard = new CardLayout(0, 0);
		mainPanel.setLayout(mainCard);
		mainPanel.setSize(1000,600);
		
		setContentPane(mainPanel);
		
		JPanel welcomPanel = new WelcomPanel(mainPanel, mainCard);
		mainPanel.add(welcomPanel, "welcomPanel");
		
		JPanel signinPanel = new SigninPanel(mainPanel, mainCard);
		mainPanel.add(signinPanel, "signinPanel");
		
		JPanel signupPanel = new SignupPanel(mainPanel, mainCard);
		mainPanel.add(signupPanel, "signupPanel");
		
		JPanel indexPanel = new IndexPanel(mainPanel, mainCard);
		mainPanel.add(indexPanel, "indexPanel");
		
		JPanel accountsPanel = new AccountsPanel(mainPanel, mainCard);
		mainPanel.add(accountsPanel, "accountsPanel");
		
		JPanel panel = new JPanel();
		mainPanel.add(panel, "name_26744048052600");
		
		
	}
}
