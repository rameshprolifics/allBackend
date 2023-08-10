import { Component, EventEmitter, Output } from "@angular/core";
import { Employee } from "./employee";


@Component({

    selector:'crud-app',
    templateUrl:'./employee-crud.component.html',
    styleUrls:[]
})
export class EmployeeCrudComponent{

    emp:Employee=new Employee(0,"",0,0);

    @Output()
    addEmployeeEvent: EventEmitter<Employee>= new EventEmitter<Employee>();
    
    addEmployee(empid:string, ename:string, salary:string, deptno:string)
    {
        this.addEmployeeEvent.emit(new Employee(parseInt(empid), ename, parseFloat(salary), parseInt(deptno)));
    }
}