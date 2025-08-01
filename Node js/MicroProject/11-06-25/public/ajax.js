
let searchDept = (str) =>{
    
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(){

        if(this.readyState==4 && this.status==200){
            // alert(this.responseText);
            let jsonObj = JSON.parse(this.responseText);

            let tblBody = document.getElementById("tblBody");
            tblBody.innerHTML = "";
            if(jsonObj.length>0){
            jsonObj.forEach((element,index) => {

                let row = document.createElement("tr");
                let col = document.createElement("td");

                col.innerHTML = (index+1);
                row.appendChild(col);

                col = document.createElement("td");
                col.innerHTML = element.deptname;
                row.appendChild(col);

                col = document.createElement("td");
                col.innerHTML = `<a style="color: red;" href="/deltdelt/${element.deptid}"><i class="fa-solid fa-trash"></i></a>`
                row.appendChild(col);

                col = document.createElement("td");
                col.innerHTML = `<a style="color: rgb(47, 179, 255);" href="/updatedept/${element.deptid}"><i class="fa-solid fa-file-pen"></i></a>`
                row.appendChild(col);
                
                tblBody.appendChild(row);
            });
        }else{
            tblBody.innerHTML = '<tr><td colspan="100%" style="text-align:center background-color:red;"><h6 style="margin: 0;">No Dept Found!!!</h6></td></tr>'
        }
        }
    };

    xhttp.open("get","/searchDeptByName?dn="+str, true);
    xhttp.send();
}

let checkEmailExistance = (str) =>{
    
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(){
        if(this.readyState==4 && this.status==200){
            if(this.responseText.length>0){
                document.getElementById("labelMsg").innerText = "Email alerady exists";
                document.getElementById("email").focus();
                document.getElementById("submit").setAttribute("disabled","")
            }else{
                document.getElementById("labelMsg").innerText = "";
                document.getElementById("submit").removeAttribute("disabled");
            }
        }
    };

    xhttp.open("get","/searchEmail?e="+str, true);
    xhttp.send();
}

let getEmployeeByDept = () =>{
    let deptId = parseInt(document.getElementById("deptid").value)
    
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function(){
        if(this.readyState==4 && this.status==200){
            let response = JSON.parse(this.responseText);
            console.log(response);

            let tblbody = document.getElementById("tblbody");
            tblbody.innerHTML = "";
            response.forEach((row,index)=>{
                let tr = document.createElement("tr");
                let name =document.createElement("td");
                name.innerText = row.name;
                let email = document.createElement("td");
                email.innerText = row.email;
                let contact = document.createElement("td");
                contact.innerText = row.contact;
                let photo = document.createElement("td");
                photo.innerHTML = "<img src='/images/"+row.photo+"' width=200 height=100/>"
                let dept = document.createElement("td");
                dept.innerText = row.deptname;

                tr.appendChild(name);
                tr.appendChild(email);
                tr.appendChild(contact);
                tr.appendChild(photo);
                tr.appendChild(dept);

                tr.style.height = "100px";

                tblbody.appendChild(tr);
            })
        }
    }

    xhttp.open("get","/getEmpByDeptId?deptId="+deptId,true);
    xhttp.send();
}