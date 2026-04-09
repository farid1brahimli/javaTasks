package az.company.jpa_hibernate.service;

import az.company.jpa_hibernate.repository.UserRepository;
import az.company.jpa_hibernate.dao.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}
