package microcredit.service.logic;

import microcredit.domain.Blog;
import microcredit.service.BlogService;
import microcredit.store.BlogStore;
import microcredit.store.logic.BlogStoreLogic;

public class BlogServiceLogic implements BlogService {
	private BlogStore store;
	
	public BlogServiceLogic() {
		store = new BlogStoreLogic();
	}

	@Override
	public boolean registBlog(Blog blog) {
		return store.createBlog(blog);
	}

	@Override
	public Blog findBlogById(int blogId) {
		return store.searchBlogById(blogId);
	}

	@Override
	public Blog findBlogByMemberId(String memberId) {
		return store.searchBlogByMemberId(memberId);
	}

}
