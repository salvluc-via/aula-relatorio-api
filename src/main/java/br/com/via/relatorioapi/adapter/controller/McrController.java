package br.com.via.relatorioapi.adapter.controller;

import br.com.via.relatorioapi.adapter.dto.MCRDto;
import br.com.via.relatorioapi.infrastructure.service.McrService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mcr")
public class McrController {

    McrService mcrService;

    McrController(McrService mcrService){
        this.mcrService = mcrService;
    }

    @GetMapping
    public ResponseEntity<List<MCRDto>> getMcr(){
        return new ResponseEntity<List<MCRDto>>(mcrService.getMcr(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<MCRDto> getMcrById(@PathVariable int id){
        return new ResponseEntity<MCRDto>(mcrService.getMcrById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<MCRDto> postMcr(@RequestBody MCRDto body){
        return new ResponseEntity<MCRDto>(mcrService.postMcr(body), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<MCRDto> putMcr(@RequestBody MCRDto body){
        return new ResponseEntity<MCRDto>(mcrService.postMcr(body), HttpStatus.CREATED);
    }

    @PatchMapping("{id}")
    public ResponseEntity<MCRDto> patchMcr(@PathVariable int id,
                                           @RequestBody MCRDto body){
        return new ResponseEntity<MCRDto>(mcrService.patchMcr(id, body), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteMcr(@PathVariable int id){
        mcrService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
