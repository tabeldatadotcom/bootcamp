class Hewan{
    private nama:string = 'kucing anggora';

    move(distanceInMeter: number = 0){
        console.log(`dia bergerak sejauh ${distanceInMeter}m`);
    }

    getNama(): string{
        return this.nama;
    }
}

class Kucing extends Hewan{

    getNama(): string{
        return super.getNama().toUpperCase();
    }
    
    mencakar(): boolean{
        return true;
    }
}

let anggora: Kucing = new Kucing;
anggora.move(10);
console.log(`nama dari kucing anggora adalah ${anggora.getNama()}`);