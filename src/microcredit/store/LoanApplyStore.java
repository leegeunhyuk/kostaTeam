package microcredit.store;

import java.util.List;

import microcredit.domain.Category;
import microcredit.domain.LoanApply;

public interface LoanApplyStore {

	public boolean createLoanApply(LoanApply loanApply);
	public boolean updateLoanApply(LoanApply loanApply);
	public boolean deleteLoanApply(int loanApplyId);
	public List<LoanApply> searchAllLoanApply();
	public List<LoanApply> searchLoanApplyByCategory(Category category);
	public List<LoanApply> searchLoanApplyByKeyword(String key);
	public List<LoanApply> searchLoanApplyByCondition(Category category);
	public LoanApply searchLoanApplyByMemberId(String memberId);
	public LoanApply sarchLoanApplyById(int loanApplyId);
}
