package controllers;

import models.Flower;
import play.*;
import play.api.templates.Html;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result showMain(Html content) {

        return ok(main.render(content));
    }

    public static Result index() {
        return showMain(home.render());
    }

    public static Result second(){
        return showMain(secondpage.render());
    }

    public  static Result products() {
        return showMain(products.render());
    }

    public static Result showFlower(){
        Flower rose=new Flower();
        rose.setId("f001");
        rose.setName("ดอกกุหลาบ");
        rose.setPrice(15000.00);
        rose.setAmount(150);

        Flower justmin = new Flower("f002", "ดอกมะลิ", 2500.00, 1000);
        return showMain(showFlower.render(rose,justmin));
    }
}
