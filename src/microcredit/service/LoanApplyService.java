package microcredit.service;

import java.util.List;

import microcredit.domain.Category;
import microcredit.domain.LoanApply;

public interface LoanApplyService {

	public boolean registLoanApply(LoanApply loanApply);
	public boolean modifyLoanApply(LoanApply loanApply);
	public boolean dropLoanApply(int loanApplyId);
	public List<LoanApply> findAllLoanApply();
	public List<LoanApply> findLoanApplyByCategory(Category category);
	public List<LoanApply> findLoanApplyByKeyword(String key);
	public List<LoanApply> findLoanApplyByCondition(Category category);
	public LoanApply findLoanApplyByMemberId(String memberId);
	public LoanApply findLoanApplyById(int loanApplyId);
	public boolean completeLoanApply(LoanApply loanApply, String memberId);
	
}
