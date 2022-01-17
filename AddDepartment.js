import React, { Fragment } from "react";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";

const AddDepartment = () => {

    return (
        <Fragment>
            <h1 className="text-center my-3"> Add a Department</h1>
        <Form>
            <FormGroup>
                <label for="departmentName">Name</label>
                <Input
                        type="Text" 
                        placeholder="Enter Heare" 
                        name="employeeId" 
                        id="employeeId" 
                        />
            </FormGroup>
            <FormGroup inline check>
                        <label check>
                         Active
                        </label>
                        <Input type="checkbox" />
                
            </FormGroup>
            <Container>
                <Button color="success">Add </Button>
            </Container>
                        
        </Form>
    </Fragment>

    );
        
};
export default AddDepartment;