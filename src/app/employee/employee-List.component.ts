import { Component, EventEmitter, Input, Output} from "@angular/core";
import { Employee } from "./employee";

@Component({

    selector:'employee-list',
    templateUrl:'./employee-list.component.html',
    styleUrls:[]
})


export class EmployeeListComponent 
{

    
   @Input()
   empList:Employee[]=[];

   @Output()
   deleteEvent = new EventEmitter<number>();

   deleteEmployeeRow(index:number){

    this.deleteEvent.emit(index);

    }

   
}