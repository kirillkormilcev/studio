package ru.shagiclass.studio.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Teacher {
    Long id;
    final String name;
    final String surname;
    final String description;
}
