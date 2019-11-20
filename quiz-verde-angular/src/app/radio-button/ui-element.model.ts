export class UiElement {


    public randonId?: number;
    public object?: any;
    public display?: string;
    public checked?: boolean = false;

    constructor(object:any, display:string) {
        this.object = object;
        this.display = display;
    }
}