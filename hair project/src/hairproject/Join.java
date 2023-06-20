package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Join {
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
		// -------------------회원가입버튼눌렀을때 db--------------------------
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

				if (result == 1) {
					msg = "회원가입이완료되었습니다.";
				} else {
					msg = "회원가입실패";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});

	}

}
