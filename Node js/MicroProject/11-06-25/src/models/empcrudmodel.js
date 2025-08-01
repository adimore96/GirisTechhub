const conn = require("../../db");

exports.saveEmployee = (...empData)=>{
    return new Promise((resolve,reject)=>{
        conn.query("insert into employee values('0',?,?,?,?,?,?)",[...empData],(err,result)=>{
            if(err) reject(err)
            else resolve("Employee save successfully... :)")
        })
    })
}

// verify email exists
exports.verifyEmail = (userEmail) =>{
    return new Promise((resolve,reject)=>{
        conn.query("select * from employee where email = ? ",[userEmail], (err,result)=>{
            if(err){
                reject(err);
            }else{
                resolve(result);
            }
        })
    })
}