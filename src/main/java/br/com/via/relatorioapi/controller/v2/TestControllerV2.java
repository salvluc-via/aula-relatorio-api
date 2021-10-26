package br.com.via.relatorioapi.controller.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2/test")
public class TestControllerV2 {

    @GetMapping
    public String getTest(){
        return "Olá v2";
    }

}