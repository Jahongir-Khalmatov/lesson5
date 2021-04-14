package lesson5.appjwtrealemailauditing.entity;

import lesson5.appjwtrealemailauditing.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Turniket extends AbsEntity {

    @ManyToOne
    private Company company;

    @OneToOne
    private User owner;


    private String number = UUID.randomUUID().toString();
}
