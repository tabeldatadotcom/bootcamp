package oop.init;

import java.math.BigDecimal;

public class Tabungan{

	public Tabungan(){
		this.saldo = new BigDecimal("1234567");
	}

	public Tabungan(BigDecimal saldo, String nama){
		this.nama = nama;
		this.saldo = saldo;
	}

	private String nama;
	private BigDecimal saldo;

	public BigDecimal getSaldo(){ return this.saldo; }

	public void setSaldo(BigDecimal s){ this.saldo = s; }

	@Override
	public String toString(){
		return this.getSaldo().toString()+ " namanya adalah " + this.nama;
	}
}
