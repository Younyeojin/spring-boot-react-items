package shop.tripn.api.backend.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.tripn.api.backend.board.service.BoardServiceImpl;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardServiceImpl boardService;
}
