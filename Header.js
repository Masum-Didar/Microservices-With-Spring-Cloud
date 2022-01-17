import React from "react";
import { Card, CardBody } from "reactstrap";


function Header({ name, title }){

    return(
        <div className="text-center">
            <Card className="my-3 bg-success">
                <CardBody>
                <h1 className="my-2">Welcome To IBCS-PRIMAX Project</h1>
                </CardBody>
            </Card>
            
        </div>
    )

}
export default Header;