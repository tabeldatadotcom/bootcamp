/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.controller;

import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimmaryanto93
 */
@RestController
public class IndexController {

    /**
     * get method mengkases http://localhost:8080/halo
     *
     * @return
     */
    @RequestMapping(
            path = "/halo",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    public String haloWorld() {
        return "{ \"nana\" : \"Dimas Maryanto\", "
                + "\"aplikasi\": \"Aplikasi Web Resto\""
                + "}";
    }

    /**
     * menggunakan query param menakses
     * http://localhost:8080/hello?nama_lengkap=dimas%20maryanto&aplikasi=java
     *
     * @param nama
     * @param aplikasi
     * @return
     */
    @RequestMapping(
            path = "/hello",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    public String haloWorld(
            @RequestParam(name = "nama_lengkap") String nama,
            @RequestParam(name = "aplikasi") String aplikasi) {
        return "{ \"nana\" : \"" + nama + "\", "
                + "\"aplikasi\": \"" + aplikasi + "\""
                + "}";
    }

    /**
     * menggunakan path variable akses
     * http://localhost:8080/halo/dimas%20maryanto
     *
     * @param namaLengkap
     * @return
     */
    @GetMapping(
            path = "/halo/{nama}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String haloWorld(
            @PathVariable("nama") String namaLengkap) {
        return "{ \"nana\" : \"" + namaLengkap + "\", "
                + "\"aplikasi\": \"Spring WEB MVC\""
                + "}";
    }

    @RequestMapping(
            path = "/halo",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST)
    public String haloWorldPost(@RequestBody Map<String, Object> body) {
        return "{ \"nana\" : \"" + body.get("nama") + "\", "
                + "\"aplikasi\": \"" + body.get("aplikasi") + "\""
                + "}";
    }

}
