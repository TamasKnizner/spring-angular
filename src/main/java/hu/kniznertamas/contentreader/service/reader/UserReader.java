package hu.kniznertamas.contentreader.service.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import hu.kniznertamas.contentreader.domain.User;
import hu.kniznertamas.contentreader.service.transformer.UserTransformer;

@Component
public class UserReader implements CSVReader<User> {

    private static final String SEPARATOR = ",";

    @Autowired
    private UserTransformer userTransformer;

    @Override
    public List<User> read(String fileName) {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new ClassPathResource(fileName).getFile()))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] splitted = line.split(SEPARATOR);
                users.add(userTransformer.transform(splitted));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

}
