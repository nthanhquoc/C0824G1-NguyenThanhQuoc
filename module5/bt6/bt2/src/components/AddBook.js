import { Formik, Form, Field, ErrorMessage } from "formik";
import * as Yup from "yup";
import { useNavigate } from "react-router-dom";
import { addBook } from "../service/BookService";

const AddBook = () => {
    const navigate = useNavigate();

    // Schema xác thực bằng Yup
    const validationSchema = Yup.object({
        title: Yup.string()
            .required("Title is required")
            .min(3, "Title must be at least 3 characters"),
        quantity: Yup.number()
            .required("Quantity is required")
            .min(1, "Quantity must be at least 1")
            .integer("Quantity must be an integer"),
    });

    const handleSubmit = async (values, { setSubmitting }) => {
        const result = await addBook(values);
        setSubmitting(false);
        if (result) {
            navigate("/");
        } else {
            alert("Failed to add book");
        }
    };

    return (
        <div>
            <h1>Add New Book</h1>
            <Formik
                initialValues={{ title: "", quantity: "" }}
                validationSchema={validationSchema}
                onSubmit={handleSubmit}
            >
                {({ isSubmitting }) => (
                    <Form>
                        <div>
                            <label>Title:</label>
                            <Field type="text" name="title" />
                            <ErrorMessage name="title" component="div" style={{ color: "red" }} />
                        </div>
                        <div>
                            <label>Quantity:</label>
                            <Field type="number" name="quantity" />
                            <ErrorMessage name="quantity" component="div" style={{ color: "red" }} />
                        </div>
                        <button type="submit" disabled={isSubmitting}>
                            {isSubmitting ? "Adding..." : "Add Book"}
                        </button>
                    </Form>
                )}
            </Formik>
        </div>
    );
};

export default AddBook;
