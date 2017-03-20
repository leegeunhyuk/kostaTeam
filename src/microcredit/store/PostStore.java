package microcredit.store;

import java.util.List;

import microcredit.domain.Post;

public interface PostStore {

	public boolean createPost(Post post);
	public boolean deletePost(int postId);
	public Post searchPostById(int postId);
	public List<Post> searchPostByName(String name);
	
}
