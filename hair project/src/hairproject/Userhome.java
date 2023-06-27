package hairproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Userhome {
	JFrame jf;
	JComboBox cb3, cb4;
	JTextField jt8;
	JOptionPane jo;

	public Userhome(HairMemberVo member) {

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

//		ri.setMonth(cb3.getSelectedItem().toString());

//		Comoboboxevent box = new Comoboboxevent();
//		DayComboBox box1= new DayComboBox();

//		box.setJf(jf);
//		box1.setJf(jf);

		jf.add(cb3);

		String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
				"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", "29일",
				"30일", "31일" };
		cb4 = new JComboBox(days);

//		ri.setDays(cb4.getSelectedItem().toString());
//		cb4.addActionListener(cb4);

		cb4.setLocation(340, 100);
		cb4.setSize(120, 25);

//		box.setDay(cb4);
//		box.setDay(cb4);

		jf.add(cb4);
		
		
		
		
		
		

		cb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					monthChange(String.valueOf(cb3.getSelectedItem()));
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
					System.out.println("일 선택 됐습니다.");
				}
			}
		});
		
		
		
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

		JButton bt18 = new JButton("09:00");
		bt18.setSize(120, 50);
		bt18.setLocation(40, 200);

		jf.add(bt18);
		
		
		bt18.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  9:00입니다.");
				if(bt18.getText().equals("click"))
					bt18.setText("메롱메롱");
				
			
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "09:00예약 완료되었습니다.");
					
			}
				
			
		});
		
		//----------------------------------------------
		JButton bt7 = new JButton("10:00");
		bt7.setSize(120, 50);
		bt7.setLocation(190, 200);

		jf.add(bt7);
		
		
		bt7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  10:00입니다.");
				if(bt7.getText().equals("click"))
					bt7.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "10:00예약 완료되었습니다.");
					
			}
				
			
		});
		
		//------------------------------------------------------
		
		

		JButton bt8 = new JButton("11:00");
		bt8.setSize(120, 50);
		bt8.setLocation(340, 200);

		jf.add(bt8);
		
		
		bt8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  11:00입니다.");
				if(bt8.getText().equals("click"))
					bt8.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "11:00예약 완료되었습니다.");
					
			}
				
			
		});
		//----------------------------------------------------------
		
		
		
		

		JButton bt9 = new JButton("12:00");
		bt9.setSize(120, 50);
		bt9.setLocation(490, 200);

		jf.add(bt9);
	
		
		bt9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  12:00입니다.");
				if(bt9.getText().equals("click"))
					bt9.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "12:00예약 완료되었습니다.");
					
			}
				
			
		});
		//-----------------------------------------------------------
		
		
		
		

		JButton bt10 = new JButton("13:00");
		bt10.setSize(120, 50);
		bt10.setLocation(40, 270);

		jf.add(bt10);
		
		
		bt10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  13:00입니다.");
				if(bt10.getText().equals("click"))
					bt10.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "13:00예약 완료되었습니다.");
					
			}
				
			
		});
		
		//---------------------------------------------------------------
		
		
		

		JButton bt11 = new JButton("14:00");
		bt11.setSize(120, 50);
		bt11.setLocation(190, 270);

		jf.add(bt11);
		
		
		
		bt11.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  14:00입니다.");
				if(bt11.getText().equals("click"))
					bt11.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "14:00예약 완료되었습니다.");
					
			}
				
			
		});
		//----------------------------------------------------------
		
		
		
		
		
		

		JButton bt12 = new JButton("15:00");
		bt12.setSize(120, 50);
		bt12.setLocation(340, 270);

		jf.add(bt12);
		
		
		
		
		bt12.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  9:00입니다.");
				if(bt12.getText().equals("click"))
					bt12.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "15:00예약 완료되었습니다.");
					
			}
				
			
		});
		//------------------------------------------------------------
		
		
		

		JButton bt13 = new JButton("16:00");
		bt13.setSize(120, 50);
		bt13.setLocation(490, 270);

		jf.add(bt13);
		
		
		
		bt13.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  9:00입니다.");
				if(bt13.getText().equals("click"))
					bt13.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "16:00예약 완료되었습니다.");
			}
				
			
		});
		//------------------------------------------------------------
		
		
		
		
		
		
		

		JButton bt14 = new JButton("17:00");
		bt14.setSize(120, 50);
		bt14.setLocation(40, 340);

		
		jf.add(bt14);
		
		
		bt14.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  17:00입니다.");
				if(bt14.getText().equals("click"))
					bt14.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "17:00예약 완료되었습니다.");
					
			}
				
			
		});
		
		//---------------------------------------------------------------
		
		
		
		

		JButton bt15 = new JButton("18:00");
		bt15.setSize(120, 50);
		bt15.setLocation(190, 340);

		jf.add(bt15);
		
		
		
		
		bt15.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  18:00입니다.");
				if(bt15.getText().equals("click"))
					bt15.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "18:00예약 완료되었습니다.");
					
			}
				
			
		});
		//-----------------------------------------------------------

		JButton bt16 = new JButton("19:00");
		bt16.setSize(120, 50);
		bt16.setLocation(340, 340);

		jf.add(bt16);
		
		
		
		bt16.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  19:00입니다.");
				if(bt16.getText().equals("click"))
					bt16.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "19:00예약 완료되었습니다.");
					
			}
				
			
		});
		//-------------------------------------------------------------
		
		
		
		
		

		JButton bt17 = new JButton("20:00");
		bt17.setSize(120, 50);
		bt17.setLocation(490, 340);

		jf.add(bt17);
		
		bt17.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jt8.setText("예약시간은  20:00입니다.");
				if(bt17.getText().equals("click"))
					bt17.setText("메롱메롱");
				
				jo.showMessageDialog(null,cb3.getSelectedItem().toString()+ cb4.getSelectedItem().toString() + cb.getSelectedItem().toString() + "20:00예약 완료되었습니다.");
					
			}
				
			
		});
		//---------------------------------------------------------------
		
		

		jt8 = new JTextField();
		jt8.setSize(450, 60);
		jt8.setLocation(105, 440);
//		jt8.setText("예약시간은 :" + ri.getYear()+" "+ ri.getMonth()+" "+ri.getDays()+" "+ri.getContents()+" 시술예약되었습니다." );

//		box.setJt(jt8);
//		box.setRi(ri);

//		box1.setRi(ri);
//		box1.setJt(jt8);

		jf.add(jt8);

		jf.setVisible(true);

	}

	public void monthChange(String Item) {
		// 월콤보박스가 바뀔대 실행되는메서드

		System.out.println("Comoboboxevent - itemStateChanged() change : " + Item);

//		jt.setText("예약시간은 :" + ri.getYear() + " " + ri.getMonth() + " " + ri.getDays() + " " + ri.getContents()
//				+ " 시술예약되었습니다.");

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

}
