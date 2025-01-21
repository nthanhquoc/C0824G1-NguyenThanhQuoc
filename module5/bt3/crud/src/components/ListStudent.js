import React, { Component } from "react";
import Table from "react-bootstrap/Table";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";

class ListStudent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            students: [
                {
                    id: 1,
                    name: "John Doe",
                    phone: "1234567890",
                    email: "johndoe@gmail.com",
                },
                {
                    id: 2,
                    name: "Jane Smith",
                    phone: "0987654321",
                    email: "janesmith@gmail.com",
                },
                {
                    id: 3,
                    name: "Jack Brown",
                    phone: "1122334455",
                    email: "jackbrown@gmail.com",
                },
            ],
            currentStudent: { id: "", name: "", phone: "", email: "" }, // Sinh viên đang chỉnh sửa hoặc thêm
            isEditing: false, // Xác định đang chỉnh sửa hay thêm mới
        };
    }

    // Xử lý thay đổi giá trị trong form
    handleChange = (e) => {
        const { name, value } = e.target;
        this.setState({
            currentStudent: { ...this.state.currentStudent, [name]: value },
        });
    };

    // Xử lý thêm hoặc cập nhật sinh viên
    handleSubmit = (e) => {
        e.preventDefault();
        const { students, currentStudent, isEditing } = this.state;

        if (isEditing) {
            // Cập nhật sinh viên
            this.setState({
                students: students.map((student) =>
                    student.id === currentStudent.id ? currentStudent : student
                ),
                currentStudent: { id: "", name: "", phone: "", email: "" },
                isEditing: false,
            });
        } else {
            // Thêm sinh viên mới
            const newStudent = {
                ...currentStudent,
                id: Date.now(),
            };
            this.setState({
                students: [...students, newStudent],
                currentStudent: { id: "", name: "", phone: "", email: "" },
            });
        }
    };

    // Xử lý chỉnh sửa sinh viên
    handleEdit = (student) => {
        this.setState({ currentStudent: student, isEditing: true });
    };

    // Xử lý xóa sinh viên
    handleDelete = (id) => {
        const { students } = this.state;
        this.setState({
            students: students.filter((student) => student.id !== id),
        });
    };

    render() {
        const { students, currentStudent, isEditing } = this.state;

        return (
            <div className="container mt-5">
                <h1 className="text-center mb-4">Student List</h1>
                {/* Form thêm/chỉnh sửa sinh viên */}
                <Form onSubmit={this.handleSubmit} className="mb-4">
                    <Form.Group className="mb-3">
                        <Form.Label>Name</Form.Label>
                        <Form.Control
                            type="text"
                            name="name"
                            value={currentStudent.name}
                            onChange={this.handleChange}
                            placeholder="Enter name"
                            required
                        />
                    </Form.Group>
                    <Form.Group className="mb-3">
                        <Form.Label>Phone</Form.Label>
                        <Form.Control
                            type="text"
                            name="phone"
                            value={currentStudent.phone}
                            onChange={this.handleChange}
                            placeholder="Enter phone"
                            required
                        />
                    </Form.Group>
                    <Form.Group className="mb-3">
                        <Form.Label>Email</Form.Label>
                        <Form.Control
                            type="email"
                            name="email"
                            value={currentStudent.email}
                            onChange={this.handleChange}
                            placeholder="Enter email"
                            required
                        />
                    </Form.Group>
                    <Button variant="primary" type="submit">
                        {isEditing ? "Update Student" : "Add Student"}
                    </Button>
                </Form>

                {/* Danh sách sinh viên */}
                <Table striped bordered hover>
                    <thead className="table-dark">
                    <tr>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    {students.map((student) => (
                        <tr key={student.id}>
                            <td>{student.name}</td>
                            <td>{student.phone}</td>
                            <td>{student.email}</td>
                            <td>
                                <Button
                                    variant="warning"
                                    className="me-2"
                                    onClick={() => this.handleEdit(student)}
                                >
                                    Edit
                                </Button>
                                <Button
                                    variant="danger"
                                    onClick={() => this.handleDelete(student.id)}
                                >
                                    Delete
                                </Button>
                            </td>
                        </tr>
                    ))}
                    </tbody>
                </Table>
            </div>
        );
    }
}

export default ListStudent;
