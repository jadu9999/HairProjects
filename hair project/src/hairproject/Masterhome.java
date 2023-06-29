package hairproject;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Masterhome {
	
	public static void masterhome(HairMemberVo member) {
		//ArrayList<HairMemberVo> arrMember 
	
		JFrame jf = new JFrame();
		JPanel pn = new JPanel();
		JTable table = new JTable();
		JScrollPane sp = new JScrollPane(table);
		HairDao dao = new HairDao();
		ArrayList<HairMemberVo> list = dao.Usercheck();
		System.out.println(" 초코초코"+ list.get(0).getName());
		System.out.println("리스트사이즈:"+list.size());
//		Object record[] = new Object[5];
		
		
		
		
		
		
		
		
		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(680, 500);
		jf.setTitle("예약현황");
		jf.setLayout(null);
		

		JLabel jl13 = new JLabel("이름 : " + member.getName() + " Rank: " + member.getRank());
		jl13.setSize(400, 30);
		jl13.setLocation(110, 20);
		jl13.setHorizontalAlignment(JLabel.CENTER);
		
		jf.add(jl13);
		jf.add(pn);
		
		table.setSize(200,200);
		
		String[] heading = {"이름","연락처","예약일자","예약시간","시술목록"};
		DefaultTableModel dt = new DefaultTableModel(heading,0);
		
		for(HairMemberVo vo : list) {
			Object[] row = new Object [list.size()];
		
			dt.addRow(new Object[] {vo.getName(),vo.getPhone(),vo.getDates(),vo.getTimes(),vo.getContent()});
		}
		table.setModel(dt);
		
		pn.add(sp);
		
		pn.setBounds(35, 70, 600, 700);
		sp.setBounds(35, 70, 600, 700);
		
		pn.setVisible(true);
		
		
		
		
		
		
		
	
		
		
		
		
		jf.setVisible(true);
	}

}
