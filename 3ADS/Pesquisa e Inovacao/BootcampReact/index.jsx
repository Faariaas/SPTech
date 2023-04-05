const root = window.document.getElementById("root");

function Participante(props) {
    // var  votos = 0;
    const [votos, setVotos] = React.useState(0);

    function acrescentar() {
        setVotos(votos + 1);
        console.log("Votos: ", votos)
    }
    
    function reduzir() {
        setVotos(votos - 1);
        console.log("Votos: ", votos)
    }

    return (
        <div>
            <span>Votos para {props.nome}: { votos } <br /></span>
            <button onClick={acrescentar}>+</button>
            <button onClick={reduzir}>-</button>
        </div>
    );
}

function Votacao() {
    return( 
        <div>
            <Participante nome="Biscoito" />
            <Participante nome="Bolacha" />
            <Participante nome="Creme & Crack" />
        </div>
    );
    
}
ReactDOM.createRoot(root).render(
    <Votacao />
)