package hu.kniznertamas.contentreader.service.transformer;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hu.kniznertamas.contentreader.domain.User;

public class UserTransformerTest {

    private static final Long TEST_ID = 2L;
    private static final String EMAIL = "steve@apple.com";
    private static final String LAST_NAME = "Jobs";
    private static final String FIRST_NAME = "Steve";

    @InjectMocks
    private UserTransformer underTest;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void transformShouldTransformLineToUser() {
        // GIVEN
        String[] line = { "2", "Steve", "Jobs", "steve@apple.com" };
        User expected = createUser();
        // WHEN
        User actual = underTest.transform(line);
        // THEN
        Assert.assertEquals(actual, expected);
    }

    private User createUser() {
        User user = new User();
        user.setId(TEST_ID);
        user.setFirstName(FIRST_NAME);
        user.setLastName(LAST_NAME);
        user.setEmail(EMAIL);
        return user;
    }

}
