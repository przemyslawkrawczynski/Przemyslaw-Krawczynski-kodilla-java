package patterns.strategy.social;

import patterns.strategy.social.socialMedia.TwitterPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
