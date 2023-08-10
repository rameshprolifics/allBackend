import { empdata } from "./employeeData";
import { Employee } from "./employee";


export class EmployeeService
{
    public getAllEmployee():Employee[]
    {
        return empdata;
    }

   


}