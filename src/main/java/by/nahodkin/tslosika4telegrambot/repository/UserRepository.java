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
    @Query("select q21 from User")
    List<String> getAllByQ21();
    @Query("select q22 from User")
    List<String> getAllByQ22();
    @Query("select q23 from User")
    List<String> getAllByQ23();
    // --------------------- Вопрос 3 -------------------------------------
    @Query("select q31 from User")
    List<String> getAllByQ31();
    @Query("select q32 from User")
    List<String> getAllByQ32();
    @Query("select q33 from User")
    List<String> getAllByQ33();
    // --------------------- Вопрос 4 -------------------------------------
    @Query("select q41 from User")
    List<String> getAllByQ41();
    @Query("select q42 from User")
    List<String> getAllByQ42();
    @Query("select q43 from User")
    List<String> getAllByQ43();
    // --------------------- Вопрос 5 -------------------------------------
    @Query("select q51 from User")
    List<String> getAllByQ51();
    @Query("select q52 from User")
    List<String> getAllByQ52();
    @Query("select q53 from User")
    List<String> getAllByQ53();
    // --------------------- Вопрос 6 -------------------------------------
    @Query("select q61 from User")
    List<String> getAllByQ61();
    @Query("select q62 from User")
    List<String> getAllByQ62();
    @Query("select q63 from User")
    List<String> getAllByQ63();
    // --------------------- Вопрос 7 -------------------------------------
    @Query("select q71 from User")
    List<String> getAllByQ71();
    @Query("select q72 from User")
    List<String> getAllByQ72();
    @Query("select q73 from User")
    List<String> getAllByQ73();
    // --------------------- Вопрос 8 -------------------------------------
    @Query("select q81 from User")
    List<String> getAllByQ81();
    @Query("select q82 from User")
    List<String> getAllByQ82();
    @Query("select q83 from User")
    List<String> getAllByQ83();
    // --------------------- Вопрос 9 -------------------------------------
    @Query("select q91 from User")
    List<String> getAllByQ91();
    @Query("select q92 from User")
    List<String> getAllByQ92();
    @Query("select q93 from User")
    List<String> getAllByQ93();
}