package hairproject;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Masterhome {
	public static void masterhome(HairMemberVo member) {

		JFrame jf = new JFrame();
		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(680, 500);
		jf.setTitle("예약현황");
		jf.setLayout(null);
		

		JLabel jl13 = new JLabel("이름 : " + member.getName() + " Rank: " + member.getRank());
		jl13.setSize(400, 30);
		jl13.setLocation(-80, 30);
		jl13.setHorizontalAlignment(JLabel.CENTER);

		jf.add(jl13);
		
		
		
		
		
		

		jf.setVisible(true);
	}

}
