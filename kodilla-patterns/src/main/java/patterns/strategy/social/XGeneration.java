package patterns.strategy.social;

import patterns.strategy.social.socialMedia.SnapchatPublisher;

public class XGeneration extends User {
    public XGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
