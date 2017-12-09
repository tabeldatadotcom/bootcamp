import { Pegawai } from './pegawai'; 
import { Karyawan } from './subfolder/karyawan';

class MainAplikasi{

    private peg: Pegawai = new Pegawai('Dimas Maryanto', 'Laki-Laki');

    get pegawai() : Pegawai{
        return this.peg;
    }
}

let main = new MainAplikasi();
console.log(`nama pegawai ${main.pegawai.nama} 
             jenis kelaminnya ${main.pegawai.jenisKelamin} `);