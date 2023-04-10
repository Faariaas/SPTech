const root = window.document.getElementById("root");

function Titulo(props) {
    return (
        <h1>{props.texto}</h1>
    )
}

function Titulos() {
    return (
        <div>
        <Titulo texto="Meu Querido Ponei com PROPS"/>
        <Titulo texto="Ola Mundo dos Virgens"/>
        <Titulo texto="Mas que aula top"/>
    </div>
    )
}
ReactDOM.createRoot(root).render(
    <Participante />
);

// root.innerHTML = "<h1>Meu primeiro titulo dcom js </h1>"

// const titulo = document.createElement("h1");
// titulo.innerHTML = "TITULO MONTADO COM CONSTANTE";
// root.appendChild(titulo);