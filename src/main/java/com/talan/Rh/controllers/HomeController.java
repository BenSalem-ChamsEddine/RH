package com.talan.Rh.controllers;

import com.talan.Rh.entities.Endpoint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("")
public class HomeController {


    public List<Endpoint> getMappings(String type) {

        List<Endpoint> endpoints = new ArrayList<>();
        Map<String, String> map = new HashMap<String, String>();
        if ("none".equals(type)) {
            return null;
        }
        if ("candidat".toUpperCase().contains(type.toUpperCase().subSequence(0, type.length()))) {

            endpoints.add(new Endpoint("Add", "[/candidat/add]", "[POST]", "[candidat]", "[candidat]"));
            endpoints.add(new Endpoint("Update", "[/candidat/update]", "[PUT]", "[candidat]", "[candidat]"));
            endpoints.add(new Endpoint("Delete", "[/candidat/delete]", "[DELETE]", "[candidat]", "X"));
            endpoints.add(new Endpoint("Find All", "[/candidat]", "[GET]", "X", "[candidat[]]"));
            endpoints.add(new Endpoint("Find By Id", "[/candidat/findbyid/{id}]", "[GET]", "[long id]", "[candidat]"));
            endpoints.add(new Endpoint("Find By Nom", "[/candidat/findbynom/{nom}]", "[GET]", "[String nom]", "[candidat[]]"));
            endpoints.add(new Endpoint("Find By Prenom", "[/candidat/findbyprenom/{prenom}]", "[GET]", "[String prenom]", "[candidat[]]"));
            endpoints.add(new Endpoint("Find By Nom Or Prenom", "[/candidat/findbynomorprenom/{contains}]", "[GET]", "[String contains]", "[candidat[]]"));
            endpoints.add(new Endpoint("Find By Age", "[/candidat/findbyage/{age}]", "[GET]", "[int age]", "[candidat[]]"));
            endpoints.add(new Endpoint("Find By Collaborateur", "[/candidat/findbycollaborateur]", "[GET]", "[collaborateur]", "[candidat[]]"));
        }

        if ("collaborateur".toUpperCase().contains(type.toUpperCase().subSequence(0, type.length()))) {


            endpoints.add(new Endpoint("Add", "[/collaborateur/add]", "[POST]", "[collaborateur]", "[collaborateur]"));
            endpoints.add(new Endpoint("Update", "[/collaborateur/update]", "[PUT]", "[collaborateur]", "[collaborateur]"));
            endpoints.add(new Endpoint("Delete", "[/collaborateur/delete]", "[DELETE]", "[collaborateur]", "X"));
            endpoints.add(new Endpoint("Find All", "[/collaborateur]", "[GET]", "X", "[collaborateur[]]"));
            endpoints.add(new Endpoint("Find By Id", "[/collaborateur/findbyid/{id}]", "[GET]", "[long id]", "[collaborateur]"));
            endpoints.add(new Endpoint("Find By Nom", "[/collaborateur/findbynom/{nom}]", "[GET]", "[String nom]", "[collaborateur[]]"));
            endpoints.add(new Endpoint("Find By Prenom", "[/collaborateur/findbyprenom/{prenom}]", "[GET]", "[String prenom]", "[collaborateur[]]"));
            endpoints.add(new Endpoint("Find By Nom Or Prenom", "[/collaborateur/findbynomorprenom/{contains}]", "[GET]", "[String contains]", "[collaborateur[]]"));
            endpoints.add(new Endpoint("Find By Age", "[/collaborateur/findbyage/{age}]", "[GET]", "[int age]", "[collaborateur[]]"));
            endpoints.add(new Endpoint("Find By Candidat", "[/collaborateur/findbycandidat]", "[GET]", "[candidat]", "[collaborateur]"));


        }

        if ("manager".toUpperCase().contains(type.toUpperCase().subSequence(0, type.length()))) {

            endpoints.add(new Endpoint("Add", "[/manager/add]", "[POST]", "[manager]", "[manager]"));
            endpoints.add(new Endpoint("Update", "[/manager/update]", "[PUT]", "[manager]", "[manager]"));
            endpoints.add(new Endpoint("Delete", "[/manager/delete]", "[DELETE]", "[manager]", "X"));
            endpoints.add(new Endpoint("Find All", "[/manager]", "[GET]", "X", "[manager[]]"));
            endpoints.add(new Endpoint("Find By Id", "[/manager/findbyid/{id}]", "[GET]", "[long id]", "[manager]"));
            endpoints.add(new Endpoint("Find By Nom", "[/manager/findbynom/{nom}]", "[GET]", "[String nom]", "[manager[]]"));
            endpoints.add(new Endpoint("Find By Prenom", "[/manager/findbyprenom/{prenom}]", "[GET]", "[String prenom]", "[manager[]]"));
            endpoints.add(new Endpoint("Find By Nom Or Prenom", "[/manager/findbynomorprenom/{contains}]", "[GET]", "[String contains]", "[manager[]]"));
            endpoints.add(new Endpoint("Find By Age", "[/manager/findbyage/{age}]", "[GET]", "[int age]", "[candidat[]]"));
            endpoints.add(new Endpoint("Find By Collaborateur", "[/manager/findbycollaborateur]", "[GET]", "[collaborateur]", "[manager[]]"));
        }
        return endpoints;
    }


    @RequestMapping
    public String home(ModelMap model, @RequestParam(value = "type", defaultValue = "none") String type) {
        System.err.println(type);
        List<Endpoint> mappings = getMappings(type);
        model.addAttribute("mappings", mappings);
        return mappings == null ? "home" : "result";
    }
}


