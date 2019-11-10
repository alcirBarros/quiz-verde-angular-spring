package br.com.quizverde.api.service;

import br.com.quizverde.api.model.PerguntaQuizVerde;
import br.com.quizverde.api.repository.IPerguntaQuizVerdeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerguntaQuizVerdeService {

    @Autowired
    private IPerguntaQuizVerdeRepository iPerguntaQuizVerdeRepository;

    public List<PerguntaQuizVerde> findAll() {
        return iPerguntaQuizVerdeRepository.findAll();
    }

}
