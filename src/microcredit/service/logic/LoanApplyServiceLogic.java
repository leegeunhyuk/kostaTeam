package microcredit.service.logic;

import java.util.List;

import microcredit.domain.Category;
import microcredit.domain.LoanApply;
import microcredit.service.LoanApplyService;
import microcredit.store.LoanApplyStore;
import microcredit.store.logic.LoanApplyStoreLogic;

public class LoanApplyServiceLogic implements LoanApplyService {
	LoanApplyStore store  = new LoanApplyStoreLogic();

	@Override
	public boolean registLoanApply(LoanApply loanApply) {
		return false;
	}

	@Override
	public boolean modifyLoanApply(LoanApply loanApply) {
		return false;
	}

	@Override
	public boolean dropLoanApply(int loanApplyId) {
		return false;
	}

	@Override
	public List<LoanApply> findAllLoanApply() {
		return null;
	}

	@Override
	public List<LoanApply> findLoanApplyByCategory(String category) {
		return store.searchLoanApplyByCategory(category);
	}

	@Override
	public List<LoanApply> findLoanApplyByKeyword(String key) {
		return null;
	}

	@Override
	public List<LoanApply> findLoanApplyByCondition(Category category) {
		return null;
	}

	@Override
	public LoanApply findLoanApplyByMemberId(String memberId) {
		return null;
	}

	@Override
	public LoanApply findLoanApplyById(int loanApplyId) {
		return null;
	}

	@Override
	public boolean completeLoanApply(LoanApply loanApply, String memberId) {
		return false;
	}

}
