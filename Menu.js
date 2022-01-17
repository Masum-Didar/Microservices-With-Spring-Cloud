import React from "react";
import { ListGroup, ListGroupItem } from "reactstrap";


const Menu = () =>{
    return(

        <ListGroup>
            
            <ListGroupItem tag="a" href="/view-employee" action>Employee List</ListGroupItem>
            <ListGroupItem tag="a" href="/add-employee" action>Add Employee</ListGroupItem>
            <ListGroupItem tag="a" href="/add-department" action>Add Department</ListGroupItem>
            <ListGroupItem tag="a" href="/" action>About the Project</ListGroupItem>
            
        </ListGroup>
        
        

    );
};
export default Menu;