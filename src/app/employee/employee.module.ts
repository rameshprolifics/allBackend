import { NgModule } from "@angular/core";
import { EmployeeComponent } from './employee.component';
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { EmployeeService } from "./employee.service";
import { salaryval } from "./employee.pipe";
import { EmployeeListComponent } from "./employee-List.component";
import { EmployeeCrudComponent } from "./employee-crud.component";





@NgModule({
    declarations:[ EmployeeComponent, salaryval, EmployeeListComponent,EmployeeCrudComponent],
    imports:[FormsModule,CommonModule],
    exports:[ EmployeeComponent,EmployeeListComponent,EmployeeCrudComponent],
    providers:[EmployeeService]

})


export class EmployeeModule{

}