const mysql = require("mysql2");
require("dotenv").config();

console.log("HOST: "+process.env.HOST);

const conn = mysql.createConnection({
    host:process.env.HOST,
    user:process.env.USER,
    password:process.env.PASS,
    database:process.env.DBNAME
})

conn.connect((err)=>{
    if(!err){
        console.log("DB Connection Successful");
    }else{
        console.log("DB Connection fails");
        
    }
})

exports.conn = conn;