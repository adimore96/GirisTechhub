const express = require("express");
const app = express();
const PORT = 3000;

app.set("view engine", "ejs");
app.use(express.static("public"));

app.get("/",(req,res)=>{
    res.render("index.ejs");
})

app.get("/basicejs", (req, res) => {
    res.render("demo.ejs",{
        name:"Aditya",
        age:21
    });
});

app.get("/table",(req,res)=>{
    let number = req.query.num;
    // console.log(number);
    res.render("table.ejs",{num:number});
})

app.listen(PORT,()=>{
    console.log(`Server started at ${PORT} port!`);
    
})