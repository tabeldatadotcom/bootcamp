// in javascript
var mahasiswa = {
    nama: "Dimas Maryanto",
    alamat: "Jl. bukit indah"
}
console.log('nama mahasiswa '+ mahasiswa.nama + " alamantnya "+ mahasiswa.alamat);

let namaDepan: string = "Dimas";
let namaBelakang = "Maryanto";

var mahasiswa = {
    nama: `${namaDepan} 
            ${namaBelakang}`,
    alamat: "Jl. bukit indah"
}

let mhs: string = "Dimas Maryanto";

function halo(){
    let mhs: string = "value double";
    console.log(`nama dari mahasiswa adalah ${ mahasiswa.nama } `);
}

console.log('nama mahasiswa '+ mhs);
halo();

let listNip: Array<number> = [1, 3, 5, 6, 7, 9, 10];
console.log('index ke 3 adalah '+listNip[3]);

let listData: [number, string, Date] = [1, "Dimas Maryanto", new Date, 2, "Hadi"];
for( let data in listData){
    console.log(`index ke ${data} adalah ${listData[data]}`);
}

let listMhs : Array<{nama, nim}> = [
    {nama: "Dimas", nim: "1051148"}, 
    {nama: "adyo", nim: "061234"}
];

for(let data of listMhs){
    console.log(data.nama);
}
let myData: any = false;
myData = "asldkjfdsf";
myData = 10;

interface Mahasiswa{
    nama: string;
    nim: string;

    greeting();
}

class Motor implements Mahasiswa{

    nama: string = "Honda";
    nim: string = "10511148"

    greeting(){ }

    constructor(nama?: string){
        this.manufactor = nama;
    }

    manufactor: string;
    jumlahRoda : number = 2;

     getJumlahRoda(): number{
        return this.jumlahRoda;
    }

    getManufacture(): string{
        return this.manufactor;
    }

    toString(): void{
        console.log(`nama manufacture ${this.getManufacture()} jumlah rodanya ${this.getJumlahRoda()}`);
    }
}

let honda: Motor = new Motor();
honda.toString();
honda.greeting()
