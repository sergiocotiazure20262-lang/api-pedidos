const express = require('express');
const axios = require('axios');

const app = express();

app.get('/pedidos', async (req, res) => {
    try {
        const response = await axios.get('http://api-produtos-service:3000/produtos');
        res.json({
            pedidoId: 100,
            produtos: response.data
        });
    } catch (error) {
        res.status(500).json({ erro: error.message });
    }
});

app.listen(3001, () => {
    console.log("API PEDIDOS rodando na porta 3001");
});