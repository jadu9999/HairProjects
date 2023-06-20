package login;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FocusAction implements FocusListener{
	
	private String pwd1;
	private String pwd2;
	
	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}


	public String getPwd2() {
		return pwd2;
	}


	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}


	@Override
	public void focusLost(FocusEvent e) {
		
		JTextField jf = (JTextField)e.getSource();
		
		if(pwd1.isEmpty()) {
			pwd1 = jf.getText();
		}		
		else if(!pwd1.isEmpty()) {
			pwd2 = jf.getText();
		}
		String msg = "";
		
		System.out.println("pwd1: " + pwd1);
		System.out.println("pwd2: " + pwd2);
	
		if((!pwd1.isEmpty()) && (!pwd2.isEmpty())) {
		if(!pwd1.equals(pwd2)) {
			msg = "비밀번호가일치하지않습니다";
			JOptionPane.showMessageDialog(null, msg);
		}
	}
	
	
	}


	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
