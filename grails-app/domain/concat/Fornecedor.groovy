package concat

class Fornecedor {

    String nome

    static constraints = {
        nome nullble:false, blank:false, maxSize:128, unique:true
    }

}
