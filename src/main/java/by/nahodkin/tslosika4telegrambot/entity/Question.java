package by.nahodkin.tslosika4telegrambot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "questions")
public class Question {
    @Id
    private String id;
    private String question;
}
