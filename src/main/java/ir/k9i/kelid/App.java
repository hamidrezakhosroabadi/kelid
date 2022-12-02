package ir.k9i.kelid;

import static spark.Spark.*;

import com.google.gson.Gson;

import ir.k9i.kelid.Node.Node;
import ir.k9i.kelid.Ring.Ring;
import ir.k9i.kelid.Store.Store;
import ir.k9i.kelid.Utils.JsonTransformer;

public class App {
    public static void main(String[] args) {
        // Routes!
        get("/keys/:key/spots", (request, response) -> {
            return Ring.getSpots(request.params(":key").hashCode(), Integer.parseInt(request.queryParams("count")));
        }, new JsonTransformer());

        get("/nodes/:node", (request, response) -> {
            return Ring.find(Integer.parseInt(request.params(":node")));
        }, new JsonTransformer());

        put("/nodes/:node", (request, response) -> {
            Gson gson = new Gson();
            Node node = gson.fromJson(request.body(), Node.class);
            Ring.push(node);
            return "ok";
        });

        get("/keys/:key", (request, response) -> {
            return Store.get(request.params(":key"));
        });

        put("/keys/:key", (request, response) -> {
            Store.set(request.params(":key"), request.body());
            return "ok";
        });
    }
}
