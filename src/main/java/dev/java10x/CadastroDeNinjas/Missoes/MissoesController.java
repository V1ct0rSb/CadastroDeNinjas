package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissoesController {

    public final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping
    public List<MissoesModel> getAll(){
        return missoesService.getAll();
    }

    @PostMapping
    public  MissoesModel create(@RequestBody MissoesModel missoes){
        return missoesService.save(missoes);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        missoesService.delete(id);
    }
}
