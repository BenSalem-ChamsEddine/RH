package com.talan.Rh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class HomeController {


    public Map<String,String> getMappings(String type){
        Map<String,String> map = null;
            switch (type){
                case "candidat" :
                    map.put("Add","{[/candidat/add], methods=[POST], consumes=[candidat]}");
                    map.put("Update","{[/candidat/update], methods=[PUT], consumes=[candidat]}");
                    map.put("Delete","{[/candidat/delete], methods=[DELETE], consumes=[candidat]}");
                    map.put("Find All","{[/candidat], methods=[GET]}");
                    map.put("Find By Id","{[/candidat/findbyid/{id}], methods=[GET], consumes=[long id]}");
                    map.put("Find By Nom","{[/candidat/findbynom/{nom}], methods=[GET], consumes=[String nom]}");
                    map.put("Find By Prenom","{[/candidat/findbyprenom/{prenom}], methods=[GET], consumes=[String prenom]}");
                    map.put("Find By Nom Or Prenom","{[/candidat/findbynomorprenom/{contains}] ,methods=[GET], consumes=[String contains]}");
                    map.put("Find By Age","{[/candidat/findbyage/{age}], methods=[GET], consumes=[int age]}");
                    map.put("Find By Collaborateur ","{[/candidat/findbycollaborateur], methods=[GET], consumes=[collaborateur]}");
                    break;
                case "collaborateur" :
                    map.put("Add","{[/collaborateur/add], methods=[POST], consumes=[collaborateur]}");
                    map.put("Update","{[/collaborateur/update], methods=[PUT], consumes=[collaborateur]}");
                    map.put("Delete","{[/collaborateur/delete], methods=[DELETE], consumes=[collaborateur]}");
                    map.put("Find All","{[/collaborateur], methods=[GET]}");
                    map.put("Find By Id","{[/collaborateur/findbyid/{id}], methods=[GET], consumes=[long id]}");
                    map.put("Find By Nom","{[/collaborateur/findbynom/{nom}], methods=[GET], consumes=[String nom]}");
                    map.put("Find By Prenom","{[/collaborateur/findbyprenom/{prenom}], methods=[GET], consumes=[String prenom]}");
                    map.put("Find By Nom Or Prenom","{[/collaborateur/findbynomorprenom/{contains}], methods=[GET], consumes=[String contains]}");
                    map.put("Find By Age","{[/collaborateur/findbyage/{age}], methods=[GET], consumes=[int age]}");
                    map.put("Find By Candidat ","{[/collaborateur/findbycandidat],methods=[GET]}");
                    break;
                case "manager" :
                    map.put("Add","{[/manager/add], methods=[POST], consumes=[manager]}");
                    map.put("Update","{[/manager/update], methods=[PUT], consumes=[manager]}");
                    map.put("Delete","{[/manager/delete], methods=[DELETE], consumes=[manager]}");
                    map.put("Find All","{[/manager], methods=[GET]}");
                    map.put("Find By Id","{[/manager/findbyid/{id}], methods=[GET], consumes=[long id]}");
                    map.put("Find By Nom","{[/manager/findbynom/{nom}], methods=[GET], consumes=[String nom]}");
                    map.put("Find By Prenom","{[/manager/findbyprenom/{prenom}], methods=[GET], consumes=[String prenom]}");
                    map.put("Find By Nom Or Prenom","{[/manager/findbynomorprenom/{contains}], methods=[GET], consumes=[String contains]}");
                    map.put("Find By Age","{[/manager/findbyage/{age}], methods=[GET], consumes=[int age]}");
                    map.put("Find By Collaborateur ","{[/manager/findbycollaborateur], methods=[GET], consumes=[collaborateur]}");
                    break;
                    default:
                        map.put("","");
                        break;
            }
        return map;
    }
}
