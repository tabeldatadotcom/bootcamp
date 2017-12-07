/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.dao;

import com.gmail.maryanto.dimas.resto.restoapi.entity.AplikasiKredit;
import com.gmail.maryanto.dimas.resto.restoapi.entity.JadwalBayar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dimmaryanto93
 */
@Repository
public class AplikasiKreditDao {

    @Autowired
    private DataSource ds;

    public void save(AplikasiKredit kredit, List<JadwalBayar> listJadwal) throws SQLException {
        String saveAplikasi = "insert into kredit(nama, tenor, pinjam) values (?, ? ,?)";
        String saveJadwal = "insert into jadwal(kredit_id, jadwal_bayar, cicilan) values (? , ? ,?);";

        Connection connection = ds.getConnection();
        connection.setAutoCommit(false);
        PreparedStatement aplikasiStatement = connection.prepareStatement(
                saveAplikasi,
                Statement.RETURN_GENERATED_KEYS
        );

        aplikasiStatement.setString(1, kredit.getNamaNasabah());
        aplikasiStatement.setInt(2, kredit.getTenor());
        aplikasiStatement.setBigDecimal(3, kredit.getPinjam());
        aplikasiStatement.executeUpdate();

        ResultSet resultKey = aplikasiStatement.getGeneratedKeys();
        int kreditId = 0;
        if (resultKey.next()) {
            kreditId = resultKey.getInt(1);

        }

        PreparedStatement jadwalKredit = connection.prepareStatement(saveJadwal);
        for (JadwalBayar jadwal : listJadwal) {
            jadwal.setId(kreditId);
            jadwalKredit.setInt(1, jadwal.getId());
            jadwalKredit.setDate(2, jadwal.getJadwalBayar());
            jadwalKredit.setBigDecimal(3, jadwal.getCicilan());

            jadwalKredit.addBatch();
        }
        jadwalKredit.executeBatch();
        jadwalKredit.clearBatch();
        jadwalKredit.close();
        aplikasiStatement.close();

        connection.commit();
        connection.close();

    }

}
