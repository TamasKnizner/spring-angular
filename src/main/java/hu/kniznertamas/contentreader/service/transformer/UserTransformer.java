package hu.kniznertamas.contentreader.service.transformer;

import org.springframework.stereotype.Component;

import hu.kniznertamas.contentreader.domain.User;

@Component
public class UserTransformer implements Transformer<User> {

    @Override
    public User transform(String[] line) {
        User user = new User();
        user.setId(Long.parseLong(line[0]));
        user.setFirstName(line[1]);
        user.setLastName(line[2]);
        user.setEmail(line[3]);
        return user;
    }

}
