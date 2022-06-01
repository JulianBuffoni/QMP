package domain;

import java.time.LocalDateTime;

public class EstadoTiempo {
  private LocalDateTime fecha;
  private Temperatura temperatura;

  public EstadoTiempo(LocalDateTime fecha, Temperatura temperatura) {
    this.temperatura = temperatura;
    this.fecha = fecha;
  }

  Temperatura getTemperatura() {
    return temperatura;
  }
}
