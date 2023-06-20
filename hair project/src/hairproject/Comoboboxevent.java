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

	@Override
	public void itemStateChanged(ItemEvent e) {
		int change = e.getStateChange(); //

		if (change == 1) {
			JComboBox jb = (JComboBox)e.getSource();
			String month = jb.getSelectedItem().toString();
			
			
			if(month.equals("1월")) {
				day.removeAllItems();
				String[] days = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일",
						"16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일","29일","30일","31일"};
				
				day.removeAllItems();
				
				for(int i = 0; i < days.length; i++) {
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
	
	

}
