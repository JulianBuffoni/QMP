# QMP
## Integrantes
| Alumno                         | Legajo  |
|--------------------------------|---------|
| Bruno, Juan Pablo              | 1768920 |
| Buffoni, Julian                | 1756760 |
| Fusse, Fausto                  | 1757519 |
| Gette, Delfina                 | 1722712 |
| Riquelme Blaffet, Pablo Daniel | 1632784 |

## User Stories
### QMP1

>"*Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.*"

>"*Como usuarie de QuéMePongo, quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).*"

>"*Como usuarie de QuéMePongo, quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).*"

>"*Como usuarie de QuéMePongo, quiero poder indicar de qué tela o material está hecha una prenda.*"

>"*Como usuarie de QuéMePongo, quiero poder indicar un color principal para mis prendas.*"

>"*Como usuarie de QuéMePongo, quiero poder indicar, si existe, un color secundario para mis prendas.*"

>"*Como usuarie de QuéMePongo, quiero evitar que haya prendas sin tipo, tela, categoría o color primario.*"

>"*Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado).*"

### QMP2
>"*Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).*"

>"*Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.*"

>"*Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar los aspectos relacionados a su material (colores, material, trama, etc) para evitar elegir materiales inconsistentes con el tipo de prenda.*"

>"*Como usuarie de QuéMePongo, quiero guardar un borrador de la la última prenda que empecé a cargar para continuar después.*"

>"*Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa.*"

>"*Como usuarie de QuéMePongo, quiero poder guardar una prenda solamente si esta es válida.*"

>"*Como usuario QueMePongo, quiero poder recibir sugerencias de uniformes armados.*"

>"*Como usuario QueMePongo, quiero que un uniforme siempre conste de una prenda superior, una inferior y un calzado.*"

>"*Como administrador de QueMePongo, quiero poder configurar diferentes uniformes para distintas instituciones (Ej: para el colegio San Juan debe ser una chomba verde de piqué, un pantalón de acetato gris y zapatillas blancas, mientras que para el Instituto Johnson siempre será una camisa blanca, pantalón de vestir negro y zapatos negros).*"

### QMP3
>"*Como usuarie de QuéMePongo, quiero recibir sugerencias de atuendos para vestirme ajustándome a las condiciones climáticas con ropa de mi agrado.*"

>"*Como usuarie de QuéMePongo, quiero recibir una sugerencia de prendas que me vista completamente (torso, piernas y pies).*"

>"*Como usuarie de QuéMePongo, quiero que una sugerencia pueda incluir accesorios (guantes, gorros, bufandas, anteojos de sol, etc).*"

>"*Como usuarie de QuéMePongo, quiero recibir varias sugerencias que combinen las prendas de mi guardarropas.*"

>"*Como usuarie de QuéMePongo, quiero que una sugerencia cubra cada parte del cuerpo con no más de una prenda, es decir, evitando superposiciones.*"

>"*Como usuario QueMePongo, quiero que al aparecer en una sugerencia, la aplicación asuma que una prenda ha sido usada.*"

>"*Como usuario QueMePongo, quiero que luego de ser usada 2 veces, se considere a una prenda como “sucia”.*"

>"*Como usuarie de QuéMePongo, quiero que una prenda “sucia” pueda usarse hasta 3 veces para luego ser considerada “percudida”.*"

>"*Como usuarie de QuéMePongo, quiero que una prenda “percudida” no pueda ser nunca más sugerida.*"

>"*Como usuarie de QuéMePongo, quiero indicar que una prenda ha sido puesta a lavar.*"

>"*Como usuarie de QuéMePongo, quiero que una prenda “sucia” que es lavada, deje de estarlo.*"

>"*Como usuarie de QuéMePongo, quiero que una prenda no pueda ser sugerida mientras está lavándose.*"

### QMP4

>"*Como usuario de QuéMePongo, quiero recibir sugerencias de atuendos para vestirme ajustándome a las condiciones climáticas con ropa de mi agrado.*"

>"*Como usuario de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos Aires en un momento dado para obtener sugerencias acordes.*"

