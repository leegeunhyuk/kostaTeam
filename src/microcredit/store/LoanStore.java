package microcredit.store;

import java.util.List;

import microcredit.domain.Loan;

public interface LoanStore {

	public boolean createLoan(Loan loan);
	public List<Loan> searchLoanByLoanApplyId(int loanApplyId);
	public List<Loan> searchLoanByMemberId(String memberId);
	
}
