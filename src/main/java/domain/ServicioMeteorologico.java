package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;

public abstract class ServicioMeteorologico {
  protected EstadoTiempo ultimaRespuesta;
  protected LocalDateTime expiracion;
  protected String direccion;
  protected Duration duracion;

  public EstadoTiempo obtenerCondicionesClimaticas() {
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = consultarApi();
      this.expiracion = LocalDateTime.now().plus(this.duracion.get(ChronoUnit.HOURS), ChronoUnit.HOURS);
    }
    return this.ultimaRespuesta;
  }

  abstract public EstadoTiempo consultarApi();

  private boolean expiro() {
    return expiracion.isAfter(LocalDateTime.now());
  }
}
