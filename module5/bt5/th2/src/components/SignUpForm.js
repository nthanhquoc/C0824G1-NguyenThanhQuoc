import * as Yup from 'yup';
import {ErrorMessage, Field, Form, Formik} from "formik";

const SignUpForm = () => {
    const validationSchema = Yup.object().shape({
        email: Yup.string()
            .email("Invalid email format")
            .required("Email is required"),
        password: Yup.string()
            .min(8, "Password must be at least 8 characters long")
            .required("Password must be at least 8 characters long")

    })

    return (
        <Formik
            initialValues={{
                email: "",
                password: "",
            }}
            validationSchema={validationSchema}
            onSubmit={(values, { resetForm }) => {
                alert("Login successfully!!!");
                console.log("Submitted values: ", values);
                resetForm();
            }}
        >
            {() => (
                <Form>
                    {/* Email Field */}
                    <div>
                        <label htmlFor="email">Email</label>
                        <Field id="email" name="email" type="email" />
                        <ErrorMessage name="email" component="div" style={{ color: "red" }} />
                    </div>

                    {/* Password Field */}
                    <div>
                        <label htmlFor="password">Password</label>
                        <Field id="password" name="password" type="password" />
                        <ErrorMessage name="password" component="div" style={{ color: "red" }} />
                    </div>

                    {/* Submit Button */}
                    <button type="submit">Login</button>
                </Form>
            )}
        </Formik>
    );
}

export default SignUpForm;