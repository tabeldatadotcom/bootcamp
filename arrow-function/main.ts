let sayHalo = (nama: string, ...messages: string[]): string => {
    // console.log(`${message}${nama}`);
    let value = nama;
    for(let message of messages){
        value += message;
    }
    return value;
    
 }

console.log(
    sayHalo('Dimas Maryanto', 
    'halo nama saya adalah ', 
    ' saya bekerja di PT. Tabel data informatika', 
    ' sejak tahun 2000')
);