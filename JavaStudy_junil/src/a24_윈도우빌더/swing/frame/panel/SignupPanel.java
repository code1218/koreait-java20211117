package a24_윈도우빌더.swing.frame.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import a24_윈도우빌더.service.AuthService;
import a24_윈도우빌더.swing.dto.SignupDto;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignupPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static SignupPanel instance = new SignupPanel();
	
	private JPanel mainPane;
	private CardLayout mainCard;
	private JTextField usernameText;
	private JTextField nameText;
	private JTextField emailText;
	private JPasswordField passwordText;
	
	private SigninPanel signinPanel;
	private AuthService authService;
	
	private boolean usernameCheckFlag = false;
	
	public boolean isEmpty(String str, String label) {
		if(str.length() == 0) {
			JOptionPane.showMessageDialog(null, label + "은(는) 빈값일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
			return true;
		}else {
			return false;
		}
	}
	
	private SignupPanel() {
		setLayout(null);
		setSize(1000, 600);
		signinPanel = SigninPanel.getInstance();
		authService = new AuthService();
		
		JLabel signupTitle = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		signupTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signupTitle.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		signupTitle.setBounds(379, 61, 222, 44);
		add(signupTitle);
		
		JLabel usernameLabel = new JLabel("\uC0AC\uC6A9\uC790 \uC774\uB984");
		usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		usernameLabel.setBounds(283, 158, 96, 22);
		add(usernameLabel);
		
		usernameText = new JTextField();
		usernameText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				usernameCheckFlag = false;
			}
		});
		usernameText.setBounds(391, 154, 165, 38);
		add(usernameText);
		usernameText.setColumns(10);
		
		nameText = new JTextField();
		nameText.setColumns(10);
		nameText.setBounds(391, 281, 255, 38);
		add(nameText);
		
		JLabel nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		nameLabel.setBounds(283, 285, 96, 22);
		add(nameLabel);
		
		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(391, 342, 255, 38);
		add(emailText);
		
		JLabel emailLabel = new JLabel("\uC774\uBA54\uC77C");
		emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		emailLabel.setBounds(283, 346, 96, 22);
		add(emailLabel);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordLabel.setBounds(283, 224, 96, 22);
		add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(391, 220, 255, 38);
		add(passwordText);
		
		JButton btnNewButton = new JButton("\uAC00\uC785\uD558\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(isEmpty(usernameText.getText(), usernameLabel.getText())) {
					return;
				}else if(isEmpty(passwordText.getText(), passwordLabel.getText())) {
					return;
				}else if(isEmpty(nameText.getText(), nameLabel.getText())) {
					return;
				}else if(isEmpty(emailText.getText(), emailLabel.getText())) {
					return;
				}else if(usernameCheckFlag == false) {
					JOptionPane.showMessageDialog(null, "중복확인을 해주세요.", "중복확인 오류", JOptionPane.WARNING_MESSAGE);
				}else {
					SignupDto signupDto = new SignupDto();
					signupDto.setUsername(usernameText.getText());
					signupDto.setPassword(passwordText.getText());
					signupDto.setName(nameText.getText());
					signupDto.setEmail(emailText.getText());
					boolean result = authService.signup(signupDto);
					if(result == true) {
						JOptionPane.showMessageDialog(null, "회원이 되신 것을 축하드립니다.", "회원가입 성공", JOptionPane.PLAIN_MESSAGE);
						signinPanel.getUsernameText().setText(usernameText.getText());
						mainCard.show(mainPane, "signinPanel");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton.setBounds(390, 407, 256, 38);
		add(btnNewButton);
		
		JButton backBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usernameText.setText("");
				passwordText.setText("");
				nameText.setText("");
				emailText.setText("");
				mainCard.show(mainPane, "signinPanel");
			}
		});
		backBtn.setBounds(12, 10, 96, 38);
		add(backBtn);
		
		JButton usernameCheckBtn = new JButton("\uC911\uBCF5\uD655\uC778");
		usernameCheckBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// username 중복 체크
				boolean result = authService.usernameCheck(usernameText.getText());
				if(result == true) {
					usernameCheckFlag = true;
					JOptionPane.showMessageDialog(null, "가입가능한 사용자 이름입니다.", "가입가능", JOptionPane.PLAIN_MESSAGE);
				}else {
					usernameCheckFlag = false;
					JOptionPane.showMessageDialog(null, "이미 사용중인 사용자 이름입니다.", "가입불가능", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		usernameCheckBtn.setBounds(562, 154, 84, 38);
		add(usernameCheckBtn);
	}
	
	public static SignupPanel getInstance() {
		if(instance == null) {
			instance = new SignupPanel();
		}
		return instance;
	}
	
	public void setCardLayout(JPanel mainPanel, CardLayout mainCard) {
		this.mainPane = mainPanel;
		this.mainCard = mainCard;
	}
}
