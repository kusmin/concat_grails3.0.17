package concat

class Categoria {

    String nome

    static constraints = {
        nome nullable:false, blank:false, maxSize:128, unique:true
    }

}
