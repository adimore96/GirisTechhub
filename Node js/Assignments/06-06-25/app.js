const express = require("express");
const path = require("path");
const app = express();
app.use(express.static("public"));

app.use(express.json());
app.use(express.urlencoded({extended:true}))
let p = path.join(__dirname+"/public");

{
// const parsed = path.basename(__filename);
// console.log("_dirName: "+parsed);
// console.log("new path: "+p);
}

app.get("/",(req,res)=>{
    res.sendFile(p+"/form.html");
})

app.get("/save",(req,res)=>{
    console.log(req.params);
    res.send(req.query);
    
})
app.get("/save",(req,res)=>{
    console.log(req.params);
    res.send(req.query);
    
})

app.listen(3000,()=>{
    console.log("Server Started");
})