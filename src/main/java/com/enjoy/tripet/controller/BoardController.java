package com.enjoy.tripet.controller;

import com.enjoy.tripet.request.BoardRequest;
import com.enjoy.tripet.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/post")
    public ResponseEntity<Void> addPost(@RequestBody BoardRequest boardRequest){
        boardService.addPost(boardRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/modify")
    public ResponseEntity<Void> updatePost(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/delete/{boardId}")
    public ResponseEntity<Void> deletePost(@PathVariable Long boardId){
        boardService.deletePost(boardId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
