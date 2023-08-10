import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { EmployeeModule } from './employee/employee.module';
import { SquarePipe } from './square.pipe';
import { StrReverse } from './reverse.pipe';
import { ChildComponent } from './child/child.component';
import { addColorDirective } from './addcolor.directive';
import { bookModule } from './Book/book.module';
import { RouterLink } from '@angular/router';
import { TrainModule } from './train/train.modules';

@NgModule({
  declarations: [
    AppComponent, SquarePipe, StrReverse,ChildComponent,addColorDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	  FormsModule,
    EmployeeModule,
    bookModule,
    RouterLink,
    TrainModule
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}
