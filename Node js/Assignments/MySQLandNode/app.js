const express = require("express");
const mysql = require("mysql2"); //importing mysql2 module
const app = express();
const path = require("path")
require("dotenv").config();

app.set("view engine", "ejs");

const PORT = process.env.PORT;  //accessing .env variable here

// configuring the mysql db
const conn = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"nodelec"
});

conn.connect((err)=>{
    if(err){
        console.log("DB not connected..!");
    }else{
        console.log("DB connected..!");
        
    }
})

let data = ["raj","raj@gmail.com","9087654321",85000];
// delete from employee where eid = ?
// insert into employee values('0',?,?,?,?)
// update employee set name=?, sal=? where eid=?
 global.result = [];
conn.query("select * from employee",[],(err,result)=>{
    if(err){
        console.log("Reocord not saved!");
        console.log(err);
    }else{
        console.log("Record selected successfully..!");
        global.result = result;
        
    }
});

// home route
console.log(__dirname);
let addr = path.join(__dirname,"public");
console.log("new path\n"+addr);

app.get("/",(req,res,err)=>{
    // res.send(`<center><h2>Server Started</h2></center> <br> `+result[0])
    result.forEach((element) => {
        console.log(element.eid+"\t"+element.name+"\t"+element.email+"\t"+element.sal);
        
    });
    res.render("index",{res:result});
})

app.listen(PORT,()=>{
    console.log(`Server started at ${PORT} port..!`);
    
})