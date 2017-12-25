package examples.hibernate.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_code", nullable = false)
    private int idCode;
    @Column(name = "id_passport", nullable = false)
    private String idPassport;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;

    public User() {
    }

    public User(final int id_code,
                final String id_passport,
                final String first_name,
                final String last_name) {
        this.idCode = id_code;
        this.idPassport = id_passport;
        this.firstName = first_name;
        this.lastName = last_name;
    }

    private int generateID() {
        final AtomicInteger counter = new AtomicInteger(0);
        return counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("User info:\n")
                .append(String.format("id: %d\n", id))
                .append(String.format("id code: %d\n", idCode))
                .append(String.format("id passport: %s\n", idPassport))
                .append(String.format("name: %s\n", firstName))
                .append(String.format("surname: %s", lastName))
                .toString();
    }
}
