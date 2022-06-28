import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/models/movie';
import { MoviesService } from 'src/app/services/movies.service';

@Component({
  selector: 'app-board',
  templateUrl: './board.component.html',
  styleUrls: ['./board.component.css']
})
export class BoardComponent implements OnInit {

  //star: Star = new Star();
  //stars: Star[] = [];
  movies: Movie[] = [];

  constructor(
    //private starsService: StarsService,
    private moviesService: MoviesService
  ) { }

  ngOnInit(): void {
    this.moviesService.getMovies().subscribe(movies => {
      this.movies = movies;
    });
  }
}
