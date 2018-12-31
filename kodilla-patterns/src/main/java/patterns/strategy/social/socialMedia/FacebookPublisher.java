package patterns.strategy.social.socialMedia;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public void share() {
        System.out.println("Sharing post on Facebook");
    }

    @Override
    public String whereShare() {
        return "FB";
    }
}
