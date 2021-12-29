package a24_À©µµ¿ìºô´õ.swing.frame.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

import a24_À©µµ¿ìºô´õ.session.Principal;
import lombok.Data;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Data
public class IndexPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static IndexPanel instance = new IndexPanel();
	
	private JButton profileBtn;
	private Principal principal;
	private JPanel mainPane;
	private CardLayout mainCard;
	
	private AccountsPanel accountsPanel;
	
	private IndexPanel() {
		principal = Principal.getInstance();
		accountsPanel = AccountsPanel.getInstance();
		
		setLayout(null);
		setSize(1000, 600);
		
		JLabel indexTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		indexTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		indexTitle.setBounds(47, 21, 170, 37);
		add(indexTitle);
		
		profileBtn = new JButton("");
		profileBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountsPanel.getNameText().setText(principal.getUser().getName());
				accountsPanel.getEmailText().setText(principal.getUser().getEmail());
				mainCard.show(mainPane, "accountsPanel");
			}
		});
		profileBtn.setBounds(714, 21, 128, 37);
		add(profileBtn);
		
		JButton logoutBtn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				principal.setUser(null);
				mainCard.show(mainPane, "signinPanel");
			}
		});
		logoutBtn.setBounds(867, 21, 102, 37);
		add(logoutBtn);
	}
	
	public static IndexPanel getInstance() {
		if(instance == null) {
			instance = new IndexPanel();
		}
		return instance;
	}

	public void setCardLayout(JPanel mainPanel, CardLayout mainCard) {
		this.mainPane = mainPanel;
		this.mainCard = mainCard;
	}
}
