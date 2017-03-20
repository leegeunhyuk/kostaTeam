package microcredit.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import microcredit.domain.Member;
import microcredit.store.MemberStore;
import microcredit.store.factory.SqlSessionFactoryProvider;
import microcredit.store.mapper.MemberMapper;

public class MemberStoreLogic implements MemberStore {
	private SqlSessionFactory factory;
	
	public MemberStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public boolean createMember(Member member) {
		SqlSession session = factory.openSession();
		
		try{
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			boolean flag = mapper.createMember(member);
			
			if(flag) {
				session.commit();
			} else {
				session.rollback();
			}
			return flag;
		} finally {
			session.close();
		}
		
	}

	@Override
	public boolean updateMember(Member member) {
		SqlSession session = factory.openSession();
		
		try{
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			boolean flag = mapper.updateMember(member);
			
			if(flag) {
				session.commit();
			} else {
				session.rollback();
			}
			return flag;
		} finally {
			session.close();
		}
	}

	@Override
	public Member searchMemberById(String id) {
		SqlSession session = factory.openSession();
		
		try{
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			return mapper.searchMemberById(id);
			
			
		} finally {
			session.close();
		}
	}
	
}
