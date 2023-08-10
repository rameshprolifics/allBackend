import { NgModule } from "@angular/core";
import { bookListComponent } from "./book-list.component";
import { CommonModule } from "@angular/common";



@NgModule({

    declarations:[ bookListComponent ],
    imports:[CommonModule],
    exports:[ bookListComponent ],
    providers:[]
})

export class bookModule
{

}