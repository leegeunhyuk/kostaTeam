package microcredit.service;

import microcredit.domain.Blog;

public interface BlogService {

	public boolean registBlog(Blog blog);
	public Blog findBlogById(int blogId);
	public Blog findBlogByMemberId(String memberId);
	
}
