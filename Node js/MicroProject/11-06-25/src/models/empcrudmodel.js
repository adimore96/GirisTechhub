const conn = require("../../db");

exports.saveEmployee = (...empData)=>{
    return new Promise((resolve,reject)=>{
        conn.query("insert into employee values('0',?,?,?,?,?,?)",[...empData],(err,result)=>{
            if(err) reject(err)
            else resolve("Employee save successfully... :)")
        })
    })
}