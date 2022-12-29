package example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "role", nullable = false)
    private String role;
    @Transient
    private String passwordConfirm;

    public Account(Long id, String email, String userName, String password) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;

    }

}
