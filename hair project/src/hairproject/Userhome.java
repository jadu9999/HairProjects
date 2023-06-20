package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Userhome {
	public static void userhome(HairMemberVo member) {
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

		String[] content = { "cut", "perm", "color" };
		JComboBox cb = new JComboBox(content);
		cb.setLocation(490, 100);
		cb.setSize(120, 25);

		jf.add(cb);

		String[] year = { "2023" };
		JComboBox cb2 = new JComboBox(year);
		cb2.setLocation(40, 100);
		cb2.setSize(120, 25);

		jf.add(cb2);

		String[] month = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };
		JComboBox cb3 = new JComboBox(month);
		cb3.setLocation(190, 100);
		cb3.setSize(120, 25);

		jf.add(cb3);

		String[] day = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
				"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", "29일", "30일",
				"31일" };
		JComboBox cb4 = new JComboBox(day);
		cb4.setLocation(340, 100);
		cb4.setSize(120, 25);

		jf.add(cb4);

		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();
				String days = cb.getSelectedItem().toString();

				System.out.println(days);
				String b = days;

				switch (b) {
				case "2월":
					day[28].equals(null);

					break;
				}
			}
		});

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

}
