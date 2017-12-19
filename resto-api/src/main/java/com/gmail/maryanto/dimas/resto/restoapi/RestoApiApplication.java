package com.gmail.maryanto.dimas.resto.restoapi;

import com.gmail.maryanto.dimas.resto.restoapi.dao.AplikasiKreditDao;
import com.gmail.maryanto.dimas.resto.restoapi.dao.DepartmentDao;
import com.gmail.maryanto.dimas.resto.restoapi.entity.AplikasiKredit;
import com.gmail.maryanto.dimas.resto.restoapi.entity.Department;
import com.gmail.maryanto.dimas.resto.restoapi.entity.JadwalBayar;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestoApiApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext springContext = SpringApplication.run(RestoApiApplication.class, args);
        AplikasiKreditDao dao = springContext.getBean(AplikasiKreditDao.class);

        AplikasiKredit kredit = new AplikasiKredit();
        kredit.setNamaNasabah("Dimas Maryanto");
        kredit.setTenor(12);
        kredit.setPinjam(new BigDecimal("10000000"));

        dao.save(
                kredit,
                Arrays.asList(
                        new JadwalBayar(kredit, Date.valueOf("2017-03-20"), new BigDecimal(1000000)),
                        new JadwalBayar(kredit, Date.valueOf("2017-04-20"), new BigDecimal(1000000)),
                        new JadwalBayar(kredit, Date.valueOf("2017-05-20"), new BigDecimal(1000000)),
                        new JadwalBayar(kredit, Date.valueOf("2017-06-20"), new BigDecimal(1000000)),
                        new JadwalBayar(kredit, Date.valueOf("2017-07-20"), new BigDecimal(1000000)),
                        new JadwalBayar(kredit, Date.valueOf("2017-08-20"), new BigDecimal(1000000)),
                        new JadwalBayar(kredit, Date.valueOf("2017-09-20"), new BigDecimal(1000000))
                ));

    }
}
