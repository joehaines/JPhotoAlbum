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

        //start the slideshow with 0 photos loaded, we should see an err dialogue box displayed (using a fake dialogue so that nothing actually occurs)
        frame.start_slideshow(0);

        //determine if our fake dialogue box was called
        assertTrue(fake.wasCalled);

    }

    @Test
    public void testFullScreenViewWithPhotos() throws Exception {

        fakeDialogueBox fake = new fakeDialogueBox();
        JPhotoFrame frame = new JPhotoFrame("TEST_SPECIAL_NAME", new JPhotoCollection());
        frame.start_slideshow(1);

    }

    class fakeDialogueBox implements dialogueBox {

        public boolean wasCalled = false;

        public void showNoPhotosErr() {
            //no dialogue box
            wasCalled = true;

        }
    }
}
