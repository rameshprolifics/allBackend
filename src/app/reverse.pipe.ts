import { Pipe, PipeTransform } from "@angular/core";

@Pipe({ name : 'StrReverse'})

export class StrReverse implements PipeTransform{

    transform(str: string) {
        let rev = "";
        for (let i = str.length - 1; i >= 0; i--) {
            rev += str[i];
        }
        return rev;
    }
}