class Hewan {

    constructor(private nama: string, public kaki: number) {
    }

    move(distanceInMeter: number = 0) {
        console.log(`dia bergerak sejauh ${distanceInMeter}m`);
    }

    getNama(): string {
        return this.nama;
    }

    getKaki(): number {
        return this.kaki;
    }
}

class Kucing extends Hewan {

    constructor(name: string) {
        super(name, 4);
    }

    getNama(): string {
        return super.getNama().toUpperCase();
    }

    mencakar(): boolean {
        return true;
    }
}

let anggora: Kucing = new Kucing('Kucing Garong');
anggora.move(10);
console.log(`nama dari kucing anggora adalah ${anggora.getNama()} kakinya berjumlah ${anggora.kaki}`);