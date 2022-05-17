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

## Pseudocódigo

```java
import java.util.ArrayList;

class Atuendo {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;
  //List<Prenda> prendas;

  Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    List<Prenda> prendas = Arrays.asList(new Prenda[]{parteSuperior, parteInferior, calzado, accesorio});
    this.prendaSuperior;
    this.prendaInferior;
    this.calzado;
    this.accesorio;
  }
}

class Uniforme extends Atuendo {

  Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
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

  void configurarUniforme(List<Prenda> prendas, String institucion) {
    uniformes.add(new Uniforme(prendas, institucion));
  }

  void agregarPrenda(Prenda prenda) {
    prendasTotales.add(prenda);
  }

  List<Prenda> sugerenciaDeUniforme() {
    Prenda parteSuperior = prendasTotales.randomAt(prenda -> prenda.getCategoria() == PARTE_SUPERIOR);
    Prenda parteInferior = prendasTotales.randomAt(prenda -> prenda.getCategoria() == PARTE_INFERIOR);
    Prenda calzado = prendasTotales.randomAt(prenda -> prenda.getCategoria() == CALZADO);
    Prenda accesorio = prendasTotales.randomAt(prenda -> prenda.getCategoria() == ACCESORIO);
    validateNonNull(parteSuperior);
    validateNonNull(parteInferior);
    validateNonNull(calzado);
    return Arrays.asList(new Prenda[]{parteSuperior, parteInferior, calzado, accesorio});
  }

}

class Prenda {
  TipoPrenda tipoPrenda;
  var material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;
  EstadoPrenda estado;
  Bool estaLavandose;
  Int cantUsos;

  // Se usa sólo por borrador
  Prenda(Tipo tipoPrenda, Material material, Trama trama, Color colorPrincipal, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.estado = new Limpia();

  }

  method getCategoria() {
    return tipo.getCategoria();
  }

  method setEstado(EstadoPrenda nuevoEstado) {
    this.estado = nuevoEstado;
  }

  method puedeUsarse() {
    return this.estado != Percudida && !estaLavandose;
  }

  method Lavar() {
    estaLavandose = true;
  }

  method terminoDeLavar() {
    this.estado.seLavo(this);
    estaLavandose = false;
  }

  method usar() {
    cantUsos++;
    estado.seUso(this);
  }

  method getUsos() {
    return cantUsos;
  }
}

abstract class EstadoPrenda {
  int maxCantUsos;

  method seLavo(Prenda prenda) {
    prenda.setEstado(new Limpia); //redefinir en Percudida
  }

  method 
  (Prenda prenda) {
    if (prenda.getUsos() == maxCantUsos) {
      this.demasiadoUsada(prenda);
    }
  }

  abstract method demasiadoUsada(Prenda prenda);
}

class Limpia extends EstadoPrenda {
  int maxCantUsos = 2;

  method demasiadoUsada(prenda) {
    prenda.setEstado(new Sucia);
  }
}

class Sucia extends EstadoPrenda {
  int maxCantUsos = 3;

  public method demasiadoUsada(prenda) {
    prenda.setEstado(new Percudida);
  }
}

class Percudida extends EstadoPrenda {
  int maxCantUsos = 0;

  method demasiadoUsada(prenda) {}

  override method seLavo(prenda) {}
}


class Color {
  int rojo, verde, azul;

  public Color(var rojo, var verde, var azul) {
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
  Categoria categoria;

  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  method getCategoria() {
    return categoria;
  }
}

enum Trama {
  LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO;
}

class Material {
  NombreMaterial material;


  pubMaterial(NombreMaterial material) {
    this.material = material;
  }

  method validarTipoPrenda(TipoPrenda tipoPrenda) {
    if (!isConsistente(this, tipoPrenda)) {
      throw new tipoInvalido("Tipo y Material de la prenda son inconsistentes");
    }
  }
}

class Borrador {
  TipoPrenda tipoPrenda;
  var material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  Borrador(TipoPrenda tipoDePrenda) {
    validateNonNull(tipoDePrenda);
    this.tipoDePrenda = tipoDePrenda;
  }

  method especificarColorPrincipal(Color colorPrincipal) {
    validarNoNull(colorPrincipal);
    this.colorPrincipal = colorPrincipal;
  }

  method especificarColorSecundario(Color colorSecundario) {
    this.colorPrincipal = colorSecundario;
  }

  method especificarMaterial(Material material(Trama trama))

  {
    validateNonNull(material);
    material.validarTipoPrenda(material);
    this.material = material;
  }

  method especificarTrama(Trama trama) {
    validateNonNull(trama);
    this.trama = if trama is null then Trama.LISA else trama;
  }

  method crear() {
    return new Prenda(tipo, material, colorPrincipal, colorSecundario);
  }
}

//---

class Usuario {

  List<Prenda> guardarropa;
  
  Atuendo sugerencia(boolean conAccesorio) {
    List<Prenda> guardarropaSinPercudidas = guardarropa.filter(unaPrenda -> unaPrenda.puedeUsarse());
    Prenda parteSuperior = guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == PARTE_SUPERIOR);
    Prenda parteInferior = guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == PARTE_INFERIOR);
    Prenda calzado = guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == CALZADO);
    Prenda accesorio = conAccesorio ? guardarropaSinPercudidas.randomAt(prenda -> prenda.getCategoria() == ACCESORIO) : null;
    validateNonNull(parteSuperior);
    validateNonNull(parteInferior);
    validateNonNull(calzado);

    parteSuperior.usar();
    parteInferior.usar();
    calzado.usar();
    if (conAccesorio){
      accesorio.usar();
      return new Atuendo(parteSuperior, parteInferior, calzado, accesorio);
    } 
    else{
      return new Atuendo(parteSuperior, parteInferior, calzado);
    }
    
  }

  List<Atuendo> sugerencias(boolean conAccesorio, int cantidad) {
    List<Atuendo> resultado = new ArrayList<>();
    for (int i = 0; i < cantidad; i++) resultado.add(sugerencia(conAccesorio));
    return resultado;
  }
}
```
