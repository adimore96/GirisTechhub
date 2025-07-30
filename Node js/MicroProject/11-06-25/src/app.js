const express = require("express");
const app = express();
require("dotenv").config();
const path = require("path")

const conn = require("../db");
const router = require("./routes/route");

app.use(express.static("public"));
app.use(express.json());
app.use(express.urlencoded({extended:true}));
app.set("view engine","ejs");



app.use("/",router);

module.exports = app;