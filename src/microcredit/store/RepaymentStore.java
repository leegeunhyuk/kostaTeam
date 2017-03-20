package microcredit.store;

import microcredit.domain.Repayment;

public interface RepaymentStore {

	public boolean createRepayment(Repayment repayment);
	public boolean updateRepayment(Repayment repayment);
	public Repayment searchById(String repaymentId);
	
}
