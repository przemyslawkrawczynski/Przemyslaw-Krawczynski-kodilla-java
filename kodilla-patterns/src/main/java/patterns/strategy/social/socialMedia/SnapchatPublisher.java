package patterns.strategy.social.socialMedia;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public void share() {
        System.out.println("Sharing post on Snapchat");
    }

    @Override
    public String whereShare() {
        return "SC";
    }
}
