package microcredit.domain;

import java.sql.Date;
import java.util.List;

public class LoanApply {

	private int id;
	private Category category;
	private String title;
	private String contents; 
	private double targetMoney;
	private double currentMoney;
	private Date startDate;
	private Date endDate;
	private String status;
	private Member borrower;
	private List<file> files;
	
	
	public List<file> getFiles() {
		return files;
	}
	public void setFiles(List<file> files) {
		this.files = files;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public double getTargetMoney() {
		return targetMoney;
	}
	public void setTargetMoney(double targetMoney) {
		this.targetMoney = targetMoney;
	}
	public double getCurrentMoney() {
		return currentMoney;
	}
	public void setCurrentMoney(double currentMoney) {
		this.currentMoney = currentMoney;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Member getBorrower() {
		return borrower;
	}
	public void setBorrower(Member borrower) {
		this.borrower = borrower;
	}

	
}
