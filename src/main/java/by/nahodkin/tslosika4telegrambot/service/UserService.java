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

    public Double getAllByShareTrue(String status) {
        List<String> shareTrue = userRepository.getAllByShareTrue(status);
        return shareTrue.stream().mapToDouble(Double::valueOf).sum();
    }
    public Integer getAllByStatusTrue(String status) {
        List<String> statusTrue = userRepository.getAllByStatusTrue(status);
        return statusTrue.stream().mapToInt(Integer::valueOf).sum();
    }

    //------------------------- Вопрос 1--------------------------------------
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

    //------------------------- Вопрос 2--------------------------------------
    public Double getAllSumByQ21() {
        List<String> q21 = userRepository.getAllByQ21();
        return q21.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ21() {
        List<String> q21 = userRepository.getAllByQ21();
        return q21.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ22() {
        List<String> q22 = userRepository.getAllByQ22();
        return q22.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ22() {
        List<String> q22 = userRepository.getAllByQ22();
        return q22.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ23() {
        List<String> q23 = userRepository.getAllByQ23();
        return q23.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ23() {
        List<String> q23 = userRepository.getAllByQ23();
        return q23.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 3--------------------------------------
    public Double getAllSumByQ31() {
        List<String> q31 = userRepository.getAllByQ31();
        return q31.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ31() {
        List<String> q31 = userRepository.getAllByQ31();
        return q31.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ32() {
        List<String> q32 = userRepository.getAllByQ32();
        return q32.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ32() {
        List<String> q32 = userRepository.getAllByQ32();
        return q32.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ33() {
        List<String> q33 = userRepository.getAllByQ33();
        return q33.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ33() {
        List<String> q33 = userRepository.getAllByQ33();
        return q33.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 4--------------------------------------
    public Double getAllSumByQ41() {
        List<String> q41 = userRepository.getAllByQ41();
        return q41.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ41() {
        List<String> q41 = userRepository.getAllByQ41();
        return q41.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ42() {
        List<String> q42 = userRepository.getAllByQ42();
        return q42.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ42() {
        List<String> q42 = userRepository.getAllByQ42();
        return q42.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ43() {
        List<String> q43 = userRepository.getAllByQ43();
        return q43.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ43() {
        List<String> q43 = userRepository.getAllByQ43();
        return q43.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 5--------------------------------------
    public Double getAllSumByQ51() {
        List<String> q51 = userRepository.getAllByQ51();
        return q51.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ51() {
        List<String> q51 = userRepository.getAllByQ51();
        return q51.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ52() {
        List<String> q52 = userRepository.getAllByQ52();
        return q52.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ52() {
        List<String> q52 = userRepository.getAllByQ52();
        return q52.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ53() {
        List<String> q53 = userRepository.getAllByQ53();
        return q53.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ53() {
        List<String> q53 = userRepository.getAllByQ53();
        return q53.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 6--------------------------------------
    public Double getAllSumByQ61() {
        List<String> q61 = userRepository.getAllByQ61();
        return q61.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ61() {
        List<String> q61 = userRepository.getAllByQ61();
        return q61.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ62() {
        List<String> q62 = userRepository.getAllByQ62();
        return q62.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ62() {
        List<String> q62 = userRepository.getAllByQ62();
        return q62.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ63() {
        List<String> q63 = userRepository.getAllByQ63();
        return q63.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ63() {
        List<String> q63 = userRepository.getAllByQ63();
        return q63.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 7--------------------------------------
    public Double getAllSumByQ71() {
        List<String> q71 = userRepository.getAllByQ71();
        return q71.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ71() {
        List<String> q71 = userRepository.getAllByQ71();
        return q71.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ72() {
        List<String> q72 = userRepository.getAllByQ72();
        return q72.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ72() {
        List<String> q72 = userRepository.getAllByQ72();
        return q72.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ73() {
        List<String> q73 = userRepository.getAllByQ73();
        return q73.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ73() {
        List<String> q73 = userRepository.getAllByQ73();
        return q73.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 8--------------------------------------
    public Double getAllSumByQ81() {
        List<String> q81 = userRepository.getAllByQ81();
        return q81.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ81() {
        List<String> q81 = userRepository.getAllByQ81();
        return q81.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ82() {
        List<String> q82 = userRepository.getAllByQ82();
        return q82.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ82() {
        List<String> q82 = userRepository.getAllByQ82();
        return q82.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ83() {
        List<String> q83 = userRepository.getAllByQ83();
        return q83.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ83() {
        List<String> q83 = userRepository.getAllByQ83();
        return q83.stream().filter(Objects::nonNull).count();
    }

    //------------------------- Вопрос 9--------------------------------------
    public Double getAllSumByQ91() {
        List<String> q91 = userRepository.getAllByQ91();
        return q91.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ91() {
        List<String> q91 = userRepository.getAllByQ91();
        return q91.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ92() {
        List<String> q92 = userRepository.getAllByQ92();
        return q92.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ92() {
        List<String> q92 = userRepository.getAllByQ92();
        return q92.stream().filter(Objects::nonNull).count();
    }
    public Double getAllSumByQ93() {
        List<String> q93 = userRepository.getAllByQ93();
        return q93.stream().filter(Objects::nonNull).mapToDouble(Double::valueOf).sum();
    }
    public long getAllCountByQ93() {
        List<String> q93 = userRepository.getAllByQ93();
        return q93.stream().filter(Objects::nonNull).count();
    }

}