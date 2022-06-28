import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Star } from '../models/star';

@Injectable({
  providedIn: 'root'
})

export class StarsService {

  baseUrl: string = "http://localhost:8080"

  constructor(private http: HttpClient) { }

  getStars(): Observable<Star[]> {
    return this.http.get<Star[]>(this.baseUrl + "/star/");
  }

  getStarById(id: number): Observable<Star> {
    return this.http.get<Star>(this.baseUrl + "/star/5");
  }

}
