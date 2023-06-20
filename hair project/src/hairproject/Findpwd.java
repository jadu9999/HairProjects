package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Findpwd {
	public static void Findpwd() {
		JFrame jf = new JFrame();
		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(500, 310);
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

		JLabel jl13 = new JLabel("전화번호 : ");
		jl13.setSize(400, 30);
		jl13.setLocation(-140, 80);
		jl13.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl13);

		JTextField jt13 = new JTextField();
		jt13.setSize(270, 30);
		jt13.setLocation(140, 80);

		jf.add(jt13);

		JLabel jl11 = new JLabel("비밀번호 재설정 : ");
		jl11.setSize(400, 30);
		jl11.setLocation(-130, 120);
		jl11.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl11);

		JTextField jt11 = new JTextField();
		jt11.setSize(270, 30);
		jt11.setLocation(140, 120);

		FocusAction fc = new FocusAction();
		fc.setPwd1(jt11.getText());

		jt11.addFocusListener(fc);

		jf.add(jt11);

		JLabel jl12 = new JLabel("비밀번호 확인 : ");
		jl12.setSize(400, 30);
		jl12.setLocation(-130, 160);
		jl12.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl12);

		JTextField jt12 = new JTextField();
		jt12.setSize(270, 30);
		jt12.setLocation(140, 160);

		fc.setPwd2(jt12.getText());

		jt12.addFocusListener(fc);
		jf.add(jt12);

		JButton bt6 = new JButton("확인");
		bt6.setSize(110, 25);
		bt6.setLocation(200, 210);

		jf.add(bt6);

		jf.setVisible(true);

		// 비밀번호찾기 눌렀을때 db--------------------------------------
		bt6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				HairDao hair = new HairDao();
				HairMemberVo member = new HairMemberVo();
				String msg = "";

				member.setId(jt10.getText());
				member.setPhone(jt13.getText());
				member.setPwd(jt11.getText());

				int findchangepwd = hair.findchangepwd(member);

				if (findchangepwd == 1) {
					msg = "비밀번호 변경이 완료되었습니다.";
				} else if (findchangepwd == 0) {
					msg = "아이디 또는 전화번호를 다시 확인해 주세요";
				}

				JOptionPane.showMessageDialog(null, msg);
			}
		});
	}
}
