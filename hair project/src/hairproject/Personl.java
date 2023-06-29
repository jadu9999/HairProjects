package hairproject;

public class Personl {
	private String name;
	private String dates;
	private String times;
	private String content;
	private String phone;
	
	public Personl(){
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

	public Personl(String name, String dates, String times, String content, String phone) {
		this.name = name;
		this.dates = dates;
		this.times = times;
		this.content = content;
		this.phone = phone;
	}
		
	}
	
	
	