>"*Como usuario de QuéMePongo, quiero poder recibir sugerencias de atuendos que tengan una prenda para cada categoría, aunque a futuro podrán tener más. (Ej.: Una remera, un pantalón, zapatos y un gorro)*"

>"*Como usuario de QuéMePongo, quiero que al generar una sugerencia las prendas sean acordes a la temperatura actual sabiendo que para cada prenda habrá una temperatura hasta la cual es adecuada. (Ej.: “Remera de mangas largas” no es apta a más de 20°C)*"

>"*Como administrador de QuéMePongo, quiero poder configurar fácilmente diferentes servicios de obtención del clima para ajustarme a las cambiantes condiciones económicas.*"

>"*Como stakeholder de QuéMePongo, quiero poder asegurar la calidad de mi aplicación sin incurrir en costos innecesarios.*"

## Pseudocódigo

```java
import java.util.ArrayList;

class Atuendo {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    List<Prenda> prendas = Arrays.asList(new Prenda[]{parteSuperior, parteInferior, calzado, accesorio});
    this.prendaSuperior;
    this.prendaInferior;
    this.calzado;
    this.accesorio;
  }
  
  void usar(){
    prendaSuperior.usar();
    prendaInferior.usar();
    calzado.usar();
    if(accesorio != NULL){
      accesorio.usar();
    }
  }
  public boolean aptoParaTemperatura(Temperatura temperatura){
    List<Prenda> prendas = Arrays.asList(new Prenda[]{parteSuperior, parteInferior, calzado, accesorio});
    return prendas.all(unaPrenda -> unaPrenda.esAptaParaTemperatura(temperatura));
  }
}

class Uniforme extends Atuendo {

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    List<Prenda> prendas = Arrays.asList(new Prenda[]{parteSuperior, parteInferior, calzado, null});
    validarUniforme(prendas);
    super(prendas);
  }

  void validarUniforme(List<Prenda> prendas) {
    boolean uniformeValido = prendas
        .map(prenda -> prenda.getCategoria())
        .containsAll([PARTE_SUPERIOR, PARTE_INFERIOR, CALZADO]);

    if (!uniformeValido) {
      throw new uniformeIncompleto("Uniforme necesita de una prenda superior, una inferior y un calzado");
    }
  }
}

class Institucion {
  List<Uniforme> uniformes;

  void crearUniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    uniforme.add(new Uniforme(prendaSuperior, prendaInferior, calzado));
  }
}

class Negocio {
  List<Prenda> prendas;
  List<Atuendo> uniformes;

  void configurarUniforme(List<Prenda> prendas, Institucion institucion) {
    uniformes.add(new Uniforme(prendas, institucion));
  }

  void agregarPrenda(Prenda prenda) {
    prendasTotales.add(prenda);
  }
}

class Prenda {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;
  EstadoPrenda estado;
  bool estaLavandose;
  int cantUsos;
  private Temperatura temperaturaMaxima;

  // Se usa sólo por borrador
  public Prenda(Tipo tipoPrenda, Material material, Trama trama, Color colorPrincipal, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.estado = new Limpia();
  }

  Categoria getCategoria() {
    return tipo.getCategoria();
  }

  void setEstado(EstadoPrenda nuevoEstado) {
    this.estado = nuevoEstado;
  }

  bool puedeUsarse() {
    return this.estado.maxCantUsos > 0 && !estaLavandose;
  }

  void Lavar() {
    this.estaLavandose = true;
  }

  void terminoDeLavar() {
    this.estado.seLavo(this);
    this.estaLavandose = false;
  }

  void usar() {
    this.cantUsos++;
    this.estado.seUso(this);
  }

  int getUsos() {
    return this.cantUsos;
  }
  public boolean aptaParaTemperatura(Temperatura temperatura){
    return this.temperaturaMaxima < temperatura;
  }
}

abstract class EstadoPrenda {
  protected int maxCantUsos;

  void seLavo(Prenda prenda) {
    prenda.setEstado(new Limpia()); //redefinir en Percudida
  }

  method (Prenda prenda) {
    if (prenda.getUsos() == maxCantUsos) {
      this.demasiadoUsada(prenda);
    }
  }

  abstract void demasiadoUsada(Prenda prenda);
}

class Limpia extends EstadoPrenda {
//    int maxCantUsos = 2;
  
  public Limpia() {
    this.maxCantUsos = 2;
  }

  @Override
  void demasiadoUsada(Prenda prenda) {
    prenda.setEstado(new Sucia());
  }
}

class Sucia extends EstadoPrenda {
//  int maxCantUsos = 3;

  public Sucia() {
    this.maxCantUsos = 3;
  }
  
  @Override
  public void demasiadoUsada(Prenda prenda) {
    prenda.setEstado(new Percudida());
  }
}

class Percudida extends EstadoPrenda {
//  int maxCantUsos = 0;
  
  public Percudida() {
    this.maxCantUsos = 0;
  }

  @Override
  public void demasiadoUsada(Prenda prenda) {}

  @Override
  public void seLavo(Prenda prenda) {}
}


class Color {
  private final int rojo, verde, azul;

  public Color(int rojo, int verde, int azul) {
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }
}

enum Categoria {
  PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIOS;
}

enum NombreMaterial {
  ALGODON, POLIESTER, LINO, LANA, SEDA, NYLON, LYCRA;
}

class TipoPrenda {
  private Categoria categoria;


  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}

enum Trama {
  LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO;
}

class Material {
  private NombreMaterial material;

  public Material(NombreMaterial material) {
    this.material = material;
  }

  public void validarTipoPrenda(TipoPrenda tipoPrenda) {
    if (!isConsistente(this, tipoPrenda)) {
      throw new tipoInvalido("Tipo y Material de la prenda son inconsistentes");
    }
  }
}

class Borrador {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public Borrador(TipoPrenda tipoDePrenda) {
    validateNonNull(tipoDePrenda);
    this.tipoDePrenda = tipoDePrenda;
  }

  public void especificarColorPrincipal(Color colorPrincipal) {
    validarNoNull(colorPrincipal);
    this.colorPrincipal = colorPrincipal;
  }

  public Color especificarColorSecundario(Color colorSecundario) {
    this.colorPrincipal = colorSecundario;
  }

  public void especificarMaterial(Material material) {
    validateNonNull(material);
    material.validarTipoPrenda(material);
    this.material = material;
  }

  public void especificarTrama(Trama trama) {
    validateNonNull(trama);
    this.trama = trama == null ? Tram.LISA : this.trama;
  }

  public Prenda crear() {
    return new Prenda(tipo, material, colorPrincipal, colorSecundario);
  }
}

//---

class AsesorDeImagen {

  private List<Prenda> guardarropa;

  private ServicioMeteorologico servicioMeteorologico;

  public Atuendo sugerencia(boolean conAccesorio) {
    List<Prenda> guardarropaSinPercudidas = guardarropa.filter(unaPrenda -> unaPrenda.puedeUsarse());
    Prenda parteSuperior = guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == PARTE_SUPERIOR);
    Prenda parteInferior = guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == PARTE_INFERIOR);
    Prenda calzado = guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == CALZADO);
    Prenda accesorio = conAccesorio ? guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == ACCESORIO) : null;
    validateNonNull(parteSuperior);
    validateNonNull(parteInferior);
    validateNonNull(calzado);

    Atuendo atuendo = new Atuendo(parteSuperior, parteInferior, calzado, accesorio); 
    atuendo.usar();
    return atuendo;
  }

  public List<Atuendo> sugerencias(boolean conAccesorio, int cantidad) {
    List<Atuendo> resultado = new ArrayList<>();
    for (int i = 0; i < cantidad; i++) resultado.add(sugerencia(conAccesorio));
    return resultado;
  }

  public Atuendo sugerirAtuendoClima(String direccion) {
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico()
        .obtenerCondicionesClimaticas(direccion);
    List<Atuendo> combinaciones = this.guardarropa.todasLasPosiblesCombinaciones()
    return combinaciones
        .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.temperatura))
        .first();

  }

}
```
