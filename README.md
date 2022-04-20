# QMP1

## Integrantes
| Alumno                         | Legajo  |
|--------------------------------|---------|
| Bruno, Juan Pablo              | 1768920 |
| Buffoni, Julian                | 1756760 |
| Fusse, Fausto                  | 1757519 |
| Gette, Delfina                 | 1722712 |
| Riquelme Blaffet, Pablo Daniel | 1632784 |

## User Stories

>"*Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.*"

>"*Como usuarie de QuéMePongo, quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).*"

>"*Como usuarie de QuéMePongo, quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).*"

>"*Como usuarie de QuéMePongo, quiero poder indicar de qué tela o material está hecha una prenda.*"

>"*Como usuarie de QuéMePongo, quiero poder indicar un color principal para mis prendas.*"

>"*Como usuarie de QuéMePongo, quiero poder indicar, si existe, un color secundario para mis prendas.*"

>"*Como usuarie de QuéMePongo, quiero evitar que haya prendas sin tipo, tela, categoría o color primario.*"

>"*Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado).*"

## Pseudocódigo

```java
class Atuendo {
    Prenda prendas;
    
    void generarAtuendo(Prenda prenda){
      var atuendoValido = prendas.map(getCategoría()).contains(prenda.getCategoría());
      if(atuendoValido) {
        prendas.add(prenda);
      }
    }
}

class Prenda {
    var tipo;
    var colorPrincipal;
    var material;
    var colorSecundario;
    
    Prenda(var tipo, var colorPrincipal, var material, var ... colorSecundario){
      this.tipo = tipo;
      this.colorPrincipal = colorPrincipal;
      this.material = material;
      this.colorSecundario = colorSecundario;
      
      if(tipo == null || colorPrincipal == null|| material == null){
        throw new IllegalArgumentException("Error - Atributo Faltante, no se cargó prenda");
      }
    }
    
    method getCategoria(){
        return tipo.getCategoria();
    }
}

class Tipo {
    var categoría;
    
    method getCategoria(){
        return categoria;
    }
}
```