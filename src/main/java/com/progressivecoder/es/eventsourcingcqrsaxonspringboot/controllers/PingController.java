package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class PingController {
    @GetMapping("ping")
    public String ping(){
        return "ping v 0.3";
    }
}
