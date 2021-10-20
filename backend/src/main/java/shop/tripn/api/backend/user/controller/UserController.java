package shop.tripn.api.backend.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.tripn.api.backend.user.domain.User;
import shop.tripn.api.backend.user.domain.UserDto;
import shop.tripn.api.backend.user.service.UserService;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto user){
        UserDto returnUser = userService.login(user.getUsername(), user.getPassword());
        System.out.println("마리아DB에서 넘어온 정보: "+returnUser.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable long id) {
        System.out.println("--------");
        User user = userService.findById(id).get();
        UserDto userDto = UserDto.builder()
                .userId(user.getUserId())
                .username(user.getUserName())
                .password(user.getPassword())
                .name(user.getName())
                .email(user.getEmail())
                .regDate(user.getRegDate())
                .build();
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}