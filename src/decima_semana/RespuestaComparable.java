package decima_semana;

public class RespuestaComparable implements Comparable<RespuestasDeEncuesta>{

    RespuestasDeEncuesta respuestasDeEncuesta;

    @Override
    public int compareTo(RespuestasDeEncuesta respuestaAComparar) {
        if( this.respuestasDeEncuesta.getRespuesta().equals(RespuestasDeEncuesta.BAJO)
                && (
                        respuestaAComparar.getRespuesta().equals(RespuestasDeEncuesta.MEDIO) ||
                        respuestaAComparar.getRespuesta().equals(RespuestasDeEncuesta.ALTO)
                )
        ){
             return -1;
        }
        else if( this.respuestasDeEncuesta.getRespuesta().equals(RespuestasDeEncuesta.MEDIO) &&
                respuestaAComparar.getRespuesta().equals(RespuestasDeEncuesta.BAJO)){
             return 1;
        }
        else if( this.respuestasDeEncuesta.getRespuesta().equals(RespuestasDeEncuesta.MEDIO) &&
                respuestaAComparar.getRespuesta().equals(RespuestasDeEncuesta.ALTO)){
            return -1;
        }
        else if( this.respuestasDeEncuesta.getRespuesta().equals(RespuestasDeEncuesta.ALTO)
                && (
                respuestaAComparar.getRespuesta().equals(RespuestasDeEncuesta.BAJO) ||
                        respuestaAComparar.getRespuesta().equals(RespuestasDeEncuesta.MEDIO)
        )
        ){
            return 1;
        }
        else {
            return 0;
        }
    }
}
