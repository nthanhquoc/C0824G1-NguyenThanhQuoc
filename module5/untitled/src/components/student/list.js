import React from "react";
import {Table} from "react-bootstrap";

function StudentList(){
    const name="c08";
    const students=[
        {
            id:1,
            name:"Trương Tấn Hải",
            point:9,
            address:"Quảng Nam"
        },
        {
            id:2,
            name:"Trương Tấn Hải",
            point:7,
            address: "Quảng Nam"
        }
    ]
    return (
        <>
            <h1 id="c08" className={name}>Danh sách học sinh {name}</h1>
            {/*    Hiển thị danh sách học sinh
             Sử dụng table có các cột: stt, name, điểm, học lực, địa chỉ. Sử dụng map để hiển thị
             Sử dụng Bootstrap (react-bootstrap) or module.css
             Tìm hiểu key, tại sao phải bắt buộc có key trong vòng lặp
      */}
            <Table striped bordered hover>
                <thead>
                <tr>
                    <th>STT</th>
                    <th>Họ Tên</th>
                    <th>Điểm</th>
                    <th>Học Lực</th>
                    <th>Địa Chỉ</th>
                </tr>
                </thead>
                <tbody>
                {students.map((student, index) => (
                    <tr key={student.id}>
                        <td>{index + 1}</td>
                        <td>{student.name}</td>
                        <td>{student.point}</td>
                        <td>{student.point >= 8 ? "Giỏi" : student.point >= 6.5 ? "Khá" : "Trung Bình"}</td>
                        <td>{student.address}</td>
                    </tr>
                ))}
                </tbody>
            </Table>
        </>
    )
}

export default StudentList;