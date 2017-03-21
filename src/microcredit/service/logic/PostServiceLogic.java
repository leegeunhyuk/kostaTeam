package microcredit.service.logic;

import java.util.List;

import microcredit.domain.Post;
import microcredit.service.PostService;
import microcredit.store.PostStore;
import microcredit.store.logic.PostStoreLogic;

public class PostServiceLogic implements PostService {
	private PostStore store;
	

	public PostServiceLogic() {
		store = new PostStoreLogic();
	}

	@Override
	public boolean registPost(Post post) {
		return store.createPost(post);
	}

	@Override
	public boolean dropPost(int postId) {
		return store.deletePost(postId);
	}

	@Override
	public Post findPostById(int postId) {
		return store.searchPostById(postId);
	}

	@Override
	public List<Post> findPostByName(String name) {
		return store.searchPostByName(name);
	}

}
