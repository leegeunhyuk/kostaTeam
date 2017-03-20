import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import microcredit.domain.Member;
import microcredit.store.logic.MemberStoreLogic;

public class MemberStoreLogicTest {
	private MemberStoreLogic store;
	
	@Before
	public void set() {
		store = new MemberStoreLogic();
	}
//	@Test
//	public void testCreateMember() {
//		Member m = new Member();
//		m.setId("rmsurll");
//		m.setPw("1234");
//		m.setName("그녁");
//		m.setGender("1");
//		m.setStatus("1");
//		m.setPhone("010");
//		m.setEmail("rmsurll@naver.com");
//		m.setCash(100000);
//		assertTrue(store.createMember(m));
//		
//	}

	@Test
	public void testUpdateMember() {
		Member m = store.searchMemberById("rmsurll");
		m.setCash(m.getCash() + 500000);
		store.updateMember(m);
		double d = store.searchMemberById("rmsurll").getCash();
		assertEquals(2100000, (int)d);
	}

//	@Test
//	public void testSearchMemberById() {
//		assertEquals("rmsurll@naver.com", store.searchMemberById("rmsurll").getEmail());
//	}

}
