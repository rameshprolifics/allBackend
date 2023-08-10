import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient, provideHttpClient } from '@angular/common/http'; 


@Injectable()
export class TrainService {
    constructor(private httpClient: HttpClient) {}

    public getAllTrainDetails(): Observable<any>
    {
        return this.httpClient.get('http://localhost:8045/train');
    }

    public getTrainById(trainId: number): Observable<any>
    {
        return this.httpClient.get('http://localhost:8045/train' + trainId);
    }
}
