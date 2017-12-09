function plus(a: number, b: number): number {
    return a + b;
}
console.log('nilai penjumlahan antara 10 dan 50 adalah ' + plus(10, 50));

let tambah = function (a: number, b: number): number {
    return a * b;
}

console.log('nilai penjumlahan antara 10 dan 50 adalah ' + tambah(10, 50) +
    ' dan tipe data variable tambah adalah ' + typeof (tambah));