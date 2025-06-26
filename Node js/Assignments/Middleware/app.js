const express = require("express");
const app = express();
require("dotenv").config();

const port = process.env.PORT || 5000;

app.set("view engine", "ejs");
app.use(express.static("public"))
app.use(express.json());
app.use(express.urlencoded({extended:true}));


app.get("/",(req,res)=>{
    let {err} = req.query;
     console.log("err: ",err);
    if(err){
        res.render("login",{msg:"Invalid Credentials"});
    }else{
        res.render("login",{msg:""});
    }
});


// auth middleware
app.use((req,res,next)=>{
    if(req.body === undefined){
        res.redirect("/");
    }else{
         let {user, pass} = req.body;
        // console.log(typeof pass);
        
        if(user==="adityamore96" && pass==="123"){
            next();
        }else{
            res.redirect("/?err=true");
        }
    }
   
});


app.post("/save",(req,res)=>{
    // console.log(user +"\t"+ pass);
    let {user} = req.body;
    res.send(`<center><h1>Welcome ${user} :)</h1></center>`)
    
});

app.listen(port, () => console.log(`Server running on port ${port} 🔥`));