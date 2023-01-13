package com.walkoding.datadogexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/datadog")
public class DatadogLogs {

    @GetMapping
    public ResponseEntity<String> sendDatadogLog(@RequestBody String body) {
        log.info(body);
        return ResponseEntity.ok("Datadog log sended");
    }
}
