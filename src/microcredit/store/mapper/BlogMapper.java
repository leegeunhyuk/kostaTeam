package microcredit.store.mapper;

import microcredit.domain.Blog;

public interface BlogMapper {

	public boolean createBlog(Blog blog);
	public Blog searchBlogById(int blogId);
	public Blog searchBlogByMemberId(String memberId);
	
}
