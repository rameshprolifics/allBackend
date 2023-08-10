import { Component, EventEmitter, Input, Output } from "@angular/core";


@Component({

    selector:'child-component',
    template:`<h1>I am Child Componet {{ message }}</h1><br>
                <input type="button" value="sendMessage" (click)="sendMessage()">`,
    styleUrls:[]
})


export class ChildComponent{

    @Input()
    message:string='';

    @Output()
    childEvent = new EventEmitter<string>();

    sendMessage()
    {
        this.childEvent.emit("hello world");
    }


}