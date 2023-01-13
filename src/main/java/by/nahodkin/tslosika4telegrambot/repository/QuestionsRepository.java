package by.nahodkin.tslosika4telegrambot.repository;

import by.nahodkin.tslosika4telegrambot.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.MapKey;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@Transactional
public interface QuestionsRepository extends JpaRepository<Question, String> {
    @Query("select question from Question")
    List<String> getAllQuestions();
}
