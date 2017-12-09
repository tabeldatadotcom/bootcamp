class Pegawai {
    private nip_pegawai: string;
    private _nama: string;

    get nip(): string {
        return this.nip_pegawai;
    }

    set nip(x: string) {
        this.nip_pegawai = x;
    }

    get nama(): string {
        return this._nama;
    }

    set nama(x: string) {
        this._nama = x;
    }
}
let dimas: Pegawai = new Pegawai;
dimas.nama = 'Dimas Maryanto';
dimas.nip = '1052016'
console.log(dimas);