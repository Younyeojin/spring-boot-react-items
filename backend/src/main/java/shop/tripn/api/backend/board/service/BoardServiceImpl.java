package shop.tripn.api.backend.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.tripn.api.backend.board.repository.BoardRepository;
import shop.tripn.api.backend.board.service.BoardService;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;
}
