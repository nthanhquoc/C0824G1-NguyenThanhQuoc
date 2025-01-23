import { useEffect, useState } from "react";
import { Form, Table, Container } from "react-bootstrap";

const StudentList = () => {
    const [name, setName] = useState("");
    const [students, setStudents] = useState([]);
    const [originalStudents, setOriginalStudents] = useState([]);

    useEffect(() => {
        const initialStudents = [
            {
                id: 1,
                name: "John Doe",
                email: "john@doe.com",
                address: "XXXXX",
            },
            {
                id: 2,
                name: "Jane Smith",
                email: "jane@smith.com",
                address: "YYYYY",
            },
        ];
        setStudents(initialStudents);
        setOriginalStudents(initialStudents);
    }, []);

    useEffect(() => {
        if (name === "") {
            setStudents(originalStudents);
        } else {
            const filtered = originalStudents.filter(student =>
                student.name.toLowerCase().includes(name.toLowerCase())
            );
            setStudents(filtered);
        }
    }, [name, originalStudents]);

    return (
        <Container className="mt-4">
            <h1 className="text-center mb-4">Danh Sách Học Sinh</h1>
            <Form.Group className="mb-3">
                <Form.Control
                    type="text"
                    value={name}
                    onChange={(e) => setName(e.target.value)}
                    placeholder="Tìm kiếm theo tên..."
                />
            </Form.Group>
            <Table striped bordered hover>
                <thead>
                <tr>
                    <th>STT</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Address</th>
                </tr>
                </thead>
                <tbody>
                {students.map((student, index) => (
                    <tr key={student.id}>
                        <td>{index + 1}</td>
                        <td>{student.name}</td>
                        <td>{student.email}</td>
                        <td>{student.address}</td>
                    </tr>
                ))}
                </tbody>
            </Table>
        </Container>
    );
};

export { StudentList };
