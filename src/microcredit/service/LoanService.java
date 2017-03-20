package microcredit.service;

import java.util.List;

import microcredit.domain.Loan;

public interface LoanService {

	public boolean registLoan(Loan loan);
	public List<Loan> findLoanByLoanApplyId(int loanApplyId);
	public List<Loan> findLoanByMemberId(String memberId);
	
}
