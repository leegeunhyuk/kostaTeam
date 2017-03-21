import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import microcredit.domain.Category;
import microcredit.domain.LoanApply;
import microcredit.store.LoanApplyStore;
import microcredit.store.logic.LoanApplyStoreLogic;

public class LoanApplyStoreLogicTest {
	LoanApplyStore store;
	
	@Before
	public void setUp() {
		store = new LoanApplyStoreLogic();
	}
	

//	@Test
//	public void testCreateLoanApply() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateLoanApply() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteLoanApply() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSearchAllLoanApply() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testSearchLoanApplyByCategory() {
		List<LoanApply> list = store.searchLoanApplyByCategory("농업");
		assertEquals(2, list.size());
	}
//
//	@Test
//	public void testSearchLoanApplyByKeyword() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSearchLoanApplyByCondition() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSearchLoanApplyByMemberId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSarchLoanApplyById() {
//		fail("Not yet implemented");
//	}

}
