package microcredit.service;

import java.util.List;

import microcredit.domain.Post;

public interface PostService {

	public boolean registPost(Post post);
	public boolean dropPost(int postId);
	public Post findPostById(int postId);
	public List<Post> findPostByName(String name);
	
}
