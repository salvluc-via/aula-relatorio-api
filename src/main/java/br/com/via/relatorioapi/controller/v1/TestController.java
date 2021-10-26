package br.com.via.relatorioapi.controller.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/test")
public class TestController {

    @GetMapping()
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<String>("Hakuna Matata", HttpStatus.I_AM_A_TEAPOT);
    }

    @GetMapping("{id}")
    public String getById(@PathVariable String id,
                          @RequestParam(name = "filter") String filter,
                          @RequestHeader("Content-Type") String type) {
        return "Hakuna Matata " + type;
    }

    @PostMapping("outro/path")
    public String postTest(@RequestBody String body) {
        return body;
    }

    @PatchMapping("{id}")
    public String patchTest(@PathVariable String id,
                            @RequestBody String body) {
        return "Meu patch v1";
    }

    @PutMapping()
    public String putTest(@RequestBody String body) {
        return "Meu patch v1";
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable String id) {
        return "Meu patch v1";
    }

}