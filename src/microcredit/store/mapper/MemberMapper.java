package microcredit.store.mapper;

import microcredit.domain.Member;

public interface MemberMapper {

	public boolean createMember(Member member);
	public boolean updateMember(Member member);
	public Member searchMemberById(String id);
	
}
