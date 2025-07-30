
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
