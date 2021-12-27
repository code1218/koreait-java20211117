package a24_���������.swing.frame.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import a24_���������.service.AuthService;
import a24_���������.swing.dto.SigninDto;

public class SigninPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField usernameText;
	private JPasswordField passwordText;
	private AuthService authService;

	public SigninPanel(JPanel mainPanel, CardLayout mainCard) {
		setLayout(null);
		setSize(1000, 600);
		
		authService = new AuthService();
		
		JLabel signinTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		signinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signinTitle.setFont(new Font("���� ���", Font.BOLD, 20));
		signinTitle.setBounds(373, 100, 220, 54);
		add(signinTitle);
		
		JPanel signinItems = new JPanel();
		signinItems.setBackground(Color.WHITE);
		signinItems.setBounds(208, 167, 564, 335);
		add(signinItems);
		signinItems.setLayout(null);
		
		JLabel usernameLabel = new JLabel("\uC544\uC774\uB514");
		usernameLabel.setFont(new Font("���� ���", Font.BOLD, 16));
		usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLabel.setBounds(105, 87, 57, 15);
		signinItems.add(usernameLabel);
		
		usernameText = new JTextField();
		usernameText.setBounds(174, 78, 292, 40);
		signinItems.add(usernameText);
		usernameText.setColumns(10);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("���� ���", Font.BOLD, 16));
		passwordLabel.setBounds(92, 167, 70, 15);
		signinItems.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("���� ���", Font.BOLD, 16));
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
					// �α��� ����
					mainCard.show(mainPanel, "indexPanel");
				}else if(result == 0) {
					System.out.println("�������� �ʴ� ���̵�");
				}else if(result == 1) {
					System.out.println("��й�ȣ�� ��ġ���� ����");
				}
			}
		});
		signinBtn.setFont(new Font("���� ���", Font.BOLD, 16));
		signinBtn.setBounds(222, 244, 115, 40);
		signinItems.add(signinBtn);

	}
}
