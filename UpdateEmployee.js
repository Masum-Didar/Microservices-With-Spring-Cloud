import React, { Fragment } from "react";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";

const UpdateEmployee = () => {

    return (
        <Fragment>
            <h1 className="text-center my-3"> Update Employee Details</h1>
        <Form>
            <FormGroup>
                <label for="employeeName">Name</label>
                <Input
                        type="Text" 
                        placeholder="Enter your name" 
                        name="name" 
                        id="employeeId" 
                        />
            </FormGroup>
            <FormGroup>
                <label for="employeeId">Code</label>
                <Input
                        type="number" 
                        placeholder="Enter your unique code" 
                        name="code" 
                        id="employeeId" 
                        />
            </FormGroup>
            <FormGroup>
                <label for="employeeId">Date of Birth</label>
                <Input
                        type="date" 
                        placeholder="Select your Date of birth" 
                        name="date" 
                        id="employeeId" 
                        />
            </FormGroup>
            <FormGroup>
                <label for="employeeId">Gender</label>
                    <Input  type="select" 
                            placeholder="Select Your gender" 
                            name="gender" 
                            id="employeeId" 
                            >
                                    <option>
                                    Male
                                    </option>
                                    <option>
                                    Female
                                    </option>
                                    <option>
                                    Other
                                    </option>
                    </Input>           
            </FormGroup>
            <FormGroup>
                <label for="employeeId">Mobile</label>
                <Input
                        type="number" 
                        placeholder="Enter Heare" 
                        name="number" 
                        id="employeeId" 
                        />
            </FormGroup>
            <FormGroup>
                <label for="employeeId">Department Id</label>
                <Input
                        type="select" 
                        placeholder="Enter Heare" 
                        name="number" 
                        id="employeeId" 
                        >
                            <option>
                             1
                            </option>
                            <option>
                             2
                             </option>
                            <option>
                             3
                            </option>

                </Input>
                        
            </FormGroup>
            <Container>
                <Button color="success">Update</Button>
            </Container>
            
        </Form>
    </Fragment>

    );
        
};
export default UpdateEmployee;