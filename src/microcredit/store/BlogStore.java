package microcredit.store;

import microcredit.domain.Blog;

public interface BlogStore {

	public boolean createBlog(Blog blog);
	public Blog searchBlogById(int blogId);
	public Blog searchBlogByMemberId(String memberId);
	
}
