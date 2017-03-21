package microcredit.service.logic;

import java.util.List;

import microcredit.domain.Loan;
import microcredit.service.LoanService;
import microcredit.store.LoanStore;
import microcredit.store.logic.LoanStoreLogic;

public class LoanServiceLogic implements LoanService {
	private LoanStore store;

	public LoanServiceLogic() {
		store = new LoanStoreLogic();
	}

	@Override
	public boolean registLoan(Loan loan) {
		return store.createLoan(loan);
	}

	@Override
	public List<Loan> findLoanByLoanApplyId(int loanApplyId) {
		return store.searchLoanByLoanApplyId(loanApplyId);
	}

	@Override
	public List<Loan> findLoanByMemberId(String memberId) {
		return store.searchLoanByMemberId(memberId);
	}

}
