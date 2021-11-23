package shop.tripn.api.backend.user.service;

import shop.tripn.api.backend.user.domain.User;
import shop.tripn.api.backend.user.domain.UserDto;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(long userId);
    Optional<User> login(String username, String password);
}