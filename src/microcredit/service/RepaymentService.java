package microcredit.service;

import microcredit.domain.Repayment;

public interface RepaymentService {

	public boolean registRepayment(Repayment repayment);
	public boolean modifyRepayment(Repayment repayment);
	public Repayment findById(String repaymentId);
	
}
