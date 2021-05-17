package twoline;

public class OnelineDTO {
	private int no;
	private String memo;
	private String wdate;
	
	public OnelineDTO(int no, String memo, String wdate) {
		super();
		this.no = no;
		this.memo = memo;
		this.wdate = wdate;
	}
	public OnelineDTO() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
}
