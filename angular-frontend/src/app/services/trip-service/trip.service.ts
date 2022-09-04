import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {allTripsUrl} from "../../models/urls";

@Injectable({
  providedIn: 'root'
})
export class TripService {
  // TODO add correct module to AppModule
  constructor(private http: HttpClient) { }

  getAllTrio(): any {
    return this.http.get<any[]>(allTripsUrl)
  }
}
