package ru.otp.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.otp.enums.RoleType;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User extends AbstractEntity implements Indexable<Long> {

    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String tgId;
    @Column
    private String password;
    @Enumerated(EnumType.STRING)
    @Column
    private RoleType role;

    @Override
    public void setIndex(Long index) {
        setId(index);
    }

    @Override
    public Long getIndex() {
        return getId();
    }
}
