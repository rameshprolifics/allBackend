import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { bookListComponent } from './Book/book-list.component';
import { EmployeeComponent } from './employee/employee.component';
import { TrainListComponent } from './train/train-list.component';

const routes: Routes = [
  {component:EmployeeComponent,path:'employee'},
  {component:bookListComponent,path:'book-list'},
  {component:TrainListComponent,path:'train-list'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
