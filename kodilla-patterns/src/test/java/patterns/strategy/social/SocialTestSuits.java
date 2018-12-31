package patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;
import patterns.strategy.social.socialMedia.SnapchatPublisher;

public class SocialTestSuits {
    @Test
    public void testDefaultSharingStrategies() {

        System.out.println("Test 1");
        //Given
        User millenials = new Millenials("John Wick");
        User yPerson = new YGeneration("Anna Smith");
        User xPerson = new XGeneration("Steve Kowalsky");


        System.out.println("Millenials person is [" + millenials.getName() + "] he share his post on " + millenials.socialPublisher.whereShare());
        System.out.println("YGeneration person is [" + yPerson.getName() + "] he share his post on " + yPerson.socialPublisher.whereShare());
        System.out.println("XGeneration person is [" + xPerson.getName() + "] he share his post on " + xPerson.socialPublisher.whereShare());

        //When

        String result1 = millenials.sharePost();
        String result2 = yPerson.sharePost();
        String result3 = xPerson.sharePost();

        Assert.assertEquals("FB", result1);
        Assert.assertEquals("TW", result2);
        Assert.assertEquals("SC", result3);
    }

    @Test
    public void testIndividualSharingStrategy() {


        System.out.println("Test 2");
        //Given
        User millenials = new Millenials("John Wick");

        //When
        millenials.setSocialPublisher(new SnapchatPublisher());
        String newStrategy = millenials.sharePost();

        //Then
        Assert.assertEquals("SC", newStrategy);

    }
}
