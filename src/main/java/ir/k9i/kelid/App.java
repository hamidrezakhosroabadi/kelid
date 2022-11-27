package ir.k9i.kelid;

import static spark.Spark.*;
import ir.k9i.kelid.Node.Node;
import ir.k9i.kelid.Ring.Ring;

public class App {
    public static void main(String[] args) {
        Ring.push(new Node((int) Math.random() + 1, "main", "http://localhost:4567/"));

        get("/keys/:key/spots", (request, response) -> {
            return Ring.getSpots(request.params(":key").hashCode(), Integer.parseInt(request.queryParams("count")));
        });

    }
}
