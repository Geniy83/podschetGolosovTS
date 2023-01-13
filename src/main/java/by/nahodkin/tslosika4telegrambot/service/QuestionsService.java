package by.nahodkin.tslosika4telegrambot.service;

import by.nahodkin.tslosika4telegrambot.entity.Question;
import by.nahodkin.tslosika4telegrambot.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    public List<String> getAllQuestions() {
        return questionsRepository.getAllQuestions();
    }
}
