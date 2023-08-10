import { Directive, ElementRef, HostListener } from "@angular/core";

@Directive({

    selector:'[addColor]',

})

export class addColorDirective
{
    constructor(private elementRef:ElementRef)
    {
        this.elementRef.nativeElement.style.backgroundColor='black';
        this.elementRef.nativeElement.style.color='white';
        this.elementRef.nativeElement.style.padding='10px';
        this.elementRef.nativeElement.style.textAlign='center';
       
    }

   @HostListener('mouseover')
   onMouseOver(){
    this.elementRef.nativeElement.style.backgroundColor='blue';
   }

   @HostListener('mouseleave')
   onMouseLeave(){
    this.elementRef.nativeElement.style.backgroundColor='red';
   }
}