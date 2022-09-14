package ru.shagiclass.studio.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
public class User {
    Long id;
    final String name;
    final String phone;
    List<Subscription> subscriptions;
    List<Sign> signs;
 }
