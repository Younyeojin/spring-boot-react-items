package shop.tripn.api.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.tripn.api.backend.user.domain.User;
import shop.tripn.api.backend.user.domain.UserDto;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Transactional
    @Query(value = "select username , password from users where users.username=:username and users.password=:passowrd",
            nativeQuery = true)
    UserDto login(@Param("username") String username, @Param("password") String password);
}
