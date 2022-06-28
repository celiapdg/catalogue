import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../models/movie';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  baseUrl: string = "http://localhost:8080"

  constructor(private http: HttpClient) { }

  getMovies(): Observable<Movie[]> {
    return this.http.get<Movie[]>(this.baseUrl + "/movie/");
  }

  getMovieById(id: number): Observable<Movie> {
    return this.http.get<Movie>(this.baseUrl + "/movie/" + id);
  }
}
