import axios from "axios";

const api = axios.create({
    baseURL: "https://642f360db289b1dec4af0a21.mockapi.io/"
});

export default api;