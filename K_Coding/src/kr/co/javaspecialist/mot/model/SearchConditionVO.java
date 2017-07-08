package kr.co.javaspecialist.mot.model;

public class SearchConditionVO {
	private int startdate;
	private int enddate;
	private String[] category;
	private int mincomm;
	private int maxcomm;
	
	public SearchConditionVO(){}
	
	public SearchConditionVO(int startdate, int enddate, String[] category,
			int mincomm, int maxcomm) {
		super();
		this.startdate = startdate;
		this.enddate = enddate;
		this.category = category;
		this.mincomm = mincomm;
		this.maxcomm = maxcomm;
	}
	public int getStartdate() {
		return startdate;
	}
	public void setStartdate(int startdate) {
		this.startdate = startdate;
	}
	public int getEnddate() {
		return enddate;
	}
	public void setEnddate(int enddate) {
		this.enddate = enddate;
	}
	public String[] getCategory() {
		return category;
	}
	public void setCategory(String[] category) {
		this.category = category;
	}
	public int getMincomm() {
		return mincomm;
	}
	public void setMincomm(int mincomm) {
		this.mincomm = mincomm;
	}
	public int getMaxcomm() {
		return maxcomm;
	}
	public void setMaxcomm(int maxcomm) {
		this.maxcomm = maxcomm;
	}		
	
}
