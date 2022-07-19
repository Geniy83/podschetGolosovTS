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

    @Query("select area from User")
    List<String> getAllByArea();

    @Query("select share from User")
    List<String> getAllByShare();

    @Query("select share from User where status =:status")
    List<String> getAllByShareTrue(@Param("status") String status);

    @Query("select q11 from User where status =:status")
    List<String> getAllByQ11(@Param("status") String status);

    @Query("select status from User where status =:status")
    List<String> getAllByStatusTrue(@Param("status") String status);

    @Query("select fio from User where id =:id")
    String getUserByFio(@Param("id") Integer id);

    @Modifying
    @Query("update User set status =:status where id =:id")
    void updateStatusByUser(@Param("id") Integer id, @Param("status") String status);

    @Query("select status from User where id =:id")
    String getStatusByUser(@Param("id") Integer id);

    @Query("select password from User where id =:id")
    String getPasswordByUser(@Param("id") Integer id);

    @Query("select area from User where id =:id")
    String getAreaByUser(@Param("id") Integer id);

    @Query("select share from User where id =:id")
    String getShareByUser(@Param("id") Integer id);

    @Query("select id from User where flat =:flat")
    Integer getIdByUser(@Param("flat") String flat);
}