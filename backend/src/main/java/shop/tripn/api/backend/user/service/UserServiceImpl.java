package shop.tripn.api.backend.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.tripn.api.backend.user.domain.User;
import shop.tripn.api.backend.user.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;


    @Override
    public Optional<User> findById(long userid) {
        return userRepository.findById(userid);
    }
}
