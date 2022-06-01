package domain;

import java.time.LocalDateTime;
import java.util.Map;

public class Asesor {
    private ServicioMeteorologico servicioMeteorologico;

    public Asesor(ServicioMeteorologico servicio) {
      this.servicioMeteorologico = servicio;
    }

    // Atuendo y Prenda en PseudoCodigo
    public Atuendo sugerirAtuendo(String direccion, List<Prenda> guardarropas) {
      EstadoTiempo estadoDelTiempo = this.servicioMeteorologico.obtenerCondicionesClimaticas();
      List<Atuendo> combinaciones = guardarropas.todasLasCombinaciones();
      return combinaciones
          .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.getTemperatura()));
          .first();

    }
}

enum UnidadTemperatura { CELCIUS, FAHRENHEIT };

