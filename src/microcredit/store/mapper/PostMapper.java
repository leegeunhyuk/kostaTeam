package microcredit.store.mapper;

import java.util.List;

import microcredit.domain.Post;

public interface PostMapper {

	public boolean createPost(Post post);
	public boolean deletePost(int postId);
	public Post searchPostById(int postId);
	public List<Post> searchPostByName(String name);
	
}
