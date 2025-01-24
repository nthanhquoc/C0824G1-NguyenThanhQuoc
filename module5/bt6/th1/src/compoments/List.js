import React, { useState, useEffect } from "react";
import axios from "axios";

const List = ()=>{
    const [data, setData] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get("http://localhost:3002/student");
                setData(response.data); // Lưu dữ liệu từ JSON vào state
                setLoading(false);
            } catch (error) {
                console.error("Error fetching data:", error);
            }
        };

        fetchData();
    }, []);

    if (loading) {
        return <div>Loading...</div>;
    }

    return (
        <div>
            <h1>List of People</h1>
            <ul>
                {data.map((item) => (
                    <li key={item.id}>
                        {item.name} - Age: {item.age}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export  default List;