package hu.kniznertamas.contentreader.service.transformer;

public interface Transformer<T> {

    T transform(String[] line);

}
