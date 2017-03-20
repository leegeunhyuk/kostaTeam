package microcredit.domain;

public class Loan {

	private int id;
	private double lendMoney;
	private Member lender;
	private LoanApply loanApply;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLendMoney() {
		return lendMoney;
	}
	public void setLendMoney(double lendMoney) {
		this.lendMoney = lendMoney;
	}
	public Member getLender() {
		return lender;
	}
	public void setLender(Member lender) {
		this.lender = lender;
	}
	public LoanApply getLoanApply() {
		return loanApply;
	}
	public void setLoanApply(LoanApply loanApply) {
		this.loanApply = loanApply;
	}
	
	
}
