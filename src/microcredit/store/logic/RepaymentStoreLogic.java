package microcredit.store.logic;

import microcredit.domain.Repayment;
import microcredit.store.RepaymentStore;

public class RepaymentStoreLogic implements RepaymentStore {
	

	@Override
	public boolean createRepayment(Repayment repayment) {
		return false;
	}

	@Override
	public boolean updateRepayment(Repayment repayment) {
		return false;
	}

	@Override
	public Repayment searchById(String repaymentId) {
		return null;
	}

}
