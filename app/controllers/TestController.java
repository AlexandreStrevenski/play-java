package controllers;


import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import entities.Department;

public class TestController extends Controller {

    public Result executar()  {
        return ok("test working");
    }

    @Transactional
    public Result checkJPA(){

        Department department = new Department();
        department.setName("novo teste");

        JPA.em().persist(department);

        return ok("Ok!");
    }


}
