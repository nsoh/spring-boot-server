package spring.boot.server.game.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
@Table(name = "defaultdb.person")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_nick")
    private String userNick;
    @Column(name = "created")
    private Time created;
}
