package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class UserProxy implements PersistableUser {
    private User realUser;
    private PostRepository postRepository;
    private boolean postsLoaded;

    public UserProxy(String username, String email, PostRepository postRepository) {
        this.realUser = new User(username,email);
        this.postRepository = postRepository;
        this.postsLoaded = false;
    }

    @Override
    public String getUsername() {
        return realUser.getUsername();
    }

    @Override
    public String getEmail() {
        return realUser.getEmail();
    }

    @Override
    public List<Post> getPosts() {
        if (!this.postsLoaded) {
            List<Post> postsBuscados = this.postRepository.findPostsByUsername(this.realUser.getUsername());
            this.realUser.addPosts(postsBuscados);
            this.postsLoaded = true;
        }
        return this.realUser.getPosts();
    }
}
