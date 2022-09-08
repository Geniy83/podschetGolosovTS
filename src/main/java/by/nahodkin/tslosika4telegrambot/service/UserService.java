package by.nahodkin.tslosika4telegrambot.service;

import by.nahodkin.tslosika4telegrambot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Double getAllSumByQ11() {
        List<String> q11 = userRepository.getAllByQ11();
        return q11.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ11() {
        List<String> q11 = userRepository.getAllByQ11();
        return q11.stream().filter(Objects::nonNull).count();
    }

    public Double getAllSumByQ12() {
        List<String> q12 = userRepository.getAllByQ12();
        return q12.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ12() {
        List<String> q12 = userRepository.getAllByQ12();
        return q12.stream().filter(Objects::nonNull).count();
    }

    public Double getAllSumByQ13() {
        List<String> q13 = userRepository.getAllByQ13();
        return q13.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ13() {
        List<String> q13 = userRepository.getAllByQ13();
        return q13.stream().filter(Objects::nonNull).count();
    }
    public Double getAllByShareTrue(String status) {
        List<String> shareTrue = userRepository.getAllByShareTrue(status);
        return shareTrue.stream().mapToDouble(Double::valueOf).sum();
    }

    public Integer getAllByStatusTrue(String status) {
        List<String> statusTrue = userRepository.getAllByStatusTrue(status);
        return statusTrue.stream().mapToInt(Integer::valueOf).sum();
    }

}