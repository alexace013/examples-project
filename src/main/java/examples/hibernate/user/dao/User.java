package examples.hibernate.user.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "id_code")
    private int idCode;
    private String idPassport;
    private String firstName;
    private String lastName;

}
