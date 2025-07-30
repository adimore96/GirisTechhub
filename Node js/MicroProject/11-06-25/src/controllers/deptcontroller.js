const deptmodel = require("../models/savedeptmodel");


// Save department controller
exports.saveDept = (req, res) => {
    let { name } = req.body;
    let promise = deptmodel.saveDept(name);
    promise.then((result) => {
        res.render("adddept.ejs", { msg: result });
    }).catch((err => {
        res.render("adddept.ejs", { msg: err });
    }));
};

// Homepage route
exports.homePage = ((req, res) => {
    res.render("home.ejs");
});

// New dept
exports.newDept = ((req, res) => {
    res.render("adddept.ejs", { msg: "" });
})

// Get all Dept
exports.getAllDept = (req, res) => {
    deptmodel.getAllDept()
        .then((result) => {
            if (req.query.msg == 1) {
                res.render("viewdept.ejs", { deptList: result, msg: "11" });
            } else if (req.query.msg == 0) {
                res.render("viewdept.ejs", { deptList: result, msg: "00" });
            } else {
                res.render("viewdept.ejs", { deptList: result, msg: "" });
            }
        }).catch((err) => {
            res.send(err);
        })
}

// Delete department
exports.dltDept = (req, res) => {
    const deptid = req.params.id;
    deptmodel.dltDept(deptid)
        .then((result) => {
            res.redirect("/viewalldept?msg=1");
        })
        .catch((err) => {
            res.redirect("/viewalldept?msg=0");
        })


}

// update dept
exports.getDeptByID = (req, res) => {
    let deptid = req.params.id;
    // console.log(req.params);

    // console.log("Controller called with ID:", deptid);
    deptmodel.getDeptByID(deptid)
        .then((result) => {
            // console.log(result);

            res.render("edit.ejs", { data: result[0] });

        })
        .catch((err) => {
            res.redirect("/viewalldept");
        })

}

exports.updateDept = (req, res) => {
    // let {}
    console.log(req.body);
    let { name, deptid } = req.body;

    deptmodel.updateDept(name, deptid)
        .then((result) => {
            res.redirect("/viewalldept");
        })
        .catch((err) => {
            console.log(err);
            res.redirect("/viewalldept");

        })
}

// search dept
exports.searchDept = (req,res) =>{
    let name = req.query.dn;
    name = `%${name}%`;
    console.log(name);
    deptmodel.searchDept(name)
    .then((result)=>{
        console.log(result);
        res.json(result);
    })
    .catch((err)=>{
        console.log(err);
        res.send(err);
    })
}

