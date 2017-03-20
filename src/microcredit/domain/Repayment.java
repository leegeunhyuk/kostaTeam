package microcredit.domain;

import java.util.List;

public class Repayment {
	
	private int id;
	private double repayments;
	private LoanApply loanApply;
	private List<Loan> loans;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRepayments() {
		return repayments;
	}
	public void setRepayments(double repayments) {
		this.repayments = repayments;
	}
	public LoanApply getLoanApply() {
		return loanApply;
	}
	public void setLoanApply(LoanApply loanApply) {
		this.loanApply = loanApply;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	
	
}
