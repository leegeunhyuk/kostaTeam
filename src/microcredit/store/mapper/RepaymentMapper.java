package microcredit.store.mapper;

import microcredit.domain.Repayment;

public interface RepaymentMapper {

	public boolean createRepayment(Repayment repayment);
	public boolean updateRepayment(Repayment repayment);
	public Repayment searchById(String repaymentId);
	
}
