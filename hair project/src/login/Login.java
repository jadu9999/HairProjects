package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login extends JFrame {

	public static void main(String[] args) {
		//Login();
		String [] days = new String [31];
		userhome(new HairMemberVo(), days);
		

	}
	
	//로그인 성공하면 나오는user프레임-----------------------------------------
	
	public static void userhome(HairMemberVo member , String [] days) {
		JFrame jf = new JFrame();
		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(680, 500);
		jf.setTitle("예약하기");
		jf.setLayout(null);
		
		JLabel jl13 = new JLabel("닉네임 : " + member.getName() + " Rank: " + member.getRank());
		jl13.setSize(400, 30);
		jl13.setLocation(120, 15);
		jl13.setHorizontalAlignment(JLabel.CENTER);
		
		jf.add(jl13);
		
		String [] content = {"cut","perm","color"};
		JComboBox cb = new JComboBox(content);
		cb.setLocation(490,100);
		cb.setSize(120,25);
		
		jf.add(cb);
		
		String [] year = {"2023"};
		JComboBox cb2 = new JComboBox(year);
		cb2.setLocation(40,100);
		cb2.setSize(120,25);
		
		jf.add(cb2);
		
		String [] month = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
		JComboBox cb3 = new JComboBox(month);
		cb3.setLocation(190,100);
		cb3.setSize(120,25);
		
		jf.add(cb3);
		
		String [] day = {"1일"};
		
		
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb=(JComboBox<String>)e.getSource();
				String days =cb.getSelectedItem().toString();
				
				System.out.println(days);
				
				switch (days) {
				case "2월": day[28]=null;day[29]=null; day[30] =null;
				
							break;
				}
				
			}
		});
		
		
		
		
		JComboBox cb4 = new JComboBox(day);
		cb4.setLocation(340,100);
		cb4.setSize(120,25);
		
		jf.add(cb4);
		jf.setVisible(false);
		
		
	
		JButton bt18 = new JButton("09:00");
		bt18.setSize(120, 50);
		bt18.setLocation(40, 200);

		jf.add(bt18);

		JButton bt7 = new JButton("10:00");
		bt7.setSize(120, 50);
		bt7.setLocation(190, 200);

		jf.add(bt7);
		
		JButton bt8 = new JButton("11:00");
		bt8.setSize(120, 50);
		bt8.setLocation(340, 200);

		jf.add(bt8);
		
		JButton bt9 = new JButton("12:00");
		bt9.setSize(120, 50);
		bt9.setLocation(490, 200);

		jf.add(bt9);
		
		JButton bt10 = new JButton("13:00");
		bt10.setSize(120, 50);
		bt10.setLocation(40, 270);

		jf.add(bt10);
		
		JButton bt11 = new JButton("14:00");
		bt11.setSize(120, 50);
		bt11.setLocation(190, 270);

		jf.add(bt11);
		
		JButton bt12 = new JButton("15:00");
		bt12.setSize(120, 50);
		bt12.setLocation(340, 270);

		jf.add(bt12);
		
		JButton bt13 = new JButton("16:00");
		bt13.setSize(120, 50);
		bt13.setLocation(490, 270);

		jf.add(bt13);
		
		JButton bt14 = new JButton("17:00");
		bt14.setSize(120, 50);
		bt14.setLocation(40, 340);

		jf.add(bt14);
		
		JButton bt15 = new JButton("18:00");
		bt15.setSize(120, 50);
		bt15.setLocation(190, 340);

		jf.add(bt15);
		
		JButton bt16 = new JButton("19:00");
		bt16.setSize(120, 50);
		bt16.setLocation(340, 340);

		jf.add(bt16);
		
		JButton bt17 = new JButton("20:00");
		bt17.setSize(120, 50);
		bt17.setLocation(490, 340);

		jf.add(bt17);

		

		
		
		
		
		jf.setVisible(true);
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
		//-------------------회원가입버튼눌렀을때 db--------------------------
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
		
		bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				HairMemberVo member = new HairMemberVo();
				String msg = "";
				//member에는 아무것도일단 안들어있어
				member.setId(jt8.getText());
				member.setPwd(jt9.getText());
				//member에 입력한값이 들어가있음
				HairDao dao = new HairDao();
				member = dao.loginCheck(member);
				
				System.out.println(member);
				
				if(member.getId() == null) {
					msg = "아이디/비밀번호를 확인해주세요";
					JOptionPane.showMessageDialog(null, msg);
				}
				
				else if(member.getId() != null){
					msg = "로그인이 성공했습니다.";
					JOptionPane.showMessageDialog(null, msg);
					
					if(member.getPositions().equals("Master")) {
						
					}
					else {
						//userhome(member);
					}
				}
				
				
			}
		});

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
