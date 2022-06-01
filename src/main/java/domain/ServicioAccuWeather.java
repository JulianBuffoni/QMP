package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAccuWeather extends ServicioMeteorologico {
    private AccuWeatherAPI api;

    public ServicioAccuWeather(String direccion) {
        this.api = new AccuWeatherAPI();
        this.duracion = Duration.ofHours(2);
        this.direccion = direccion;
    }

    public ServicioAccuWeather(AccuWeatherAPI api, Duration duracion, String direccion) {
        this.api = api;
        this.duracion = duracion;
        this.direccion = direccion;
    }

    private UnidadTemperatura unidadFromString(String unidad) {
        return unidad.equals("C") ? UnidadTemperatura.CELCIUS : UnidadTemperatura.FAHRENHEIT;
    }

    @Override
    public EstadoTiempo consultarApi() {
        Map<String, Object> weather = this.api.getWeather(direccion).get(0);
        HashMap<String, Object> hashTemperatura = (HashMap<String, Object>) weather.get("Temperature");
        UnidadTemperatura unidad = unidadFromString(hashTemperatura.get("Unidad").toString());
        int valor = (int) hashTemperatura.get("Value");
        Temperatura temperatura = new Temperatura(valor, unidad);
        LocalDateTime fecha = (LocalDateTime) weather.get("DateTime");
        return new EstadoTiempo(fecha, temperatura);
    }
}