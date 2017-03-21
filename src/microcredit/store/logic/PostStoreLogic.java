package microcredit.store.logic;

import java.util.List;

import microcredit.domain.Post;
import microcredit.store.PostStore;

public class PostStoreLogic implements PostStore {

	@Override
	public boolean createPost(Post post) {
		return false;
	}

	@Override
	public boolean deletePost(int postId) {
		return false;
	}

	@Override
	public Post searchPostById(int postId) {
		return null;
	}

	@Override
	public List<Post> searchPostByName(String name) {
		return null;
	}

}
