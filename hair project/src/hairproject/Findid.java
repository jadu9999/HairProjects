package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Findid {
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

		// 아이디찾기 눌렀을때 db-----------------------------------------
		bt5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				HairDao hair = new HairDao();
				HairMemberVo member = new HairMemberVo();
				String msg = "";

				member.setName(jt.getText());
				member.setPhone(jt2.getText());

				HairMemberVo findMember = hair.findid(member);

				if (findMember.getId().isEmpty()) {
					msg = "다시 확인해주세요";
				} else {
					msg = "귀하의 아이디는 " + findMember.getId() + " 입니다";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});

	}
}
