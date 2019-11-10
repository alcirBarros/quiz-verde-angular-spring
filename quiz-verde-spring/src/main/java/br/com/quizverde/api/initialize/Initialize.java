package br.com.quizverde.api.initialize;

import br.com.quizverde.api.model.AlternativaPerguntaQuizVerde;
import br.com.quizverde.api.model.PerguntaQuizVerde;
import br.com.quizverde.api.repository.IPerguntaQuizVerdeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Initialize implements CommandLineRunner {

    @Autowired
    private IPerguntaQuizVerdeRepository banckRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA001");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA002");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA003");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA004");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA005");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA006");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA007");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA008");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA009");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("PERGUNTA010");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA001"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA002"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA003"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("ALTERNATIVA004"));
            banckRepository.save(perguntaQuizVerde);
        }

    }

}
