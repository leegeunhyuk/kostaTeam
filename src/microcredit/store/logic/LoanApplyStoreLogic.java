package microcredit.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import microcredit.domain.Category;
import microcredit.domain.LoanApply;
import microcredit.store.LoanApplyStore;
import microcredit.store.factory.SqlSessionFactoryProvider;
import microcredit.store.mapper.LoanApplyMapper;

public class LoanApplyStoreLogic implements LoanApplyStore {
	private SqlSessionFactory factory;
	
	
	public LoanApplyStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public boolean createLoanApply(LoanApply loanApply) {
		return false;
	}

	@Override
	public boolean updateLoanApply(LoanApply loanApply) {
		return false;
	}

	@Override
	public boolean deleteLoanApply(int loanApplyId) {
		return false;
	}

	@Override
	public List<LoanApply> searchAllLoanApply() {
		return null;
	}

	@Override
	public List<LoanApply> searchLoanApplyByCategory(String category) {
		SqlSession session = factory.openSession();
		List<LoanApply> list = null;
		try {
			LoanApplyMapper mapper = session.getMapper(LoanApplyMapper.class);
			list = mapper.searchLoanApplyByCategory(category);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<LoanApply> searchLoanApplyByKeyword(String key) {
		return null;
	}

	@Override
	public List<LoanApply> searchLoanApplyByCondition(Category category) {
		return null;
	}

	@Override
	public LoanApply searchLoanApplyByMemberId(String memberId) {
		return null;
	}

	@Override
	public LoanApply sarchLoanApplyById(int loanApplyId) {
		return null;
	}

}
