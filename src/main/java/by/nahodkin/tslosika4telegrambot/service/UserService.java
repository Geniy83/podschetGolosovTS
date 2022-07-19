package by.nahodkin.tslosika4telegrambot.service;

import by.nahodkin.tslosika4telegrambot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Double getAllByArea() {
        List<String> area = userRepository.getAllByArea();
        return area.stream().mapToDouble(Double::valueOf).sum();
    }

    public Double getAllByShare() {
        List<String> share = userRepository.getAllByShare();
        return share.stream().mapToDouble(Double::valueOf).sum();
    }

    public Double getAllByQ11(String status) {
        List<String> q11 = userRepository.getAllByQ11(status);
        return q11.stream().mapToDouble(Double::valueOf).sum();
    }
    public Long getAllUserByQ11(String status) {
        List<String> q11 = userRepository.getAllByQ11(status);
        return q11.stream().mapToDouble(Double::valueOf).filter((p) -> p > 0).count();
    }
    public Double getAllByShareTrue(String status) {
        List<String> shareTrue = userRepository.getAllByShareTrue(status);
        return shareTrue.stream().mapToDouble(Double::valueOf).sum();
    }

    public Integer getAllByStatusTrue(String status) {
        List<String> statusTrue = userRepository.getAllByStatusTrue(status);
        return statusTrue.stream().mapToInt(Integer::valueOf).sum();
    }

    public String getFio(Integer id) {
        return userRepository.getUserByFio(id);
    }

    public Integer getIdUserFlat(String flat) {
        return userRepository.getIdByUser(flat);
    }

    public void updateUserStatus(Integer id, String status) {
        userRepository.updateStatusByUser(id, status);
    }

    public String getStatusUser(Integer id) {
        return userRepository.getStatusByUser(id);
    }

    public String getPassword(Integer id) {
        return userRepository.getPasswordByUser(id);
    }

    public String getShare(Integer id) {
        return userRepository.getShareByUser(id);
    }

    public String getArea(Integer id) {
        return userRepository.getAreaByUser(id);
    }

}