export class Movie {

    constructor(
        private _id?: number,
        private _title?: string,
        private _year?: number,
        private _imdbRating?: number,
        private _votes?: number,
        private _description?: string
    ) { }

    public get id(): number | undefined {
        return this._id;
    }

    public set id(value: number | undefined) {
        this._id = value;
    }

    public get title(): string | undefined {
        return this._title;
    }

    public set title(value: string | undefined) {
        this._title = value;
    }

    public get year(): number | undefined {
        return this._year;
    }

    public set year(value: number | undefined) {
        this._year = value;
    }

    public get imdbRating(): number | undefined {
        return this._imdbRating;
    }

    public set imdbRating(value: number | undefined) {
        this._imdbRating = value;
    }

    public get votes(): number | undefined {
        return this._votes;
    }

    public set votes(value: number | undefined) {
        this._votes = value;
    }

    public get description(): string | undefined {
        return this._description;
    }

    public set description(value: string | undefined) {
        this._description = value;
    }

}
