package lesson5.appjwtrealemailauditing.entity;

import lesson5.appjwtrealemailauditing.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Month;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SalaryTaken extends AbsEntity {

    @ManyToOne
    private User owner;

    @Column(nullable = false)
    private double amount;

    @Enumerated(EnumType.STRING)
    private Month period;

    private boolean paid = false; //oy uchun to'langanlik holati
}