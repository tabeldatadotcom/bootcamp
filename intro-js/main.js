console.log("Halo ini dari javascript");    
var nama = 'Dimas maryanto';
console.log(nama + ' tipe datanya adalah '+ typeof(nama));

nama = 10;
console.log(nama + ' tipe datanya adalah '+ typeof(nama))

nama = "5" - "20";
console.log(nama);

nama = false;
console.log(nama + ' tipe datanya adalah '+ typeof(nama));

nama = null;
console.log(nama + ' tipe datanya adalah '+ typeof(nama));

nama = new Date();
console.log(nama + ' tipe datanya adalah ' + typeof(nama))

function sayHalo(nama = "Dimas Maryanto"){
    console.log("halo saya "+ nama)
}

function getTheName(){
    return "nama";
}

sayHalo();
sayHalo('Adyo')
console.log(getTheName);

var anObject = {
    nama : "Dimas",
    alamat: {
        jalan: "jl.bukit indah",
        rt: 18,
        rw: 6,
        kec: "cileuyi",
        kota: "bandung"
    },
    active: true
}

console.log(
    'nama saya adalah '+ anObject.nama + 
    ', alamat rumahnya di '+ anObject.alamat.jalan
);

anObject.nama = "Dimas Maryanto"

// memanggil object
console.log(anObject);

anObject.alamat.kota = "Kab. Bandung"

anObject.alamat = {
    jalan: "jl.bukit indah no b8",
    rt: 18,
    rw: 6,
    kec: "cileuyi",
    kota: "bandung"
}

// memanggil object dalam object
console.log(anObject.alamat)

