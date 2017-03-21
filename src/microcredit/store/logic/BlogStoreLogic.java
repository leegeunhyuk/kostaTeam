package microcredit.store.logic;

import microcredit.domain.Blog;
import microcredit.store.BlogStore;

public class BlogStoreLogic implements BlogStore {

	@Override
	public boolean createBlog(Blog blog) {
		return false;
	}

	@Override
	public Blog searchBlogById(int blogId) {
		return null;
	}

	@Override
	public Blog searchBlogByMemberId(String memberId) {
		return null;
	}

}
