import React, { useState } from "react";
import Employee from "./Employee";


const AllEmployee = () =>{
   
    const [employees, setEmployees] = useState([
       
        { id:"01", code:"4444", name:"Masum", dob:"09.07.1998", gender:"Male", mobile:"5674893", deptId:"444"},
        
        { id:"02", code:"5678", name:"Didar", dob:"09.07.1998", gender:"Male", mobile:"5674893", deptId:"444"},
        
        { id:"03", code:"0987", name:"Tarek", dob:"09.07.1998", gender:"Male", mobile:"5674893", deptId:"444"}
    ])
   
    return(

        <div>

            {
                employees.length>0 ? employees.map( (item)=> <Employee employee={item} />)
                 : "No Employee"
            }


        </div>
    )
}
export default AllEmployee;