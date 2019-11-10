import { AlternativaPerguntaQuiz } from './alternativa-pergunta-quiz.model';
import { UiElement } from 'src/app/radio-button/ui-element.model';

export class PerguntaQuiz {

    public id?: number = null;
    public pergunta?: string = null;
    public alternativaPerguntaQuizVerdeList?: Array<AlternativaPerguntaQuiz> = new Array<AlternativaPerguntaQuiz>();

    constructor() {

    }

    public addAlternativa(alternativaPerguntaQuiz:AlternativaPerguntaQuiz): void{
      this.alternativaPerguntaQuizVerdeList.push(alternativaPerguntaQuiz);
    }

    public alternativaUiElementArray() : Array<UiElement> {
      return this.alternativaPerguntaQuizVerdeList.map(function(value) {
        return new UiElement(value, value.alternativa);
      });
    }
}