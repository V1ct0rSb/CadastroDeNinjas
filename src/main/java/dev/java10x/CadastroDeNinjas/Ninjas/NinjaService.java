package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar
    public List<NinjaModel> getAll(){
        return ninjaRepository.findAll();
    }
    //Criar
    public NinjaModel save(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
    //Deletar
    public void delete(Long id){
        ninjaRepository.deleteById(id);
    }
}
