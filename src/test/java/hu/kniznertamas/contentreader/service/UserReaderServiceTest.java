package hu.kniznertamas.contentreader.service;

import static org.mockito.Matchers.anyString;

import java.util.ArrayList;
import java.util.List;

import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hu.kniznertamas.contentreader.domain.User;
import hu.kniznertamas.contentreader.service.reader.CSVReader;

public class UserReaderServiceTest {

    private static final Long TEST_ID = 2L;
    private static final String EMAIL = "steve@apple.com";
    private static final String LAST_NAME = "Jobs";
    private static final String FIRST_NAME = "Steve";

    @InjectMocks
    private UserReaderService underTest;

    @Mock
    private CSVReader<User> userReader;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void readUsersShouldReturnUserList() {
        // GIVEN
        List<User> expected = createUserList();
        BDDMockito.given(userReader.read(anyString())).willReturn(expected);
        // WHEN
        List<User> actual = underTest.readUsers();
        // THEN
        Assert.assertEquals(actual, expected);
    }

    private List<User> createUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(createUser());
        return userList;
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
