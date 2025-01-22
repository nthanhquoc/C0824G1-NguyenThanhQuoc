import { useState } from "react";
import { Container, Form, Row, Col } from "react-bootstrap";

const CarSelection = () => {
    const cars = ["BMW", "Audi", "GClass", "Lamborghini"];
    const colors = ["Black", "White", "Yellow", "Blue", "Purple", "Orange"];

    const [selectCar, setSelectCar] = useState(cars[0]);
    const [selectColor, setSelectColor] = useState(colors[0]);

    const handleChangeCar = (e) => setSelectCar(e.target.value);
    const handleChangeColor = (e) => setSelectColor(e.target.value);

    return (
        <Container className="mt-4">
            <h1 className="text-center mb-4">Car And Color Selection</h1>
            <Row className="justify-content-center">
                <Col xs={12} md={6}>
                    <Form>
                        <Form.Group className="mb-3">
                            <Form.Label><strong>Select Car</strong></Form.Label>
                            <Form.Select value={selectCar} onChange={handleChangeCar}>
                                {cars.map((car) => (
                                    <option key={car} value={car}>{car}</option>
                                ))}
                            </Form.Select>
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label><strong>Select Color</strong></Form.Label>
                            <Form.Select value={selectColor} onChange={handleChangeColor}>
                                {colors.map((color) => (
                                    <option key={color} value={color}>{color}</option>
                                ))}
                            </Form.Select>
                        </Form.Group>
                    </Form>
                </Col>
            </Row>
            <Row className="justify-content-center mt-3">
                <Col xs={12} md={6} className="text-center">
                    <p className="alert alert-primary">
                        <strong>You selected a {selectCar} - {selectColor}</strong>
                    </p>
                </Col>
            </Row>
        </Container>
    );
};

export default CarSelection;
