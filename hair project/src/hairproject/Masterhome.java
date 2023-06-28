package hairproject;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;



public class Masterhome {
	
	public static void masterhome(HairMemberVo member) {
		//ArrayList<HairMemberVo> arrMember 
		String title[] = {"이름","연락처"};
		String data[][];
		
		data = new String[1][2];
		data[0][0] = "1";
		data[0][1] = "초코";
		
		
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
		
		
		
		JTable jtb = new JTable(data,title);
		
		jtb.setSize(400,150);
		jtb.setLocation(500,300);
		
		jf.add(jtb);
		
		
		

		jf.setVisible(true);
	}

}
