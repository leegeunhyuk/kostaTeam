package microcredit.service.logic;

import microcredit.domain.Member;
import microcredit.service.MemberService;
import microcredit.store.MemberStore;
import microcredit.store.logic.MemberStoreLogic;

public class MemberServiceLogic implements MemberService {
	private MemberStore store;

	public MemberServiceLogic() {
		store = new MemberStoreLogic();
	}

	@Override
	public boolean registMember(Member member) {
		return store.createMember(member);
	}

	@Override
	public boolean modifyMember(Member member) {
		return store.updateMember(member);
	}

	@Override
	public Member findMemberById(String id) {
		return store.searchMemberById(id);
	}

}
