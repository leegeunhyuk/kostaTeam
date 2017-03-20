package microcredit.store.mapper;

import java.util.List;

import microcredit.domain.Loan;

public interface LoanMapper {

	public boolean createLoan(Loan loan);
	public List<Loan> searchLoanByLoanApplyId(int loanApplyId);
	public List<Loan> searchLoanByMemberId(String memberId);
	
}
