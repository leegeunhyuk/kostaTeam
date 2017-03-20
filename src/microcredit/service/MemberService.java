package microcredit.service;

import microcredit.domain.Member;

public interface MemberService {

	public boolean registMember(Member member);
	public boolean modifyMember(Member member);
	public Member findMemberById(String id);
}
