package ru.shagiclass.studio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shagiclass.studio.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
