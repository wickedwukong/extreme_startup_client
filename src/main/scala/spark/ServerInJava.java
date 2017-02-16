package spark;

import static spark.Spark.*;

public class ServerInJava {
    public static void main(String[] args) {
        port(1337);
        get("/hello", (req, res) -> "Hello World");
    }
}