package lesson5.appjwtrealemailauditing.entity;

import lesson5.appjwtrealemailauditing.entity.template.AbsEntity;
import lesson5.appjwtrealemailauditing.enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Task extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private Timestamp deadline;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne(optional = false)
    private User taskTaker;//qabul qiluvchi

    @ManyToOne(optional = false)
    private User taskGiver;//vazifa beruvchi
}
