package com.prash.demo.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class DockerController {

    private static final Logger logger = LoggerFactory.getLogger(DockerController.class);

    @GetMapping("/docker")
    public ResponseEntity<String> helloDocker() {
        logger.info("Welcome to spring-boot docker demo project.");
        return new ResponseEntity<>("Welcome to spring-boot docker demo.", HttpStatus.OK);

    }
}
