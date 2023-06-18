package login;

public class HairMemberVo {
	
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private int point;
	private String positions;
	
	private String ranks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getRank() {
		return ranks;
	}

	public void setRank(String rank) {
		this.ranks = rank;
	}
	
		
	public String getPositions() {
		return positions;
	}

	public void setPositions(String positions) {
		this.positions = positions;
	}

	

	@Override
	public String toString() {
		return "HairMemberVo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", point=" + point
				+ ", rank=" + ranks + "]";
	}

	
	
}
