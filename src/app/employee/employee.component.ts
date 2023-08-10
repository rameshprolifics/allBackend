import { Employee  } from "./employee";
import { Component, Input, } from "@angular/core";
import { EmployeeService } from "./employee.service";


@Component({

    selector:'employee',
    template:`<crud-app (addEmployeeEvent)="addEmployee($event)"></crud-app><br>
        <employee-list [empList]="empList" (deleteEvent)="deleteEmployeeRow($event)"></employee-list>`,
    styleUrls:[]
})

export class EmployeeComponent
{
    empList:Employee[] = [];

    public constructor(private employeeService:EmployeeService){
        
        this.empList = this.employeeService.getAllEmployee();
    }

    deleteEmployeeRow(index:number)
    {
       
    this.empList.splice(index,1);
    }

    addEmployee(emp:Employee):void{
        this.empList.push(emp);
    }
   
    


}

//<employee-list [empList]="empList" (deleteEvent)="deleteEmployeeRow($event)"></employee-list>