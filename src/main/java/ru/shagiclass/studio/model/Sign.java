package ru.shagiclass.studio.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Time;
import java.util.Date;

@Data
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Sign {
    Long id;
    final Date date;
    final Time time;
}
