package ir.k9i.kelid;

import static spark.Spark.*;
import ir.k9i.kelid.Ring.Ring;
import ir.k9i.kelid.Utils.JsonTransformer;

public class App {
    public static void main(String[] args) {
        // Routes!
        get("/keys/:key/spots", (request, response) -> {
            return Ring.getSpots(request.params(":key").hashCode(), Integer.parseInt(request.queryParams("count")));
        }, new JsonTransformer());

    }
}
