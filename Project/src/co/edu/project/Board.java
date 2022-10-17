package co.edu.project;

public class Board {
	private int bNum;
	private String bTitle;
	private String bContent;
	private String bWriter;
	private String bDate;
	
	public Board() {
		
	};
	
	public Board(int bNum, String bContent) {
		this.bNum = bNum;
		this.bContent = bContent;
	}
	public Board(int bNum, String bTitle, String bwriter, String bDate) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bWriter = bwriter;
		this.bDate = bDate;
	}
	
	public Board(int bNum, String bTitle, String bContent, String bwriter, String bDate) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bwriter;
		this.bDate = bDate;
	}
	

	//get/set
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public int getbNum() {
		return bNum;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	
	@Override
	public String toString() {
		return  bNum + " " + bTitle + " " + bWriter + " " + bDate + "\n";
	}
	
	public String showString() {
		return  "글 번호 : " + bNum + ", 글 제목 : " + bTitle + ", 글 내용 : " + bContent+ ", 글쓴이 : "+ bWriter + ", 작성일시 : " + bDate + "\n";
	}
}
