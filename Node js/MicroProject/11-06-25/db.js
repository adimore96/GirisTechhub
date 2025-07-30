const mysql = require("mysql2");
require("dotenv").config();

const HOST = process.env.DB_HOST;
const USER = process.env.DB_USERNAME;
const PASSWORD = process.env.DB_PASSWORD;
const DBNAME = process.env.DB_NAME;


// console.log(HOST,USER, PASSWORD, DBNAME);


const conn = mysql.createConnection({
    host:HOST,
    user:USER,
    password:PASSWORD,
    database:DBNAME
});

conn.connect((err)=>{
    if(err){
        console.log("DB connection failed: \n",err.stack);
        return;
    }
    console.log("DB Connection Successful :) ID:- ",conn.threadId);
    
});

module.exports = conn;