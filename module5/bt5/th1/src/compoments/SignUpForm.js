import React from "react";
import { Formik, Form, Field, ErrorMessage } from "formik";
import * as Yup from "yup";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

const SignUpForm = () => {
    // Validation Schema sử dụng Yup
    const validationSchema = Yup.object({
        username: Yup.string().required("Username is required"),
        email: Yup.string()
            .email("Invalid email address")
            .required("Email is required"),
        password: Yup.string()
            .min(6, "Password must be at least 6 characters long")
            .required("Password is required"),
        confirmPassword: Yup.string()
            .oneOf([Yup.ref("password"), null], "Passwords must match")
            .required("Confirm password is required"),
    });

    return (
        <>
            <Formik
                initialValues={{
                    username: "",
                    email: "",
                    password: "",
                    confirmPassword: "",
                }}
                validationSchema={validationSchema}
                onSubmit={(values, { resetForm }) => {
                    // Hiển thị thông báo thành công
                    toast.success("Form submitted successfully!");
                    console.log("Form Submitted", values);
                    resetForm();
                }}
            >
                {() => (
                    <Form>
                        {/* Username Field */}
                        <div>
                            <label htmlFor="username">Username</label>
                            <Field id="username" name="username" type="text" />
                            <ErrorMessage
                                name="username"
                                component="div"
                                style={{ color: "red" }}
                            />
                        </div>

                        {/* Email Field */}
                        <div>
                            <label htmlFor="email">Email</label>
                            <Field id="email" name="email" type="email" />
                            <ErrorMessage
                                name="email"
                                component="div"
                                style={{ color: "red" }}
                            />
                        </div>

                        {/* Password Field */}
                        <div>
                            <label htmlFor="password">Password</label>
                            <Field id="password" name="password" type="password" />
                            <ErrorMessage
                                name="password"
                                component="div"
                                style={{ color: "red" }}
                            />
                        </div>

                        {/* Confirm Password Field */}
                        <div>
                            <label htmlFor="confirmPassword">Confirm Password</label>
                            <Field
                                id="confirmPassword"
                                name="confirmPassword"
                                type="password"
                            />
                            <ErrorMessage
                                name="confirmPassword"
                                component="div"
                                style={{ color: "red" }}
                            />
                        </div>

                        {/* Submit Button */}
                        <button type="submit">Sign Up</button>
                    </Form>
                )}
            </Formik>

            {/* Toast Container */}
            <ToastContainer />
        </>
    );
};

export { SignUpForm };
