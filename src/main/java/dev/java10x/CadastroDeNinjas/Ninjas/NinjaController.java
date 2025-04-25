package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    //Injeção de dependencia
    private final NinjaService ninjaService;

    //Com o Construtor o projeto entende essa injeção
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<NinjaModel> getAll() {
        return ninjaService.getAll();
    }

    @PostMapping
    public NinjaModel create(@RequestBody NinjaModel ninja) {
        return ninjaService.save(ninja);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        ninjaService.delete(id);
    }
}
