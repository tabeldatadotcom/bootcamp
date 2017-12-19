/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.entity;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author dimmaryanto93
 */
public class JadwalBayar {
    
    private Integer id;
    private AplikasiKredit kredit;
    private Date jadwalBayar;
    private BigDecimal cicilan;
    
    public JadwalBayar(AplikasiKredit kredit, Date jadwal, BigDecimal cicilan){
        setKredit(kredit);
        setJadwalBayar(jadwal);
        setCicilan(cicilan);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AplikasiKredit getKredit() {
        return kredit;
    }

    public void setKredit(AplikasiKredit kredit) {
        this.kredit = kredit;
    }

    public Date getJadwalBayar() {
        return jadwalBayar;
    }

    public void setJadwalBayar(Date jadwalBayar) {
        this.jadwalBayar = jadwalBayar;
    }

    public BigDecimal getCicilan() {
        return cicilan;
    }

    public void setCicilan(BigDecimal cicilan) {
        this.cicilan = cicilan;
    }
    
    
    
}
