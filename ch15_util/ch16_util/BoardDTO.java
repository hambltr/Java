package ch16_util;
//BoardDTO는 데이터를 백엔드와 프론트엔드로 값을 전달할 때 사용한다.
//Spring에서는 BoardDTO 대신하여 HashMap을 사용할 수도 있다.
public class BoardDTO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String addr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
