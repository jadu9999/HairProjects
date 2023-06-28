package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Userhome {
	private JFrame jf;
	private JComboBox cb3, cb4;
	private JTextField jt8;
	private JOptionPane jo;
	
	private Buttons bt;
	

	public Userhome(HairMemberVo member) {
		System.out.println("여기까지살아있음2");
		HairDao dao = new HairDao();
		ArrayList<HairMemberVo> arrMember = dao.checkReservation();//예약정보가 Y인 전체정보를 불러옴
					//HairMemberVo 만 들어올수있다.
		System.out.println(arrMember);
//		Reservationinformation ri = new Reservationinformation();

		jf = new JFrame();
		jf.setLocation(700, 400);
		jf.setSize(680, 600);
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

//		ri.setContents(cb.getSelectedItem().toString());

		jf.add(cb);

		String[] year = { "2023" };
		JComboBox cb2 = new JComboBox(year);
		cb2.setLocation(40, 100);
		cb2.setSize(120, 25);

		jf.add(cb2);

		String[] month = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };
		cb3 = new JComboBox(month);
		cb3.setLocation(190, 100);
		cb3.setSize(120, 25);
		


		jf.add(cb3);

		String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
				"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", "29일",
				"30일", "31일" };
		cb4 = new JComboBox(days);

		cb4.setLocation(340, 100);
		cb4.setSize(120, 25);

		jf.add(cb4);
		
	
		cb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					jt8.setText("예약날자는 :" + String.valueOf(cb2.getSelectedItem()) + " "
							+ String.valueOf(cb3.getSelectedItem()) + " " + String.valueOf(cb4.getSelectedItem()) + " "
							+ String.valueOf(cb.getSelectedItem()) + " 시술예약되었습니다.");
					System.out.println("시술목록 선택 됐습니다.");
				}
			}
		});
		
		
		
		
		// cb4.addItemListener(box1);
		// cb4.addItemListener(box);
		JButton [] bt = new JButton [12];
		
		JButton bt18 = new JButton("09:00");
		bt18.setSize(120, 50);
		bt18.setLocation(40, 200);
		
		bt[0] = bt18;

		jf.add(bt18);
		
		
		bt18.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
				jt8.setText("예약시간은  9:00입니다.");
				reservation(member,cb, cb3, cb4, bt18,jo);
				
				
				
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			}
				
			
		});
		
		//----------------------------------------------
		JButton bt7 = new JButton("10:00");
		bt7.setSize(120, 50);
		bt7.setLocation(190, 200);
		
		bt[1] = bt7;
		
		jf.add(bt7);
		
		
		bt7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  10:00입니다.");
				reservation(member,cb, cb3, cb4, bt7,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
					
			}			
		});
		
		//------------------------------------------------------
		
		

		JButton bt8 = new JButton("11:00");
		bt8.setSize(120, 50);
		bt8.setLocation(340, 200);
		bt[2] = bt8;
		jf.add(bt8);
		
		
		bt8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  11:00입니다.");
				reservation(member,cb, cb3, cb4, bt8,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
					
			}
				
			
		});
		//----------------------------------------------------------
		
		
		
		

		JButton bt9 = new JButton("12:00");
		bt9.setSize(120, 50);
		bt9.setLocation(490, 200);
		bt[3] = bt9;
		
		jf.add(bt9);
	
		
		bt9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  12:00입니다.");
				
				reservation(member,cb, cb3, cb4, bt9,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			}
				
			
		});
		//-----------------------------------------------------------
		JButton bt10 = new JButton("13:00");
		bt10.setSize(120, 50);
		bt10.setLocation(40, 270);
		bt[4] = bt10;
		jf.add(bt10);
		
		
		bt10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  13:00입니다.");
				
				reservation(member,cb, cb3, cb4, bt10,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			
					
			}
				
			
		});
		
		//---------------------------------------------------------------

		JButton bt11 = new JButton("14:00");
		bt11.setSize(120, 50);
		bt11.setLocation(190, 270);
		bt[5] = bt11;
		jf.add(bt11);
		
		
		
		bt11.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  14:00입니다.");
				
				
				reservation(member,cb, cb3, cb4, bt11,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			}
				
			
		});
		//----------------------------------------------------------
		JButton bt12 = new JButton("15:00");
		bt12.setSize(120, 50);
		bt12.setLocation(340, 270);
		bt[6] = bt12;
		jf.add(bt12);
		
		
		
		
		bt12.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은 15:00입니다.");
				
				reservation(member,cb, cb3, cb4, bt12,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			}
				
			
		});
		//------------------------------------------------------------
		
		
		

		JButton bt13 = new JButton("16:00");
		bt13.setSize(120, 50);
		bt13.setLocation(490, 270);
		bt[7] = bt13;
		jf.add(bt13);
		
		
		
		bt13.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  16:00입니다.");
				
				
				reservation(member,cb, cb3, cb4, bt13,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			}
				
			
		});
		//------------------------------------------------------------
		JButton bt14 = new JButton("17:00");
		bt14.setSize(120, 50);
		bt14.setLocation(40, 340);
		bt[8] = bt14;
		
		jf.add(bt14);
		
		
		bt14.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  17:00입니다.");
				
				reservation(member,cb, cb3, cb4, bt14,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);	
			}		
		});
		
		JButton bt15 = new JButton("18:00");
		bt15.setSize(120, 50);
		bt15.setLocation(190, 340);
		bt[9] = bt15;
		jf.add(bt15);
			
		bt15.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  18:00입니다.");
				
				
				reservation(member,cb, cb3, cb4, bt15,jo);
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);
					
			}			
		});

		JButton bt16 = new JButton("19:00");
		bt16.setSize(120, 50);
		bt16.setLocation(340, 340);
		bt[10] = bt16;
		jf.add(bt16);
			
		bt16.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  19:00입니다.");
						
				reservation(member,cb, cb3, cb4, bt16,jo);
				
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);					
			}		
		});

		JButton bt17 = new JButton("20:00");
		bt17.setSize(120, 50);
		bt17.setLocation(490, 340);
		bt[11] = bt17;
		jf.add(bt17);
		
		bt17.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  20:00입니다.");
			
				
				reservation(member,cb, cb3, cb4, bt17,jo);//()데이터불러와서 DB에 저장
				HairDao bt17Dao = new HairDao();
				ArrayList<HairMemberVo> arrMember = bt17Dao.checkReservation();			
				InitializationButton(bt);
				buttonClose(cb3,cb4,arrMember,bt);			
			}			
		});

		InitializationButton(bt);//버튼 초기화 다 열려있는상태
		buttonClose(cb3,cb4,arrMember,bt);//버튼 선택해서 닫아놓음
		
		cb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					monthChange(String.valueOf(cb3.getSelectedItem()));
					InitializationButton(bt);//모든 버튼을 다 열어놓음
					HairDao dao = new HairDao();
					ArrayList<HairMemberVo> arrMember =  dao.checkReservation(); // 이벤트발생시마다 다시 예약이 Y상태인 멤버를 불러온다.
					buttonClose(cb3,cb4,arrMember,bt); // 예약된 시간버튼을 닫는것
					
					System.out.println("월 선택 됐습니다.");
				}
			}
		});

		cb4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					jt8.setText("예약날자는 :" + String.valueOf(cb2.getSelectedItem()) + " "
							+ String.valueOf(cb3.getSelectedItem()) + " " + String.valueOf(cb4.getSelectedItem()) + " "
							+ String.valueOf(cb.getSelectedItem()) + " 시술예약되었습니다.");
					
					InitializationButton(bt);
					HairDao dao = new HairDao();
					ArrayList<HairMemberVo> arrMember =  dao.checkReservation();
					buttonClose(cb3,cb4,arrMember,bt);
					System.out.println("일 선택 됐습니다.");
				}
			}
		});
		
		jt8 = new JTextField();
		jt8.setSize(450, 60);
		jt8.setLocation(105, 440);

		jf.add(jt8);

		jf.setVisible(true);

	}

	public void monthChange(String Item) {
		// 월콤보박스가 바뀔대 실행되는메서드
		System.out.println("Comoboboxevent - itemStateChanged() change : " + Item);

		if (Item.equals("1월")) {
			cb4.removeAllItems();// 모든 항목 삭제
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) { // 콤보박스안에 있는거 지우고 새로운데이터 넣기위해서
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("2월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		}

		else if (Item.equals("3월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("4월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("5월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("6월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("7월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("8월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		}

		else if (Item.equals("9월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		}

		else if (Item.equals("10월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		}

		else if (Item.equals("11월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		} else if (Item.equals("12월")) {
			cb4.removeAllItems();
			String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
					"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
					"29일", "30일", "31일" };

			for (int i = 0; i < days.length; i++) {
				cb4.addItem(days[i]);
			}
			jf.add(cb4);
		}
		
	}
	//로그인하고 userhome으로 넘어오면 실행됨. 콤보박스 변경하거나 버튼클릭했을때도 실행됨 db와 정보비교해서 일치하면 버튼을 닫음
	public static void buttonClose(JComboBox cb3 , JComboBox cb4 , ArrayList<HairMemberVo> arrMember , JButton[]bt) {
		String [] months = cb3.getSelectedItem().toString().split("월");
		String [] day = cb4.getSelectedItem().toString().split("일");
		
		if(bt.length == 1) {
			bt[0].setEnabled(false);
			return;
		}
		
		for(int i = 0; i < arrMember.size(); i++) {
			System.out.println("1번: " + arrMember.get(i).getDates());
			System.out.println("2번: " + months[0] + "-"+day[0]);
			System.out.println(arrMember.get(i).getId());
			
			
			if((arrMember.get(i).getDates()).equals("2023"+"-"+months[0]+"-"+day[0])) {
				System.out.println("여기들어오나?");
				if(arrMember.get(i).getTimes().equals("09:00")) {
					bt[0].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("10:00")) {
					bt[1].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("11:00")) {
					bt[2].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("12:00")) {
					bt[3].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("13:00")) {
					bt[4].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("14:00")) {
					bt[5].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("15:00")) {
					bt[6].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("16:00")) {
					bt[7].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("17:00")) {
					bt[8].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("18:00")) {
					bt[9].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("19:00")) {
					bt[10].setEnabled(false);
				}
				else if(arrMember.get(i).getTimes().equals("20:00")) {
					bt[11].setEnabled(false);
				}
			}
//			
		}
	}
	//버튼클릭하거나 콤보박스선택했을때 모든버튼이 열어져있음
	public static void InitializationButton(JButton[]bt) {
		for(int i = 0 ; i < bt.length; i++) {
			bt[i].setEnabled(true);//열어줌
		}
	}
	public static void reservation(HairMemberVo member , JComboBox cb, JComboBox cb3 , JComboBox cb4 , JButton bt18 , JOptionPane jo) {
		String [] month = cb3.getSelectedItem().toString().split("월");
		String [] day = cb4.getSelectedItem().toString().split("일");
		
		member.setReservation("Y");
		member.setContent(cb.getSelectedItem().toString());
		member.setDates("2023-"+month[0]+"-"+day[0]);
		member.setTimes(bt18.getText());
		System.out.println(member);
		
		HairDao userdao = new HairDao();
		int reuslt = userdao.UserRv(member);
		System.out.println(reuslt);
		if(reuslt > 0) {
			jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + bt18.getText()+"시예약이 완료되었습니다.");
			
		}else {
			jo.showMessageDialog(null,"예약불가능한 일자입니다.");
		}
	}

}
