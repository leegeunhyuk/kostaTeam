package microcredit.service.logic;

import microcredit.domain.Repayment;
import microcredit.service.RepaymentService;
import microcredit.store.RepaymentStore;
import microcredit.store.logic.RepaymentStoreLogic;

public class RepaymentServiceLogic implements RepaymentService {
	private RepaymentStore store;
	
	public RepaymentServiceLogic() {
		store = new RepaymentStoreLogic();
	}

	@Override
	public boolean registRepayment(Repayment repayment) {
		return store.createRepayment(repayment);
	}

	@Override
	public boolean modifyRepayment(Repayment repayment) {
		return store.updateRepayment(repayment);
	}

	@Override
	public Repayment findById(String repaymentId) {
		return store.searchById(repaymentId);
	}

}
