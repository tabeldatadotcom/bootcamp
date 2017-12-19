/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.entity;

import java.math.BigDecimal;

/**
 *
 * @author dimmaryanto93
 */
public class AplikasiKredit {
    
    private String id;
    private String namaNasabah;
    private Integer tenor;
    private BigDecimal pinjam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Integer getTenor() {
        return tenor;
    }

    public void setTenor(Integer tenor) {
        this.tenor = tenor;
    }

   

    public BigDecimal getPinjam() {
        return pinjam;
    }

    public void setPinjam(BigDecimal pinjam) {
        this.pinjam = pinjam;
    }
    
}
