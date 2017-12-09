export class Pegawai{
    constructor(private _nama: string, private _jenikKelamin: string){}

    get nama(): string{
        return this._nama;
    }

    get jenisKelamin(): string{
        return this._jenikKelamin;
    }
}