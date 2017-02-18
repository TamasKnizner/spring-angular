package hu.kniznertamas.contentreader.service.reader;

import java.util.List;

public interface CSVReader<T> {

    List<T> read(String fileName);

}
