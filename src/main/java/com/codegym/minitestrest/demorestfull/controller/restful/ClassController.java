package com.codegym.minitestrest.demorestfull.controller.restful;

import com.codegym.minitestrest.demorestfull.model.ClassRoom;
import com.codegym.minitestrest.demorestfull.service.impl.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    ClassRoomService classRoomService;

    @GetMapping
    public ResponseEntity<Iterable<ClassRoom>> findAll() {
        return new ResponseEntity<>(classRoomService.findAll(), HttpStatus.OK);
    }
}