import React from "react";
import {Container, Row, Col, Form, Button} from "react-bootstrap";

function SignInForm() {
    return (
        <Container fluid className="d-flex align-items-center justify-content-center min-vh-100 bg-light">
            <Row className="w-100 justify-content-center">
                <Col md={6} lg={4} className="text-center p-4 shadow rounded bg-white">
                    <Form className="form-signin">
                        <img
                            className="mb-4"
                            src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Bootstrap_logo.svg/2560px-Bootstrap_logo.svg.png"
                            alt="Bootstrap Logo"
                            width="72"
                            height="57"
                        />
                        <h1 className="h4 mb-4 fw-bold">Sign In to Your Account</h1>
                        <Form.Group className="mb-3" controlId="formEmail">
                            <Form.Floating>
                                <Form.Control
                                    type="email"
                                    placeholder="name@example.com"
                                    className="email"
                                />
                                <Form.Label>Email Address</Form.Label>
                            </Form.Floating>
                        </Form.Group>
                        <Form.Group className="mb-4" controlId="formPassword">
                            <Form.Floating>
                                <Form.Control
                                    type="password"
                                    placeholder="Password"
                                    className="password"
                                />
                                <Form.Label>Password</Form.Label>
                            </Form.Floating>
                        </Form.Group>
                        <Form.Group className="d-flex justify-content-between align-items-center mb-4"
                                    controlId="formCheckbox">
                            <Form.Check type="checkbox" label="Remember me"/>
                            <a href="#forgot-password" className="small text-muted">Forgot Password?</a>
                        </Form.Group>
                        <Button className="w-100" variant="primary" size="lg" type="submit">
                            Sign In
                        </Button>
                        <p className="mt-4 text-muted small">Don't have an account? <a href="#register"
                                                                                       className="text-primary">Sign
                            up</a></p>
                        <p className="mt-5 mb-3 text-muted small">© 2023 Company Name</p>
                    </Form>
                </Col>
            </Row>
        </Container>
    );
}

export default SignInForm;
