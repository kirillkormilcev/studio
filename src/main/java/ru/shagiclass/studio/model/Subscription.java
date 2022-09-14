package ru.shagiclass.studio.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Data
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    final String name;
    final Teacher teacher;
    final List<Study> studies;
    final int totalStudies;
    int actualStudies;
    final Date endDate;
}
