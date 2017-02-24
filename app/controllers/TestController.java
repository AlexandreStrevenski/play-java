package controllers;


import play.mvc.Controller;
import play.mvc.Result;

public class TestController extends Controller {

    public Result executar()  {
        return ok("test working");
    }
}
