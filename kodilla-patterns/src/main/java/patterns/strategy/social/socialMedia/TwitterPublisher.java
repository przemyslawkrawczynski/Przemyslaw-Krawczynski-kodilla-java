package patterns.strategy.social.socialMedia;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public void share() {
        System.out.println("Sharing post on Twitter");
    }

    @Override
    public String whereShare() {
        return "TW";
    }
}
