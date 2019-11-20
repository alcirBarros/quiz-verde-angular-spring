import { Component, OnInit, Input } from '@angular/core';
import { UiElement } from './ui-element.model';

@Component({
  selector: 'h:radio-button',
  templateUrl: './radio-button.component.html',
  styleUrls: ['./radio-button.component.css']
})
export class RadioButtonComponent implements OnInit {

  @Input('uiElementArray')
  list: Array<UiElement> = new Array;

  @Input('label')
  label: string;

  @Input('validar')
  validar: boolean = false;

  constructor() {

  }

  ngOnInit() {

  }

  styleClass(value) : string{
    console.log(value);
    if(value.object.alternativaAcertEnum == "ALTERNATIVA_CORRETA" && this.validar){
      return "#cdf8bf";
    }
  }
} 