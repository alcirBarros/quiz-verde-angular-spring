import { Injectable } from '@angular/core';
import { PerguntaQuiz } from '../shared/pergunta-quiz/pergunta-quiz.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BackEndService {

  private readonly bankUrl = 'http://localhost:8080/api/list';

  constructor(private http: HttpClient) {
  }

  listar() {
    return this.http.get<any[]>(this.bankUrl);
  }
}
