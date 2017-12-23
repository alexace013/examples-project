package utils.generator;

import java.util.List;

public interface IGenerator<T> {

    T generate();

    List<T> generateList();

}
