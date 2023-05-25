package edu.capgemini.cursosAppBE.repository;

import edu.capgemini.cursosAppBE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {

    //CREATE
    void createUser();

    //READ
    User findUserById(long userId);

    List<User> findStudentByClassId();

    //UPDATE
    void updateUserById();

    //DELETE
    void deleteUserById();
}
