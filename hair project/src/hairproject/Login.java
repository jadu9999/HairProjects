package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {

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

	//-----------------------------------------------------
			jf.add(bt1);

			JButton bt2 = new JButton("비밀번호찾기");
			bt2.setSize(115, 25);
			bt2.setLocation(200, 140);

			jf.add(bt2);
	//------------------------------------------------------------------------
			JButton bt3 = new JButton("회원가입");
			bt3.setSize(110, 25);
			bt3.setLocation(340, 140);

			jf.add(bt3);

			bt.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					HairMemberVo member = new HairMemberVo();
					String msg = "";
					// member에는 아무것도일단 안들어있어
					member.setId(jt8.getText());
					member.setPwd(jt9.getText());
					// member에 입력한값이 들어가있음
					HairDao dao = new HairDao();
					member = dao.loginCheck(member);

					System.out.println(member);

					if (member.getId() == null) {
						msg = "아이디/비밀번호를 확인해주세요";
						JOptionPane.showMessageDialog(null, msg);
					} else if (member.getId() != null) {
						msg = "로그인이 성공했습니다.";
						JOptionPane.showMessageDialog(null, msg);

						if (member.getPositions().equals("Master")) {
							Masterhome.masterhome(member);
						} else if (member.getPositions().equals("User")) {
							System.out.println("여기까진살아있음");
							new Userhome(member);
						}
					}
				}
			});

			// 회원가입 버튼 누르면 ---------------------------------
			bt3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					Join.Join();

				}
			});
			// 아이디찾기 버튼 누르면-------------------------------------
			bt1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					Findid.FindId();

				}
			});
			// 비밀번호찾기 버튼 누르면---------------------------------------------------------
			bt2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					Findpwd.Findpwd();

				}
			});

}
}
