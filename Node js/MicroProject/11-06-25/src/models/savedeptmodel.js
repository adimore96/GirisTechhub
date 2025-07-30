const { request } = require("express");
const conn = require("../../db");

exports.saveDept = (deptName) =>{
    return new Promise((resolve,reject)=>{
        conn.query("insert into dept values('0',?);",[deptName],(err,result)=>{
            if(err){
                console.log(err);
                
                reject("Dept not save");
            }else{
                resolve("Dept save successfully...");
            }
        });
    });
}


exports.getAllDept = () =>{
    return new Promise( (resolve,reject)=>{
        conn.query("select * from dept ORDER BY deptid;",(err,result)=>{
            if(err){
                reject(err);
            }else{
                resolve(result);
            }
        });
    });
}

// delete dept
exports.dltDept = (deptid) =>{
    return new Promise( (resolve,reject)=>{
        conn.query("delete from dept where deptid = ?",[deptid], (err,result)=>{
            if(err){
                reject(err);
            }else{
                resolve(result);
            }
        })
    })
}

// get dept by id
exports.getDeptByID = (deptid)=>{
    return new Promise((resolve,reject)=>{
        conn.query("select * from dept where deptid = ? ;",[deptid], (err,result)=>{
            if(err){
                reject(err);
            }else{
                resolve(result);
            }
        })
    })
}

// update Dept 
exports.updateDept = (name, deptid) =>{
    return new Promise( (resolve,reject)=>{
        console.log("name "+name+" id "+deptid);
        
        conn.query("update dept set deptname = ? where deptid = ? ;",[name,deptid], ((err,result)=>{
            if(err){
                reject(err);
            }else{
                resolve(result);
            }
        }))
    })
}

// search Dept
exports.searchDept = (name) =>{
    return new Promise((resolve,reject)=>{
        conn.query("select * from dept where deptname like ?;",[name], (err,result)=>{
            if(err){
                reject(err);
            }else{
                resolve(result);
            }
        })
    })
}