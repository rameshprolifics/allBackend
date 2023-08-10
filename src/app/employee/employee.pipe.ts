import { Pipe, PipeTransform } from "@angular/core";
import { EmployeeService } from "./employee.service";
import { empdata } from "./employeeData";
import { Employee } from "./employee";

@Pipe({ name:'salaryval'})

export class salaryval implements PipeTransform{

    empList:Employee[] = []
    

    
    transform(empList: Employee[]):Employee[]
    {

        for(var i=0;i<empdata.length;i++)
        {
            var j=0;

            if(empdata[i].salary>1000)
            {
                empList[j] = empdata[i];
                j=j+1;
                
            }
            
            
        }

        return empList;

        //return empList.filter(e => e.salary > 1000);
    }
      

    

    
}