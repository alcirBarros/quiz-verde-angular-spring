import { Component, OnInit } from '@angular/core';
import { BackEndService } from '../core/back-end.service';
import { UiElement } from '../radio-button/ui-element.model';
import { PerguntaQuiz } from '../shared/pergunta-quiz/pergunta-quiz.model';
import { AlternativaPerguntaQuiz } from '../shared/pergunta-quiz/alternativa-pergunta-quiz.model';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

  public perguntaQuizArray: Array<PerguntaQuiz> = new Array;

  //public perguntaQuaiz001: PerguntaQuiz = new PerguntaQuiz();

  constructor(public backEndService: BackEndService) {

  }

  ngOnInit() {
    let result: any = this.backEndService.listar().subscribe(dados => this.method(dados));
  }



  public method(perguntaQuaizArray: Array<any>) {
    for (let perguntaQuaiz of perguntaQuaizArray) {
     const perguntaQuaiz001:PerguntaQuiz = this.method02(perguntaQuaiz);
     this.perguntaQuizArray.push(perguntaQuaiz001);
    }
  }

  private method02(any: any): PerguntaQuiz {
    let perguntaQuaiz: PerguntaQuiz = new PerguntaQuiz();
    perguntaQuaiz.pergunta = any.pergunta,
    perguntaQuaiz.alternativaPerguntaQuizVerdeList = any.alternativaPerguntaQuizVerdeList;
    return perguntaQuaiz;

  }

}
