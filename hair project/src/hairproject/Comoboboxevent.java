package hairproject;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Comoboboxevent implements ItemListener {
	private JFrame jf;
	private JComboBox day;
	private JTextField jt;
	private Reservationinformation ri;
	
	
	
	public Reservationinformation getRi() {
		return ri;
	}

	public void setRi(Reservationinformation ri) {
		this.ri = ri;
	}

	public JTextField getJt() {
		return jt;
	}

	public void setJt(JTextField jt) {
		this.jt = jt;
	}

	public JFrame getJf() {
		return jf;
	}

	public void setJf(JFrame jf) {
		this.jf = jf;
	}

	public JComboBox getDay() {
		return day;
	}

	public void setDay(JComboBox day) {
		this.day = day;
	}


	public void monthChange(ItemEvent e) {
		//월콤보박스가 바뀔대 실행되는메서드
		int change = e.getStateChange(); //
		
		System.out.println("Comoboboxevent - itemStateChanged() change : " + change);
		
		if (change == 1) {
			JComboBox jb = (JComboBox)e.getSource();
			String month = jb.getSelectedItem().toString();
			
			Reservationinformation ri = this.ri;
			
			ri.setMonth(month);
			
			jt.setText("예약시간은 :" + ri.getYear()+" "+ ri.getMonth()+" "+ri.getDays()+" "+ri.getContents()+" 시술예약되었습니다." );
		
			if(month.equals("1월")) {
				day.removeAllItems();//모든 항목 삭제
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				day.removeAllItems();
				
				for(int i = 0; i < days.length; i++) { //콤보박스안에 있는거 지우고 새로운데이터 넣기위해서
					day.addItem(days[i]);
				}				
				jf.add(day);
			}			
			else if(month.equals("2월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			
			else if(month.equals("3월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			else if(month.equals("4월")) {
				day.removeAllItems(); 
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			else if(month.equals("5월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			else if(month.equals("6월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			else if(month.equals("7월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			else if(month.equals("8월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			
			else if(month.equals("9월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			
			else if(month.equals("10월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			
			else if(month.equals("11월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}
			else if(month.equals("12월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				for(int i = 0; i < days.length; i++) {
					day.addItem(days[i]);
				}				
				jf.add(day);
			}			
		}	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
