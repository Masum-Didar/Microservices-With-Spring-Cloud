import React from "react";
import {
    Card,
    CardBody,
    CardTitle,
    Button,
    Table
    } from "reactstrap";
    import { ToastContainer, toast } from 'react-toastify';


    const btnHandler = () => {
        toast.success("Wow this is working !", {position: "top-center"});
     }


    const Employee=( {employee} )=>{
        return(
        <Card>
            <CardBody>
                <CardTitle>
                     <Table hover>
                            <thead>
                                <tr>
                                    <th>
                                        ID
                                    </th>
                                    <th>
                                        Code
                                    </th>
                                    <th>
                                        Name
                                    </th>
                                    <th>
                                        DateOfBirth
                                    </th>
                                    <th>
                                        Gender
                                    </th>
                                    <th>
                                        Mobile
                                    </th>
                                    <th>
                                        DeptId
                                    </th>
                                    <th>
                                        Action
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                    <tr>
                                        <th scope="row">
                                            { employee.id }
                                        </th>
                                        <td>
                                            { employee.code }
                                        </td>
                                        <td>
                                            { employee.name }
                                        </td>
                                        <td>
                                            { employee.dob }
                                        </td>
                                        <td>
                                            { employee.gender }
                                        </td>
                                        <td>
                                            { employee.mobile }
                                        </td>
                                        <td>
                                            { employee.deptId }
                                        </td>
                                        <td>
                                        <Button color="primary" outline onClick={btnHandler}>Update</Button>
                                        <Button color="danger ml-3" outline>Delete</Button>
                                        </td>
                                    </tr>
                             </tbody>
                         </Table>
                    
                </CardTitle>
            </CardBody>
        </Card>
        )

    }

    export default Employee;