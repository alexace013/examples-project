package examples.hibernate.user.dao;

import java.io.Serializable;

public interface GenericDao<T, PK extends Serializable> {

    PK create(T persistentObj);

    T get(PK id);

    void update(T persistentObj);

    void delete(T persistentObj);

}
