import { useState } from "react";
import api from "../api";
function Musicas() {

    const [Musicas, setMusicas] = useState([])

    function getMusicas(params) {
        api.get("/musicas").
            then((response) => {
                console.log("RESPONSE: ", response)
                console.log("MUSICAS: ", response.data)
                setMusicas(response.data)
            }).catch((err) => {
                if (err.responce.status == 404) {
                    console.log("Sa poha nao existe cabaço")
                } else (
                    console.error(err)
                )
            })
    }
    return (
        <div>
            <h1>Lista de musicas!!</h1>
            <button onClick={getMusicas}>Listar Musicas</button>
            <div>
                {Musicas.map((musica) => {
                    return <div key={musica.id}>{musica.id}-{musica.titulo}</div>
                })
                }</div>
        </div>
    )
}

export default Musicas;