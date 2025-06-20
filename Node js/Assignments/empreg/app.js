const express = require("express");
const app = express();
require("dotenv").config();
const path = require("path");
const {conn} = require("./config/dbconfig");


// Accessing .env constants
const PORT = process.env.PORT;

// Middlewares
app.use(express.static("public"));
app.use(express.json());
app.use(express.urlencoded({extended:true}));

// declaring the absolute path
let addr = path.join(__dirname,"public");
console.log(__dirname);


app.get("/",(req,res)=>{        
    // res.send("<center><h1>Server started</h1></center>")
    res.sendFile(addr+"/emp.html");
})

app.post("/save",(req,res)=>{
     let {name, email, contact, sal} = req.body;
     console.log(name+" "+email+" "+contact+" "+sal);
     conn.query("insert into employee values('0',?,?,?,?)",[name,email,contact,sal],(err,result)=>{

        if(err){
            console.log("Data not inserted.!");
            res.send("<h2>Employee not added.!</h2>");
        }else{
            if (result.affectedRows>0) {
                console.log("Data inserted: ");
                console.log(result);
                res.send(req.body);
            }else{
                res.send("<h2>Employee not added.!</h2>");
            }
            
        }
     })
     
     
});

app.listen(PORT,(err)=>{
    console.log(`Server started at ${PORT} Port!`);
});