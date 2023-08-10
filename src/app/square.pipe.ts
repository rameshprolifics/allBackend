import { Pipe } from "@angular/core";
import { PipeTransform } from "@angular/core";



@Pipe({ name : 'SquarePipe' })
export class SquarePipe implements PipeTransform
{

    transform(n:any,...args: any[]):any
    {
        return n*n;
    }
}