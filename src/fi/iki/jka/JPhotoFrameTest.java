package fi.iki.jka;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: localuser
 * Date: 26/06/2012
 * Time: 15:27
 * To change this template use File | Settings | File Templates.
 */
public class JPhotoFrameTest {

    @Test
    public void testFullScreenView() throws Exception {

        fakeDialogueBox fake = new fakeDialogueBox();
        JPhotoFrame frame = new JPhotoFrame("TEST_SPECIAL_NAME", new JPhotoCollection(), fake);
        frame.start_slideshow();
        assertTrue(fake.wasCalled);

    }

    class fakeDialogueBox implements dialogueBox {

        public boolean wasCalled = false;

        public void showNoPhotosErr() {
            //no dialogue box
            wasCalled = true;

        }
    }
}
