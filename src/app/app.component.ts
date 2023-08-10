import { Component } from '@angular/core';
import { Employee } from './employee/employee';
import { bookListComponent } from './Book/book-list.component';


@Component({
  selector: 'app-component',
  templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent 
{
	
	
	message=": I am from parent Hello";
	
	childMessage:string='';

	receiveMessage(message:string)
	{
		this.childMessage=message;
	}

	emp:Employee[]=[];

	


	/*
	title="prolifics";
	num1:number=0;
	num2:number=0;
	num3:number=0;
	mynum:number=2;
	
	
	public add():void
	{
		this.num3=Number(this.num1)+Number(this.num2);
	}
	public sub():void
	{
		this.num3=Number(this.num1)-Number(this.num2);
	}
	
	public res():void
	{
		this.num1=0;
		this.num2=0;
		this.num3=0;
	}

	public hover():void
	{
		this.mynum++;
	}*/
	
}







