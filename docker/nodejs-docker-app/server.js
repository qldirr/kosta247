const express = require("express");

const PORT = 8082;

const app = express();

app.get("/", (req, res) => {
    res.send("좋은 하루222.  nodeJS!!!");
});

app.listen(PORT);
console.log("Server in running...");