package patterns.strategy.social;

import oracle.jrockit.jfr.StringConstantPool;
import patterns.strategy.social.socialMedia.SocialPublisher;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        socialPublisher.share();
        return socialPublisher.whereShare();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
