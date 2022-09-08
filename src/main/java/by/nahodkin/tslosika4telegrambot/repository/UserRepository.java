package by.nahodkin.tslosika4telegrambot.repository;

import by.nahodkin.tslosika4telegrambot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, String> {

    @Query("select share from User where status =:status")
    List<String> getAllByShareTrue(@Param("status") String status);
    @Query("select status from User where status =:status")
    List<String> getAllByStatusTrue(@Param("status") String status);

    // --------------------- Вопрос 1 -------------------------------------
    @Query("select q11 from User")
    List<String> getAllByQ11();
    @Query("select q12 from User")
    List<String> getAllByQ12();
    @Query("select q13 from User")
    List<String> getAllByQ13();
    // --------------------- Вопрос 2 -------------------------------------




}