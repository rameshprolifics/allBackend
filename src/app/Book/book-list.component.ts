import { Component } from "@angular/core";



@Component({

    selector:'booklist',
    templateUrl:'./book-list.component.html'
})

export class bookListComponent
{
    books = [{"BookTitle":"Late Sravanthi","author":"Late Kavya","publisher":"Nayak Foundation", "price":999},
    {"BookTitle":"Fight For","author":"Sunny Austin","publisher":"Sun Foundation", "price":100},
    {"BookTitle":"Foolish Fellow","author":"Hill","publisher":"GRK Foundation", "price":500}]
}