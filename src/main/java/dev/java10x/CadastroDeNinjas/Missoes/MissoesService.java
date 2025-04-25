package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //Listar
    public List<MissoesModel> getAll(){
        return missoesRepository.findAll();
    }

    //Criar
    public MissoesModel save(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }

    //Deletar
    public void delete(Long id){
        missoesRepository.deleteById(id);
    }
}
