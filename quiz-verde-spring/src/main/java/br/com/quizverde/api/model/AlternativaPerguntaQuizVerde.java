package br.com.quizverde.api.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aqv_alternativa_pergunta_quiz_verde")
public class AlternativaPerguntaQuizVerde implements Serializable {

    @Id
    @Column(name = "aqv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "pqv_id", referencedColumnName = "pqv_id", foreignKey = @ForeignKey(name = "fk_aqv_pqv_id"))
    private PerguntaQuizVerde perguntaQuizVerde;

    @Column(name = "aqv_alternativa")
    private String alternativa;

    public AlternativaPerguntaQuizVerde() {
    }

    public AlternativaPerguntaQuizVerde(String alternativa) {
        this.alternativa = alternativa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PerguntaQuizVerde getPerguntaQuizVerde() {
        return perguntaQuizVerde;
    }

    public void setPerguntaQuizVerde(PerguntaQuizVerde perguntaQuizVerde) {
        this.perguntaQuizVerde = perguntaQuizVerde;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}
