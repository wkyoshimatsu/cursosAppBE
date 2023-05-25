package edu.capgemini.cursosAppBE.repository;

import edu.capgemini.cursosAppBE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    //CREATE
    void createUser();

    //READ
    User findUserById(long userId);

    List<User> findStudentByClassId(long classId);

    //UPDATE
    void updateUserById(long userId);

    //DELETE
    void deleteUserById(long userId);
}
