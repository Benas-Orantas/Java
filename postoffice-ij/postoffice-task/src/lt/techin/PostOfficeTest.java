package lt.techin;

import lt.vtvpmc.java.postoffice.AbstractPostOfficeTest;
import lt.vtvpmc.java.postoffice.PostOffice;

public class PostOfficeTest extends AbstractPostOfficeTest {

    @Override
    protected PostOffice getPostOffice() {
        return new PostOfficeImpl();
    }
}
