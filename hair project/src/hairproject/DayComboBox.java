package hairproject;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DayComboBox implements ItemListener {

	private JFrame jf;
	private JTextField jt;
	private Reservationinformation ri;

	public JFrame getJf() {
		return jf;
	}

	public void setJf(JFrame jf) {
		this.jf = jf;
	}

	public JTextField getJt() {
		return jt;
	}

	public void setJt(JTextField jt) {
		this.jt = jt;
	}

	public Reservationinformation getRi() {
		return ri;
	}

	public void setRi(Reservationinformation ri) {
		this.ri = ri;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int change = e.getStateChange(); // 일 콤보박스바뀔때

		System.out.println("DayComboBox - itemStateChanged() change : " + change);

		if (change == 1) {

			JComboBox jb = (JComboBox) e.getSource();
			String Day = jb.getSelectedItem().toString();

			Reservationinformation ri = this.ri;

			ri.setDays(Day);

			jt.setText("예약시간은 :" + ri.getYear() + " " + ri.getMonth() + " " + ri.getDays() + " " + ri.getContents()
					+ " 시술예약되었습니다.");

		}
	}

}
