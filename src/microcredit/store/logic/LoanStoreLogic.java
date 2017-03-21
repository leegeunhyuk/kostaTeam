package microcredit.store.logic;

import java.util.List;

import microcredit.domain.Loan;
import microcredit.store.LoanStore;

public class LoanStoreLogic implements LoanStore {

	@Override
	public boolean createLoan(Loan loan) {
		return false;
	}

	@Override
	public List<Loan> searchLoanByLoanApplyId(int loanApplyId) {
		return null;
	}

	@Override
	public List<Loan> searchLoanByMemberId(String memberId) {
		return null;
	}

}
