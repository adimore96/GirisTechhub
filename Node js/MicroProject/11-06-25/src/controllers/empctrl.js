/* 
    New employee Controller
*/

const dbmodel = require("../models/savedeptmodel");
const empCrud = require("../models/empcrudmodel");

exports.newEmp = (req, res) => {
    dbmodel.getAllDept()
        .then((result) => {
            res.render("newemp", { deptList: result, msg: "" });
        })
}

exports.saveEmployee = (req, res) => {
    let { name, email, contact, salary, deptid } = req.body;
    console.log(req.body);
    let filename = req.file.filename;

    empCrud.saveEmployee(name, email, contact, salary, filename, deptid)
        .then((result) => {
            dbmodel.getAllDept()
                .then((resultt) => {
                    res.render("newemp", { deptList: resultt, msg: result });
                })
        })
        .catch((err) => {
            res.send(err);
        })
}

// Verify email exists
exports.verifyEmail = (req, res) => {
    let userEmail = req.query.e;

    console.log(req.query);

    empCrud.verifyEmail(userEmail)
        .then((result) => {
            if (result.length) {
                res.send("Email address already exists!!");
            } else {
                res.send("");
            }
        })
        .catch((err) => {
            console.log(err);
        })
}

exports.viewEmployee = (req, res) => {
    dbmodel.getAllDept()
        .then((resultt) => {
            res.render("viewemployee.ejs", { deptList: resultt });
        })
}


exports.getEmployeeByDeptId = (req,res)=>{
    let deptId = parseInt(req.query.deptId);
    console.log(deptId);

    empCrud.getEmployeeByDeptId(deptId)
    .then((result)=>{
        console.log(result);
        
        res.send(result)
    })
    
}