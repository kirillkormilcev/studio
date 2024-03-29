package ru.shagiclass.studio.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.Hibernate;

import jakarta.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="studies")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Study study = (Study) o;
        return id != null && Objects.equals(id, study.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
