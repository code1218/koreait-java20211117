package a24_윈도우빌더.swing.frame.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import a24_윈도우빌더.service.AuthService;
import a24_윈도우빌더.session.Principal;
import a24_윈도우빌더.swing.dto.SigninDto;

public class SigninPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private IndexPanel indexPanel;
	
	private JTextField usernameText;
	private JPasswordField passwordText;
	private AuthService authService;
	
	private Principal principal;

	public SigninPanel(JPanel mainPanel, CardLayout mainCard) {
		setLayout(null);
		setSize(1000, 600);
		
		authService = new AuthService();
		
		principal = Principal.getInstance();
		indexPanel = IndexPanel.getInstance();
		
		JLabel signinTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		signinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signinTitle.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		signinTitle.setBounds(373, 100, 220, 54);
		add(signinTitle);
		
		JPanel signinItems = new JPanel();
		signinItems.setBackground(Color.WHITE);
		signinItems.setBounds(208, 167, 564, 335);
		add(signinItems);
		signinItems.setLayout(null);
		
		JLabel usernameLabel = new JLabel("\uC544\uC774\uB514");
		usernameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLabel.setBounds(105, 87, 57, 15);
		signinItems.add(usernameLabel);
		
		usernameText = new JTextField();
		usernameText.setBounds(174, 78, 292, 40);
		signinItems.add(usernameText);
		usernameText.setColumns(10);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordLabel.setBounds(92, 167, 70, 15);
		signinItems.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordText.setBounds(174, 158, 292, 40);
		signinItems.add(passwordText);
		
		JButton signinBtn = new JButton("\uB85C\uADF8\uC778");
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SigninDto signinDto = new SigninDto();
				signinDto.setUsername(usernameText.getText());
				signinDto.setPassword(passwordText.getText());
				int result = authService.signin(signinDto);
				if(result == 2) {
					// 로그인 성공
					JOptionPane.showMessageDialog(null, principal.getUser().getName() + "님 환영합니다.", "로그인 성공", JOptionPane.PLAIN_MESSAGE);
					indexPanel.getProfileBtn().setText(principal.getUser().getUsername());
					usernameText.setText("");
					passwordText.setText("");
					mainCard.show(mainPanel, "indexPanel");
				}else if(result == 0) {
					JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.", "아이디 오류", JOptionPane.ERROR_MESSAGE);
				}else if(result == 1) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		signinBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		signinBtn.setBounds(222, 244, 115, 40);
		signinItems.add(signinBtn);

	}
}
