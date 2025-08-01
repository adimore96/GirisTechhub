const express = require("express");
const router = express.Router();
let deptctrl = require("../controllers/deptcontroller");
const empctrl = require("../controllers/empctrl");
const multer = require("../middleware/multer/multer");

// Homepage route
router.get("/",deptctrl.homePage);

// Add department POST route
router.post("/adddept",deptctrl.saveDept);

// get the new dept
router.get("/newdept",deptctrl.newDept);

// get all the departments
router.get("/viewalldept",deptctrl.getAllDept);

// delete department 
router.get("/deltdelt/:id",deptctrl.dltDept);

router.get("/updatedept/:id",deptctrl.getDeptByID);
router.post("/updatedept",deptctrl.updateDept);

router.get("/searchDeptByName", deptctrl.searchDept);

// Eployee routes
router.get("/newemployee",empctrl.newEmp);

router.post("/saveemp",multer.single("photo"),empctrl.saveEmployee);

router.get("/searchEmail",empctrl.verifyEmail);

router.get("/viewemployee",empctrl.viewEmployee);

router.get("/getEmpByDeptId",empctrl.getEmployeeByDeptId);

module.exports = router;