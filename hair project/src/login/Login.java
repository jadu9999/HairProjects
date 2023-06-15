package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame {

	public static void main(String[] args) {
		 Login();
		

	}

	// 비밀번호찾기창프레임----------------------------------------------
	public static void Findpwd() {
		JFrame jf = new JFrame();
		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(500, 300);
		jf.setTitle("비밀번호찾기");
		jf.setLayout(null);

		JLabel jl10 = new JLabel("아이디 : ");
		jl10.setSize(400, 30);
		jl10.setLocation(-140, 40);
		jl10.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl10);

		JTextField jt10 = new JTextField();
		jt10.setSize(270, 30);
		jt10.setLocation(140, 40);

		jf.add(jt10);

		JLabel jl11 = new JLabel("비밀번호 재설정 : ");
		jl11.setSize(400, 30);
		jl11.setLocation(-130, 80);
		jl11.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl11);

		JTextField jt11 = new JTextField();
		jt11.setSize(270, 30);
		jt11.setLocation(140, 80);

		jf.add(jt11);
		
		
		JLabel jl12 = new JLabel("비밀번호 확인 : ");
		jl12.setSize(400, 30);
		jl12.setLocation(-130, 120);
		jl12.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl12);

		JTextField jt12 = new JTextField();
		jt12.setSize(270, 30);
		jt12.setLocation(140, 120);

		jf.add(jt12);
		
		JButton bt6 = new JButton("확인");
		bt6.setSize(110, 25);
		bt6.setLocation(200, 180);

		jf.add(bt6);


		jf.setVisible(true);
	}

	// 아이디찾기창프레임-------------------------------------------------

	public static void FindId() {
		JFrame jf = new JFrame();
		jf = new JFrame();
		jf.setLocation(700, 300);
		jf.setSize(500, 300);
		jf.setTitle("아이디찾기");
		jf.setLayout(null);

		JLabel jl = new JLabel("이름 : ");
		jl.setSize(400, 30);
		jl.setLocation(-120, 40);
		jl.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl);

		JTextField jt = new JTextField();
		jt.setSize(270, 30);
		jt.setLocation(120, 40);

		jf.add(jt);

		JLabel jl2 = new JLabel("전화번호 : ");
		jl2.setSize(400, 30);
		jl2.setLocation(-120, 100);
		jl2.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl2);

		JTextField jt2 = new JTextField();
		jt2.setSize(270, 30);
		jt2.setLocation(120, 100);

		jf.add(jt2);

		JButton bt5 = new JButton("아이디찾기");
		bt5.setSize(250, 30);
		bt5.setLocation(130, 160);

		jf.add(bt5);

		jf.setVisible(true);

	}

	// 회원가입창프레임---------------------------------------------------
	public static void Join() {
		JFrame jf = new JFrame();
		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(500, 700);
		jf.setTitle("회원가입");
		jf.setLayout(null);

		JLabel jl3 = new JLabel("이름 : ");
		jl3.setSize(400, 30);
		jl3.setLocation(-120, 60);
		jl3.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl3);

		JTextField jt3 = new JTextField();
		jt3.setSize(270, 30);
		jt3.setLocation(120, 60);

		jf.add(jt3);

		JLabel jl4 = new JLabel("아이디 : ");
		jl4.setSize(400, 30);
		jl4.setLocation(-120, 150);
		jl4.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl4);

		JTextField jt4 = new JTextField();
		jt4.setSize(270, 30);
		jt4.setLocation(120, 150);

		jf.add(jt4);

		JLabel jl5 = new JLabel("비밀번호 : ");
		jl5.setSize(400, 30);
		jl5.setLocation(-120, 240);
		jl5.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl5);

		JTextField jt5 = new JTextField();
		jt5.setSize(270, 30);
		jt5.setLocation(120, 240);

		jf.add(jt5);

		JLabel jl6 = new JLabel("비밀번호 확인 : ");
		jl6.setSize(400, 30);
		jl6.setLocation(-130, 330);
		jl6.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl6);

		JTextField jt6 = new JTextField();
		jt6.setSize(270, 30);
		jt6.setLocation(120, 330);

		jf.add(jt6);

		JLabel jl7 = new JLabel("전화번호 : ");
		jl7.setSize(400, 30);
		jl7.setLocation(-120, 420);
		jl7.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl7);

		JTextField jt7 = new JTextField();
		jt7.setSize(270, 30);
		jt7.setLocation(120, 420);

		jf.add(jt7);

		JButton bt4 = new JButton("가입완료");
		bt4.setSize(275, 40);
		bt4.setLocation(115, 510);

		jf.add(bt4);

		jf.setVisible(true);
		//---------------------------------------------
		bt4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				HairDao hair = new HairDao();
				HairMemberVo member = new HairMemberVo();
				String msg = "";
				
				member.setId(jt4.getText());
				member.setPwd(jt5.getText());
				member.setName(jt3.getText());
				member.setPhone(jt7.getText());
				
				int result = hair.join(member);
				
				if(result == 1) {
					msg = "회원가입이완료되었습니다.";
				}
				else {
					msg = "회원가입실패";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		
		

	}

	// 로그인창프레임---------------------------------------
	public static void Login() {
		JFrame jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(500, 250);
		jf.setTitle("로그인");
		jf.setLayout(null);

		JLabel jl8 = new JLabel("아이디 : ");
		jl8.setSize(80, 30);
		jl8.setLocation(30, 30);
		jl8.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl8);

		JTextField jt8 = new JTextField();
		jt8.setSize(220, 30);
		jt8.setLocation(110, 30);

		jf.add(jt8);

		JLabel jl9 = new JLabel("비밀번호 : ");
		jl9.setSize(220, 30);
		jl9.setLocation(30, 70);

		jf.add(jl9);

		JTextField jt9 = new JTextField();
		jt9.setSize(220, 30);
		jt9.setLocation(110, 70);

		jf.add(jt9);

		JButton bt = new JButton("로그인");
		bt.setSize(100, 60);
		bt.setLocation(350, 35);
		jf.add(bt);

		jf.setVisible(true);

		JButton bt1 = new JButton("아이디찾기");
		bt1.setSize(110, 25);
		bt1.setLocation(60, 140);

		jf.add(bt1);

		JButton bt2 = new JButton("비밀번호찾기");
		bt2.setSize(115, 25);
		bt2.setLocation(200, 140);

		jf.add(bt2);

		JButton bt3 = new JButton("회원가입");
		bt3.setSize(110, 25);
		bt3.setLocation(340, 140);

		jf.add(bt3);

		// 회원가입 버튼 누르면 ---------------------------------
		bt3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Join();

			}
		});
		// 아이디찾기 버튼 누르면-------------------------------------
		bt1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				FindId();

			}
		});
		//비밀번호찾기 버튼 누르면---------------------------------------------------------
		bt2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Findpwd();

			}
		});
		
		
		
	}
}
