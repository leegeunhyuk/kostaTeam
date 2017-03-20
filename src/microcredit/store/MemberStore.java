package microcredit.store;

import microcredit.domain.Member;

public interface MemberStore {

	public boolean createMember(Member member);
	public boolean updateMember(Member member);
	public Member searchMemberById(String id);
	
}
