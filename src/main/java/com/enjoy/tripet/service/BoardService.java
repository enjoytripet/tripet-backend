//package com.enjoy.tripet.service;
//
//import com.enjoy.tripet.domain.Board;
//import com.enjoy.tripet.repository.BoardRepository;
//import com.enjoy.tripet.request.BoardRequest;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class BoardService {
//    private final BoardRepository boardRepository;
//
//    public void addPost(BoardRequest boardRequest){
//        Board board = Board.builder()
//                .title(boardRequest.getTitle())
//                .content(boardRequest.getContent())
//                .build();
//        boardRepository.save(board);
//    }
//
//    public void deletePost(Long boardId){
//        boardRepository.deleteById(boardId);
//    }
//
//}
