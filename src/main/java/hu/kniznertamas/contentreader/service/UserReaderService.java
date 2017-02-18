package hu.kniznertamas.contentreader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.kniznertamas.contentreader.domain.User;
import hu.kniznertamas.contentreader.service.reader.CSVReader;

@Service
public class UserReaderService {

    @Autowired
    private CSVReader<User> userReader;

    public List<User> readUsers() {
        return userReader.read("static/data.csv");
    }

}
