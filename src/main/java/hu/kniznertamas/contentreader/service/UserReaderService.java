package hu.kniznertamas.contentreader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import hu.kniznertamas.contentreader.domain.User;
import hu.kniznertamas.contentreader.service.reader.CSVReader;

@Service
@PropertySource("classpath:application.properties")
public class UserReaderService {

    @Value("${data.user.filename}")
    private String fileName;

    @Autowired
    private CSVReader<User> userReader;

    public List<User> readUsers() {
        return userReader.read(fileName);
    }

}
